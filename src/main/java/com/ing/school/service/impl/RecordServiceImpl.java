package com.ing.school.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ing.school.constants.CostIntervalEnum;
import com.ing.school.constants.EnumConstants;
import com.ing.school.controller.auth.AuthUtil;
import com.ing.school.dao.mapper.*;
import com.ing.school.dao.po.*;
import com.ing.school.dto.PageDto;
import com.ing.school.dto.SearchDto;
import com.ing.school.service.CommonService;
import com.ing.school.service.RecordService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.beans.PropertyDescriptor;
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

    @Autowired
    SchoolInfoMapper schoolInfoMapper;

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
    public List<Map> search(SearchDto searchDto) {
        SchoolExample schoolExample = new SchoolExample();
        SchoolExample.Criteria criteria = schoolExample.createCriteria();
        if (!StringUtils.isEmpty(searchDto.getKeyword())) {
            criteria.andSchoolNameLike("%" + searchDto.getKeyword() + "%");
        }
        if (CollectionUtils.isNotEmpty(searchDto.getContinentCode())) {
            criteria.andContinentCodeIn(searchDto.getContinentCode());
        }
        if (CollectionUtils.isNotEmpty(searchDto.getCountryCode())) {
            criteria.andCountryCodeIn(searchDto.getCountryCode());
        }
        if (CollectionUtils.isNotEmpty(searchDto.getStateCode())) {
            criteria.andStateCodeIn(searchDto.getStateCode());
        }
        if (CollectionUtils.isNotEmpty(searchDto.getSchoolGenderTypeCode())) {
            criteria.andSchoolGenderTypeCodeIn(searchDto.getSchoolGenderTypeCode());
        }
        if (CollectionUtils.isNotEmpty(searchDto.getSchoolTypeCode())) {
            criteria.andSchoolTypeCodeIn(searchDto.getSchoolTypeCode());
        }
        if (CollectionUtils.isNotEmpty(searchDto.getReligionTypeCode())) {
            criteria.andReligionTypeCodeIn(searchDto.getReligionTypeCode());
        }
        if (searchDto.getHasEsl() != null) {
            criteria.andHasEslEqualTo(searchDto.getHasEsl());
        }
        StringBuilder stb = new StringBuilder("and (");
        if (CollectionUtils.isNotEmpty(searchDto.getCostIntervalCode())) {
            List<String> costIntervalEnumList = searchDto.getCostIntervalCode();
            for (String code : costIntervalEnumList) {
                CostIntervalEnum enumItem = CostIntervalEnum.getEnumByCode(code);
                if (enumItem == null)
                    continue;
                Integer upper = enumItem.getCostUpper();
                Integer floor = enumItem.getCostFloor();
                if (upper != null) {
                    stb.append(" school.cost <= ").append(upper);
                    if (floor != null)
                        stb.append(" and school.cost >= ").append(floor);
                } else if (floor != null)
                    stb.append(" school.cost >= ").append(floor);
                stb.append(" or ");
            }
            stb.append(" 1=1 )");
            criteria.addCriterion(stb.toString());
        }
        PageHelper.startPage(searchDto.getPageNo(), searchDto.getPageSize());
        List<School> schoolList = schoolMapper.selectByExample(schoolExample);
        Map<String, String> countryMap = commonService.getEnumByCategory(EnumConstants.COUNTRY);
        Map<String, String> cityMap = commonService.getEnumByCategory(EnumConstants.CITY);
        List<Map> resultList = new ArrayList<>(schoolList.size());
        for (School school : schoolList) {
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("id", school.getId());
            resultMap.put("schoolName", school.getSchoolName());
            resultMap.put("countryName", countryMap.get(school.getCountryCode()) + cityMap.get(school.getCityCode()));
            resultMap.put("mainPicture", school.getMainPicture());
            resultMap.put("positionX", school.getPositionX());
            resultMap.put("positionY", school.getPositionY());
            resultList.add(resultMap);
        }
        return resultList;

    }


    @Override
    public SchoolInfo getSchoolInfo(Integer schoolId) {
        SchoolInfoExample schoolInfoExample = new SchoolInfoExample();
        schoolInfoExample.createCriteria().andSchoolIdEqualTo(schoolId);
        List<SchoolInfo> result = schoolInfoMapper.selectByExample(schoolInfoExample);
        if (result.size() > 1)
            throw new RuntimeException("查询学校详情错误");
        if (result.size() == 1)
            return result.get(0);
        return null;
    }

    @Override
    public Map<String, Object> getApplyInfo(Integer applyId) {
        ApplyExample applyExample = new ApplyExample();
        Apply apply = applyMapper.selectByPrimaryKey(applyId);
        ApplyInfoExample applyInfoExample = new ApplyInfoExample();
        List<ApplyInfo> applyInfoResult = applyInfoMapper.selectByExample(applyInfoExample);
        ApplyInfo applyInfo = null;
        Map<String, Object> resultMap = new HashMap<>();
        try {
            PropertyDescriptor[] applyDescriptors = BeanUtils.getPropertyDescriptors(Apply.class);
            for (PropertyDescriptor applyDescriptor : applyDescriptors) {
                resultMap.put(applyDescriptor.getName(), applyDescriptor.getReadMethod().invoke(apply));
            }
            if (applyInfoResult.size() > 1)
                throw new RuntimeException("获取流程详情错误");
            if (applyInfoResult.size() == 1) {
                PropertyDescriptor[] applyInfoDescriptors = BeanUtils.getPropertyDescriptors(ApplyInfo.class);
                applyInfo = applyInfoResult.get(0);
                for (PropertyDescriptor applyInfoDescriptor : applyInfoDescriptors) {
                    resultMap.put(applyInfoDescriptor.getName(), applyInfoDescriptor.getReadMethod().invoke(applyInfo));
                }
            }
            return resultMap;
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException("流程数据拼装失败");
        }

    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
