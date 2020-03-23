package cn.uaj.service.impl;

import cn.uaj.dao.IAccountDao;
import cn.uaj.dao.impl.AccountDaoImpl;
import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;


import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/14 16:37
 */

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }
}
