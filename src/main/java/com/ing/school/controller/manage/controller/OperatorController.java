package com.ing.school.controller.manage.controller;

import com.ing.school.controller.utils.Result;
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
@RestController
@RequestMapping("/api/manage")
public class OperatorController {
    @Autowired
    RecordService recordService;

    @RequestMapping(value = "/apply/getApplyList",method = RequestMethod.POST)
    public Result getApplyList(PageDto pageDto, @RequestParam("startTime")Date startTime
            ,@RequestParam("sortOrder")String sortOrder){
        return Result.builder().data(recordService.getApplyList(pageDto, startTime, sortOrder)).successTrue().build();
    }

    @RequestMapping(value = "/apply/getApplyInfo/{applyId}",method = RequestMethod.POST)
    public Result getApplyInfo(@PathVariable("applyId") Integer applyId){
        return Result.builder().data(recordService.getApplyInfoById(applyId)).successTrue().build();
    }

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
