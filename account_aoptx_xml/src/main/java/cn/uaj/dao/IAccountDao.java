package cn.uaj.dao;

/**
 * @author wushaojie
 * @date 2020/1/15 21:32
 */

import cn.uaj.entity.Account;
import java.util.List;

/**
 * 账户的持久层接口
 */
public interface IAccountDao {
    /**
     * 查询所有账户信息
     * @return
     */
    List<Account> findAccountAll();

    /**
     * 根据账户id查询账户信息
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存账户信息
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 修改账户信息
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 根据账户id删除账户
     * @param accountId
     */
    void deleteAccount(Integer accountId);

    /**
     * 根据账户名称模糊查找
     * @param accountName
     * @return
     */
    List<Account> findByAccountName(String accountName);

    /**
     * 根据名称查询账户
     * @param accountName
     * @return
     */
    Account findAccountByName(String accountName);
}
