package cn.uaj.test;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import cn.uaj.dao.IUserDao;
import cn.uaj.dao.impl.UserDaoImpl;
import cn.uaj.entity.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @auther wushaojie
 * @date 2020/1/9 20:12
 */
public class MyBatisTest {
    private InputStream resourceAsStream;
    private IUserDao userDao;
    @Before
    public void init() throws IOException {
        //1,读取配置文件,生成字节输入流
        resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 获取SqlSessionFactory
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 使用工厂对象创建dao对象
        userDao = new UserDaoImpl(build);
    }
    @After
    public void destory() throws IOException {
        resourceAsStream.close();
    }
    @Test
    public void test(){
        //5，使用代理对象执行方法
        List<User> list = userDao.findAll();
        for (User user: list) {
            System.out.println(user);
        }
    }
    @Test
    public void test1(){
        User user = new User();
        user.setUsername("小白菜");
        user.setSex("女");
        user.setAddress("上海");
        user.setBirthday(new Date());
        userDao.saveUser(user);
        System.out.println("操作成功");
        test();
    }
    @Test
    public void test2(){
        User user = new User();
        user.setUsername("大白菜");
        user.setId(56);
        user.setSex("女");
        user.setAddress("海南");
        user.setBirthday(new Date());
        userDao.updateUser(user);
        System.out.println("操作成功");
        test();
    }
    @Test
    public void test3(){
        User user = new User();
        user.setUsername("大白菜");
        user.setId(56);
        user.setSex("女");
        user.setAddress("海南");
        user.setBirthday(new Date());
        userDao.deleteUser(user);
        System.out.println("操作成功");
        test();
    }
    @Test
    public void test4(){
        User user = userDao.findById(43);
        System.out.println("操作成功" + user);
    }
    @Test
    public void test5(){
        List<User> users = userDao.findLike("%王%");
        for (User user:users) {
            System.out.println("操作成功" + user);
        }

    }
    @Test
    public void test6(){
        int totalCount = userDao.totalCount();
        System.out.println("操作成功" + totalCount);
    }
}
