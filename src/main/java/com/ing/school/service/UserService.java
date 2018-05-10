package com.ing.school.service;

import com.ing.school.controller.auth.UserInfo;
import com.ing.school.dao.po.User;

/**
 * Created by yujingyang on 2018/4/28.
 */
public interface UserService {
    String pushPermissionCode(String telephone);

    UserInfo login(String telephone, String checkCode);


    UserInfo createUser(String telephone, String checkCode);

    User getUserInfo();

    void editUserInfo(User user);
}
