package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsMemberPrice;
import cn.uaj.mall.entity.sms.SmsMemberPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsMemberPriceMapper {
    long countByExample(SmsMemberPriceExample example);

    int deleteByExample(SmsMemberPriceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsMemberPrice record);

    int insertSelective(SmsMemberPrice record);

    List<SmsMemberPrice> selectByExample(SmsMemberPriceExample example);

    SmsMemberPrice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsMemberPrice record, @Param("example") SmsMemberPriceExample example);

    int updateByExample(@Param("record") SmsMemberPrice record, @Param("example") SmsMemberPriceExample example);

    int updateByPrimaryKeySelective(SmsMemberPrice record);

    int updateByPrimaryKey(SmsMemberPrice record);
}