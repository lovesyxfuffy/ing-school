package com.ing.school.service;

import com.ing.school.dao.po.Apply;
import com.ing.school.dao.po.ApplyInfo;
import com.ing.school.dto.ListDto;
import com.ing.school.dto.PageDto;
import com.ing.school.dto.SchoolInfoDto;
import com.ing.school.dto.SearchDto;
import org.springframework.web.multipart.MultipartFile;

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



    ListDto<Apply> getApplyList(PageDto pageDtoInput);

    Integer addApply(Apply apply, ApplyInfo applyInfo);

    List<Map> search(SearchDto searchDto);

    SchoolInfoDto getSchoolInfo(Integer schoolId);


    Map<String, Object> getApplyInfo();

    String uploadFile(MultipartFile file);
}
