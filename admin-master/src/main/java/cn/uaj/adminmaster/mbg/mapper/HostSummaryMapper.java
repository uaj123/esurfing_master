package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.HostSummary;
import cn.uaj.adminmaster.mbg.model.HostSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryMapper {
    int countByExample(HostSummaryExample example);

    int deleteByExample(HostSummaryExample example);

    int insert(HostSummary record);

    int insertSelective(HostSummary record);

    List<HostSummary> selectByExampleWithBLOBs(HostSummaryExample example);

    List<HostSummary> selectByExample(HostSummaryExample example);

    int updateByExampleSelective(@Param("record") HostSummary record, @Param("example") HostSummaryExample example);

    int updateByExampleWithBLOBs(@Param("record") HostSummary record, @Param("example") HostSummaryExample example);

    int updateByExample(@Param("record") HostSummary record, @Param("example") HostSummaryExample example);
}