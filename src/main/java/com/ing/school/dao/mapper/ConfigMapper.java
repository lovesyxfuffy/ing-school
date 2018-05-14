package com.ing.school.dao.mapper;

import com.ing.school.dao.po.Config;
import com.ing.school.dao.po.ConfigExample;
import java.util.List;

public interface ConfigMapper {
    int deleteByPrimaryKey(String configKey);

    int insert(Config record);

    int insertSelective(Config record);

    List<Config> selectByExample(ConfigExample example);

    Config selectByPrimaryKey(String configKey);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}