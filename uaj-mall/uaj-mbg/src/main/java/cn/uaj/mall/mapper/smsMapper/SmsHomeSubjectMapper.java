package cn.uaj.mall.mapper.smsMapper;

import cn.uaj.mall.entity.sms.SmsHomeSubject;
import cn.uaj.mall.entity.sms.SmsHomeSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeSubjectMapper {
    long countByExample(SmsHomeSubjectExample example);

    int deleteByExample(SmsHomeSubjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeSubject record);

    int insertSelective(SmsHomeSubject record);

    List<SmsHomeSubject> selectByExample(SmsHomeSubjectExample example);

    SmsHomeSubject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsHomeSubject record, @Param("example") SmsHomeSubjectExample example);

    int updateByExample(@Param("record") SmsHomeSubject record, @Param("example") SmsHomeSubjectExample example);

    int updateByPrimaryKeySelective(SmsHomeSubject record);

    int updateByPrimaryKey(SmsHomeSubject record);
}