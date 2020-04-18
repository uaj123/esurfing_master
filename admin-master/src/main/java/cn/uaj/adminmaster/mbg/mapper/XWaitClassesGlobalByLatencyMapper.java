package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XWaitClassesGlobalByLatency;
import cn.uaj.adminmaster.mbg.model.XWaitClassesGlobalByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitClassesGlobalByLatencyMapper {
    int countByExample(XWaitClassesGlobalByLatencyExample example);

    int deleteByExample(XWaitClassesGlobalByLatencyExample example);

    int insert(XWaitClassesGlobalByLatency record);

    int insertSelective(XWaitClassesGlobalByLatency record);

    List<XWaitClassesGlobalByLatency> selectByExample(XWaitClassesGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitClassesGlobalByLatency record, @Param("example") XWaitClassesGlobalByLatencyExample example);

    int updateByExample(@Param("record") XWaitClassesGlobalByLatency record, @Param("example") XWaitClassesGlobalByLatencyExample example);
}