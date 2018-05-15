package com.ing.school.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by yujingyang on 2018/5/15.
 */
@Data
public class ListDto<T> {
    List<T> tableBody;
    PageDto page;
}
