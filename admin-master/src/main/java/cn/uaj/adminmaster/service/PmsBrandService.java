package cn.uaj.adminmaster.service;

import cn.uaj.adminmaster.mbg.model.PmsBrand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品品牌Service
 * @Author: wushaojie
 * @Date: 2020/4/13 18:19
 */
public interface PmsBrandService {

    /**
     * 修改品牌
     * @param id
     * @param pmsBrandDto
     * @return
     */
    @Transactional
    int updateBrand(Long id, PmsBrand pmsBrandDto);

    /**
     * 删除品牌
     * @param id
     * @return
     */
    int deleteBrand(Long id);

    /**
     * 分页查询品牌
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsBrand> listBrand(Integer pageNum, Integer pageSize);

    /**
     * 获取品牌
     * @param id
     * @return
     */
    PmsBrand getBrand(Long id);

    /**
     * 创建品牌
     * @param pmsBrand
     * @return
     */
    int createBrand(PmsBrand pmsBrand);

    /**
     * 获取所有品牌
     * @return
     */
    List<PmsBrand> listAllBrand();
}
