package cn.uaj.dao.impl;

/**
 * @author wushaojie
 * @date 2020/1/15 21:33
 */

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.utils.ConnectionUtils;
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
    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public List<Account> findAccountAll() {
        try {
            return queryRunner.query(connectionUtils.getThreadConnection(), "select * from account", new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException("查询失败");
        }
    }

    public Account findAccountById(Integer accountId) {
        try {
            return queryRunner.query(connectionUtils.getThreadConnection(),"select * from account where id = ?", new BeanHandler<Account>(Account.class),accountId);
        } catch (Exception e) {
            throw new RuntimeException("根据id查询失败");
        }
    }

    public void saveAccount(Account account) {
        try {
            queryRunner.update(connectionUtils.getThreadConnection(),"insert into account (name,money) values(?,?)",account.getName(),account.getMoney());
        } catch (SQLException e) {
            throw new RuntimeException("保存失败");
        }
    }

    public void updateAccount(Account account) {
        try {
            queryRunner.update(connectionUtils.getThreadConnection(),"update account set name = ?,money=? where id = ?",account.getName(),account.getMoney(),account.getId());
        } catch (SQLException e) {
            throw new RuntimeException("修改失败");
        }
    }

    public void deleteAccount(Integer accountId) {
        try {
            queryRunner.update(connectionUtils.getThreadConnection(),"delete from account where id = ?",accountId);
        } catch (SQLException e) {
            throw new RuntimeException("删除失败");
        }
    }

    public List<Account> findByAccountName(String accountName) {
        try {
            return queryRunner.query(connectionUtils.getThreadConnection(),"select * from account where name like ?", new BeanListHandler<Account>(Account.class),accountName);
        } catch (Exception e) {
            throw new RuntimeException("根据名称查询失败");
        }
    }

    /**
     * 根据名称查询账户
     * 如果账户唯一，则返回account
     * 如果账户没找到，返回null
     * 如果账户的结果集中的账户数量大于1，则抛出异常
     * @param accountName
     * @return
     */
    @Override
    public Account findAccountByName(String accountName){
        try {
            List<Account> accounts = queryRunner.query(connectionUtils.getThreadConnection(),"select * from account where name = ?", new BeanListHandler<Account>(Account.class),accountName);
            if (accounts == null || accounts.size() == 0) {
                return null;
            }
            if (accounts.size() > 1) {
                throw new RuntimeException("查询账户不唯一，查询失败");
            }
            return accounts.get(0);
        } catch (Exception e) {
            throw new RuntimeException("根据名称查询失败");
        }
    }
}
