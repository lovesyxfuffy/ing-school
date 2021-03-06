package com.ing.school.controller;

import com.ing.school.controller.auth.AuthUtil;
import com.ing.school.controller.utils.Result;
import com.ing.school.dao.po.Apply;
import com.ing.school.dao.po.ApplyInfo;
import com.ing.school.dao.po.User;
import com.ing.school.dto.SearchDto;
import com.ing.school.service.RecordService;
import com.ing.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yujingyang on 2018/5/7.
 */
@RestController
@RequestMapping("/api/operator")
public class OperatorController {
    @Autowired
    RecordService recordService;
    @Autowired
    UserService userService;


    @RequestMapping(value = "/{category}/delete/{collectionId}", method = RequestMethod.POST)
    public Result delete(@PathVariable("category") String category, @PathVariable("collectionId") Integer collectionId) {
        recordService.delete(category, collectionId);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/collection/add", method = RequestMethod.POST)
    public Result addCollection(@RequestParam("schoolId") Integer schoolId) {
        recordService.addCollection(schoolId);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/collection/delete", method = RequestMethod.POST)
    public Result removeCollection(@RequestParam("schoolId") Integer schoolId) {
        recordService.deleteCollection(schoolId);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/apply/add", method = RequestMethod.POST)
    public Result addApply(Apply apply, ApplyInfo applyInfo) {
        Integer applyId = recordService.addApply(apply, applyInfo);
        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("id", applyId);
        return Result.builder().data(resultMap).successTrue().build();
    }

    @RequestMapping(value = "/user/edit", method = RequestMethod.POST)
    public Result editUser(User user) {
        userService.editUserInfo(user, AuthUtil.getUserId());
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/search/schoolList", method = RequestMethod.POST)
    public Result Search(@RequestBody SearchDto searchDto) {
        return Result.builder().data(recordService.search(searchDto)).successTrue().build();
    }

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
