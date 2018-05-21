package com.ing.school.controller.manage.controller;

import com.google.gson.Gson;
import com.ing.school.controller.utils.Result;
import com.ing.school.dto.UploadDTO;
import com.ing.school.service.CommonService;
import com.ing.school.utls.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by yujingyang on 2018/5/18.
 */
@RestController
@RequestMapping("/api/manage/config")
public class ConfigController {

    @Autowired
    CommonService commonService;
    @Autowired
    Gson gson;

    @RequestMapping(value = "/ad", method = RequestMethod.POST)
    public Result addAd(@RequestParam("text") String text) {
        commonService.setAdConfig(text);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "config", produces = "text/html;charset=UTF-8", method = {RequestMethod.POST, RequestMethod.GET})
    public String config(String action, MultipartFile file) {
        if ("config".equals(action)) {
            return Config.config;
        }
        UploadDTO to = commonService.upload(file);
        return gson.toJson(to);
    }
}