package com.groupCbanking.uis.service;

import com.groupCbanking.uis.dao.AccountDao;
import com.groupCbanking.uis.dao.AccountDaoImpl;
import com.groupCbanking.uis.model.Account;

public class AccountServiceImpl implements AccountService{

    AccountDao accountDao = new AccountDaoImpl();
    @Override
    public int saveAccount(Account account) {
        return accountDao.saveAccount(account);
    }

    @Override
    public int updateAccount(Account account) {
        return accountDao.updateAccount(account);
    }

    @Override
    public int deleteAccount(int accountId) {
        return accountDao.deleteAccount(accountId);
    }
}
