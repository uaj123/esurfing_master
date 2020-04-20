package cn.uaj.adminmaster.repository.search;

import cn.uaj.adminmaster.domain.search.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 商品ES操作类
 * @Author: wushaojie
 * @Date: 2020/4/19 21:47
 */
public interface EsProductRepository extends ElasticsearchRepository<EsProduct,Long> {
    /**
     *  搜索查询
     * @param name 商品名称
     * @param subTitle 商品标题
     * @param keyworks 商品关键字
     * @param pageable 分页信息
     * @return
     */
    Page<EsProduct> findByNameOrSubTitleOrKeyworks(String name, String subTitle, String keyworks, Pageable pageable);
}
