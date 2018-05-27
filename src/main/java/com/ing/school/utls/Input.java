package com.ing.school.utls;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

public class Input {
    static PreparedStatement p = null;
    static AtomicInteger val = new AtomicInteger(3);
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, InvalidFormatException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://103.202.123.220:3306/school?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "lovesyxfuffy21");
        p = c.prepareStatement("insert into commonDict(enumName,category,code,parentCode,name) values(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
        Integer one = null;
        Integer two = null;
        Integer three = null;
        FileInputStream file = new FileInputStream("/home/wjx/download/学校资料.xlsx");
        Sheet sheet = WorkbookFactory.create(file).getSheetAt(0);
        for (Row row : sheet) {
            one = insert(row.getCell(0), null, one,"大洲美剧","continent");
            two = insert(row.getCell(1), one, two,"国家枚举","country");
            three = insert(row.getCell(2), two, three,"州/省枚举","state");
            insert(row.getCell(3), three, null,"城市枚举","city");
        }
    }

    private static Integer insert(Cell cell, Integer pre, Integer that,String enumName,String category) throws SQLException {
        if(cell==null){
            return null;
        }
        String value = cell.getStringCellValue().trim();
        if(empty(value))
            return that;
        p.setString(1,enumName);
        p.setString(2,category);
        p.setInt(3,val.getAndIncrement());
        p.setInt(4,pre==null?-9:pre);
        p.setString(5,value);
        p.executeUpdate();
        ResultSet rs = p.getGeneratedKeys();
        while (rs.next()) {
            return rs.getInt( 1 ) ;  /*返回主键增长信息*/
        }
        return null;
    }
    private static boolean empty(String s) {
        return s == null || "".equals(s.trim());
    }
}
