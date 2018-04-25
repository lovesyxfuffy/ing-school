package com.ing.school.dao.mapper;

import com.ing.school.dao.po.CommonDict;

public interface CommonDictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommonDict record);

    int insertSelective(CommonDict record);

    CommonDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommonDict record);

    int updateByPrimaryKey(CommonDict record);
}