package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsSkuLadder;
import cn.uaj.mall.entity.sms.SmsSkuLadderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsSkuLadderMapper {
    long countByExample(SmsSkuLadderExample example);

    int deleteByExample(SmsSkuLadderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsSkuLadder record);

    int insertSelective(SmsSkuLadder record);

    List<SmsSkuLadder> selectByExample(SmsSkuLadderExample example);

    SmsSkuLadder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsSkuLadder record, @Param("example") SmsSkuLadderExample example);

    int updateByExample(@Param("record") SmsSkuLadder record, @Param("example") SmsSkuLadderExample example);

    int updateByPrimaryKeySelective(SmsSkuLadder record);

    int updateByPrimaryKey(SmsSkuLadder record);
}