package com.ing.school.controller.manage.controller;

import com.ing.school.controller.utils.Result;
import com.ing.school.dto.PageDto;
import com.ing.school.service.ManageService;
import com.ing.school.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yujingyang on 2018/5/18.
 */
@RestController("manageUserController")
@RequestMapping("/api/manage/user")
public class UserController {
    @Autowired
    ManageService manageService;

    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    public Result getUserList(PageDto pageDto){
        return Result.builder().data(manageService.getUserList(pageDto)).successTrue().build();
    }

    @RequestMapping(value = "/userInfo/{userId}",method = RequestMethod.POST)
    public Result getUserInfo(@PathVariable("userId") Integer  userId){
        return Result.builder().data(manageService.getUserInfo(userId)).successTrue().build();
    }
}
