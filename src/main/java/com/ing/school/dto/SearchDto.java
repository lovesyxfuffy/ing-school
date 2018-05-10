package com.ing.school.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by yujingyang on 2018/5/10.
 */
@Data
public class SearchDto {
    String keyword;

    List<String> continentCode;

    List<String> countryCode;

    List<String> stateCode;

    List<String> schoolGenderTypeCode;

    List<String> schoolTypeCode;

    List<String> religionTypeCode;

    Boolean hasEsl;

    List<String> costIntervalCode;

    Integer pageNo;

    Integer pageSize;

}
