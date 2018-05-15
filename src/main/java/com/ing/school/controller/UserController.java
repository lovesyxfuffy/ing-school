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
            return Result.builder().data("登录失败,手机号或验证码不正确").failedFalse().build();

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
        UserInfo userInfo = userService.createUser(telephone, checkCode);
        if (userInfo == null)
            return Result.builder().data("注册失败,验证码不正确").failedFalse().build();
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

    @RequestMapping(value = "/perfect", method = RequestMethod.POST)
    public Result perfectUser(User user) {
        userService.editUserInfo(user);
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
        return Result.builder().data(AuthUtil.getUserInfo() == null).successTrue().build();
    }

}
