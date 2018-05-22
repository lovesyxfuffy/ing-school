package com.ing.school.controller.manage.controller;

import com.ing.school.controller.utils.Result;
import com.ing.school.dao.po.ChoicestSchool;
import com.ing.school.dao.po.SchoolInfo;
import com.ing.school.dto.PageDto;
import com.ing.school.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yujingyang on 2018/5/20.
 */
@RestController("operatorManageController")
@RequestMapping("/api/manage")
public class ManagerOperatorController {
    @Autowired
    RecordService recordService;

    @RequestMapping(value = "/apply/getApplyList", method = RequestMethod.POST)
    public Result getApplyList(PageDto pageDto, @RequestParam(value = "startTime", required = false) Date startTime
            , @RequestParam(value = "sortOrder", required = false) String sortOrder) {
        return Result.builder().data(recordService.getApplyList(pageDto, startTime, sortOrder)).successTrue().build();
    }

    @RequestMapping(value = "/apply/getApplyInfo/{userId}", method = RequestMethod.POST)
    public Result getApplyInfo(@PathVariable("userId") Integer userId) {
        return Result.builder().data(recordService.getApplyInfoById(userId)).successTrue().build();
    }

    @RequestMapping(value = "/school/deleteSchool/{id}", method = RequestMethod.POST)
    public Result deleteSchool(@PathVariable("id") Integer id) {
        recordService.deleteSchool(id);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/school/deleteChoicestSchool/{id}", method = RequestMethod.POST)
    public Result deleteChoicestSchool(@PathVariable("id") Integer id) {
        recordService.deleteChoicestSchool(id);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/school/getChoicestSchool", method = RequestMethod.POST)
    public Result getChoicestSchool() {
        return Result.builder().data(recordService.getChoicestList()).successTrue().build();
    }

    @RequestMapping(value = "/school/addChoicestSchool",method = RequestMethod.POST)
    public Result addChoicestSchool(ChoicestSchool choicestSchool){
        recordService.addChoicestSchool(choicestSchool);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/school/schoolList", method = RequestMethod.POST)
    public Result getSchoolList(PageDto page) {
        return Result.builder().data(recordService.getSchoolList(page)).successTrue().build();
    }


    @RequestMapping(value = "/api/manage/school/addSchoolInfo", method = RequestMethod.POST)
    public Result addSchoolInfo(SchoolInfo schoolInfo) {
        recordService.addSchoolInfo(schoolInfo);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/school/getSchoolInfo/{schoolId}",method = RequestMethod.POST)
    public Result getSchoolInfo(@PathVariable("schoolId") Integer schoolId){
        return Result.builder().data(recordService.getSchoolInfo(schoolId)).successTrue().build();
    }


    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
