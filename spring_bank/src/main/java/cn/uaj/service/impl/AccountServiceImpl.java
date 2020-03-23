package cn.uaj.service.impl;

/**
 * @author wushaojie
 * @date 2020/1/15 21:35
 */

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 账户的业务层接口实现类
 */
@Service("accountService")
public class  AccountServiceImpl implements IAccountService {
    @Resource
    private IAccountDao accountDao;

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

    /**
     * @param sourceName
     * @param targetName
     * @param money
	 * 事务控制有误
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
		int i = 1 / 0;
        // 更新转入账户
        accountDao.updateAccount(targetAccount);
    }
}
