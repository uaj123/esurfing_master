package cn.uaj.test;

/**
 * @author wushaojie
 * @date 2020/1/15 21:36
 */

import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用junit单元测试，测试配置
 * Spring整合junit的配置：
 *      1，导入spring整合junit的jar包或者(坐标)
 *      2，使用Junit提供的一个注解把原有的main方法替换成spring提供的@Runwith(SpringJUnit4ClassRunner.class)
 *      3,告知spring的运行器：spring和ioc创建是基于xml还是注解的，并且说明位置
 *              @ContextConfiguration
 *                      locations:指定xml文件的位置，加上classpath关键字，表示在类路径下
 *                      classes：指定注解类所在的位置
 *  注意：使用spring 5.x版本的时候，要求junit的jar版本必须是4.12及以上
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Account_tx_xml_Test {

    @Autowired
    private IAccountService accountService;

    @Test
    public void findByIdTest(){
        // 执行方法
        Account account = accountService.findById(3);
        System.out.println(account);
        System.out.println("--------------------------");
    }

    @Test
    public void transferTest(){
        accountService.transfer("bbb","aaa",100f);
        System.out.println("--------------------------");
    }
    @Test
    public void saveAccount(){
        Account account1 = new Account("ggg", 1666f);
        accountService.saveAccount(account1);
    }
    @Test
    public void dete(){
        accountService.deleteAccountById(333);
    }
}
