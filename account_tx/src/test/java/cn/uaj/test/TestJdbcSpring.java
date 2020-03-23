package cn.uaj.test;

import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wushaojie
 * @ 2020/1/28
 */
public class TestJdbcSpring {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = applicationContext.getBean("accountService", IAccountService.class);
        Account account = accountService.findById(3);
        System.out.println(account);
        Account account1 = accountService.findByName("bbb");
        System.out.println(account1);
        // 反射创建对象
        try {
            //  获取class类型
            Class<?> forName = Class.forName("cn.uaj.entity.Account");
            Account account2 = (Account) forName.newInstance();
            account2.setId(3);
            account2.setName("eee");
            account2.setMoney(22000f);
            accountService.updateAccount(account2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
