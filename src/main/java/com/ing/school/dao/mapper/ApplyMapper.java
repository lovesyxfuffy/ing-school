package com.ing.school.dao.mapper;

import com.ing.school.dao.po.Apply;
import com.ing.school.dao.po.ApplyExample;
import java.util.List;

public interface ApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Apply record);

    int insertSelective(Apply record);

    List<Apply> selectByExample(ApplyExample example);

    Apply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}