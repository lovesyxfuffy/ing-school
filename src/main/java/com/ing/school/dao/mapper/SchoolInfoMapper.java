package com.ing.school.dao.mapper;

import com.ing.school.dao.po.SchoolInfo;
import com.ing.school.dao.po.SchoolInfoExample;
import java.util.List;

public interface SchoolInfoMapper {
    int insert(SchoolInfo record);

    int insertSelective(SchoolInfo record);

    List<SchoolInfo> selectByExampleWithBLOBs(SchoolInfoExample example);

    List<SchoolInfo> selectByExample(SchoolInfoExample example);
}