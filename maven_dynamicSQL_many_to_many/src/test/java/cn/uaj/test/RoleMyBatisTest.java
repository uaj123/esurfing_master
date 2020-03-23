package cn.uaj.test;

import cn.uaj.dao.IRoleDao;
import cn.uaj.dao.IUserDao;
import cn.uaj.entity.Role;
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
 * @date 2020/1/13 11:40
 */
public class RoleMyBatisTest {
    private InputStream resourceAsStream;
    private SqlSession sqlSession;
    private IRoleDao roleDao;

    @Before /*测试之前执行*/
    public void init() throws IOException {
        /*读取配置文件*/
        resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        /*创建工厂*/
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        /*使用工厂创建sql对象*/
        sqlSession = build.openSession();
        /*使用sql对象创建dao的代理对象*/
        roleDao = sqlSession.getMapper(IRoleDao.class);
    }
    @After /*测试之后执行*/
    public void destory() throws IOException {
        resourceAsStream.close();
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test(){
        List<Role> roles = roleDao.findAll();
        for(Role role : roles){
            System.out.println("---------每个role --------");
            System.out.println(role);
            System.out.println(role.getUsers());
        }

    }
}
