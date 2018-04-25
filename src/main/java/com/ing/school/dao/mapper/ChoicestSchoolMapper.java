package com.ing.school.dao.mapper;

import com.ing.school.dao.po.ChoicestSchool;
import com.ing.school.dao.po.ChoicestSchoolExample;
import java.util.List;

public interface ChoicestSchoolMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChoicestSchool record);

    int insertSelective(ChoicestSchool record);

    List<ChoicestSchool> selectByExampleWithBLOBs(ChoicestSchoolExample example);

    List<ChoicestSchool> selectByExample(ChoicestSchoolExample example);

    ChoicestSchool selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChoicestSchool record);

    int updateByPrimaryKeyWithBLOBs(ChoicestSchool record);

    int updateByPrimaryKey(ChoicestSchool record);
}