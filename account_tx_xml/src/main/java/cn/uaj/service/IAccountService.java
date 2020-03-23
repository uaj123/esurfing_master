package cn.uaj.service;


import cn.uaj.entity.Account;

/**
 * @author wushaojie
 * @ 2020/1/27
 */
public interface IAccountService {
    void saveAccount();

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

    /**
     * 转账
     * @param sourceName 转出账户姓名
     * @param targetName 转入账户姓名
     * @param money 转出金额
     */
    void transfer(String sourceName,String targetName,Float money);
}
