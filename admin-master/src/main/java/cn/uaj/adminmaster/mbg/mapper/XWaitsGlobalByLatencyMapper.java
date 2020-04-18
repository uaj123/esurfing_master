package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XWaitsGlobalByLatency;
import cn.uaj.adminmaster.mbg.model.XWaitsGlobalByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XWaitsGlobalByLatencyMapper {
    int countByExample(XWaitsGlobalByLatencyExample example);

    int deleteByExample(XWaitsGlobalByLatencyExample example);

    int insert(XWaitsGlobalByLatency record);

    int insertSelective(XWaitsGlobalByLatency record);

    List<XWaitsGlobalByLatency> selectByExample(XWaitsGlobalByLatencyExample example);

    int updateByExampleSelective(@Param("record") XWaitsGlobalByLatency record, @Param("example") XWaitsGlobalByLatencyExample example);

    int updateByExample(@Param("record") XWaitsGlobalByLatency record, @Param("example") XWaitsGlobalByLatencyExample example);
}