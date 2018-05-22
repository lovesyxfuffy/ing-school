package com.ing.school.dao.mapper;

import com.ing.school.dao.po.SchoolInfo;
import com.ing.school.dao.po.SchoolInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolInfoMapper {
    int deleteByExample(SchoolInfoExample example);

    int insert(SchoolInfo record);

    int insertSelective(SchoolInfo record);

    List<SchoolInfo> selectByExampleWithBLOBs(SchoolInfoExample example);

    List<SchoolInfo> selectByExample(SchoolInfoExample example);

    int updateByExampleSelective(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);

    int updateByExample(@Param("record") SchoolInfo record, @Param("example") SchoolInfoExample example);
}