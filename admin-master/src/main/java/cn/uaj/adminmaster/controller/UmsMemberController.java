package cn.uaj.adminmaster.controller;

import cn.uaj.adminmaster.common.CommonResult;
import cn.uaj.adminmaster.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wushaojie
 * @Date: 2020/4/15 21:01
 */
@Controller
@Api(tags = "UmsMemberController",description = "会员登录注册管理")
@RequestMapping("/sso")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam String telephone){
        return umsMemberService.generateAuthCode(telephone);
    }
    @RequestMapping(value = "/verifyAuthCode",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("判断验证码是否正确")
    public CommonResult updatePassword(@RequestParam String telephone,@RequestParam String authCode){
        return umsMemberService.verifyAuthCode(telephone,authCode);
    }

}
