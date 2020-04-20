package cn.uaj.adminmaster.controller;

import cn.uaj.adminmaster.common.CommonPage;
import cn.uaj.adminmaster.common.CommonResult;
import cn.uaj.adminmaster.domain.search.EsProduct;
import cn.uaj.adminmaster.service.search.EsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 搜索商品管理Controller
 * @Author: wushaojie
 * @Date: 2020/4/20 13:51
 */
@Controller
@Api(tags = "EsProductController",description = "搜索商品管理")
@RequestMapping("/esProduct")
public class EsProductController {
    @Autowired
    private EsProductService esProductService;
    @ApiOperation(value = "导入所有数据库中的商品到ES")
    @RequestMapping(value = "/importAll",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<Integer> importAllList(){
        int count = esProductService.importAll();
        return CommonResult.success(count);
    }
    @ApiOperation(value = "根据id删除商品")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    // Spring会对@PathVariable注解的变量进行自动赋值
    public CommonResult<Object> delete(@PathVariable Long id){
        esProductService.delete(id);
        return CommonResult.success(null);
    }
    @ApiOperation(value = "根据ids批量删除商品")
    @RequestMapping(value = "/delete/batch",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Object> delete(@RequestParam("ids") List<Long> ids){
        esProductService.delete(ids);
        return CommonResult.success(null);
    }
    @ApiOperation(value = "根据id创建商品")
    @RequestMapping(value = "create/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<EsProduct> create(@PathVariable Long id){
        EsProduct esProduct = esProductService.create(id);
        if (esProduct != null) {
            return CommonResult.success(esProduct);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EsProduct>> search(@RequestParam(required = false) String keywork,
                                                      @RequestParam(required = false,defaultValue = "0") Integer pageNum,
                                                      @RequestParam(required = false,defaultValue = "5") Integer pageSize){
        Page<EsProduct> esProductPage = esProductService.search(keywork, pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(esProductPage));
    }





}
