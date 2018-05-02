package com.ing.school.service.impl;

import com.ing.school.constants.LoginConstants;
import com.ing.school.controller.auth.UserInfo;
import com.ing.school.dao.mapper.UserMapper;
import com.ing.school.dao.po.User;
import com.ing.school.dao.po.UserExample;
import com.ing.school.service.UserService;
import com.ing.school.utls.CacheUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * Created by yujingyang on 2018/4/28.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public String pushPermissionCode(String telephone) {
        String code = "";
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            code += random.nextInt(10);
        }
        return code;
    }

    @Override
    public UserInfo login(String telephone, String checkCode) {
        String telephoneKey = LoginConstants.TELEPHONE_KEY + telephone;
        String checkCodeCache = CacheUtils.get(telephoneKey);
        CacheUtils.remove(telephoneKey);
        if (checkCodeCache != null && checkCodeCache.equals(checkCode)) {
            UserExample userExample = new UserExample();
            userExample.createCriteria().andTelephoneEqualTo(telephone);
            List<User> userList = userMapper.selectByExample(userExample);
            if (userList.size() != 1)
                return null;
            User userDto = userList.get(0);
            UserInfo userInfo = new UserInfo();
            userInfo.setTelephone(userDto.getTelephone());
            userInfo.setAvatarUrl(userDto.getAvatarUrl());
            userInfo.setName(userDto.getName());
            userInfo.setUserId(userDto.getId());
            return userInfo;
        }
        return null;
    }


}
