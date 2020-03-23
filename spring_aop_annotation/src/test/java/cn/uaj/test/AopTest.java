package cn.uaj.test;

import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author wushaojie
 * @ 2020/1/27
 */
public class AopTest {
    @Test
    public void testAop(){
        // 获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取对象
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
        //执行方法
        accountService.saveAccount();
    }
}
