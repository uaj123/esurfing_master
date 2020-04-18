package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XWaitClassesGlobalByAvgLatency;
import cn.uaj.adminmaster.mbg.model.XWaitClassesGlobalByAvgLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitClassesGlobalByAvgLatencyMapper {
    int countByExample(XWaitClassesGlobalByAvgLatencyExample example);

    int deleteByExample(XWaitClassesGlobalByAvgLatencyExample example);

    int insert(XWaitClassesGlobalByAvgLatency record);

    int insertSelective(XWaitClassesGlobalByAvgLatency record);

    List<XWaitClassesGlobalByAvgLatency> selectByExample(XWaitClassesGlobalByAvgLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitClassesGlobalByAvgLatency record, @Param("example") XWaitClassesGlobalByAvgLatencyExample example);

    int updateByExample(@Param("record") XWaitClassesGlobalByAvgLatency record, @Param("example") XWaitClassesGlobalByAvgLatencyExample example);
}