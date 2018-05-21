package com.ing.school.service;

import com.ing.school.dto.MetaKeyValue;
import com.ing.school.dto.UploadDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * Created by yujingyang on 2018/5/3.
 */
public interface CommonService {

    List<MetaKeyValue> getEnumByCategory(String category, String parentCode);

    Map<String, String> getEnumByCategory(String category);

    String getAdConfig();

    void setAdConfig(String text);

    List<Map> getChoicestSchool();

    UploadDTO upload(MultipartFile file);
}
