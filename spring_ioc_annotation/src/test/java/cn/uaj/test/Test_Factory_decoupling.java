package cn.uaj.test;

/**
 * @author wushaojie
 * @date 2020/1/14 17:26
 */

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 模拟表现层
 */
public class Test_Factory_decoupling {

    /**
     * 获取spring 的Ioc核心容器，并根据id获取对象
     * @param args
     */
    public static void main(String[] args) {
        // 获取核心容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 根据id获取Bean对象，两种方式获取
        IAccountService accountService = applicationContext.getBean("accountService",IAccountService.class);
        IAccountService accountService2 = applicationContext.getBean("accountService",IAccountService.class);
        /*测试对象是单例还是多例创建*/
        System.out.println(accountService == accountService2);
        IAccountDao accountDao = (IAccountDao) applicationContext.getBean("accountDao");

        System.out.println(accountDao + "查询成功");
        System.out.println(accountService + "查询成功");

        System.out.println("-----------------------------");
        IAccountService accountService1 = (IAccountService) applicationContext.getBean("accountService1");
        List<Account> all = accountService1.findAll();
        System.out.println(all);
    }
}
