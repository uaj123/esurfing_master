package cn.uaj.controller;

import cn.uaj.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: wushaojie
 * @Date: 2020/2/7 11:29
 */
@Controller
@RequestMapping("/account")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString执行了。。。");
        Account account = new Account();
        account.setPassword("123");
        account.setUsername("skks");
        model.addAttribute("account" ,account);
        return "success";
    }
    @RequestMapping("testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("testVoid执行了。。。");
        /*转发，可以直接访问WEB-INF目录下的jsp*/
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        /*重定向，不可以直接访问WEB-INF目录下的jsp*/
        //response.sendRedirect(request.getContextPath() + "/response.jsp");
        /*设置中文乱码*/
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        /*直接会进行响应*/
        response.getWriter().print("你好");
        return;
    }
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){
        /*创建modelAndView对象*/
        ModelAndView modelAndView = new ModelAndView();
        Account account = new Account();
        account.setUsername("消灭");
        account.setPassword("555");
        /*把account对象存入到modelAndView对象中，也会存入request域对象中*/
        modelAndView.addObject("account",account);
        /*跳转到哪个页面*/
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("testForwardOrRedirect执行了。。。");
        /*转发*/
        //return "forward:/WEB-INF/pages/success.jsp";
        /*重定向*/
        return "redirect:/response.jsp";
    }

    /**
     * @ResponseBody 注解用于转换响应体内容为json格式
     * @RequestBody 注解用于获取请求体内容
     * @param account account
     */
    @RequestMapping("testAjax")
    public @ResponseBody Account testAjax(@RequestBody Account account){
        System.out.println("testAjax执行了。。。");
        System.out.println(account);
        return account;
    }
}
