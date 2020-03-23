package cn.uaj.controller;

import cn.uaj.entity.Role;
import cn.uaj.entity.UserInfo;
import cn.uaj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sun.security.util.Password;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 15:20
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAllUserInfo() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<UserInfo> userInfoList = iUserService.findAllUserInfo();
        modelAndView.addObject("userList",userInfoList);
        modelAndView.setViewName("user-list");
        return modelAndView;
    }

    @RequestMapping("/save.do")
    public String saveUserInfo(UserInfo userInfo) throws Exception {
        iUserService.saveUserInfo(userInfo);
        /*只能直接return "redirect:findAll.do" , 不能加/user */
        return "redirect:findAll.do";
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id",required = true) Integer id) throws Exception{
        UserInfo userInfo = iUserService.findUserInfoById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",userInfo);
        modelAndView.setViewName("user-show");
        return modelAndView;
    }

    @RequestMapping("/findOtherRole.do")
    public ModelAndView findOtherRole(@RequestParam(name = "id",required = true) Integer userId) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        /*根据用户id查询用户*/
        UserInfo userInfo = iUserService.findUserInfoById(userId);
        /*根据用户id查询可以添加的角色*/
        List<Role> otherRoles = iUserService.findOtherRoles(userId);
        modelAndView.addObject("userInfo",userInfo);
        modelAndView.addObject("otherRoles",otherRoles);
        modelAndView.setViewName("user-role-add");
        return modelAndView;
    }

    @RequestMapping("/saveRoleToUser")
    public String addRoleToUser(@RequestParam(name = "userId", required = true) Integer userId, @RequestParam(name = "ids", required = true) Integer[] roleIds) throws Exception {
        iUserService.addRoleToUser(userId,roleIds);
        return "redirect:findAll.do";
    }

    /*未完成密码修改功能*/
    @RequestMapping("/updatePassword.do")
    public ModelAndView updatePassword(@RequestParam(name = "id" ,required = true) Integer id,@RequestParam(name = "password" ,required = true) String oldPassword,@RequestParam(name = "newPassword" ,required = true) String  newPassword) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        String password = iUserService.findUserInfoById(id).getPassword();
        if (!(password.hashCode() == oldPassword.hashCode() && password.equals(oldPassword))) {
            modelAndView.addObject("error","原密码错误");
            modelAndView.setViewName("");
            return modelAndView;
        }
        iUserService.updatePassword(newPassword,id);
        modelAndView.addObject("success","修改成功");
        modelAndView.setViewName("main");
        return modelAndView;
    }
}
