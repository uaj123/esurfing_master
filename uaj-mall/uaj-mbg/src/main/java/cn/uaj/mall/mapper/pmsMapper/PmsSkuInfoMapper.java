package cn.uaj.mall.mapper.pmsMapper;

import cn.uaj.mall.entity.pms.PmsSkuInfo;
import cn.uaj.mall.entity.pms.PmsSkuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsSkuInfoMapper {
    long countByExample(PmsSkuInfoExample example);

    int deleteByExample(PmsSkuInfoExample example);

    int deleteByPrimaryKey(Long skuId);

    int insert(PmsSkuInfo record);

    int insertSelective(PmsSkuInfo record);

    List<PmsSkuInfo> selectByExample(PmsSkuInfoExample example);

    PmsSkuInfo selectByPrimaryKey(Long skuId);

    int updateByExampleSelective(@Param("record") PmsSkuInfo record, @Param("example") PmsSkuInfoExample example);

    int updateByExample(@Param("record") PmsSkuInfo record, @Param("example") PmsSkuInfoExample example);

    int updateByPrimaryKeySelective(PmsSkuInfo record);

    int updateByPrimaryKey(PmsSkuInfo record);
}