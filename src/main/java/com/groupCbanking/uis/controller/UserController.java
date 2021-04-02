package com.groupCbanking.uis.controller;

import com.groupCbanking.uis.service.AccountService;
import com.groupCbanking.uis.service.AccountServiceImpl;
import com.groupCbanking.uis.model.AccountUser;
import com.groupCbanking.uis.model.Transaction;
import com.groupCbanking.uis.dao.AccountDaoImpl;
import com.groupCbanking.uis.dao.AccountDao;

import javax.swing.*;

public class UserController {

    public static void main(String[] args) {

        AccountService accountService = new AccountServiceImpl() ;

        String decision = "N";

        do {
            String operation = JOptionPane.showInputDialog("Enter operation: save | update | delete ");
            switch (operation){

                case"save":
                    AccountUser account = getAccount("save");
                    int saved = accountService.saveAccount(account);
                    if(saved >= 1){
                        JOptionPane.showMessageDialog(null, "Accountinfo is saved in database");
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in database");
                    }
                    break;

                case"update":
                    AccountUser updatedAccount = getAccount("update");
                    int updated = accountService.updateAccount(updatedAccount);
                    if(updated >= 1){
                        JOptionPane.showMessageDialog(null, "Account info is updated in database");
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in database");
                    }
                    break;

                case"delete":
                    int accountId = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Id: "));
                    int deleted = accountService.deleteAccount(accountId);
                    if(deleted >= 1){
                        JOptionPane.showMessageDialog(null, "Account is deleted from database");
                    }else{
                        JOptionPane.showMessageDialog(null, "Error in database");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Wrong selection");

            }
            decision = JOptionPane.showInputDialog("Do you want to continue? Enter Y / N");
        }while(decision.equalsIgnoreCase("Y"));
        JOptionPane.showMessageDialog(null,"Thanks for using the service");

    }

    public static AccountUser getAccount(String type){
        AccountUser account= new AccountUser();
        if (type.equals("update")){
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Id: "));
           account.setAccountId(id);
        }
        String AccountName = JOptionPane.showInputDialog("Enter Account Name: ");
        int AccountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Number: "));
        String Email = JOptionPane.showInputDialog("Enter Account Email: ");
        long mobileNo = Long.parseLong(JOptionPane.showInputDialog("Enter mobile no.: "));

        account.setAccountName(account.getAccountName());
        account.setAccountNumber(account.getAccountNumber());
        account.setAccountId(account.getAccountId());
        account.setEmail(account.getEmail());
        account.setMobileNo(account.getMobileNo());
//        account.setAccountName(accoutName);
//        account.setEmail(email);
//        account.setMobileNo(mobileNo);
//        account.setAccountId(accountId);
//        account.setAccountNumber(accountNumber);

        return account;

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
//        double balance;
//        double previousTransaction;
//        String decision = "N";
//
//        public void depositAmount ( double amount){
//            if (amount != 0) {
//                balance = balance + amount;
//                previousTransaction = amount;
//            }
//        }
//
//        public void withdrawAmount ( double amount){
//            if (amount != 0) {
//                balance = balance - amount;
//                previousTransaction = -amount;
//            }
//        }
//        public void checkPreviousTransaction () {
//            if (previousTransaction > 0) {
//                System.out.println("Deposited: " + previousTransaction);
//                ;
//            } else if (previousTransaction < 0) {
//                System.out.println("Withdrawn: " + Math.abs(previousTransaction));
//            } else {
//                System.out.println("No transaction");
//            }
//
//            do {
//                String operation = JOptionPane.showInputDialog("Enter operation: createAccount | depositAmount | withdrawAmount | checkBalance");
//                switch (operation) {
//                    case "createAccount":
//                        break;
//                    case "depositAmount":
//                        System.out.println("===============");
//                        System.out.println("Enter an amount to deposit: ");
//                        System.out.println("================");
//                        break;
//                    case "withdrawAmount":
//                        System.out.println("===============");
//                        System.out.println("Enter an amount to withdraw: ");
//                        System.out.println("===============");
//                        break;
//                    case "checkBalance":
//                        System.out.println("================");
//                        System.out.println("Your balance is: " + balance);
//                        System.out.println("================");
//                        break;
//                    case "checkPreviousTransaction":
//                        System.out.println("================");
//                        System.out.println("================");
//                        break;
//                    default:
//                        JOptionPane.showMessageDialog(null, "Wrong selection");
//                }
//                decision = JOptionPane.showInputDialog("Do you want to continue? Enter y|n");
//
//            } while (decision.equalsIgnoreCase("y"));
//
//            JOptionPane.showMessageDialog(null, "Good Day.");
//
//
//        }

}
