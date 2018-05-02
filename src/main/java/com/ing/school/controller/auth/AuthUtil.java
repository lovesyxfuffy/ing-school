package com.ing.school.controller.auth;

/**
 * Created by yujingyang on 2018/4/28.
 */
public class AuthUtil {
    private static ThreadLocal<UserInfo> userInfoThreadLocal = new InheritableThreadLocal<>();

    public static void bind(UserInfo userInfo) {
        userInfoThreadLocal.set(userInfo);
    }

    public static void unbind() {
        userInfoThreadLocal.remove();
    }

    public static UserInfo getUserInfo() {
        return userInfoThreadLocal.get();
    }

    public static Integer getUserId() {
        return userInfoThreadLocal.get().getUserId();
    }

    public static String getTelephone() {
        return userInfoThreadLocal.get().getTelephone();
    }
}
