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
 * @date 2020/1/9 20:12
 */
public class MyBatisTest {
    public static void main(String[] args) throws IOException {
        //1,读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2，创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        //3，使用工厂生产SqlSession对象
        SqlSession sqlSession = sessionFactory.openSession();
        //4，使用SqlSession创建Dao接口的代理对象
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        //5，使用代理对象执行方法
        List<User> list = mapper.findAll();
        for (User user: list) {
            System.out.println(user);
        }

        //6，释放资源
        sqlSession.close();
        resourceAsStream.close();
    }
}
