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
        // 执行操作
        List<Account> accounts = accountDao.findAccountAll();

        // 返回结果
        return accounts;
    }

    public Account findById(Integer accountId) {
        // 执行操作
        Account account = accountDao.findAccountById(accountId);

        // 返回结果
        return account;
    }

    public void save(Account account) {
        // 执行操作
        accountDao.saveAccount(account);
    }

    public void update(Account account) {
        // 执行操作
        accountDao.updateAccount(account);
    }

    public void delete(Integer accountId) {
        // 执行操作
        accountDao.deleteAccount(accountId);
    }

    public List<Account> findByName(String accountName) {
        // 执行操作
        List<Account> accounts = accountDao.findByAccountName(accountName);
        // 返回结果
        return accounts;
    }

    /**
     * @param sourceName
     * @param targetName
     * @param money
     *
     */
    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        //查询转出账户
        Account sourceAccount = accountDao.findAccountByName(sourceName);
        //查询转入账户
        Account targetAccount = accountDao.findAccountByName(targetName);
        // 转出金额
        sourceAccount.setMoney(sourceAccount.getMoney() - money);
        // 转入金额
        targetAccount.setMoney(targetAccount.getMoney() + money);
        //更新转出账户
        accountDao.updateAccount(sourceAccount);
//        int i = 1 / 0;
        // 更新转入账户
        accountDao.updateAccount(targetAccount);
    }
}
