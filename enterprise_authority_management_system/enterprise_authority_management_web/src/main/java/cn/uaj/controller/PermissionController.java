package cn.uaj.controller;

import cn.uaj.entity.Permission;
import cn.uaj.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 21:17
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private IPermissionService iPermissionService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        List<Permission> permissionList = iPermissionService.findAllPermission();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("permissionList",permissionList);
        modelAndView.setViewName("permission-list");
        return modelAndView;
    }

    @RequestMapping("/savePermission")
    public String savePer(Permission permission){
        iPermissionService.savePermission(permission);
        return "redirect:findAll.do";
    }

    @RequestMapping("/deletePermission")
    public String deletePermission(@RequestParam(name = "id",required = true) Integer id) throws Exception {
        //第一： 先删除中间表的对应关系数据，才能删除中间表关联的其他表的数据
        iPermissionService.deletePermissionFromRole(id);
        //第二：才能删除中间表关联的其他表的数据，两个service顺序不能颠倒
        iPermissionService.deletePermission(id);
        return "redirect:findAll.do";
    }
}
