package cn.uaj.test;

/**
 * @author wushaojie
 * @date 2020/1/14 17:26
 */

import cn.uaj.entity.Account;
import cn.uaj.factory.BeanFactory;
import cn.uaj.service.IAccountService;

import java.util.List;

/**
 * 测试工厂模式解耦，本质降低耦合度
 */
public class Test_Factory_decoupling {

    public static void main(String[] args) {
        IAccountService accountService = BeanFactory.getBean("accountService");
        List<Account> accounts = accountService.findAll();
        System.out.println(accounts + "查询成功");

    }
}
