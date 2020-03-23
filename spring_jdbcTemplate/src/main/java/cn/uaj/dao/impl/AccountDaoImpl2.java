package cn.uaj.dao.impl;

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @author wushaojie
 * @ 2020/1/28
 * 此实现类比之前的实现类多了继承JdbcDaoSupport,功能是如果有多个dao接口就抽取了多个dao接口的重复代码jdbcTemplate
 * 但是此方式不能用于注解开发
 */
public class AccountDaoImpl2 extends JdbcDaoSupport implements IAccountDao {

    public Account findById(Integer id) {
        List<Account> accountList = super.getJdbcTemplate().query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), id);
        return accountList.isEmpty() ? null : accountList.get(0);
    }

    public Account findByName(String accountName) {
        List<Account> accounts = getJdbcTemplate().query("select * from account where name = ?", new BeanPropertyRowMapper<Account>(Account.class), accountName);
        if (accounts.isEmpty()) {
            return null;
        }
        if (accounts.size() > 1) {
            throw new RuntimeException("结果集不唯一");
        }
        return accounts.get(0);
    }

    public void updateAccount(Account account) {
        getJdbcTemplate().update("update account set name = ?,money = ? where id = ?", account.getName(),account.getMoney(),account.getId());
    }
}
