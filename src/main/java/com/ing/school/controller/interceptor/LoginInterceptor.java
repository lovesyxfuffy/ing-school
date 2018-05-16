package com.ing.school.controller.interceptor;

import com.google.gson.Gson;
import com.ing.school.constants.LoginConstants;
import com.ing.school.controller.auth.AuthUtil;
import com.ing.school.controller.auth.UserInfo;
import com.ing.school.controller.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * Created by yujingyang on 2018/5/2.
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    private static final String LOGIN_PATH = "/api/user";

    private static final String COMMON_PATH = "/api/common";

    private static final String MANAGE_PATH = "/api/manage";


    @Autowired
    Gson gson;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String requestURI = httpServletRequest.getRequestURI();
        if (requestURI.startsWith(MANAGE_PATH))
            return true;
        String loginCookie = getCookie(httpServletRequest, LoginConstants.SCHOOL_COOKIE);
        HttpSession session = httpServletRequest.getSession();
        UserInfo userInfo = (UserInfo) session.getAttribute(loginCookie);
        if (StringUtils.isEmpty(loginCookie) || userInfo == null) {
            if (((requestURI.startsWith(LOGIN_PATH)) || requestURI.startsWith(COMMON_PATH)) && "POST".equals(httpServletRequest.getMethod()))
                return true;
            httpServletResponse.setContentType("application/json;charset=utf-8");
            Result result = Result.builder().data(Result.FORBIDDEN, "请登录").failedFalse("登录认证失败").build();
            PrintWriter printWriter = new PrintWriter(httpServletResponse.getOutputStream());
            printWriter.print(gson.toJson(result));
            printWriter.flush();
            printWriter.close();
            return false;
        } else {
            AuthUtil.bind(userInfo);
            session.setMaxInactiveInterval(LoginConstants.EXPIRE_TIME);
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

    private String getCookie(HttpServletRequest request, String key) {
        if (StringUtils.isEmpty(key)) {
            throw new IllegalArgumentException("cookie key can not be blank");
        }
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0) {
            for (Cookie cookie : cookies) {
                if (key.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}


