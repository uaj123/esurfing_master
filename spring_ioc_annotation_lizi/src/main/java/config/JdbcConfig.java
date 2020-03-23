package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
/*import org.springframework.context.annotation.Configuration;*/
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

/**
 * @author wushaojie
 * @date 2020/1/16 14:46
 */
/*@Configuration()*/
public class JdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    /**
     * 创建一个queryRunner对象
     * @return
     */
    @Bean(name = "queryRunner")
    @Scope(value = "prototype")
    public QueryRunner creatRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    /**
     * 创建数据库对象
     * @return
     */
    @Bean(name = "dataSource")
    public DataSource creatDataSource(){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass(driver);
            dataSource.setJdbcUrl(url);
            dataSource.setUser(username);
            dataSource.setPassword(password);
            return dataSource;
        } catch (Exception e) {
            throw new RuntimeException("创建数据库对象失败");
        }
    }

}
