package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.IoGlobalByFileByLatency;
import cn.uaj.adminmaster.mbg.model.IoGlobalByFileByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByFileByLatencyMapper {
    int countByExample(IoGlobalByFileByLatencyExample example);

    int deleteByExample(IoGlobalByFileByLatencyExample example);

    int insert(IoGlobalByFileByLatency record);

    int insertSelective(IoGlobalByFileByLatency record);

    List<IoGlobalByFileByLatency> selectByExampleWithBLOBs(IoGlobalByFileByLatencyExample example);

    List<IoGlobalByFileByLatency> selectByExample(IoGlobalByFileByLatencyExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByFileByLatency record, @Param("example") IoGlobalByFileByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") IoGlobalByFileByLatency record, @Param("example") IoGlobalByFileByLatencyExample example);

    int updateByExample(@Param("record") IoGlobalByFileByLatency record, @Param("example") IoGlobalByFileByLatencyExample example);
}