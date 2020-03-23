package cn.uaj.springboot_01.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ctrl + shift + alt + N 快速查询类和方法
 */
@Component // 将当前实体类注册为spring容器组件
@ConfigurationProperties(prefix = "user")  // 加载yml配置文件中前缀为user文档属性
public class User {
    private Integer id;

    private String name;

    public User() {
    }

    private Integer age;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}