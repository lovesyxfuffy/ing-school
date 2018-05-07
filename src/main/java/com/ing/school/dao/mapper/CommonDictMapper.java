package com.ing.school.dao.mapper;

import com.ing.school.dao.po.CommonDict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommonDictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommonDict record);

    int insertSelective(CommonDict record);

    CommonDict selectByPrimaryKey(Integer id);

    List<CommonDict> selectByCategory(@Param("category") String category, @Param("parentCode") String parentCode);

    int updateByPrimaryKeySelective(CommonDict record);

    int updateByPrimaryKey(CommonDict record);
}