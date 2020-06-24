package cn.uaj.mall.mapper.omsMapper;

import cn.uaj.mall.entity.oms.OmsRefundInfo;
import cn.uaj.mall.entity.oms.OmsRefundInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsRefundInfoMapper {
    long countByExample(OmsRefundInfoExample example);

    int deleteByExample(OmsRefundInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsRefundInfo record);

    int insertSelective(OmsRefundInfo record);

    List<OmsRefundInfo> selectByExample(OmsRefundInfoExample example);

    OmsRefundInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsRefundInfo record, @Param("example") OmsRefundInfoExample example);

    int updateByExample(@Param("record") OmsRefundInfo record, @Param("example") OmsRefundInfoExample example);

    int updateByPrimaryKeySelective(OmsRefundInfo record);

    int updateByPrimaryKey(OmsRefundInfo record);
}