package com.ing.school.controller.manage.auth;

/**
 * Created by yujingyang on 2018/5/16.
 */
public class AccountUtil {
    private static ThreadLocal<AccountInfo> accountInfoThreadLocal = new InheritableThreadLocal<>();

    public static Integer getAccountId(){
        return accountInfoThreadLocal.get().getId();
    }

    public static void  bind(AccountInfo accountInfo){
        accountInfoThreadLocal.set(accountInfo);
    }

    public static void unbind(){
        accountInfoThreadLocal.remove();
    }

    public static AccountInfo getAccountInfo(){
        return accountInfoThreadLocal.get();
    }

    


}
