package com.ing.school.service;

import com.ing.school.dto.MetaKeyValue;

import java.util.List;
import java.util.Map;

/**
 * Created by yujingyang on 2018/5/3.
 */
public interface CommonService {

    List<MetaKeyValue> getEnumByCategory(String category, String parentCode);

    Map<String, String> getEnumByCategory(String category);
}
