package cn.uaj.test;

import cn.uaj.dao.IAccountDao;
import cn.uaj.dao.IUserDao;
import cn.uaj.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/14 11:34
 */
public class MyBatis_Annotation_Test_Account {
    private InputStream in;
    private SqlSession sqlSession;
    private IAccountDao accountDao;
    private SqlSessionFactory factory;

    @Before
    public void init() throws IOException {
        // 读取配置文件，获取字符输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建工厂
        factory = new SqlSessionFactoryBuilder().build(in);
        // 生产sqlSession对象
        sqlSession = factory.openSession();
        // 创建dao的接口对象
        accountDao = sqlSession.getMapper(IAccountDao.class);
    }

    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void findAllTest(){
        List<Account> accounts = accountDao.findAll();
        for (Account account: accounts) {
            System.out.println(account);
        }
    }
    @Test
    public void findByIdTest(){
        Account account = accountDao.findById(1);
        System.out.println(account);

    }
    @Test
    public void findByUidTest(){
        List<Account> accounts = accountDao.findAccountByUid(48);
        for (Account account: accounts) {
            System.out.println(account);
        }

    }
}
