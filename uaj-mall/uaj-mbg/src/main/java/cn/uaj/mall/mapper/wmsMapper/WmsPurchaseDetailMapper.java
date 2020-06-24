package cn.uaj.mall.mapper.wmsMapper;

import cn.uaj.mall.entity.wms.WmsPurchaseDetail;
import cn.uaj.mall.entity.wms.WmsPurchaseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsPurchaseDetailMapper {
    long countByExample(WmsPurchaseDetailExample example);

    int deleteByExample(WmsPurchaseDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WmsPurchaseDetail record);

    int insertSelective(WmsPurchaseDetail record);

    List<WmsPurchaseDetail> selectByExample(WmsPurchaseDetailExample example);

    WmsPurchaseDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WmsPurchaseDetail record, @Param("example") WmsPurchaseDetailExample example);

    int updateByExample(@Param("record") WmsPurchaseDetail record, @Param("example") WmsPurchaseDetailExample example);

    int updateByPrimaryKeySelective(WmsPurchaseDetail record);

    int updateByPrimaryKey(WmsPurchaseDetail record);
}