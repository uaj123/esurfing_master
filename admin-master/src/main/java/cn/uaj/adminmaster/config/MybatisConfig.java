package cn.uaj.adminmaster.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis 配置类
 * @Author: wushaojie
 * @Date: 2020/4/13 20:46
 */
@Configuration
@MapperScan({"cn.uaj.adminmaster.mbg.mapper","cn.uaj.adminmaster.dao"})
public class MybatisConfig {

}
