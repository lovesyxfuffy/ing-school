package com.ing.school.service.impl;

import com.ing.school.dao.mapper.CommonDictMapper;
import com.ing.school.dao.po.CommonDict;
import com.ing.school.dto.MetaKeyValue;
import com.ing.school.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yujingyang on 2018/5/3.
 */
@Component
public class CommonServiceImpl implements CommonService {


    @Autowired
    private CommonDictMapper commonDictMapper;

    @Override
    @Cacheable(value = "LRUCache-1d",key = "'UserService.search'+'-'+#category")
    public List<MetaKeyValue> getEnumByCategory(String category, String parentCode) {
        List<CommonDict> commonDictList = commonDictMapper.selectByCategory(category, parentCode);
        if (commonDictList.size() == 0)
            return null;
        List<MetaKeyValue> metaList = new ArrayList<>();
        for (CommonDict commonDict : commonDictList) {
            MetaKeyValue meta = new MetaKeyValue();
            meta.setName(commonDict.getCode());
            meta.setCode(commonDict.getName());
            metaList.add(meta);
        }
        return metaList;
    }


    @Override
    @Cacheable(value = "LRUCache-1d",key = "'UserService.search'+'-'+#category")
    public Map<String, String> getEnumByCategory(String category) {
        List<CommonDict> commonDictList = commonDictMapper.selectByCategory(category, null);
        if (commonDictList.size() == 0)
            return null;
        Map<String, String> enumMap = new HashMap<>();
        for (CommonDict commonDict : commonDictList) {
            enumMap.put(commonDict.getCode(), commonDict.getName());
        }
        return enumMap;
    }


}
