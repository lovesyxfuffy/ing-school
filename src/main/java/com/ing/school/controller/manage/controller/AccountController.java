package com.ing.school.controller.manage.controller;

import com.ing.school.constants.LoginConstants;
import com.ing.school.controller.manage.auth.AccountInfo;
import com.ing.school.controller.utils.Result;
import com.ing.school.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by yujingyang on 2018/5/16.
 */
@RestController
@RequestMapping("/api/manage/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestParam("account") String account, @RequestParam("password") String password,
                        HttpSession httpSession, HttpServletResponse response) {
        AccountInfo accountInfo = accountService.login(account, password);
        String token = UUID.randomUUID().toString().replace("-", "");
        httpSession.setAttribute(token, accountInfo);
        httpSession.setMaxInactiveInterval(LoginConstants.EXPIRE_TIME);
        Cookie cookie = new Cookie(LoginConstants.SCHOOL_MANAGE_COOKIE, token);

        cookie.setMaxAge(LoginConstants.EXPIRE_TIME);
        cookie.setPath("/");
        response.addCookie(cookie);
        //暂时请求体返回token
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addAccount(@RequestParam("account") String account, @RequestParam("password") String password){
        accountService.addAccount(account, password);
        return Result.builder().data("").successTrue().build();
    }
}
