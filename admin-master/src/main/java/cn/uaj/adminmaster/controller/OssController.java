package cn.uaj.adminmaster.controller;

import cn.uaj.adminmaster.common.CommonResult;
import cn.uaj.adminmaster.dto.OssCallbackResult;
import cn.uaj.adminmaster.dto.OssPolicyResult;
import cn.uaj.adminmaster.service.impl.OssServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Oss相关操作接口
 * @Author: wushaojie
 * @Date: 2020/4/21 23:01
 */
@Controller
@Api(tags = "OssController",description = "Oss管理")
@RequestMapping("/aliyun/oss")
public class OssController {
    @Autowired
    private OssServiceImpl ossService;

    @ApiOperation(value = "oss上传签名生成")
    @RequestMapping(value = "/policy",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OssPolicyResult> policy(){
        OssPolicyResult result = ossService.policy();
        return CommonResult.success(result);
    }
    @ApiOperation(value = "oss上传成功回调")
    @RequestMapping(value = "/callback",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<OssCallbackResult> callback(HttpServletRequest request){
        OssCallbackResult ossCallbackResult = ossService.callback(request);
        return CommonResult.success(ossCallbackResult);
    }
}















