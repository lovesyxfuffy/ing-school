package com.ing.school.controller.manage.controller;

import com.ing.school.controller.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yujingyang on 2018/5/18.
 */
@RestController
@RequestMapping("/api/manage/user")
public class UserController {

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Result getUserList(){
        return Result.builder().data("").successTrue().build();
    }
}
