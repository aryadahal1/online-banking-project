package com.groupCbanking.uis.dao;

import com.groupCbanking.uis.model.AccountUser;

public interface TransactionDao {

    int createAccount(AccountUser account);

    double checkBalance(int accountId);

    String withdrawAmount(int accountId);

    String depositAmount(int accountId);

}
