package com.ing.school.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ing.school.constants.BooleanConstants;
import com.ing.school.constants.CostIntervalEnum;
import com.ing.school.constants.EnumConstants;
import com.ing.school.constants.FollowUpStatusConstants;
import com.ing.school.controller.auth.AuthUtil;
import com.ing.school.dao.mapper.*;
import com.ing.school.dao.po.*;
import com.ing.school.dao.po.Collection;
import com.ing.school.dto.*;
import com.ing.school.service.CommonService;
import com.ing.school.service.RecordService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.beans.PropertyDescriptor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by yujingyang on 2018/5/7.
 */
@Service
public class RecordServiceImpl implements RecordService, ApplicationContextAware {

    @Autowired
    CollectionMapper collectionMapper;

    @Autowired
    SchoolMapper schoolMapper;

    @Autowired
    ApplyMapper applyMapper;

    @Autowired
    ApplyInfoMapper applyInfoMapper;

    @Autowired
    SchoolInfoMapper schoolInfoMapper;

    @Autowired
    CommonService commonService;

    @Autowired
    ChoicestSchoolMapper choicestSchoolMapper;

    private ApplicationContext applicationContext;

    @Override
    public Map<String, Object> getCollectionList(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        CollectionExample collectionExample = new CollectionExample();
        collectionExample.createCriteria().andUserIdEqualTo(AuthUtil.getUserId());
        List<Collection> collectionList = collectionMapper.selectByExample(collectionExample);
        Map<Integer, Integer> collectionMapRelation = new HashMap<>();
        PageDto pageDto = new PageDto();
        pageDto.setTotal(((Page) collectionList).getTotal());
        pageDto.setPageNo(pageNo);
        pageDto.setPageSize(pageSize);

        List<Integer> schoolIdList = collectionList.stream().map(Collection::getUserId).collect(Collectors.toList());
        for (Collection collection : collectionList) {
            collectionMapRelation.put(collection.getSchoolId(), collection.getId());
        }
        Map<String, Object> returnResult = new HashMap<>();
        List<Map> result = new ArrayList<>(schoolIdList.size());
        returnResult.put("tableBody", result);
        returnResult.put("page", pageDto);
        if (CollectionUtils.isEmpty(schoolIdList))
            return returnResult;
        SchoolExample schoolExample = new SchoolExample();
        schoolExample.createCriteria().andIdIn(schoolIdList);
        List<School> schoolList = schoolMapper.selectByExample(schoolExample);

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
    @Transactional
    public void addCollection(Integer schoolId) {
        Collection collection = new Collection();
        collection.setSchoolId(schoolId);
        collection.setUserId(AuthUtil.getUserId());
        schoolMapper.updateCount(schoolId);

        collectionMapper.insertSelective(collection);
    }

    @Override
    public void deleteCollection(Integer schoolId) {
        CollectionExample collection = new CollectionExample();
        collection.createCriteria().andSchoolIdEqualTo(schoolId).andUserIdEqualTo(AuthUtil.getUserId());
        List<Collection> collectionList = collectionMapper.selectByExample(collection);
        for (Collection collection1 : collectionList) {
            collectionMapper.deleteByPrimaryKey(collection1.getId());
        }
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
    public ListDto<Apply> getApplyList(PageDto pageDtoInput,Integer userId) {
        PageHelper.startPage(pageDtoInput.getPageNo(), pageDtoInput.getPageSize());
        ApplyExample applyExample = new ApplyExample();
        applyExample.createCriteria().andUserIdEqualTo(userId);
        List<Apply> result = applyMapper.selectByExample(applyExample);
        ListDto<Apply> listDto = new ListDto<>();
        PageDto pageDto = new PageDto();
        pageDto.setPageSize(pageDtoInput.getPageSize());
        pageDto.setPageNo(pageDtoInput.getPageNo());
        pageDto.setTotal(((Page) result).getTotal());
        listDto.setTableBody(result);
        listDto.setPage(pageDto);
        return listDto;
    }

    @Override
    @Transactional
    public Integer addApply(Apply apply, ApplyInfo applyInfo) {
        apply.setUserId(AuthUtil.getUserId());
        apply.setApplyTime(new Date());
        School school = schoolMapper.selectByPrimaryKey(apply.getSchoolId());
        apply.setSchoolName(school.getSchoolName());
        apply.setSchoolEnglishName(school.getSchoolEnglishName());

        ApplyExample applyExample = new ApplyExample();
        applyExample.createCriteria().andSchoolIdEqualTo(apply.getSchoolId()).andUserIdEqualTo(AuthUtil.getUserId());
        if (applyMapper.selectByExample(applyExample).size() == 0)
            applyMapper.insertSelective(apply);
        ApplyInfoExample applyInfoExample = new ApplyInfoExample();
        applyInfoExample.createCriteria().andUserIdEqualTo(AuthUtil.getUserId());
        List<ApplyInfo> applyInfoResult = applyInfoMapper.selectByExample(applyInfoExample);
        applyInfo.setApplyId(apply.getId());
        applyInfo.setUserId(AuthUtil.getUserId());
        if (applyInfoResult.size() == 0)
            applyInfoMapper.insertSelective(applyInfo);
        else if (applyInfoResult.size() == 1) {
            applyInfo.setId(applyInfoResult.get(0).getId());
            applyInfoMapper.updateByPrimaryKeySelective(applyInfo);
        } else {
            throw new RuntimeException("申请详情查询错误");
        }
        return apply.getId();
    }

    @Override
    public ListDto<Map> search(SearchDto searchDto) {
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
        if (CollectionUtils.isNotEmpty(searchDto.getHasEsl())) {
            String eslBoolean = searchDto.getHasEsl().get(0);
            if (BooleanConstants.TREU.equals(eslBoolean))
                criteria.andHasEslEqualTo(true);
            if (BooleanConstants.FALSE.equals(eslBoolean))
                criteria.andHasEslEqualTo(false);
        }
        StringBuilder stb = new StringBuilder("(");
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
        if (searchDto.getSortByScore())
            schoolExample.setOrderByClause("passingScore desc");
        else
            schoolExample.setOrderByClause("collectionCount desc");
        PageHelper.startPage(searchDto.getPageNo(), searchDto.getPageSize());
        List<School> schoolList = schoolMapper.selectByExample(schoolExample);
        Map<String, String> countryMap = commonService.getEnumByCategory(EnumConstants.COUNTRY);
        Map<String, String> cityMap = commonService.getEnumByCategory(EnumConstants.CITY);
        List<Map> resultList = new ArrayList<>(schoolList.size());
        Page page = (Page) schoolList;
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
        ListDto<Map> listDto = new ListDto<>();
        listDto.setTableBody(resultList);
        PageDto pageDto = new PageDto();
        pageDto.setPageNo(searchDto.getPageNo());
        pageDto.setPageSize(searchDto.getPageSize());
        pageDto.setTotal(page.getTotal());
        listDto.setPage(pageDto);
        return listDto;

    }


    @Override
    public SchoolInfoDto getSchoolInfo(Integer schoolId) {
        SchoolInfoExample schoolInfoExample = new SchoolInfoExample();
        schoolInfoExample.createCriteria().andSchoolIdEqualTo(schoolId);
        List<SchoolInfo> result = schoolInfoMapper.selectByExample(schoolInfoExample);
        School school = schoolMapper.selectByPrimaryKey(schoolId);
        if (result.size() > 1)
            throw new RuntimeException("查询学校详情错误");
        if (result.size() == 1) {
            SchoolInfoDto schoolInfoDto = new SchoolInfoDto();
            SchoolInfo schoolInfo = result.get(0);
            BeanUtils.copyProperties(school, schoolInfoDto);
            BeanUtils.copyProperties(schoolInfo, schoolInfoDto);
            CollectionExample collectionExample = new CollectionExample();
            collectionExample.createCriteria().andUserIdEqualTo(AuthUtil.getUserId());
            schoolInfoDto.setIsCollected(collectionMapper.selectByExample(collectionExample).size() > 0);

            return schoolInfoDto;
        }
        return null;
    }

    @Override
    public Map<String, Object> getApplyInfo() {
        ApplyInfoExample applyInfoExample = new ApplyInfoExample();
        applyInfoExample.createCriteria().andUserIdEqualTo(AuthUtil.getUserId());
        List<ApplyInfo> applyInfoResult = applyInfoMapper.selectByExample(applyInfoExample);
        ApplyInfo applyInfo;
        Map<String, Object> resultMap = new HashMap<>();
        try {
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
    public String uploadFile(MultipartFile file) {
        try {
            String jpegHeader = "FFD8FF";
            String pngHeader = "89504E47";
            String gifHeader = "47494638";
            String fileTypeHex = String.valueOf(bytesToHexString(file.getBytes())).toUpperCase();
            if (fileTypeHex.startsWith(jpegHeader) || fileTypeHex.startsWith(pngHeader) || fileTypeHex.startsWith(gifHeader)) {
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File("/var/www/static/", file.getOriginalFilename()));

                return "/static/" + UUID.randomUUID().toString().replace("-", "") + "_"
                        + file.getOriginalFilename();
            } else {
                throw new RuntimeException("文件格式不正确");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    @Override
    public ListDto<Apply> getApplyList(PageDto page, Date startTime, String sortOrder) {
        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        ApplyExample applyExample = new ApplyExample();
        if (startTime != null)
            applyExample.createCriteria().andApplyTimeGreaterThanOrEqualTo(startTime);
        if (sortOrder != null)
            applyExample.setOrderByClause("applyTime " + sortOrder);
        List<Apply> applyList = applyMapper.selectByExample(applyExample);
        ListDto<Apply> result = new ListDto<>();
        PageDto resultPage = new PageDto();
        resultPage.setTotal(((Page) applyList).getTotal());
        resultPage.setPageNo(page.getPageNo());
        resultPage.setPageSize(page.getPageSize());
        result.setTableBody(applyList);
        result.setPage(resultPage);
        return result;
    }

    @Override
    public Map<String, Object> getApplyInfoById(Integer userId) {
        ApplyInfoExample applyInfoExample = new ApplyInfoExample();
        applyInfoExample.createCriteria().andUserIdEqualTo(userId);
        List<ApplyInfo> applyInfoResult = applyInfoMapper.selectByExample(applyInfoExample);
        ApplyInfo applyInfo;
        Map<String, Object> resultMap = new HashMap<>();
        try {
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
    @Transactional
    public void addSchoolInfo(SchoolInfo schoolInfo) {
        SchoolInfoExample schoolInfoExample = new SchoolInfoExample();
        schoolInfoExample.createCriteria().andSchoolIdEqualTo(schoolInfo.getSchoolId());
        if (schoolInfoMapper.selectByExample(schoolInfoExample).size() > 0) {
            schoolInfoMapper.insertSelective(schoolInfo);
        } else {
            schoolInfoMapper.updateByExample(schoolInfo, schoolInfoExample);
        }
    }


    @Override
    public List<ChoicestSchool> getChoicestList() {
        List<ChoicestSchool> choicestList = choicestSchoolMapper.selectByExample(new ChoicestSchoolExample());
        choicestList.forEach((row) -> row.setSchoolName(schoolMapper.selectByPrimaryKey(row.getSchoolId()).getSchoolName()));
        return choicestList;
    }

    @Override
    public void followUp(String followUpContent, Integer applyId) {
        Apply apply = new Apply();
        apply.setId(applyId);
        apply.setFollowUpStatus(FollowUpStatusConstants.FINISH_FOLLOW_UP);
        apply.setFollowUpContent(followUpContent);
        applyMapper.updateByPrimaryKeySelective(apply);
    }

    @Override
    public void addChoicestSchool(ChoicestSchool choicestSchool) {
        choicestSchoolMapper.insertSelective(choicestSchool);
    }


    @Transactional
    @Override
    public void deleteSchool(Integer id) {
        schoolMapper.deleteByPrimaryKey(id);
        SchoolInfoExample schoolInfoExample = new SchoolInfoExample();
        schoolInfoExample.createCriteria().andSchoolIdEqualTo(id);
        schoolInfoMapper.deleteByExample(schoolInfoExample);
    }

    @Override
    public void deleteChoicestSchool(Integer id) {
        choicestSchoolMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ListDto<SchoolDto> getSchoolList(PageDto page) {
        Map<String, String> continentMap = commonService.getEnumByCategory(EnumConstants.CONTINENT);
        Map<String, String> countryMap = commonService.getEnumByCategory(EnumConstants.COUNTRY);
        Map<String, String> stateMap = commonService.getEnumByCategory(EnumConstants.STATE);
        Map<String, String> cityMap = commonService.getEnumByCategory(EnumConstants.CITY);
        Map<String, String> schoolTypeMap = commonService.getEnumByCategory(EnumConstants.SCHOOL_TYPE);
        Map<String, String> genderTypeMap = commonService.getEnumByCategory(EnumConstants.SCHOOL_GENDER_TYPE);
        Map<String, String> religionTypeMap = commonService.getEnumByCategory(EnumConstants.RELIGION_TYPE);

        PageHelper.startPage(page.getPageNo(), page.getPageSize());
        List<School> schoolList = schoolMapper.selectByExample(new SchoolExample());
        List<SchoolDto> resultList = new ArrayList<>(schoolList.size());
        schoolList.forEach((row) -> {
            SchoolDto schoolDto = new SchoolDto();
            schoolDto.setId(row.getId());
            schoolDto.setSchoolName(row.getSchoolName());
            schoolDto.setSchoolEnglishName(row.getSchoolEnglishName());
            schoolDto.setCityName(cityMap.get(row.getCityCode()));
            schoolDto.setContinentName(continentMap.get(row.getContinentCode()));
            schoolDto.setCountryName(countryMap.get(row.getCountryCode()));
            schoolDto.setReligionTypeName(religionTypeMap.get(row.getReligionTypeCode()));
            schoolDto.setSchoolGenderTypeName(genderTypeMap.get(row.getSchoolGenderTypeCode()));
            schoolDto.setSchoolTypeName(schoolTypeMap.get(schoolTypeMap.get(row.getSchoolTypeCode())));
            schoolDto.setStateName(stateMap.get(row.getStateCode()));
            schoolDto.setHasEsl(row.getHasEsl());
            resultList.add(schoolDto);
        });
        ListDto<SchoolDto> result = new ListDto<>();
        PageDto resultPage = new PageDto();
        BeanUtils.copyProperties(page, resultPage);
        resultPage.setTotal(((Page) schoolList).getTotal());
        result.setTableBody(resultList);
        result.setPage(resultPage);
        return result;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
