package cn.uaj.service.impl;

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;



/**
 * @author wushaojie
 * @ 2020/1/27
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void saveAccount() {
        System.out.println("查询成功。。。。");
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
}
