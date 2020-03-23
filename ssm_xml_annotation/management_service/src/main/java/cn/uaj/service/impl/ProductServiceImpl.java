package cn.uaj.service.impl;

import cn.uaj.dao.IProductDao;
import cn.uaj.service.IProductService;
import cn.uaj.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/13 20:09
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao iProductDao;

    @Override
    public List<Product> findAll() throws Exception{
        return iProductDao.findAll().isEmpty() ? null : iProductDao.findAll();
    }

    @Override
    public void saveProduct(Product product) throws Exception {
        iProductDao.saveProduct(product);
    }

    @Override
    public Product findProductByProductNum(String productNum) throws Exception{
        return iProductDao.findByProductNum(productNum);
    }
}
