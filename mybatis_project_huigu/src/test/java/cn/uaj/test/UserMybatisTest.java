package cn.uaj.test;

import cn.uaj.dao.IUserDao;
import cn.uaj.entity.QueryVo;
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
 * @author wushaojie
 * @date 2020/1/10 17:36
 */
public class UserMybatisTest {
    private InputStream resourceAsStream;
    private SqlSession sqlSession;
    private IUserDao userDao;
    @Before // 用于测试方法执行之前执行
    public void init() throws IOException {
        // 读取配置文件
        resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 创建sqlSession对象
        sqlSession = build.openSession();
        // 创建Dao的代理对象
        userDao = sqlSession.getMapper(IUserDao.class);
    }
    @After // 用于测试方法执行之后执行
    public void destory() throws IOException {
        //提交事务
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
        resourceAsStream.close();
    }
    @Test //测试查询全部
    public void test() {

        // 使用代理对象调用放法
        List<User> all = userDao.findAll();
        for (User user: all) {
            System.out.println(user);
        }

    }

    @Test //测试保存user
    public void test1(){
        User user = new User();
        user.setUsername("张三");
        user.setBirthday(new Date());
        user.setAddress("北京");
        user.setSex("男");
        userDao.saveUser(user);
        System.out.println(user.getId());
    }

    @Test //测试修改user
    public void test2(){
        User user = new User();
        user.setId(49);
        user.setUsername("大宝玛丽");
        user.setBirthday(new Date());
        user.setAddress("北京");
        user.setSex("女");
        userDao.updateUser(user);
    }
    @Test //测试删除user
    public void test3(){
        userDao.deleteUser(50);
    }
    @Test //测试根据id查询user
    public void test4(){
        List<User> list = userDao.findById(48);
        for (User user:list) {
            System.out.println(user);
        }
    }
    @Test //测试根据username模糊查询user
    public void test5(){
        List<User> list = userDao.findLike("%王%");
        for (User user:list) {
            System.out.println(user);
        }
    }
    @Test //查询总记录数
    public void test6(){
        int totalCount = userDao.totalCount();
        System.out.println(totalCount);
    }

    @Test //测试根据queryVo模糊查询user,实际开发中，通常使用这种方法
    public void test7(){
        User user = new User();
        QueryVo queryVo = new QueryVo();
        user.setUsername("%王%");
        queryVo.setUser(user);
        List<User> users = userDao.findByVo(queryVo);
        for (User u:users) {
            System.out.println(u);
        }
    }
}
