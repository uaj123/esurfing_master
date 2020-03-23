package cn.uaj.test;

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.entity.AccountUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/13 10:12
 */
public class AccountTest {
    private InputStream resourceAsStream;
    private SqlSession sqlSession;
    private IAccountDao accountDao;
    @Before
    public void init() throws IOException {
        resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = build.openSession();
        accountDao  = sqlSession.getMapper(IAccountDao.class);

    }
    @After
    public  void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        resourceAsStream.close();

    }


    @Test //测试查询全部accout 包括user，不常用
    public void testAccountUser() {

        // 使用代理对象调用放法
        List<AccountUser> all = accountDao.findAllAccountUser();
        for (AccountUser accountUser: all) {
            System.out.println(accountUser);

        }

    }
    @Test //测试查询全部accout 包括user，常用
    public void testAccount() {

        // 使用代理对象调用放法
        List<Account> accounts = accountDao.findAll();
        for (Account account: accounts) {
            System.out.println(account);
            System.out.println(account.getUser());
        }

    }
}
