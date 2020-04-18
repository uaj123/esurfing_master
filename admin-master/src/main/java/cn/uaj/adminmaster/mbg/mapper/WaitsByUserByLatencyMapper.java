package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.WaitsByUserByLatency;
import cn.uaj.adminmaster.mbg.model.WaitsByUserByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaitsByUserByLatencyMapper {
    int countByExample(WaitsByUserByLatencyExample example);

    int deleteByExample(WaitsByUserByLatencyExample example);

    int insert(WaitsByUserByLatency record);

    int insertSelective(WaitsByUserByLatency record);

    List<WaitsByUserByLatency> selectByExampleWithBLOBs(WaitsByUserByLatencyExample example);

    List<WaitsByUserByLatency> selectByExample(WaitsByUserByLatencyExample example);

    int updateByExampleSelective(@Param("record") WaitsByUserByLatency record, @Param("example") WaitsByUserByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") WaitsByUserByLatency record, @Param("example") WaitsByUserByLatencyExample example);

    int updateByExample(@Param("record") WaitsByUserByLatency record, @Param("example") WaitsByUserByLatencyExample example);
}