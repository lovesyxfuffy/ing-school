package com.ing.school.dto;

import com.ing.school.dao.po.School;
import lombok.Data;

/**
 * Created by yujingyang on 2018/5/7.
 */
@Data
public class SchoolDto extends School {
    private Integer id;

    private String continentName;

    private String countryName;

    private String stateName;

    private String cityName;

    private String schoolTypeName;

    private String schoolGenderTypeName;

    private String religionTypeName;

    private String hasEsl;
    
}
