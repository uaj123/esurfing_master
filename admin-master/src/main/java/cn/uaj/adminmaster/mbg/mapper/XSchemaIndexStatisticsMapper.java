package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XSchemaIndexStatistics;
import cn.uaj.adminmaster.mbg.model.XSchemaIndexStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaIndexStatisticsMapper {
    int countByExample(XSchemaIndexStatisticsExample example);

    int deleteByExample(XSchemaIndexStatisticsExample example);

    int insert(XSchemaIndexStatistics record);

    int insertSelective(XSchemaIndexStatistics record);

    List<XSchemaIndexStatistics> selectByExample(XSchemaIndexStatisticsExample example);

    int updateByExampleSelective(@Param("record") XSchemaIndexStatistics record, @Param("example") XSchemaIndexStatisticsExample example);

    int updateByExample(@Param("record") XSchemaIndexStatistics record, @Param("example") XSchemaIndexStatisticsExample example);
}