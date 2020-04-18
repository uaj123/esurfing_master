package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.SchemaTableStatisticsWithBuffer;
import cn.uaj.adminmaster.mbg.model.SchemaTableStatisticsWithBufferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableStatisticsWithBufferMapper {
    int countByExample(SchemaTableStatisticsWithBufferExample example);

    int deleteByExample(SchemaTableStatisticsWithBufferExample example);

    int insert(SchemaTableStatisticsWithBuffer record);

    int insertSelective(SchemaTableStatisticsWithBuffer record);

    List<SchemaTableStatisticsWithBuffer> selectByExampleWithBLOBs(SchemaTableStatisticsWithBufferExample example);

    List<SchemaTableStatisticsWithBuffer> selectByExample(SchemaTableStatisticsWithBufferExample example);

    int updateByExampleSelective(@Param("record") SchemaTableStatisticsWithBuffer record, @Param("example") SchemaTableStatisticsWithBufferExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaTableStatisticsWithBuffer record, @Param("example") SchemaTableStatisticsWithBufferExample example);

    int updateByExample(@Param("record") SchemaTableStatisticsWithBuffer record, @Param("example") SchemaTableStatisticsWithBufferExample example);
}