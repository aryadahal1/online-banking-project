package com.groupCbanking.uis.service;

import com.groupCbanking.uis.dao.TransactionDao;
import com.groupCbanking.uis.dao.TransactionDaoImpl;
import com.groupCbanking.uis.model.AccountUser;

public class TransactionServiceImpl implements TransactionService {

    TransactionDao transactionDao = new TransactionDaoImpl();


    @Override
    public String createAccount(AccountUser account) {
        return transactionDao.createAccount(account);
    }

    @Override
    public String depositAmount(int accountId) {
        return transactionDao.depositAmount(accountId);
    }

    @Override
    public double checkBalance(int accountId) {
        return transactionDao.checkBalance(accountId);
    }

    @Override
    public String withdrawAmount(int accountId) {
        return transactionDao.withdrawAmount(accountId);
    }

}
