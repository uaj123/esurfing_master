package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsHomeAdv;
import cn.uaj.mall.entity.sms.SmsHomeAdvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeAdvMapper {
    long countByExample(SmsHomeAdvExample example);

    int deleteByExample(SmsHomeAdvExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeAdv record);

    int insertSelective(SmsHomeAdv record);

    List<SmsHomeAdv> selectByExample(SmsHomeAdvExample example);

    SmsHomeAdv selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsHomeAdv record, @Param("example") SmsHomeAdvExample example);

    int updateByExample(@Param("record") SmsHomeAdv record, @Param("example") SmsHomeAdvExample example);

    int updateByPrimaryKeySelective(SmsHomeAdv record);

    int updateByPrimaryKey(SmsHomeAdv record);
}