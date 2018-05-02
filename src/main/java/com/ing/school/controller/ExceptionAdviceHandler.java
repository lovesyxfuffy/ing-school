package com.ing.school.controller;

import com.ing.school.controller.utils.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ExceptionAdviceHandler {

    @ExceptionHandler(Exception.class)
    public Result handleBizException(Exception ex) {
        String msg = ex instanceof RuntimeException ? ex.getMessage() : "";
        ex.printStackTrace();
        return Result.builder().data(Result.FAILED, msg).failedFalse(ex.getMessage()).build();
    }


}
