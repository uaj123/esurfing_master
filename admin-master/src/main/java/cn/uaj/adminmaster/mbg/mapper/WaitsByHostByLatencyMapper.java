package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.WaitsByHostByLatency;
import cn.uaj.adminmaster.mbg.model.WaitsByHostByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsByHostByLatencyMapper {
    int countByExample(WaitsByHostByLatencyExample example);

    int deleteByExample(WaitsByHostByLatencyExample example);

    int insert(WaitsByHostByLatency record);

    int insertSelective(WaitsByHostByLatency record);

    List<WaitsByHostByLatency> selectByExampleWithBLOBs(WaitsByHostByLatencyExample example);

    List<WaitsByHostByLatency> selectByExample(WaitsByHostByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsByHostByLatency record, @Param("example") WaitsByHostByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") WaitsByHostByLatency record, @Param("example") WaitsByHostByLatencyExample example);

    int updateByExample(@Param("record") WaitsByHostByLatency record, @Param("example") WaitsByHostByLatencyExample example);
}