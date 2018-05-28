package com.ing.school.service.impl;

import com.ing.school.constants.ConfigConstants;
import com.ing.school.constants.EnumConstants;
import com.ing.school.dao.mapper.ChoicestSchoolMapper;
import com.ing.school.dao.mapper.CommonDictMapper;
import com.ing.school.dao.mapper.ConfigMapper;
import com.ing.school.dao.mapper.SchoolMapper;
import com.ing.school.dao.po.*;
import com.ing.school.dto.MetaKeyValue;
import com.ing.school.dto.UploadDTO;
import com.ing.school.service.CommonService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;
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

    @Autowired
    private CommonService commonService;

    @Override
    @Cacheable(value = "LRUCache-1d", key = "'UserService.search'+'-'+#category")
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
    public Map<String, String> getEnumByCategoryXargs(String category) {
        return getEnumByCategoryXargs(category, null);
    }

    @Override
    @Cacheable(value = "LRUCache-1d", key = "'UserService.search'+'-'+#category")
    public Map<String, String> getEnumByCategoryXargs(String category, String parentCode) {
        List<CommonDict> commonDictList = commonDictMapper.selectByCategory(category, null);
        if (commonDictList.size() == 0)
            return null;
        Map<String, String> enumMap = new HashMap<>();
        for (CommonDict commonDict : commonDictList) {
            enumMap.put(commonDict.getName(), commonDict.getCode());
        }
        return enumMap;
    }

    @Override
    @Cacheable(value = "LRUCache-1d", key = "'UserService.search'+'-'+#category")
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
    public String getAdConfig() {
        ConfigExample configExample = new ConfigExample();
        configExample.createCriteria().andTypeEqualTo(ConfigConstants.ADVERTISEMENT);
        List<Config> configList = configMapper.selectByExample(configExample);
        return configList.get(0).getConfigValue();
    }

    @Override
    public void setAdConfig(String text) {
        Config config = new Config();
        config.setConfigKey(ConfigConstants.ADVERTISEMENT);
        config.setConfigValue(text);
        config.setType(ConfigConstants.ADVERTISEMENT);

        configMapper.updateByPrimaryKeySelective(config);
    }

    @Override
    public List<Map> getChoicestSchool() {
        ChoicestSchoolExample choicestSchoolExample = new ChoicestSchoolExample();
        List<ChoicestSchool> choicestSchoolList = choicestSchoolMapper.selectByExampleWithBLOBs(choicestSchoolExample);
        List<Integer> schoolIdList = choicestSchoolList.stream()
                .map(ChoicestSchool::getSchoolId)
                .collect(Collectors.toList());
        Map<Integer, ChoicestSchool> tmpMap = new HashMap<>();
        for (ChoicestSchool choicestSchool : choicestSchoolList) {
            tmpMap.put(choicestSchool.getSchoolId(), choicestSchool);
        }
        List<Map> result = new ArrayList<>();
        if (CollectionUtils.isEmpty(schoolIdList))
            return result;
        SchoolExample schoolExample = new SchoolExample();
        schoolExample.createCriteria().andIdIn(schoolIdList);
        List<School> schoolList = schoolMapper.selectByExample(schoolExample);
        for (School school : schoolList) {
            Map<String, Object> rowMap = new HashMap<>();
            rowMap.put("schoolId", school.getId());
            rowMap.put("schoolName", school.getSchoolName());
            rowMap.put("schoolEnglishName", school.getSchoolEnglishName());
            rowMap.put("mainPicture", tmpMap.get(school.getId()).getMainPicture());
            rowMap.put("choicestContent", tmpMap.get(school.getId()).getChoicestContent());
            result.add(rowMap);
        }
        return result;
    }

    @Override
    public UploadDTO upload(MultipartFile file) {
        try {
            String jpegHeader = "FFD8FF";
            String pngHeader = "89504E47";
            String gifHeader = "47494638";
            String fileTypeHex = String.valueOf(bytesToHexString(file.getBytes())).toUpperCase();
            if (fileTypeHex.startsWith(jpegHeader) || fileTypeHex.startsWith(pngHeader) || fileTypeHex.startsWith(gifHeader)) {
                String id = UUID.randomUUID().toString().replaceAll("-", "");
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File("/var/www/static", id));
                return new UploadDTO(file, id, "SUCCESS");
            } else {
                return new UploadDTO(file, null, "IO");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new UploadDTO(file, null, "IO");
        }
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
    @Transactional
    public void resolveExcel(MultipartFile file) throws Exception {
        Sheet sheet = WorkbookFactory.create(file.getInputStream()).getSheetAt(0);
        Map<String, String> continentMap = commonService.getEnumByCategoryXargs(EnumConstants.CONTINENT);
        Map<String, String> countryMap = commonService.getEnumByCategoryXargs(EnumConstants.COUNTRY);
        Map<String, String> stateMap = commonService.getEnumByCategoryXargs(EnumConstants.STATE);
        Map<String, String> cityMap = commonService.getEnumByCategoryXargs(EnumConstants.CITY);
        Map<String, String> schoolTypeMap = commonService.getEnumByCategoryXargs(EnumConstants.SCHOOL_TYPE);
        Map<String, String> genderTypeMap = commonService.getEnumByCategoryXargs(EnumConstants.SCHOOL_GENDER_TYPE);
        Map<String, String> religionTypeMap = commonService.getEnumByCategoryXargs(EnumConstants.RELIGION_TYPE);
        //学校姓名 英文名 大洲名称 国家名称 洲名 城市名  学校类型（寄宿走读）  学校性别类型（男校女校） 学校宗教类型 花费（单位 万元） 主页图地址（需先上传 ） 经度 纬度 是否有esl  分数线
        for (Row row : sheet) {
            if (row.getRowNum() == 0)
                continue;
            School school = new School();
            if (row.getCell(0) == null)
                continue;
            System.out.println(row.getCell(0).getStringCellValue());
            school.setSchoolName(row.getCell(0).getStringCellValue());
            school.setSchoolEnglishName(row.getCell(1).getStringCellValue());
            school.setContinentCode(continentMap.get(row.getCell(2).getStringCellValue()));
            school.setCountryCode(countryMap.get(row.getCell(3).getStringCellValue()));
            school.setStateCode(stateMap.get(row.getCell(4).getStringCellValue()));
            school.setCityCode(cityMap.get(row.getCell(5).getStringCellValue()));
            school.setSchoolTypeCode(schoolTypeMap.get(row.getCell(6).getStringCellValue()));
            school.setSchoolGenderTypeCode(genderTypeMap.get(row.getCell(7).getStringCellValue()));
            school.setReligionTypeCode(religionTypeMap.get(row.getCell(8).getStringCellValue()));
            school.setCost((int) row.getCell(9).getNumericCellValue());
            school.setMainPicture(row.getCell(10) != null ? row.getCell(10).getStringCellValue() : null);
            school.setPositionX(row.getCell(11).getNumericCellValue());
            school.setPositionY(row.getCell(12).getNumericCellValue());
            school.setHasEsl("是".equals(row.getCell(13).getStringCellValue()));
            school.setPassingScore(row.getCell(14).getNumericCellValue());
            school.setCollectionCount(0);
            schoolMapper.insertSelective(school);
        }
    }

}
