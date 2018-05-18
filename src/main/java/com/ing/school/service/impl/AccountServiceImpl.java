package com.ing.school.service.impl;

import com.ing.school.controller.manage.auth.AccountInfo;
import com.ing.school.dao.mapper.AccountMapper;
import com.ing.school.dao.po.Account;
import com.ing.school.dao.po.AccountExample;
import com.ing.school.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yujingyang on 2018/5/16.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Override
    public AccountInfo login(String account, String password){
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andAccountEqualTo(account).andPasswordEqualTo(password);
        List<Account> accountList = accountMapper.selectByExample(accountExample);
        if(accountList.size() != 1)
            throw new RuntimeException("登录失败");
        Account accountResult = accountList.get(0);
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setId(accountResult.getId());
        return accountInfo;
    }

    @Override
    public void addAccount(String account, String password){
        Account accountPo = new Account();
        accountPo.setAccount(account);
        accountPo.setPassword(password);
        accountMapper.insertSelective(accountPo);
    }
}
