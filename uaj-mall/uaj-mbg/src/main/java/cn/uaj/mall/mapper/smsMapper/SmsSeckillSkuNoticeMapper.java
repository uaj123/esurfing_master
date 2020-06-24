package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsSeckillSkuNotice;
import cn.uaj.mall.entity.sms.SmsSeckillSkuNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsSeckillSkuNoticeMapper {
    long countByExample(SmsSeckillSkuNoticeExample example);

    int deleteByExample(SmsSeckillSkuNoticeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsSeckillSkuNotice record);

    int insertSelective(SmsSeckillSkuNotice record);

    List<SmsSeckillSkuNotice> selectByExample(SmsSeckillSkuNoticeExample example);

    SmsSeckillSkuNotice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsSeckillSkuNotice record, @Param("example") SmsSeckillSkuNoticeExample example);

    int updateByExample(@Param("record") SmsSeckillSkuNotice record, @Param("example") SmsSeckillSkuNoticeExample example);

    int updateByPrimaryKeySelective(SmsSeckillSkuNotice record);

    int updateByPrimaryKey(SmsSeckillSkuNotice record);
}