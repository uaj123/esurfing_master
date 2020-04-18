package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XSchemaTableStatisticsWithBuffer;
import cn.uaj.adminmaster.mbg.model.XSchemaTableStatisticsWithBufferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaTableStatisticsWithBufferMapper {
    int countByExample(XSchemaTableStatisticsWithBufferExample example);

    int deleteByExample(XSchemaTableStatisticsWithBufferExample example);

    int insert(XSchemaTableStatisticsWithBuffer record);

    int insertSelective(XSchemaTableStatisticsWithBuffer record);

    List<XSchemaTableStatisticsWithBuffer> selectByExample(XSchemaTableStatisticsWithBufferExample example);

    int updateByExampleSelective(@Param("record") XSchemaTableStatisticsWithBuffer record, @Param("example") XSchemaTableStatisticsWithBufferExample example);

    int updateByExample(@Param("record") XSchemaTableStatisticsWithBuffer record, @Param("example") XSchemaTableStatisticsWithBufferExample example);
}