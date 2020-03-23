package cn.uaj.controller;

import cn.uaj.service.ProvinceService;
import cn.uaj.service.impl.ProvinceServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: wushaojie
 * @Date: 2020/2/11 22:07
 */
public class ProvinceRedisDelete extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        ProvinceService provinceService = new ProvinceServiceImpl();
        if(id != null) {
            provinceService.delete(Integer.parseInt(id));
        }
        /*重定向*/
        // response.sendRedirect(request.getContextPath()+"/index.html");
        response.sendRedirect(request.getContextPath()+"/index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
