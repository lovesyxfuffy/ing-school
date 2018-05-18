package com.ing.school.service;

import com.ing.school.controller.manage.auth.AccountInfo;

/**
 * Created by yujingyang on 2018/5/16.
 */
public interface AccountService {

    AccountInfo login(String account, String password);

    void addAccount(String account, String password);
}
