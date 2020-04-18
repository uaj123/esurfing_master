package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XWaitsByHostByLatency;
import cn.uaj.adminmaster.mbg.model.XWaitsByHostByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitsByHostByLatencyMapper {
    int countByExample(XWaitsByHostByLatencyExample example);

    int deleteByExample(XWaitsByHostByLatencyExample example);

    int insert(XWaitsByHostByLatency record);

    int insertSelective(XWaitsByHostByLatency record);

    List<XWaitsByHostByLatency> selectByExample(XWaitsByHostByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitsByHostByLatency record, @Param("example") XWaitsByHostByLatencyExample example);

    int updateByExample(@Param("record") XWaitsByHostByLatency record, @Param("example") XWaitsByHostByLatencyExample example);
}