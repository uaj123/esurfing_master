package cn.uaj.springboot_01;

import cn.uaj.springboot_01.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*当配置较多时，使用application.yml配置文件阅读性更好，一般系统级别推荐使用yml*/
@SpringBootTest(classes = Springboot01Application.class)
class Springboot01ApplicationTests {
    @Autowired
    private User user;

    @Autowired
    private TestBean testBean;
    @Autowired
    private DataSource ds;
    @Test
    void contextLoads() {
        testBean.m();
        System.out.println(user.getName() + user.getAge());
    }
    @Test
    public void t() throws SQLException {
        Connection connection = ds.getConnection();
        System.out.println(connection);
    }
}
