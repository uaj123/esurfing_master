package cn.uaj.service.impl;

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.factory.BeanFactory;
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
    private IAccountDao accountDao =  BeanFactory.getBean("accountDao");

    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }
}
