package cn.uaj.springboot_01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: wushaojie
 * @Date: 2020/3/18 17:42
 */
public class TestBean {
    @Value("${username}")
    private String name;

    public void m(){
        System.out.println("testBean" + name);
    }
}
