package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsHomeSubjectSpu;
import cn.uaj.mall.entity.sms.SmsHomeSubjectSpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeSubjectSpuMapper {
    long countByExample(SmsHomeSubjectSpuExample example);

    int deleteByExample(SmsHomeSubjectSpuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeSubjectSpu record);

    int insertSelective(SmsHomeSubjectSpu record);

    List<SmsHomeSubjectSpu> selectByExample(SmsHomeSubjectSpuExample example);

    SmsHomeSubjectSpu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsHomeSubjectSpu record, @Param("example") SmsHomeSubjectSpuExample example);

    int updateByExample(@Param("record") SmsHomeSubjectSpu record, @Param("example") SmsHomeSubjectSpuExample example);

    int updateByPrimaryKeySelective(SmsHomeSubjectSpu record);

    int updateByPrimaryKey(SmsHomeSubjectSpu record);
}