package cn.uaj.adminmaster.controller;

import cn.uaj.adminmaster.common.CommonResult;
import cn.uaj.adminmaster.domain.portal.MemberReadHistory;
import cn.uaj.adminmaster.service.portal.MemberReadHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员商品浏览记录管理Controller
 * @Author: wushaojie
 * @Date: 2020/4/20 17:01
 */
@Controller
@Api(tags = "MemberReadHistoryController",description = "会员商品浏览记录管理")
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {
    @Autowired
    private MemberReadHistoryService memberReadHistoryService;

    @ApiOperation("创建浏览器记录")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody MemberReadHistory memberReadHistory){
        int count = memberReadHistoryService.create(memberReadHistory);
        if (count > 0) {
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }
    @ApiOperation("删除浏览记录")
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("ids") List<String> ids){
        int count = memberReadHistoryService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        }else {
            return CommonResult.failed();
        }
    }
    @ApiOperation("展示浏览记录")
    @RequestMapping(value = "/readHistoryList",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<MemberReadHistory>> readHistoryList(Long memberId){
        List<MemberReadHistory> memberReadHistoryList = memberReadHistoryService.historyList(memberId);
        return CommonResult.success(memberReadHistoryList);
}
}
