package com.groupCbanking.uis.service;

import com.groupCbanking.uis.model.Account;

public interface AccountService {

    int saveAccount (Account account);
    int updateAccount (Account account);
    int deleteAccount (int accountId);
}
