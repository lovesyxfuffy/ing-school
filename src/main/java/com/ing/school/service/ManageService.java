package com.ing.school.service;

import com.ing.school.dao.po.User;
import com.ing.school.dto.ListDto;
import com.ing.school.dto.PageDto;
import com.ing.school.dto.UserDto;

/**
 * Created by yujingyang on 2018/5/18.
 */
public interface ManageService {
    ListDto<User> getUserList(PageDto pageDto);

    UserDto getUserInfo(Integer userId);
}
