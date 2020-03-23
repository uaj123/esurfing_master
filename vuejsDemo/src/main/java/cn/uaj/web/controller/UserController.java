package cn.uaj.web.controller;

import cn.uaj.entity.User;
import cn.uaj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/3/19 20:52
 */
@Controller
@RequestMapping("/user")

public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        System.out.println("test");
        List<User> userList1 = userService.findAll();
        System.out.println(userList1 + " 33");
        System.out.println("test3");
        return userList1;
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    @ResponseBody
    public User findById(Integer id){
        return userService.findById(id);
    }

    /**
     * 更新
     * @param user
     */
    @RequestMapping("/updateUser")
    @ResponseBody
    public void updateUser(@RequestBody User user){
        System.out.println(user);
        userService.updateUser(user);
    }
}
