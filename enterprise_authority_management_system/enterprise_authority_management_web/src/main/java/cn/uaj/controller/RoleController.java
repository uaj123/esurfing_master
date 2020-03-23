package cn.uaj.controller;

import cn.uaj.entity.Permission;
import cn.uaj.entity.Role;
import cn.uaj.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Permissions;
import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 18:06
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService iRoleService;

    @RequestMapping("/findAllRole.do")
    public ModelAndView findAllRole() throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        List<Role> roleList = iRoleService.findAllRole();
        modelAndView.addObject("roleList",roleList);
        modelAndView.setViewName("role-list");
        return modelAndView;
    }

    @RequestMapping("/saveRole.do")
    public String saveRole(Role role) throws Exception{
        iRoleService.saveRole(role);
        return "redirect:findAllRole.do";
    }

    @RequestMapping("/findRoleById.do")
    public ModelAndView findRoleById(@RequestParam(name = "id", required = true)Integer id) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        Role role = iRoleService.findRoleById(id);
        modelAndView.addObject("role",role);
        modelAndView.setViewName("role-show");
        return modelAndView;
    }
    @RequestMapping("/findRoleAndOtherPermissionsById.do")
    public ModelAndView findRoleAndOtherPermissionsById(@RequestParam(name = "id",required = true) Integer roleId) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        /*调用service根据id查询role*/
        Role role = iRoleService.findRoleById(roleId);
        // 查询该角色未拥有的权限
        List<Permission> otherPermissions =iRoleService.findOtherPermissionsById(roleId);
        modelAndView.addObject("otherPermissionList",otherPermissions);
        modelAndView.addObject("role",role);
        modelAndView.setViewName("role-permission-add");
        return modelAndView;
    }
    @RequestMapping("/savePermissionToRole")
    public String savePermissionToRole(@RequestParam(name = "roleId", required = true) Integer roleId, @RequestParam(name = "ids", required = true) Integer[] permissionIds) throws Exception{
        iRoleService.savePermissionToRole(roleId,permissionIds);
        return "redirect:findAllRole.do";
    }

    @RequestMapping("/deleteRoleById")
    public String deleteRoleById(@RequestParam(name = "id",required = true) Integer id) throws Exception{
        iRoleService.deleteRoleFromUser(id);
        iRoleService.deleteRole(id);
        return "redirect:findAllRole.do";
    }
}
