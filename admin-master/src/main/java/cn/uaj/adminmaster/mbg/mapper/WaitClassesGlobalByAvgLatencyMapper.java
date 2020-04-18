package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.WaitClassesGlobalByAvgLatency;
import cn.uaj.adminmaster.mbg.model.WaitClassesGlobalByAvgLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitClassesGlobalByAvgLatencyMapper {
    int countByExample(WaitClassesGlobalByAvgLatencyExample example);

    int deleteByExample(WaitClassesGlobalByAvgLatencyExample example);

    int insert(WaitClassesGlobalByAvgLatency record);

    int insertSelective(WaitClassesGlobalByAvgLatency record);

    List<WaitClassesGlobalByAvgLatency> selectByExampleWithBLOBs(WaitClassesGlobalByAvgLatencyExample example);

    List<WaitClassesGlobalByAvgLatency> selectByExample(WaitClassesGlobalByAvgLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitClassesGlobalByAvgLatency record, @Param("example") WaitClassesGlobalByAvgLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") WaitClassesGlobalByAvgLatency record, @Param("example") WaitClassesGlobalByAvgLatencyExample example);

    int updateByExample(@Param("record") WaitClassesGlobalByAvgLatency record, @Param("example") WaitClassesGlobalByAvgLatencyExample example);
}