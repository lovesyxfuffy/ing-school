package com.ing.school.controller;

import com.ing.school.constants.LoginConstants;
import com.ing.school.controller.auth.AuthUtil;
import com.ing.school.controller.auth.UserInfo;
import com.ing.school.controller.utils.Result;
import com.ing.school.dao.po.User;
import com.ing.school.service.UserService;
import com.ing.school.utls.CacheUtils;
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
 * Created by yujingyang on 2018/4/28.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestParam("telephone") String telephone, @RequestParam("checkCode") String checkCode,
                        HttpServletResponse response, HttpSession httpSession) {

        UserInfo userInfo = userService.login(telephone, checkCode);
        if (userInfo == null)
            throw new RuntimeException("手机号或验证码不正确");

        String token = UUID.randomUUID().toString().replace("-", "");
        httpSession.setAttribute(token, userInfo);
        httpSession.setMaxInactiveInterval(LoginConstants.EXPIRE_TIME);
        Cookie cookie = new Cookie(LoginConstants.SCHOOL_COOKIE, token);

        cookie.setMaxAge(LoginConstants.EXPIRE_TIME);
        cookie.setPath("/");
        response.addCookie(cookie);
        //暂时请求体返回token
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Result register(@RequestParam("telephone") String telephone, @RequestParam("checkCode") String checkCode,
                           HttpServletResponse response, HttpSession httpSession) {
        Integer userId = userService.createUser(telephone, checkCode);
        if (userId == null)
            return Result.builder().data("注册失败,验证码不正确").failedFalse().build();
        httpSession.setAttribute("register-id", userId);
        httpSession.setMaxInactiveInterval(LoginConstants.EXPIRE_TIME);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/perfect", method = RequestMethod.POST)
    public Result perfectUser(User user, HttpSession httpSession,HttpServletResponse response) {
        Object registerId =  httpSession.getAttribute("register-id");
        if(registerId == null)
            throw new RuntimeException("请先验证手机号");
        UserInfo userInfo = userService.editUserInfo(user, (Integer) registerId);
        httpSession.removeAttribute("register-id");
        if (userInfo == null)
            throw new RuntimeException("手机号或验证码不正确");

        String token = UUID.randomUUID().toString().replace("-", "");
        httpSession.setAttribute(token, userInfo);
        httpSession.setMaxInactiveInterval(LoginConstants.EXPIRE_TIME);
        Cookie cookie = new Cookie(LoginConstants.SCHOOL_COOKIE, token);

        cookie.setMaxAge(LoginConstants.EXPIRE_TIME);
        cookie.setPath("/");
        response.addCookie(cookie);
        //暂时请求体返回token
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public Result logout(HttpServletResponse response) {

        Cookie cookie = new Cookie(LoginConstants.SCHOOL_COOKIE, null);
        cookie.setMaxAge(LoginConstants.EXPIRE_TIME);
        cookie.setPath("/");
        response.addCookie(cookie);
        return Result.builder().data("").successTrue().build();
    }

    @RequestMapping(value = "/getCheckCode", method = RequestMethod.POST)
    public Result getCheckCode(@RequestParam("telephone") String telephone) {
        String checkCode = userService.pushPermissionCode(telephone);
        CacheUtils.put(LoginConstants.TELEPHONE_KEY + telephone, checkCode);
        return Result.builder().data(checkCode).successTrue().build();
    }


    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public Result checkUserLogin() {
        return Result.builder().data(AuthUtil.getUserInfo() != null).successTrue().build();
    }

}
