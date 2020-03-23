package cn.uaj.dao.impl;

/**
 * @author wushaojie
 * @date 2020/1/15 21:33
 */

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * 账户的持久层接口实现类
 */
public class AccountDaoImpl implements IAccountDao {

    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public List<Account> findAccountAll() {
        try {
            return queryRunner.query("select * from account", new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException("查询失败");
        }
    }

    public Account findAccountById(Integer accountId) {
        try {
            return queryRunner.query("select * from account where id = ?", new BeanHandler<Account>(Account.class),accountId);
        } catch (Exception e) {
            throw new RuntimeException("根据id查询失败");
        }
    }

    public void saveAccount(Account account) {
        try {
            queryRunner.update("insert into account (name,money) values(?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            throw new RuntimeException("保存失败");
        }
    }

    public void updateAccount(Account account) {
        try {
            queryRunner.update("update account set name = ?,money=? where id = ?",account.getName(),account.getMoney(),account.getId());
        } catch (SQLException e) {
            throw new RuntimeException("修改失败");
        }
    }

    public void deleteAccount(Integer accountId) {
        try {
            queryRunner.update("delete from account where id = ?",accountId);
        } catch (SQLException e) {
            throw new RuntimeException("删除失败");
        }
    }

    public List<Account> findByAccountName(String accountName) {
        try {
            return queryRunner.query("select * from account where name like ?", new BeanListHandler<Account>(Account.class),accountName);
        } catch (Exception e) {
            throw new RuntimeException("根据名称查询失败");
        }
    }
}
