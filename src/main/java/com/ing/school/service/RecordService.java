package com.ing.school.service;

import com.ing.school.dao.po.Apply;
import com.ing.school.dao.po.ApplyInfo;
import com.ing.school.dao.po.ChoicestSchool;
import com.ing.school.dao.po.SchoolInfo;
import com.ing.school.dto.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by yujingyang on 2018/5/7.
 */
public interface RecordService  {

    Map<String, Object> getCollectionList(Integer pageNo, Integer pageSize);

    void addCollection(Integer schoolId);

    void deleteCollection(Integer schoolId);

    void delete(String category, Integer primaryKey);


    ListDto<Apply> getApplyList(PageDto pageDtoInput, Integer userId);

    Integer addApply(Apply apply, ApplyInfo applyInfo);

    ListDto<Map> search(SearchDto searchDto);


    SchoolInfoDto getSchoolInfo(Integer schoolId);


    Map<String, Object> getApplyInfo();

    String uploadFile(MultipartFile file);

    ListDto<Apply> getApplyList(PageDto page, Date startTime, String sortOrder);

    Map<String, Object> getApplyInfoById(Integer userId);

    void addSchoolInfo(SchoolInfo schoolInfo);

    List<ChoicestSchool> getChoicestList();

    void followUp(String followUpContent, Integer applyId);

    void addChoicestSchool(ChoicestSchool choicestSchool);

    void deleteSchool(Integer id);

    void deleteChoicestSchool(Integer id);

    ListDto<SchoolDto> getSchoolList(PageDto page);
}
