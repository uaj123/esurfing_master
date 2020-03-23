package cn.uaj.controller;

import cn.uaj.entity.Province;
import cn.uaj.service.ProvinceService;
import cn.uaj.service.impl.ProvinceServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/11 20:40
 */
@WebServlet("/provinceRedisServlet")
public class ProvinceRedisServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用service查询
        ProvinceService provinceService = new ProvinceServiceImpl();
        String json = provinceService.findAllJson();

        /*响应结果*/
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
