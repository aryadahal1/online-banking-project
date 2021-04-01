package com.groupCbanking.uis.dao;

import com.groupCbanking.uis.model.Account;
import com.groupCbanking.uis.util.AccountQueryUtil;
import com.groupCbanking.uis.util.DbUtil;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao{

    @Override
    public int saveAccount(Account account) {
        int status = 0;
        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(AccountQueryUtil.SAVE_SQL);
        ) {
            ps.setInt(1, account.getAccountId());
            ps.setString(2, account.getAccountName());
            ps.setString(3, account.getEmail());
            ps.setLong(4, account.getMobileNo());
            ps.setInt(5, account.getAccountNumber());

            status = ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public int updateAccount(Account account) {
        int updated = 0;
        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(AccountQueryUtil.UPDATE_SQL);
        ) {
            ps.setString(1, account.getAccountName());
            ps.setInt(2, account.getAccountNumber());
            ps.setLong(3, account.getMobileNo());
            ps.setString(4, account.getEmail());
            ps.setInt(5, account.getAccountId());

            updated = ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return updated;
    }

    @Override
    public int deleteAccount(int accountId) {
        int deleted = 0;
        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(AccountQueryUtil.DELETE_SQL);
        ) {
            ps.setInt(1, accountId);

            deleted = ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deleted;
    }
}
