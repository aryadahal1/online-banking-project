package com.groupCbanking.uis.util;

public class TransactionQueryUtil {

    public static final String UPDATE_SQL = "update transaction_tbl set balance=?, deposited_amount=? , deposited_date=? where account_id=?";
    public static final String UPDATE_SQL1 = "update transaction_tbl set balance=?, withdrawn_amount=? , withdrawn_date=? where account_id=?";

}

