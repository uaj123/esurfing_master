package cn.uaj.service.impl;

/**
 * @author wushaojie
 * @date 2020/1/15 21:35
 */

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;

import java.util.List;

/**
 * 账户的业务层接口实现类
 */
public class  AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAll() {
        return accountDao.findAccountAll();
    }

    public Account findById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void save(Account account) {
        accountDao.saveAccount(account);
    }

    public void update(Account account) {
        accountDao.updateAccount(account);
    }

    public void delete(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }

    public List<Account> findByName(String accountName) {
        return accountDao.findByAccountName(accountName);
    }
}
