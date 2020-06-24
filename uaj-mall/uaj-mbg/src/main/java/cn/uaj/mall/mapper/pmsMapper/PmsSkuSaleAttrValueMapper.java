package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsSkuSaleAttrValue;
import cn.uaj.mall.entity.pms.PmsSkuSaleAttrValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSkuSaleAttrValueMapper {
    long countByExample(PmsSkuSaleAttrValueExample example);

    int deleteByExample(PmsSkuSaleAttrValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsSkuSaleAttrValue record);

    int insertSelective(PmsSkuSaleAttrValue record);

    List<PmsSkuSaleAttrValue> selectByExample(PmsSkuSaleAttrValueExample example);

    PmsSkuSaleAttrValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsSkuSaleAttrValue record, @Param("example") PmsSkuSaleAttrValueExample example);

    int updateByExample(@Param("record") PmsSkuSaleAttrValue record, @Param("example") PmsSkuSaleAttrValueExample example);

    int updateByPrimaryKeySelective(PmsSkuSaleAttrValue record);

    int updateByPrimaryKey(PmsSkuSaleAttrValue record);
}