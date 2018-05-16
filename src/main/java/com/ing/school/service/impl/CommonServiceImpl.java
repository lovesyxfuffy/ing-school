package com.ing.school.service.impl;

import com.ing.school.constants.ConfigConstants;
import com.ing.school.dao.mapper.ChoicestSchoolMapper;
import com.ing.school.dao.mapper.CommonDictMapper;
import com.ing.school.dao.mapper.ConfigMapper;
import com.ing.school.dao.mapper.SchoolMapper;
import com.ing.school.dao.po.*;
import com.ing.school.dto.MetaKeyValue;
import com.ing.school.service.CommonService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by yujingyang on 2018/5/3.
 */
@Service
public class CommonServiceImpl implements CommonService {


    @Autowired
    private CommonDictMapper commonDictMapper;

    @Autowired
    private ConfigMapper configMapper;

    @Autowired
    private ChoicestSchoolMapper choicestSchoolMapper;

    @Autowired
    private SchoolMapper schoolMapper;

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


    @Override
    public String getAdConfig(){
        ConfigExample configExample = new ConfigExample();
        configExample.createCriteria().andTypeEqualTo(ConfigConstants.ADVERTISEMENT);
        List<Config> configList = configMapper.selectByExample(configExample);
        return configList.get(0).getConfigValue();
    }

    @Override
    public List<Map> getChoicestSchool(){
        ChoicestSchoolExample choicestSchoolExample = new ChoicestSchoolExample();
        List<ChoicestSchool> choicestSchoolList = choicestSchoolMapper.selectByExample(choicestSchoolExample);
        List<Integer> schoolIdList = choicestSchoolList.stream().map(ChoicestSchool::getId).collect(Collectors.toList());
        Map<Integer,ChoicestSchool> tmpMap = new HashMap<>();
        for (ChoicestSchool choicestSchool : choicestSchoolList) {
            tmpMap.put(choicestSchool.getSchoolId(),choicestSchool);
        }
        List<Map> result = new ArrayList<>();
        if(CollectionUtils.isEmpty(result))
            return result;
        SchoolExample schoolExample = new SchoolExample();
        schoolExample.createCriteria().andIdIn(schoolIdList);
        List<School> schoolList = schoolMapper.selectByExample(schoolExample);
        for (School school : schoolList) {
            Map<String,Object> rowMap = new HashMap<>();
            rowMap.put("schoolId",school.getId());
            rowMap.put("schoolName",school.getSchoolName());
            rowMap.put("schoolEnglishName",school.getSchoolEnglishName());
            rowMap.put("mainPicture",tmpMap.get(school.getId()).getMainPicture());
            rowMap.put("choicestContent",tmpMap.get(school.getId()).getChoicestContent());
            result.add(rowMap);
        }
        return result;
    }


}
