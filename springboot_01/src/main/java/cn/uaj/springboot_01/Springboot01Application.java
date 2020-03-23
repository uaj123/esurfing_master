package cn.uaj.springboot_01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 主配置类，不要改动
 */
@SpringBootApplication  // 声明springboot启动类
@MapperScan("cn.uaj.springboot_01.mapper") // dao接口的扫描注解
@EnableTransactionManagement // 相当于xml配置文件中<tx:annotation-driver>注解式事务
@EnableScheduling //开启quartz定时注解
public class Springboot01Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01Application.class, args);
    }

}
