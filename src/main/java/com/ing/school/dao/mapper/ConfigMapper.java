package com.ing.school.dao.mapper;

import com.ing.school.dao.po.Config;

public interface ConfigMapper {
    int deleteByPrimaryKey(String config_key);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(String config_key);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}