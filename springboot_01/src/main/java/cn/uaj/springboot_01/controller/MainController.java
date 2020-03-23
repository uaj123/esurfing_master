package cn.uaj.springboot_01.controller;

import cn.uaj.springboot_01.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/3/18 18:33
 */
@Controller
public class MainController {



    @GetMapping("/goMain")
    public String goMain(Model model, HttpSession session){
        List<User> userList = new ArrayList<>();
        userList.add(new User("D",12));
        userList.add(new User("F",12));
        userList.add(new User("DG",12));

        model.addAttribute("userList",userList);
        model.addAttribute("requestData","user");
        session.setAttribute("sessionsData","是否");
        System.out.println("goMain方法");
        return "main"; // 代表templates/main.html
    }
}
