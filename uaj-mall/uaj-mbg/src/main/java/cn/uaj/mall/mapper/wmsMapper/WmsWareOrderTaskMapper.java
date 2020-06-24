package cn.uaj.mall.mapper.wmsMapper;

import cn.uaj.mall.entity.wms.WmsWareOrderTask;
import cn.uaj.mall.entity.wms.WmsWareOrderTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WmsWareOrderTaskMapper {
    long countByExample(WmsWareOrderTaskExample example);

    int deleteByExample(WmsWareOrderTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WmsWareOrderTask record);

    int insertSelective(WmsWareOrderTask record);

    List<WmsWareOrderTask> selectByExample(WmsWareOrderTaskExample example);

    WmsWareOrderTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WmsWareOrderTask record, @Param("example") WmsWareOrderTaskExample example);

    int updateByExample(@Param("record") WmsWareOrderTask record, @Param("example") WmsWareOrderTaskExample example);

    int updateByPrimaryKeySelective(WmsWareOrderTask record);

    int updateByPrimaryKey(WmsWareOrderTask record);
}