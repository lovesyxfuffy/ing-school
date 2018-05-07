package com.ing.school.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ing.school.constants.EnumConstants;
import com.ing.school.controller.auth.AuthUtil;
import com.ing.school.dao.mapper.ApplyInfoMapper;
import com.ing.school.dao.mapper.ApplyMapper;
import com.ing.school.dao.mapper.CollectionMapper;
import com.ing.school.dao.mapper.SchoolMapper;
import com.ing.school.dao.po.*;
import com.ing.school.dto.PageDto;
import com.ing.school.service.CommonService;
import com.ing.school.service.RecordService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by yujingyang on 2018/5/7.
 */
@Service
public class RecordServiceImpl implements RecordService, ApplicationContextAware {

    @Autowired
    CollectionMapper collectionMapper;

    @Autowired
    CommonService commonService;

    @Autowired
    SchoolMapper schoolMapper;

    @Autowired
    ApplyMapper applyMapper;

    @Autowired
    ApplyInfoMapper applyInfoMapper;

    private ApplicationContext applicationContext;

    @Override
    public Map<String, Object> getCollectionList(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        CollectionExample collectionExample = new CollectionExample();
        collectionExample.createCriteria().andUserIdEqualTo(AuthUtil.getUserId());
        List<Collection> collectionList = collectionMapper.selectByExample(collectionExample);
        Map<Integer, Integer> collectionMapRelation = new HashMap<>();
        PageDto pageDto = new PageDto();
        pageDto.setTotal(((PageInfo) collectionList).getTotal());
        pageDto.setPageNo(pageNo);
        pageDto.setPageSize(pageSize);

        List<Integer> schoolIdList = collectionList.stream().map(Collection::getUserId).collect(Collectors.toList());
        for (Collection collection : collectionList) {
            collectionMapRelation.put(collection.getSchoolId(), collection.getId());
        }

        SchoolExample schoolExample = new SchoolExample();
        schoolExample.createCriteria().andIdIn(schoolIdList);
        List<School> schoolList = schoolMapper.selectByExample(schoolExample);
        Map<String, Object> returnResult = new HashMap<>();
        List<Map> result = new ArrayList<>(schoolIdList.size());
        returnResult.put("tableBody", result);
        returnResult.put("page", pageDto);
        Map<String, String> cityMap = commonService.getEnumByCategory(EnumConstants.CITY);
        Map<String, String> countryMap = commonService.getEnumByCategory(EnumConstants.COUNTRY);

        for (School school : schoolList) {
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("collectionId", collectionMapRelation.get(school.getId()));
            resultMap.put("id", school.getId());
            resultMap.put("schoolName", school.getSchoolName());
            resultMap.put("address", countryMap.get(school.getCountryCode()) + cityMap.get(school.getCityCode()));
            resultMap.put("id", school.getId());
            resultMap.put("mainPicture", school.getMainPicture());
            resultMap.put("positionX", school.getPositionX());
            resultMap.put("positionY", school.getPositionY());
            result.add(resultMap);
        }
        return returnResult;
    }

    @Override
    public void addCollection(Integer schoolId) {
        Collection collection = new Collection();
        collection.setSchoolId(schoolId);
        collection.setUserId(AuthUtil.getUserId());

        collectionMapper.insertSelective(collection);
    }

    @Override
    public void delete(String category, Integer primaryKey) {
        try {
            Object mapper = applicationContext.getBean(Class.forName(category + "Mapper"));
            mapper.getClass().getMethod("deleteByPrimaryKey", Integer.class).invoke(mapper, primaryKey);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("删除错误");
        }
    }

    @Override
    public List<Apply> getApplyList() {
        ApplyExample applyExample = new ApplyExample();
        applyExample.createCriteria().andUserIdEqualTo(AuthUtil.getUserId());
        return applyMapper.selectByExample(applyExample);
    }

    @Override
    @Transactional
    public Integer addApply(Apply apply, ApplyInfo applyInfo) {
        apply.setUserId(AuthUtil.getUserId());
        applyMapper.insertSelective(apply);
        applyInfo.setApplyId(apply.getId());
        applyInfo.setUserId(AuthUtil.getUserId());
        applyInfoMapper.insertSelective(applyInfo);
        return apply.getId();
    }

    

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
