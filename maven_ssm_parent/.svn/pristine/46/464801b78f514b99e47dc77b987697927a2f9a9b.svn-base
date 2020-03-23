package cn.uaj.controller;

import cn.uaj.entity.Items;
import cn.uaj.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: wushaojie
 * @Date: 2020/2/10 19:17
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findByIdItems")
    public String findByIdItems(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("items" , items);
        return "itemsDetail";
    }
    @RequestMapping("/saveItems")
    public void saveItems(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        itemsService.saveItems(items);
        response.sendRedirect(request.getContextPath() + "/items/findByIdItems");
    }

}
