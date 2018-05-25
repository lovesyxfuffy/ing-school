package com.ing.school.controller;

import com.ing.school.controller.auth.AuthUtil;
import com.ing.school.controller.utils.Result;
import com.ing.school.dto.PageDto;
import com.ing.school.service.RecordService;
import com.ing.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
        return Result.builder().data(recordService.getCollectionList(pageNo, pageSize,AuthUtil.getUserId())).successTrue().build();
    }

    @RequestMapping(value = "/apply/list", method = RequestMethod.POST)
    public Result getApplyList(PageDto pageDto) {
        return Result.builder().data(recordService.getApplyList(pageDto, AuthUtil.getUserId())).successTrue().build();
    }

    @RequestMapping(value = "/user/get", method = RequestMethod.POST)
    public Result getUserInfo() {
        return Result.builder().data(userService.getUserInfo()).successTrue().build();
    }

    @RequestMapping(value = "/get/schoolInfo/{schoolId}", method = RequestMethod.POST)
    public Result getSchoolInfo(@PathVariable("schoolId") Integer schoolId) {
        return Result.builder().data(recordService.getSchoolInfo(schoolId)).successTrue().build();
    }

    @RequestMapping(value = "/applyInfo/get", method = RequestMethod.POST)
    public Result getApplyInfo() {
        return Result.builder().data(recordService.getApplyInfo()).successTrue().build();
    }

    @RequestMapping(value = "/file/upload", method = RequestMethod.POST)
    public Result uploadFile(@RequestParam("file") MultipartFile file) {
        return Result.builder().data(recordService.uploadFile(file)).successTrue().build();
    }


}
