package cn.uaj.dao;

import cn.uaj.entity.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/13 20:06
 */
@Repository
public interface IProductDao {
    /**
     * 查询所有产品
     * @return List<Product>
     */
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    /**
     * 保存
     * @param product
     */
    @Insert("insert into product (productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) " +
            "values (#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void saveProduct(Product product) throws Exception;
    /**
     * 根据产品id查询
     * @param id
     * @return
     */
    @Select("select * from product where id = #{id}")
    Product findByProductId(Integer id) throws Exception;
    /**
     * 根据产品编号查询
     * @param productNum
     * @return
     */
    @Select("select * from product where productNum = #{productNum}")
    Product findByProductNum(String productNum) throws Exception;
}
