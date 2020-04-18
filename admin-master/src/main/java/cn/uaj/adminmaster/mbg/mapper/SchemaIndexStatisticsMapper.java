package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.SchemaIndexStatistics;
import cn.uaj.adminmaster.mbg.model.SchemaIndexStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaIndexStatisticsMapper {
    int countByExample(SchemaIndexStatisticsExample example);

    int deleteByExample(SchemaIndexStatisticsExample example);

    int insert(SchemaIndexStatistics record);

    int insertSelective(SchemaIndexStatistics record);

    List<SchemaIndexStatistics> selectByExampleWithBLOBs(SchemaIndexStatisticsExample example);

    List<SchemaIndexStatistics> selectByExample(SchemaIndexStatisticsExample example);

    int updateByExampleSelective(@Param("record") SchemaIndexStatistics record, @Param("example") SchemaIndexStatisticsExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaIndexStatistics record, @Param("example") SchemaIndexStatisticsExample example);

    int updateByExample(@Param("record") SchemaIndexStatistics record, @Param("example") SchemaIndexStatisticsExample example);
}