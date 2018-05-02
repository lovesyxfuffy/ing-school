package com.ing.school.service;

import com.ing.school.controller.auth.UserInfo;

/**
 * Created by yujingyang on 2018/4/28.
 */
public interface UserService {
    String pushPermissionCode(String telephone);

    UserInfo login(String telephone, String checkCode);
}
