package cn.uaj.test;


import cn.uaj.dao.IUserDao;
import cn.uaj.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @auther wushaojie
 * @date 2020/1/9 22:03
 */
public class MybatisTest {
    /*注解配置测试*/
    public static void main(String[] args) throws IOException {
        // 获取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建工厂
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        // 获取sqlsession对象
        SqlSession sqlSession = build.openSession();
        // 使用sqlSession创建Dao接口的代理对象
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        // 使用代理对象调用接口方法
        List<User> list = mapper.findAll();
        for (User user: list) {
            System.out.println(user);
        }

    }
}
