package cn.uaj.controller;

import cn.uaj.entity.Product;
import cn.uaj.service.IProductService;
import cn.uaj.utils.CreateUUid;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: wushaojie
 * @Date: 2020/2/14 17:37
 */
@Controller
@RequestMapping("/uuid")
public class UUIDController {
    @Autowired
    private IProductService iProductService;

    @RequestMapping("/getIdCard.do")
    public ModelAndView getIdCard() throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        String uuid = CreateUUid.createUUID();
        System.out.println(uuid);
        Product product = iProductService.findProductByProductNum(uuid);
        if (product != null) {
            modelAndView.addObject("uuid", uuid);
            modelAndView.setViewName("product-add");
        }
        return modelAndView;
    }

}
