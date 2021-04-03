package com.groupCbanking.uis.service;

import com.groupCbanking.uis.model.AccountUser;

public interface TransactionService {

     String createAccount(AccountUser account);

     String depositAmount(int accountId);

     String withdrawAmount(int accountId);

     double checkBalance(int accountId);

}
