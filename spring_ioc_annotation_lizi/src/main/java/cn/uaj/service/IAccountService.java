package cn.uaj.service;

/**
 * @author wushaojie
 * @date 2020/1/15 21:34
 */

import cn.uaj.entity.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {
    /**
     * 查询所有账户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 根据账户id查询账户信息
     * @param accountId
     * @return
     */
    Account findById(Integer accountId);

    /**
     * 保存账户信息
     * @param account
     */
    void save(Account account);

    /**
     * 修改账户信息
     * @param account
     */
    void update(Account account);

    /**
     * 根据账户id删除账户
     * @param accountId
     */
    void delete(Integer accountId);

    /**
     * 根据账户名称模糊查找
     * @param accountName
     * @return
     */
    List<Account> findByName(String accountName);
}
