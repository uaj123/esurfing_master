package cn.uaj.mall.mapper.wmsMapper;

import cn.uaj.mall.entity.wms.WmsPurchase;
import cn.uaj.mall.entity.wms.WmsPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsPurchaseMapper {
    long countByExample(WmsPurchaseExample example);

    int deleteByExample(WmsPurchaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WmsPurchase record);

    int insertSelective(WmsPurchase record);

    List<WmsPurchase> selectByExample(WmsPurchaseExample example);

    WmsPurchase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WmsPurchase record, @Param("example") WmsPurchaseExample example);

    int updateByExample(@Param("record") WmsPurchase record, @Param("example") WmsPurchaseExample example);

    int updateByPrimaryKeySelective(WmsPurchase record);

    int updateByPrimaryKey(WmsPurchase record);
}