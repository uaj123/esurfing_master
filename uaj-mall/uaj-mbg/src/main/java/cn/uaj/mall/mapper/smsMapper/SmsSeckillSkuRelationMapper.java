package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsSeckillSkuRelation;
import cn.uaj.mall.entity.sms.SmsSeckillSkuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsSeckillSkuRelationMapper {
    long countByExample(SmsSeckillSkuRelationExample example);

    int deleteByExample(SmsSeckillSkuRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsSeckillSkuRelation record);

    int insertSelective(SmsSeckillSkuRelation record);

    List<SmsSeckillSkuRelation> selectByExample(SmsSeckillSkuRelationExample example);

    SmsSeckillSkuRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsSeckillSkuRelation record, @Param("example") SmsSeckillSkuRelationExample example);

    int updateByExample(@Param("record") SmsSeckillSkuRelation record, @Param("example") SmsSeckillSkuRelationExample example);

    int updateByPrimaryKeySelective(SmsSeckillSkuRelation record);

    int updateByPrimaryKey(SmsSeckillSkuRelation record);
}