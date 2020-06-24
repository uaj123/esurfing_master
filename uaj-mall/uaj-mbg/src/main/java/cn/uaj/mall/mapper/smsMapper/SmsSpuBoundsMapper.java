package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsSpuBounds;
import cn.uaj.mall.entity.sms.SmsSpuBoundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsSpuBoundsMapper {
    long countByExample(SmsSpuBoundsExample example);

    int deleteByExample(SmsSpuBoundsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsSpuBounds record);

    int insertSelective(SmsSpuBounds record);

    List<SmsSpuBounds> selectByExample(SmsSpuBoundsExample example);

    SmsSpuBounds selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsSpuBounds record, @Param("example") SmsSpuBoundsExample example);

    int updateByExample(@Param("record") SmsSpuBounds record, @Param("example") SmsSpuBoundsExample example);

    int updateByPrimaryKeySelective(SmsSpuBounds record);

    int updateByPrimaryKey(SmsSpuBounds record);
}