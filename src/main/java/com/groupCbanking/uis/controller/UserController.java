package com.groupCbanking.uis.controller;

import com.groupCbanking.uis.service.AccountService;
import com.groupCbanking.uis.service.AccountServiceImpl;
import com.groupCbanking.uis.model.AccountUser;

import javax.swing.*;

public class UserController {

    public static void main(String[] args) {

        AccountService accountService = new AccountServiceImpl();

        String decision = "N";


        do {
            String operation = JOptionPane.showInputDialog("Enter operation: CreateAccount | DepositAmount | WithdrawAmount | CheckBalance  ");
            switch (operation) {

                case "CreateAccount":
                    AccountUser account = getAccount("CreateAccount");
                    int ca = accountService.createAccount(account);
                    if (ca >= 1) {
                        JOptionPane.showMessageDialog(null, "Account Created");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error in database");
                    }
                    break;

                case "DepositAmount":
                    int accountId = Integer.parseInt(JOptionPane.showInputDialog("Enter Amount to Withdraw: ");
                    AccountUser amountDeposited = getAccount("DepositAmount");
                    int da = accountService.depositAmount(amountDeposited);
                    if (da >= 1) {
                        JOptionPane.showMessageDialog(null, "Amount is deposited");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error in database");
                    }
                    break;

                case "WithdrawAmount":
                    int accountId2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Amount to Withdraw: "));
                    int wa = accountService.withdrawAmount(accountId);
                    if (wa >= 1) {
                        JOptionPane.showMessageDialog(null, "Amount is withdrawn");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error in database");
                    }
                    break;

                case "CheckBalance":
                    double balance;
                    int accountId3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Id: "));
                    int cb = accountService.deleteAccount(accountId3);
                    if (cb >= 1) {
                        JOptionPane.showMessageDialog(null, "Your Balance is: " + balance);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error in database");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Wrong selection");

            }
            decision = JOptionPane.showInputDialog("Do you want to continue? Enter Y / N");
        } while (decision.equalsIgnoreCase("Y"));
        JOptionPane.showMessageDialog(null, "Thanks for using the service");

    }

    public static AccountUser getAccount(String type) {
        AccountUser account = new AccountUser();
        if (type.equals("CheckBalance")) {
            int accountId = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Id: "));
            account.setAccountId(accountId);
        }
        String accountName = JOptionPane.showInputDialog("Enter Account Name: ");
        String email = JOptionPane.showInputDialog("Enter Account Email: ");
        int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Number: "));
        long mobileNo = Long.parseLong(JOptionPane.showInputDialog("Enter mobile no.: "));

        account.setAccountName(accountName);
        account.setAccountNumber(accountNumber);
        account.setEmail(email);
        account.setMobileNo(mobileNo);


//        account.setAccountName(accoutName);
//        account.setEmail(email);
//        account.setMobileNo(mobileNo);
//        account.setAccountId(accountId);
//        account.setAccountNumber(accountNumber);

        return account;

    }
}
//    public static void printAccountInfo(AccountUser account){
//        System.out.println("+++++++");
//        System.out.println("Account id is: " + account.getAccountId());
//        System.out.println("Account Name is: " + account.getAccountName());
//        System.out.println(" Email is " + account.getEmail());
//        System.out.println("Mobile No. is:" + account.getMobileNo());
//        System.out.println("Account Number is: " + account.getAccountNumber());
//        System.out.println("+++++++");
//
//    }
//



