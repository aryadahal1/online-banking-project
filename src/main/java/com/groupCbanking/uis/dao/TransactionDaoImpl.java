package com.groupCbanking.uis.dao;

import com.groupCbanking.uis.model.AccountUser;
import com.groupCbanking.uis.util.DbUtil;
import com.groupCbanking.uis.util.TransactionQueryUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDaoImpl implements TransactionDao {

    double amount;

    @Override
    public int createAccount(AccountUser account) {
        int ca = 0;

        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(TransactionQueryUtil.UPDATE_SQL);
        ) {
            ps.setInt(1, account.getBalance());
            ps.setDouble(2, account.getDepositedAmount());
            ps.setDouble( 3, account.getWithdrawnAmount());
            ps.setLong(4, account.getDepositedDate());

            ca = ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ca;
    }

    @Override
    public double checkBalance(int accountId) {
        Double balance = 0.0;
        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(TransactionQueryUtil.UPDATE_SQL);

        ) {
            ps.setInt(1, accountId;
            rs = ps.executeQuery();

            if(rs.next()){
                balance = rs.getDouble("balance");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return balance;
    }

    @Override
    public String withdrawAmount(int accountId) {
        double withdrawnAmount = 0;
        double balance = 0.0;
        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(TransactionQueryUtil.UPDATE_SQL1);
        ) {
            balance = checkBalance(accountId);
            if(balance < amount){
                return "Insufficient fund!!!!";
            }

            ps.setDouble(1, balance - amount);
            ps.setDouble(2, amount);
            ps.setString(4, accountId;

            withdrawnAmount = ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return (withdrawnAmount > 0) ? "Your new balance is:" +(balance-amount);
    }

    @Override
    public String depositAmount(int accountId) {
        int depositedAmount = 0;
        double balance = 0.0;
        try (
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(TransactionQueryUtil.UPDATE_SQL);

        ) {
            balance = checkBalance(accountId);
            ps.setDouble(1, balance + amount);
            ps.setDouble(2, amount);
            ps.setInt(4, accountId);

            depositedAmount = ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (depositedAmount > 0) ? "Your new balance is " +(balance+amount);

    }

}
