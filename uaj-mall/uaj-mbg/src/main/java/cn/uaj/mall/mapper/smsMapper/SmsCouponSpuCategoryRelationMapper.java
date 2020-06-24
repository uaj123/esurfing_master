package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsCouponSpuCategoryRelation;
import cn.uaj.mall.entity.sms.SmsCouponSpuCategoryRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCouponSpuCategoryRelationMapper {
    long countByExample(SmsCouponSpuCategoryRelationExample example);

    int deleteByExample(SmsCouponSpuCategoryRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponSpuCategoryRelation record);

    int insertSelective(SmsCouponSpuCategoryRelation record);

    List<SmsCouponSpuCategoryRelation> selectByExample(SmsCouponSpuCategoryRelationExample example);

    SmsCouponSpuCategoryRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsCouponSpuCategoryRelation record, @Param("example") SmsCouponSpuCategoryRelationExample example);

    int updateByExample(@Param("record") SmsCouponSpuCategoryRelation record, @Param("example") SmsCouponSpuCategoryRelationExample example);

    int updateByPrimaryKeySelective(SmsCouponSpuCategoryRelation record);

    int updateByPrimaryKey(SmsCouponSpuCategoryRelation record);
}