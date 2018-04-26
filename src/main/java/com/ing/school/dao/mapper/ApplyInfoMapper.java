package com.ing.school.dao.mapper;

import com.ing.school.dao.po.ApplyInfo;
import com.ing.school.dao.po.ApplyInfoExample;
import java.util.List;

public interface ApplyInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApplyInfo record);

    int insertSelective(ApplyInfo record);

    List<ApplyInfo> selectByExampleWithBLOBs(ApplyInfoExample example);

    List<ApplyInfo> selectByExample(ApplyInfoExample example);

    ApplyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyInfo record);

    int updateByPrimaryKeyWithBLOBs(ApplyInfo record);

    int updateByPrimaryKey(ApplyInfo record);
}