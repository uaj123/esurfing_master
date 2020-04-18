package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.UserSummaryByStatementLatency;
import cn.uaj.adminmaster.mbg.model.UserSummaryByStatementLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByStatementLatencyMapper {
    int countByExample(UserSummaryByStatementLatencyExample example);

    int deleteByExample(UserSummaryByStatementLatencyExample example);

    int insert(UserSummaryByStatementLatency record);

    int insertSelective(UserSummaryByStatementLatency record);

    List<UserSummaryByStatementLatency> selectByExampleWithBLOBs(UserSummaryByStatementLatencyExample example);

    List<UserSummaryByStatementLatency> selectByExample(UserSummaryByStatementLatencyExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByStatementLatency record, @Param("example") UserSummaryByStatementLatencyExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSummaryByStatementLatency record, @Param("example") UserSummaryByStatementLatencyExample example);

    int updateByExample(@Param("record") UserSummaryByStatementLatency record, @Param("example") UserSummaryByStatementLatencyExample example);
}