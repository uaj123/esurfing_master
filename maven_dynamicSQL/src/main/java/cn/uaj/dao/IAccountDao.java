package cn.uaj.dao;

import cn.uaj.entity.Account;
import cn.uaj.entity.AccountUser;

import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/12 21:49
 */
public interface IAccountDao {
    /**
     * 查询所有accouth和user，常用的一对一查询
     * @return
     */
    public List<Account> findAll();

    /**
     * 查询所有account包括user,不常有
     * @return
     */
    public List<AccountUser> findAllAccountUser();
}
