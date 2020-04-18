package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XHostSummaryByStatementLatency;
import cn.uaj.adminmaster.mbg.model.XHostSummaryByStatementLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryByStatementLatencyMapper {
    int countByExample(XHostSummaryByStatementLatencyExample example);

    int deleteByExample(XHostSummaryByStatementLatencyExample example);

    int insert(XHostSummaryByStatementLatency record);

    int insertSelective(XHostSummaryByStatementLatency record);

    List<XHostSummaryByStatementLatency> selectByExample(XHostSummaryByStatementLatencyExample example);

    int updateByExampleSelective(@Param("record") XHostSummaryByStatementLatency record, @Param("example") XHostSummaryByStatementLatencyExample example);

    int updateByExample(@Param("record") XHostSummaryByStatementLatency record, @Param("example") XHostSummaryByStatementLatencyExample example);
}