package com.ing.school.dao.mapper;

import com.ing.school.dao.po.Collection;
import com.ing.school.dao.po.CollectionExample;
import java.util.List;

public interface CollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Collection record);

    int insertSelective(Collection record);

    List<Collection> selectByExample(CollectionExample example);

    Collection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);
}