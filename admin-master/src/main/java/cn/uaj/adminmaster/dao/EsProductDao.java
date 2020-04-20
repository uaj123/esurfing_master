package cn.uaj.adminmaster.dao;

import cn.uaj.adminmaster.domain.search.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 搜索系统中的商品管里自定义Dao
 * @Author: wushaojie
 * @Date: 2020/4/19 22:16
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
