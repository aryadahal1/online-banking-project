package com.groupCbanking.uis.util;

public class TransactionQueryUtil {

    public static final String SAVE_SQL = "insert into transaction_tbl(balance, withdrawn_amount, deposit_amount, account_id,deposited_date)values(?,?,?,?,?)";
    public static final String UPDATE_SQL = "update transaction_tbl set balance = ?, withdrawn_amount =?, deposit_amount=?, deposited_date=? where account_id =?";
    public static final String DELETE_SQL = "delete from transaction_tbl where account_id = ?";
}
