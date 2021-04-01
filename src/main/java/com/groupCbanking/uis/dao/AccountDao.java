package com.groupCbanking.uis.dao;

import com.groupCbanking.uis.model.Account;

public interface AccountDao {


    int saveAccount (Account account);
    int updateAccount (Account account);
    int deleteAccount (int accountId);
}
