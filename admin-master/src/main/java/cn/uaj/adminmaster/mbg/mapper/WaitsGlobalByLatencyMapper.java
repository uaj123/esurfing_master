package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.WaitsGlobalByLatency;
import cn.uaj.adminmaster.mbg.model.WaitsGlobalByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsGlobalByLatencyMapper {
    int countByExample(WaitsGlobalByLatencyExample example);

    int deleteByExample(WaitsGlobalByLatencyExample example);

    int insert(WaitsGlobalByLatency record);

    int insertSelective(WaitsGlobalByLatency record);

    List<WaitsGlobalByLatency> selectByExampleWithBLOBs(WaitsGlobalByLatencyExample example);

    List<WaitsGlobalByLatency> selectByExample(WaitsGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsGlobalByLatency record, @Param("example") WaitsGlobalByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") WaitsGlobalByLatency record, @Param("example") WaitsGlobalByLatencyExample example);

    int updateByExample(@Param("record") WaitsGlobalByLatency record, @Param("example") WaitsGlobalByLatencyExample example);
}