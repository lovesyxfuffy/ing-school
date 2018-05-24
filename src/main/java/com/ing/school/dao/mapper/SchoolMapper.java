package com.ing.school.dao.mapper;

import com.ing.school.dao.po.School;
import com.ing.school.dao.po.SchoolExample;
import java.util.List;

public interface SchoolMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    School selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

    int updateCount(Integer id);
}