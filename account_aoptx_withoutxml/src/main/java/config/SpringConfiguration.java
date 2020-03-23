package config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author wushaojie
 * @ 2020/1/31
 * spring的配置类，相当于applicationContext.xml
 */


@Configuration
@ComponentScan("cn.uaj")
@Import({JdbcConfig.class,TransactionConfig.class})
@PropertySource(value = "classpath:jdbcConfig.properties")
@EnableTransactionManagement // 开启注解的支持
public class SpringConfiguration {

}
