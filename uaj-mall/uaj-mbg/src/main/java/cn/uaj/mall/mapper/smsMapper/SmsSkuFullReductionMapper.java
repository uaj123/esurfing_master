package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsSkuFullReduction;
import cn.uaj.mall.entity.sms.SmsSkuFullReductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsSkuFullReductionMapper {
    long countByExample(SmsSkuFullReductionExample example);

    int deleteByExample(SmsSkuFullReductionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsSkuFullReduction record);

    int insertSelective(SmsSkuFullReduction record);

    List<SmsSkuFullReduction> selectByExample(SmsSkuFullReductionExample example);

    SmsSkuFullReduction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsSkuFullReduction record, @Param("example") SmsSkuFullReductionExample example);

    int updateByExample(@Param("record") SmsSkuFullReduction record, @Param("example") SmsSkuFullReductionExample example);

    int updateByPrimaryKeySelective(SmsSkuFullReduction record);

    int updateByPrimaryKey(SmsSkuFullReduction record);
}