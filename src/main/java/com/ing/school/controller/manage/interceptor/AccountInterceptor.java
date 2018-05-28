package com.ing.school.controller.manage.interceptor;

import com.google.gson.Gson;
import com.ing.school.constants.LoginConstants;
import com.ing.school.controller.auth.AuthUtil;
import com.ing.school.controller.auth.UserInfo;
import com.ing.school.controller.manage.auth.AccountInfo;
import com.ing.school.controller.manage.auth.AccountUtil;
import com.ing.school.controller.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * Created by yujingyang on 2018/5/16.
 */
@Component
public class AccountInterceptor implements HandlerInterceptor {

    private static final String LOGIN_PATH = "/api/manage/account/login";

    @Autowired
    Gson gson;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        AccountUtil.unbind();
        String URI = request.getRequestURI();
        String loginCookie = getCookie(request, LoginConstants.SCHOOL_MANAGE_COOKIE);
        HttpSession session = request.getSession();
        AccountInfo accountInfo = (AccountInfo) session.getAttribute(loginCookie);
        if (StringUtils.isEmpty(loginCookie) || accountInfo == null) {
            if ((URI.startsWith(LOGIN_PATH))  && "POST".equals(request.getMethod()))
                return true;
            response.setContentType("application/json;charset=utf-8");
            Result result = Result.builder().data(Result.FORBIDDEN, "请登录").failedFalse("登录认证失败").build();
            PrintWriter printWriter = new PrintWriter(response.getOutputStream());
            printWriter.print(gson.toJson(result));
            printWriter.flush();
            printWriter.close();
            return false;
        } else {
            AccountUtil.bind(accountInfo);
            session.setMaxInactiveInterval(LoginConstants.EXPIRE_TIME);
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

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
