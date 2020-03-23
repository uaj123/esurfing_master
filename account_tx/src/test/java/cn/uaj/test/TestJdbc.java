package cn.uaj.test;
import cn.uaj.entity.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author wushaojie
 * @ 2020/1/28
 */
public class TestJdbc {
    @Test
    public void test1(){
        // 获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取对象
        JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
        // 添加
        //jdbcTemplate.update("insert into account(name,money) values(?,?)","ddd",1000f);
        // 修改
        //jdbcTemplate.update("update account set name=?,money=? where id=?","eee",1234f,4);
        // 删除
        //jdbcTemplate.update("delete from account where id = ?",4);
        //查询金额大于1000.0的所有账户
        /*
        List<Account> accountList = jdbcTemplate.query("select * from account where money > ?", new BeanPropertyRowMapper<Account>(Account.class), 1000f);
        for (Account account:accountList) {
            System.out.println(account);
        }
        */
        //查询一个账户
        List<Account> accounts = jdbcTemplate.query("select * from account where id = ?", new BeanPropertyRowMapper<Account>(Account.class), 4);
        System.out.println(accounts.isEmpty() ? "没有内容" : accounts.get(0));
        // 查询返回一行一列（使用聚合函数，但不加group by子句）
        Integer count = jdbcTemplate.queryForObject("select count(*) from account where money > ?", Integer.class, 1000f);
        System.out.println(count);
    }
}
