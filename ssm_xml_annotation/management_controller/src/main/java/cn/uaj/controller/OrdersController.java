package cn.uaj.controller;

import cn.uaj.entity.Orders;
import cn.uaj.service.IOrdersService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 订单管理
 * @Author: wushaojie
 * @Date: 2020/2/14 21:27
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService iOrdersService;

    // 未分页
//    @RequestMapping("/findAllOrders.do")
//    public ModelAndView findAllOrders() throws Exception {
//        ModelAndView modelAndView = new ModelAndView();
//        List<Orders> ordersList = iOrdersService.findAll();
//        modelAndView.addObject("ordersList",ordersList);
//        modelAndView.setViewName("orders-list");
//        return modelAndView;
//    }

    // 分页
    @RequestMapping("/findAllOrders.do")
    public ModelAndView findAllOrders(@RequestParam(name = "pageNum",required = true,defaultValue = "1") Integer pageNum, @RequestParam(name = "pageSize",required = true,defaultValue = "4") Integer pageSize) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<Orders> ordersList = iOrdersService.findAll(pageNum,pageSize);
        //PageInfo就是一个分页Bean
        PageInfo<Orders> pageInfo = new PageInfo<>(ordersList);
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("orders-page-list");
        return modelAndView;
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(Integer id) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        Orders orders = iOrdersService.findOrdersById(id);
        modelAndView.addObject("orders",orders);
        modelAndView.setViewName("orders-show");
        return modelAndView;
    }
}
