package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.SchemaTableStatistics;
import cn.uaj.adminmaster.mbg.model.SchemaTableStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableStatisticsMapper {
    int countByExample(SchemaTableStatisticsExample example);

    int deleteByExample(SchemaTableStatisticsExample example);

    int insert(SchemaTableStatistics record);

    int insertSelective(SchemaTableStatistics record);

    List<SchemaTableStatistics> selectByExampleWithBLOBs(SchemaTableStatisticsExample example);

    List<SchemaTableStatistics> selectByExample(SchemaTableStatisticsExample example);

    int updateByExampleSelective(@Param("record") SchemaTableStatistics record, @Param("example") SchemaTableStatisticsExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaTableStatistics record, @Param("example") SchemaTableStatisticsExample example);

    int updateByExample(@Param("record") SchemaTableStatistics record, @Param("example") SchemaTableStatisticsExample example);
}