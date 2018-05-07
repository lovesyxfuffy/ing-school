package com.ing.school.dto;

import lombok.Data;

/**
 * Created by yujingyang on 2018/5/7.
 */
@Data
public class PageDto {
    Integer pageNo;
    Integer pageSize;
    Long total;
}
