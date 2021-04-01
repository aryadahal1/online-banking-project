package com.groupCbanking.uis.model;

import java.time.LocalDate;

public class Transaction {

    private double balance;
    private double withdrawnAmount;
    private double depositedAmount;
    private int accountId;
    private LocalDate depositedDate;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawnAmount() {
        return withdrawnAmount;
    }

    public void setWithdrawnAmount(double withdrawnAmount) {
        this.withdrawnAmount = withdrawnAmount;
    }

    public double getDepositedAmount() {
        return depositedAmount;
    }

    public void setDepositedAmount(double depositedAmount) {
        this.depositedAmount = depositedAmount;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public LocalDate getDepositedDate() {
        return depositedDate;
    }

    public void setDepositedDate(LocalDate depositedDate) {
        this.depositedDate = depositedDate;
    }
}
