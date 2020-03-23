package cn.uaj.springboot_01;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: wushaojie
 * @Date: 2020/3/18 20:45
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("loginInterceptor");
        Object o = request.getSession().getAttribute("");
        if (o != null) {
            return true;
        }else {
            request.getRequestDispatcher("/login").forward(request,response);
            return false;
        }
    }
}
