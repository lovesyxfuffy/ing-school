package com.ing.school.dto;

import com.ing.school.dao.po.Apply;
import lombok.Data;

import java.util.List;

/**
 * Created by yujingyang on 2018/5/18.
 */
@Data
public class UserDto {
    private Integer id;

    private String name;

    private String nickname;

    private String telephone;

    private String idcard;

    private String genderCode;

    private Integer age;

    private String address;

    private String avatarUrl;

    private String englishLevelTypeCode;

    private Double englishLevelScore;

    private Integer status;

    private List<Apply> applyList;
}
