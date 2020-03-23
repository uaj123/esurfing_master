package cn.uaj.service.impl;

/**
 * @author wushaojie
 * @date 2020/1/15 21:35
 */

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;
import cn.uaj.utils.TransactionManager;

import java.util.List;

/**
 * 账户的业务层接口实现类
 */
public class  AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;
    private TransactionManager transactionManager;

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAll() {
        try{
            // 开始事务
            transactionManager.beginTransaction();
            // 执行操作
            List<Account> accounts = accountDao.findAccountAll();
            // 提交事务
            transactionManager.commit();
            // 返回结果
            return accounts;
        }catch (Exception e){
            //事务回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //释放连接
            transactionManager.release();
        }

    }

    public Account findById(Integer accountId) {
        try{
            // 开始事务
            transactionManager.beginTransaction();
            // 执行操作
            Account account = accountDao.findAccountById(accountId);
            // 提交事务
            transactionManager.commit();
            // 返回结果
            return account;
        }catch (Exception e){
            //事务回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //释放连接
            transactionManager.release();
        }
    }

    public void save(Account account) {
        try{
            // 开始事务
            transactionManager.beginTransaction();
            // 执行操作
            accountDao.saveAccount(account);
            // 提交事务
            transactionManager.commit();
        }catch (Exception e){
            //事务回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //释放连接
            transactionManager.release();
        }
    }

    public void update(Account account) {
        try{
            // 开始事务
            transactionManager.beginTransaction();
            // 执行操作
            accountDao.updateAccount(account);
            // 提交事务
            transactionManager.commit();
        }catch (Exception e){
            //事务回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //释放连接
            transactionManager.release();
        }

    }

    public void delete(Integer accountId) {
        try{
            // 开始事务
            transactionManager.beginTransaction();
            // 执行操作
            accountDao.deleteAccount(accountId);
            // 提交事务
            transactionManager.commit();
        }catch (Exception e){
            //事务回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //释放连接
            transactionManager.release();
        }

    }

    public List<Account> findByName(String accountName) {
        try{
            // 开始事务
            transactionManager.beginTransaction();
            // 执行操作
            List<Account> accounts = accountDao.findByAccountName(accountName);
            // 提交事务
            transactionManager.commit();
            // 返回结果
            return accounts;
        }catch (Exception e){
            //事务回滚
            transactionManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //释放连接
            transactionManager.release();
        }
    }

    /**
     * @param sourceName
     * @param targetName
     * @param money
     *
     */
    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        try{
            // 开始事务
            transactionManager.beginTransaction();
            /*执行操作*/
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
            // 更新转入账户
            accountDao.updateAccount(targetAccount);
            // 提交事务
            transactionManager.commit();
        }catch (Exception e){
            //事务回滚
            transactionManager.rollback();
            throw new RuntimeException("发生事务回滚");
        }finally {
            //释放连接
            transactionManager.release();
        }

    }
}
