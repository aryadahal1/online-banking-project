package com.groupCbanking.uis.util;

public class TransactionQueryUtil {

    public static final String SAVE_SQL = "insert into transaction_tbl(balance, withdrawn_amount, deposit_amount, account_id,deposited_date)values(?,?,?,?,?)";
}
