package cn.uaj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wushaojie
 * @Date: 2020/2/8 20:31
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println("testInterceptor执行了...");
        return "success";
    }
}
