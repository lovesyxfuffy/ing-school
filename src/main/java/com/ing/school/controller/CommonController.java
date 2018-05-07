package com.ing.school.controller;

import com.ing.school.controller.utils.Result;
import com.ing.school.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yujingyang on 2018/5/3.
 */
@RestController
@RequestMapping("/api/common")
public class CommonController {
    @Autowired
    CommonService commonService;

    @RequestMapping(value = "/enum/{category}", method = RequestMethod.POST)
    public Result getEnumByCategory(@RequestParam("parentCode") String parentCode, @PathVariable("category") String category) {
        return Result.builder().data(commonService.getEnumByCategory(category, parentCode)).successTrue().build();
    }
}
