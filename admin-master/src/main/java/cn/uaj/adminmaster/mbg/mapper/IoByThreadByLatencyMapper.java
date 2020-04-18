package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.IoByThreadByLatency;
import cn.uaj.adminmaster.mbg.model.IoByThreadByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoByThreadByLatencyMapper {
    int countByExample(IoByThreadByLatencyExample example);

    int deleteByExample(IoByThreadByLatencyExample example);

    int insert(IoByThreadByLatency record);

    int insertSelective(IoByThreadByLatency record);

    List<IoByThreadByLatency> selectByExampleWithBLOBs(IoByThreadByLatencyExample example);

    List<IoByThreadByLatency> selectByExample(IoByThreadByLatencyExample example);

    int updateByExampleSelective(@Param("record") IoByThreadByLatency record, @Param("example") IoByThreadByLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") IoByThreadByLatency record, @Param("example") IoByThreadByLatencyExample example);

    int updateByExample(@Param("record") IoByThreadByLatency record, @Param("example") IoByThreadByLatencyExample example);
}