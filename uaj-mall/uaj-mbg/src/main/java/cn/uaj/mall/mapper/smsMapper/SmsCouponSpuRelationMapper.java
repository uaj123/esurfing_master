package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsCouponSpuRelation;
import cn.uaj.mall.entity.sms.SmsCouponSpuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponSpuRelationMapper {
    long countByExample(SmsCouponSpuRelationExample example);

    int deleteByExample(SmsCouponSpuRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponSpuRelation record);

    int insertSelective(SmsCouponSpuRelation record);

    List<SmsCouponSpuRelation> selectByExample(SmsCouponSpuRelationExample example);

    SmsCouponSpuRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsCouponSpuRelation record, @Param("example") SmsCouponSpuRelationExample example);

    int updateByExample(@Param("record") SmsCouponSpuRelation record, @Param("example") SmsCouponSpuRelationExample example);

    int updateByPrimaryKeySelective(SmsCouponSpuRelation record);

    int updateByPrimaryKey(SmsCouponSpuRelation record);
}