package com.groupCbanking.uis.dao;

import com.groupCbanking.uis.model.AccountUser;

public interface AccountDao {


    int saveAccount (AccountUser account);
    int updateAccount (AccountUser account);
    int deleteAccount (int accountId);
}
