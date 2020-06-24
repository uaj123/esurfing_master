package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsCategoryBounds;
import cn.uaj.mall.entity.sms.SmsCategoryBoundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsCategoryBoundsMapper {
    long countByExample(SmsCategoryBoundsExample example);

    int deleteByExample(SmsCategoryBoundsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsCategoryBounds record);

    int insertSelective(SmsCategoryBounds record);

    List<SmsCategoryBounds> selectByExample(SmsCategoryBoundsExample example);

    SmsCategoryBounds selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsCategoryBounds record, @Param("example") SmsCategoryBoundsExample example);

    int updateByExample(@Param("record") SmsCategoryBounds record, @Param("example") SmsCategoryBoundsExample example);

    int updateByPrimaryKeySelective(SmsCategoryBounds record);

    int updateByPrimaryKey(SmsCategoryBounds record);
}