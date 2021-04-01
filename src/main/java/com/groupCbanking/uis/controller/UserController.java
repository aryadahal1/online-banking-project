package com.groupCbanking.uis.controller;

import javax.swing.*;

public class UserController {

    public static void main(String[] args) {

    }
        double balance;
        double previousTransaction;
        String decision = "N";

        public void depositAmount ( double amount){
            if (amount != 0) {
                balance = balance + amount;
                previousTransaction = amount;
            }
        }

        public void withdrawAmount ( double amount){
            if (amount != 0) {
                balance = balance - amount;
                previousTransaction = -amount;
            }
        }
        public void checkPreviousTransaction () {
            if (previousTransaction > 0) {
                System.out.println("Deposited: " + previousTransaction);
                ;
            } else if (previousTransaction < 0) {
                System.out.println("Withdrawn: " + Math.abs(previousTransaction));
            } else {
                System.out.println("No transaction");
            }

            do {
                String operation = JOptionPane.showInputDialog("Enter operation: createAccount | depositAmount | withdrawAmount | checkBalance");
                switch (operation) {
                    case "createAccount":
                        break;
                    case "depositAmount":
                        System.out.println("===============");
                        System.out.println("Enter an amount to deposit: ");
                        System.out.println("================");
                        break;
                    case "withdrawAmount":
                        System.out.println("===============");
                        System.out.println("Enter an amount to withdraw: ");
                        System.out.println("===============");
                        break;
                    case "checkBalance":
                        System.out.println("================");
                        System.out.println("Your balance is: " + balance);
                        System.out.println("================");
                        break;
                    case "checkPreviousTransaction":
                        System.out.println("================");
                        System.out.println("================");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Wrong selection");
                }
                decision = JOptionPane.showInputDialog("Do you want to continue? Enter y|n");

            } while (decision.equalsIgnoreCase("y"));

            JOptionPane.showMessageDialog(null, "Good Day.");


        }

}
