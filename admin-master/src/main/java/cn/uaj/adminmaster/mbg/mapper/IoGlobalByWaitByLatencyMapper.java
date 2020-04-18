package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.IoGlobalByWaitByLatency;
import cn.uaj.adminmaster.mbg.model.IoGlobalByWaitByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByWaitByLatencyMapper {
    int countByExample(IoGlobalByWaitByLatencyExample example);

    int deleteByExample(IoGlobalByWaitByLatencyExample example);

    int insert(IoGlobalByWaitByLatency record);

    int insertSelective(IoGlobalByWaitByLatency record);

    List<IoGlobalByWaitByLatency> selectByExampleWithBLOBs(IoGlobalByWaitByLatencyExample example);

    List<IoGlobalByWaitByLatency> selectByExample(IoGlobalByWaitByLatencyExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByWaitByLatency record, @Param("example") IoGlobalByWaitByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") IoGlobalByWaitByLatency record, @Param("example") IoGlobalByWaitByLatencyExample example);

    int updateByExample(@Param("record") IoGlobalByWaitByLatency record, @Param("example") IoGlobalByWaitByLatencyExample example);
}