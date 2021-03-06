package cn.uaj.dao.impl;

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wushaojie
 * @ 2020/1/28
 */
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account findById(Integer id) {
        List<Account> accountList = jdbcTemplate.query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), id);
        return accountList.isEmpty() ? null : accountList.get(0);
    }
    @Override
    public Account findByName(String accountName) {
        List<Account> accounts = jdbcTemplate.query("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class), accountName);
        if (accounts.isEmpty()) {
            return null;
        }
        if (accounts.size() > 1) {
            throw new RuntimeException("结果集不唯一");
        }
        return accounts.get(0);
    }
    @Override
    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set name = ?,money = ? where id = ?", account.getName(),account.getMoney(),account.getId());
    }


}
