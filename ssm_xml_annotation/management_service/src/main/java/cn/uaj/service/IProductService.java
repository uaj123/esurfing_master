package cn.uaj.service;

import cn.uaj.entity.Product;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/13 20:08
 */
public interface IProductService {
    /**
     * 查询所有产品
     * @return List<Product>
     */
    public List<Product> findAll() throws Exception;

    /**
     * 保存产品信息
     * @param product
     */
    void saveProduct(Product product) throws Exception;

    /**
     * 根据产品编号查询
     * @param productNum
     */
    Product findProductByProductNum(String productNum) throws Exception;
}
