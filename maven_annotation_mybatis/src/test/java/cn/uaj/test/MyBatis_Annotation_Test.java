package cn.uaj.test;

import cn.uaj.dao.IUserDao;
import cn.uaj.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * 单表操作测试
 * @author wushaojie
 * @date 2020/1/13 22:46
 */
public class MyBatis_Annotation_Test {
    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;
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
        userDao = sqlSession.getMapper(IUserDao.class);
    }

    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void testFindAll(){
        // 调用dao的方法
        List<User> users = userDao.findAll();
        for (User user : users){
            System.out.println(user);
        }
    }
    @Test
    public void saveUser(){
        // 调用dao的方法
        User user = new User();
        user.setUsername("z寒山");
        user.setAddress("江西");
        user.setSex("男");
        user.setBirthday(new Date());
        userDao.saveUser(user);
    }
    @Test
    public void updateUser(){
        // 调用dao的方法
        User user = new User();
        user.setId(51);
        user.setUsername("z何玲");
        user.setAddress("福建");
        user.setSex("女");
        user.setBirthday(new Date());
        userDao.updateUser(user);
    }
    @Test
    public void deleteUser(){
        // 调用dao的方法
        userDao.deleteUser(52);
    }
    @Test
    public void findUserByName(){
        // 调用dao的方法
        List<User> users = userDao.findByName("%宝%");
        for(User user : users){
            System.out.println(user);
        }
    }
    @Test
    public void findUserById(){
        // 调用dao的方法
        User user = userDao.findById(51);
        System.out.println(user);

    }
    @Test
    public void findTotalCount(){
        // 调用dao的方法
        int totalCount = userDao.findTotalCount();
        System.out.println(totalCount);

    }
}
