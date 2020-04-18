package cn.uaj.adminmaster.controller;

import cn.uaj.adminmaster.common.CommonResult;
import cn.uaj.adminmaster.dto.UmsAdminLoginParm;
import cn.uaj.adminmaster.dto.UmsAdminParam;
import cn.uaj.adminmaster.mbg.model.UmsAdmin;
import cn.uaj.adminmaster.mbg.model.UmsPermission;
import cn.uaj.adminmaster.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: wushaojie
 * @Date: 2020/4/18 17:32
 */
@Controller
@RequestMapping("/admin")
@Api(tags = "UmsAdminController",description = "后台用户管理")
public class UmsAdminController {
    @Autowired
    private UmsAdminService umsAdminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<UmsAdmin> register(@RequestBody UmsAdminParam umsAdminParam, BindingResult result){
        UmsAdmin umsAdmin = umsAdminService.register(umsAdminParam);
        if (umsAdmin == null) {
            CommonResult.failed();
        }
        return CommonResult.success(umsAdmin);
    }

    @ApiOperation(value = "登录后返回token")
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody UmsAdminLoginParm umsAdminLoginParm, BindingResult result){
        String token = umsAdminService.login(umsAdminLoginParm.getUsername(),umsAdminLoginParm.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String,String > tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return CommonResult.success(tokenMap);

    }

    @ApiOperation(value = "获取用户所有权限(包括 +-权限")
    @RequestMapping(value = "/getPermissionList{adminId}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<UmsPermission>> getPermissionList(@PathVariable Long adminId){
        List<UmsPermission> permissionList = umsAdminService.getPermissionList(adminId);
        return CommonResult.success(permissionList);
    }

}
