package cn.uaj.dao;

import cn.uaj.entity.Account;

/**
 * @author wushaojie
 * @ 2020/1/28
 */
public interface IAccountDao {
    /**
     * 根据id查询账户
     * @return
     */
    Account findById(Integer id);

    /**
     * 根据名称查询账户
     * @param accountName
     * @return
     */
    Account findByName(String accountName);

    /**
     * 根据账户id修改账户
     * @param account
     */
    void updateAccount(Account account);
}
