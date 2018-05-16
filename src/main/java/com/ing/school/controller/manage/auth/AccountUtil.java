package com.ing.school.controller.manage.auth;

/**
 * Created by yujingyang on 2018/5/16.
 */
public class AccountUtil {
    private ThreadLocal<AccountInfo> accountInfoThreadLocal = new InheritableThreadLocal<>();

    public Integer getAccountId(){
        return accountInfoThreadLocal.get().getId();
    }

    public void  bind(AccountInfo accountInfo){
        accountInfoThreadLocal.set(accountInfo);
    }

    public void unbind(){
        accountInfoThreadLocal.remove();
    }

    public AccountInfo getAccountInfo(){
        return accountInfoThreadLocal.get();
    }

    


}
