package com.groupCbanking.uis.service;

import com.groupCbanking.uis.model.AccountUser;

public interface AccountService {

    int saveAccount (AccountUser account);
    int updateAccount (AccountUser account);
    int deleteAccount (int accountId);
}
