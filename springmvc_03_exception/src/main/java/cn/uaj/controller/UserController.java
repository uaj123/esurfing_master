package cn.uaj.controller;

import cn.uaj.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wushaojie
 * @Date: 2020/2/8 15:44
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("testException")
    public String testException() throws SysException {
        System.out.println("testException执行了...");
        try {
            int i = 1 / 0 ;
        }catch (Exception e){
            e.printStackTrace();
            throw new SysException("查询用户信息出现了错误...");
        }
        return "success";
    }
}
