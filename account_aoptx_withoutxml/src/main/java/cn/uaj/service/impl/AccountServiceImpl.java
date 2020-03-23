package cn.uaj.service.impl;

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author wushaojie
 * @ 2020/1/27
 */
@Service("accountService")
@Transactional(propagation= Propagation.SUPPORTS,readOnly=true)//只读型事务的配置
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    @Override
    public Account findByName(String accountName) {
        return accountDao.findByName(accountName);
    }

    //需要的是读写型事务配置
    @Transactional(propagation= Propagation.REQUIRED,readOnly=false)
    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    //需要的是读写型事务配置
    @Transactional(propagation= Propagation.REQUIRED,readOnly=false)
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
//        int i = 1 / 0;
        // 更新转入账户
        accountDao.updateAccount(targetAccount);
    }

}
