package cn.uaj.factory;

/**
 * @author wushaojie
 * @date 2020/1/17 11:42
 */

import cn.uaj.service.IAccountService;
import cn.uaj.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用于创建service的代理对象的工厂
 */
public class BeanFactory {
    private IAccountService accountService;
    private TransactionManager transactionManager;

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * 获取IAccountService的代理对象
     * @return
     */
    public IAccountService getAccountService(){
        IAccountService accountServiceProxy = (IAccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(), accountService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                try{
                    Object returnValue = null;
                    // 开始事务
                    transactionManager.beginTransaction();
                    // 执行操作
                    returnValue = method.invoke(accountService, args);
                    // 提交事务
                    transactionManager.commit();
                    // 返回结果
                    return returnValue;
                }catch (Exception e){
                    //事务回滚
                    transactionManager.rollback();
                    throw new RuntimeException(e);
                }finally {
                    //释放连接
                    transactionManager.release();
                }
            }
        });
        /**
         * 返回代理对象
         */
        return accountServiceProxy;
    }
}
