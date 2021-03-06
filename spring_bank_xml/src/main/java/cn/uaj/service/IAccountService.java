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
     * @param AccountId
     * @return
     */
    Account findById(Integer AccountId);

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

    /**
     *转账
     * @param sourceName  转出账户名称
     * @param targetName 转入账户名称
     * @param money  转出金额
     */
    void transfer(String sourceName,String targetName,Float money);
}
