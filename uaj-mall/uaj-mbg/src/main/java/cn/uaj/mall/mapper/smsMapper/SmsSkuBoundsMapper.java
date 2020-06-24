package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsSkuBounds;
import cn.uaj.mall.entity.sms.SmsSkuBoundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsSkuBoundsMapper {
    long countByExample(SmsSkuBoundsExample example);

    int deleteByExample(SmsSkuBoundsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsSkuBounds record);

    int insertSelective(SmsSkuBounds record);

    List<SmsSkuBounds> selectByExample(SmsSkuBoundsExample example);

    SmsSkuBounds selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsSkuBounds record, @Param("example") SmsSkuBoundsExample example);

    int updateByExample(@Param("record") SmsSkuBounds record, @Param("example") SmsSkuBoundsExample example);

    int updateByPrimaryKeySelective(SmsSkuBounds record);

    int updateByPrimaryKey(SmsSkuBounds record);
}