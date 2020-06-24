package cn.uaj.mall.mapper.wmsMapper;

import cn.uaj.mall.entity.wms.WmsWareSku;
import cn.uaj.mall.entity.wms.WmsWareSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsWareSkuMapper {
    long countByExample(WmsWareSkuExample example);

    int deleteByExample(WmsWareSkuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WmsWareSku record);

    int insertSelective(WmsWareSku record);

    List<WmsWareSku> selectByExample(WmsWareSkuExample example);

    WmsWareSku selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WmsWareSku record, @Param("example") WmsWareSkuExample example);

    int updateByExample(@Param("record") WmsWareSku record, @Param("example") WmsWareSkuExample example);

    int updateByPrimaryKeySelective(WmsWareSku record);

    int updateByPrimaryKey(WmsWareSku record);
}