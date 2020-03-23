package config;

/**
 * @author wushaojie
 * @date 2020/1/16 11:21
 */

import org.springframework.context.annotation.*;

/**
 * spring的新注解：
 *  @Configuration:
 *      作用：指定当前类是一个配置类
 *  @ComponentScan:
 *      作用：用于通过注解指定spring在创建容器时要扫描的包
 *      属性：
 *          value:它和basePackages的作用一样，都是用于指定创建容器时要扫描的包
 *              我们使用此注解等于在xml中配置：
 *                  <context:component-scan base-package="cn.uaj"></context:component-scan>
 * @Bean:
 *      作用：用于把当前方法的返回值作为bean对象存入spring 的容器中
 *      属性：name:用于指定bean的id,当不写时，默认是当前方法的名称
 *      细节：当我们使用注解配置方法时，如果方法有参数spring框架会去容器中查找有没有可用的bean对象
 *              查找方式和Autowired注解的作用一样
 * @Import:
 *      作用：用于导入其他子配置类，子配置类无需在使用@Configuration注解，父配置类也不用在
 *              扫描子配置类的包
 *      属性：
 *          value:用于指定其他子配置类的字节码
 *              当我们使用Import的注解之后，有Import注解的类就是父配置类，而导入的都是子配置类
 * @PropertySource:
 *        作用：用于指定properties文件的位置
 *        属性：value:指定文件的名称和路径
 *              关键字：classpath,表示类路径下
 */
@Configuration
@ComponentScan(value = "cn.uaj")
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {

}
