package com.ing.school.controller;

import com.ing.school.controller.utils.Result;
import com.ing.school.service.RecordService;
import com.ing.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yujingyang on 2018/5/7.
 */
@RestController
@RequestMapping("/api/record")
public class RecordController {

    @Autowired
    RecordService recordService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/collectionList", method = RequestMethod.POST)
    public Result getCollectionList(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize) {
        return Result.builder().data(recordService.getCollectionList(pageNo, pageSize)).successTrue().build();
    }

    @RequestMapping(value = "/apply/list", method = RequestMethod.POST)
    public Result getApplyList() {
        return Result.builder().data(recordService.getApplyList()).successTrue().build();
    }

    @RequestMapping(value = "/user/get", method = RequestMethod.POST)
    public Result getUserInfo() {
        return Result.builder().data(userService.getUserInfo()).successTrue().build();
    }

}
