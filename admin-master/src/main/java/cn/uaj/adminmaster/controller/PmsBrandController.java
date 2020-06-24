package cn.uaj.adminmaster.controller;

import cn.uaj.adminmaster.common.CommonPage;
import cn.uaj.adminmaster.common.CommonResult;
import cn.uaj.adminmaster.mbg.model.PmsBrand;
import cn.uaj.adminmaster.service.PmsBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/4/14 10:26
 */
@Controller
@Api(tags = "PmsBrandController",description = "商品品牌管理")
@RequestMapping("/brand")
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    /**
     * 给查询接口添加pms:brand:read权限
     * 给修改接口添加pms:brand:update权限
     * 给删除接口添加pms:brand:delete权限
     * 给添加接口添加pms:brand:create权限
     * @return
     */
    @ApiOperation("获取所有品牌列表")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('pms:brand:read')") // 只有这个权限才能访问
    public CommonResult<List<PmsBrand>> getList(){
        return CommonResult.success(pmsBrandService.listAllBrand());
    }

    @ApiOperation("添加品牌")
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult create(@RequestBody PmsBrand pmsBrand){
        CommonResult commonResult = null;
        int count = pmsBrandService.createBrand(pmsBrand);
        if (count == 1) {
             commonResult = CommonResult.success(pmsBrand);
             LOGGER.debug("createBrand success:{}",pmsBrand);
        }else {
            CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed:{}",pmsBrand);
        }
        return commonResult;

    }
    @ApiOperation("跟新指定id品牌信息")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateBrand(@PathVariable("id") Long id, @RequestBody PmsBrand pmsBrandDto, BindingResult result){
        CommonResult commonResult;
        int count = pmsBrandService.updateBrand(id,pmsBrandDto);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrandDto);
            LOGGER.debug("updateBrand success:{}",pmsBrandDto);
        }else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}",pmsBrandDto);
        }
        return commonResult;
    }
    @ApiOperation("删除指定id的品牌")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult deleteBrand(@PathVariable("id") Long id){
        int count = pmsBrandService.deleteBrand(id);
        if (count == 1) {
            LOGGER.debug("deleteBrand success :id{}",id);
            return CommonResult.success(null);
        }else {
            LOGGER.debug("deleteBrand failed :id{}",id);
            return CommonResult.failed("操作失败");
        }

    }
    @ApiOperation("分页查询品牌列表")
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,@RequestParam(value = "pageSize",defaultValue = "3") Integer pageSize){
        List<PmsBrand> brandList = pmsBrandService.listBrand(pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }
    @ApiOperation("获取指定id的品牌详情")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id){
        return CommonResult.success(pmsBrandService.getBrand(id));
    }
}
