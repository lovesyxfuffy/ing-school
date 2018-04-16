package com.ing.school.controller;

import com.ing.school.controller.utils.Result;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yujingyang on 2018/4/16.
 */
@RestController
@RequestMapping("/test")
public class HelloController implements ApplicationContextAware{

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public Result hello(){
        return Result.builder().data("hello").successTrue().build();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext.getBean(HelloController.class);
        System.out.println(1);
    }
}
