package com.ing.school.service;

import com.ing.school.dao.po.Apply;
import com.ing.school.dao.po.ApplyInfo;
import com.ing.school.dao.po.SchoolInfo;
import com.ing.school.dto.SearchDto;

import java.util.List;
import java.util.Map;

/**
 * Created by yujingyang on 2018/5/7.
 */
public interface RecordService  {

    Map<String, Object> getCollectionList(Integer pageNo, Integer pageSize);

    void addCollection(Integer schoolId);

    void delete(String category, Integer primaryKey);

    List<Apply> getApplyList();

    Integer addApply(Apply apply, ApplyInfo applyInfo);

    List<Map> search(SearchDto searchDto);

    SchoolInfo getSchoolInfo(Integer schoolId);

    Map<String, Object> getApplyInfo(Integer applyId);
}
