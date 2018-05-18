package com.ing.school.controller.manage.controller;

import com.ing.school.controller.utils.Result;
import com.ing.school.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yujingyang on 2018/5/18.
 */
@RestController
@RequestMapping("/api/manage/config")
public class ConfigController {

    @Autowired
    CommonService commonService;

    @RequestMapping(value = "/ad", method = RequestMethod.POST)
    public Result addAd(@RequestParam("text") String text) {
        commonService.setAdConfig(text);
        return Result.builder().data("").successTrue().build();
    }
}
