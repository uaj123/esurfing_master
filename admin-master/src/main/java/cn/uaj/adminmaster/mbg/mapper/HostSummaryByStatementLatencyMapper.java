package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.HostSummaryByStatementLatency;
import cn.uaj.adminmaster.mbg.model.HostSummaryByStatementLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByStatementLatencyMapper {
    int countByExample(HostSummaryByStatementLatencyExample example);

    int deleteByExample(HostSummaryByStatementLatencyExample example);

    int insert(HostSummaryByStatementLatency record);

    int insertSelective(HostSummaryByStatementLatency record);

    List<HostSummaryByStatementLatency> selectByExampleWithBLOBs(HostSummaryByStatementLatencyExample example);

    List<HostSummaryByStatementLatency> selectByExample(HostSummaryByStatementLatencyExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByStatementLatency record, @Param("example") HostSummaryByStatementLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") HostSummaryByStatementLatency record, @Param("example") HostSummaryByStatementLatencyExample example);

    int updateByExample(@Param("record") HostSummaryByStatementLatency record, @Param("example") HostSummaryByStatementLatencyExample example);
}