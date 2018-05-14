package com.ing.school.controller;

import com.ing.school.controller.utils.Result;
import com.ing.school.service.RecordService;
import com.ing.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/get/schoolInfo/{schoolId}", method = RequestMethod.POST)
    public Result getSchoolInfo(@PathVariable("schoolId") Integer schoolId) {
        return Result.builder().data(recordService.getSchoolInfo(schoolId)).successTrue().build();
    }

    @RequestMapping(value = "/applyInfo/get/{applyId}",method = RequestMethod.POST)
    public Result getApplyInfo(@PathVariable("applyId") Integer applyId){
        return Result.builder().data(recordService.getApplyInfo(applyId)).successTrue().build();
    }



}
