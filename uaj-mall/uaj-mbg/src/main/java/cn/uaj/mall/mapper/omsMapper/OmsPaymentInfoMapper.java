package cn.uaj.mall.mapper.omsMapper;

import cn.uaj.mall.entity.oms.OmsPaymentInfo;
import cn.uaj.mall.entity.oms.OmsPaymentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsPaymentInfoMapper {
    long countByExample(OmsPaymentInfoExample example);

    int deleteByExample(OmsPaymentInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsPaymentInfo record);

    int insertSelective(OmsPaymentInfo record);

    List<OmsPaymentInfo> selectByExample(OmsPaymentInfoExample example);

    OmsPaymentInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsPaymentInfo record, @Param("example") OmsPaymentInfoExample example);

    int updateByExample(@Param("record") OmsPaymentInfo record, @Param("example") OmsPaymentInfoExample example);

    int updateByPrimaryKeySelective(OmsPaymentInfo record);

    int updateByPrimaryKey(OmsPaymentInfo record);
}