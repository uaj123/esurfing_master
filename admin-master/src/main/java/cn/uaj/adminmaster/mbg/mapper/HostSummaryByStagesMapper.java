package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.HostSummaryByStages;
import cn.uaj.adminmaster.mbg.model.HostSummaryByStagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByStagesMapper {
    int countByExample(HostSummaryByStagesExample example);

    int deleteByExample(HostSummaryByStagesExample example);

    int insert(HostSummaryByStages record);

    int insertSelective(HostSummaryByStages record);

    List<HostSummaryByStages> selectByExampleWithBLOBs(HostSummaryByStagesExample example);

    List<HostSummaryByStages> selectByExample(HostSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByStages record, @Param("example") HostSummaryByStagesExample example);

    int updateByExampleWithBLOBs(@Param("record") HostSummaryByStages record, @Param("example") HostSummaryByStagesExample example);

    int updateByExample(@Param("record") HostSummaryByStages record, @Param("example") HostSummaryByStagesExample example);
}