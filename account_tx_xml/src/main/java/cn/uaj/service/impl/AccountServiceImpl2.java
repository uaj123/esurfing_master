package cn.uaj.service.impl;

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;



/**
 * @author wushaojie
 * @ 2020/1/27
 */
public class AccountServiceImpl2 implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void saveAccount() {
        System.out.println("保存成功。。。。");
//         int i = 1 / 0;
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    @Override
    public Account findByName(String accountName) {
        return accountDao.findByName(accountName);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        // 根据名称查询转出账户
        Account sourceAccount = accountDao.findByName(sourceName);
        // 根据名称查询转入账户
        Account targetAccount = accountDao.findByName(targetName);
        // 转出账户减钱
        sourceAccount.setMoney(sourceAccount.getMoney() - money);
        // 转入账户加钱
        targetAccount.setMoney(targetAccount.getMoney() + money);
        // 跟新转出账户
        accountDao.updateAccount(sourceAccount);
        // 用于模拟异常
        int i = 1 / 0;
        // 更新转入账户
        accountDao.updateAccount(targetAccount);
    }

}
