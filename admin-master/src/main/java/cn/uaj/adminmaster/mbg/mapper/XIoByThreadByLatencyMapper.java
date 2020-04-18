package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XIoByThreadByLatency;
import cn.uaj.adminmaster.mbg.model.XIoByThreadByLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XIoByThreadByLatencyMapper {
    int countByExample(XIoByThreadByLatencyExample example);

    int deleteByExample(XIoByThreadByLatencyExample example);

    int insert(XIoByThreadByLatency record);

    int insertSelective(XIoByThreadByLatency record);

    List<XIoByThreadByLatency> selectByExample(XIoByThreadByLatencyExample example);

    int updateByExampleSelective(@Param("record") XIoByThreadByLatency record, @Param("example") XIoByThreadByLatencyExample example);

    int updateByExample(@Param("record") XIoByThreadByLatency record, @Param("example") XIoByThreadByLatencyExample example);
}