package cn.uaj.controller;

import cn.uaj.entity.Product;
import cn.uaj.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * 产品管理
 * @Author: wushaojie
 * @Date: 2020/2/13 20:52
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping("/findAllProduct.do")
    public ModelAndView findAllProduct() throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        List<Product> products = iProductService.findAll();
        modelAndView.addObject("products",products);
        modelAndView.setViewName("product-list");
        return modelAndView;
    }

    @RequestMapping("/saveProduct.do")
    public String saveProduct(Product product) throws Exception{
        iProductService.saveProduct(product);
        return "redirect:findAllProduct.do";
    }

}
