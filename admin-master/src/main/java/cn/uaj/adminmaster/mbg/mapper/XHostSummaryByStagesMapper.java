package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XHostSummaryByStages;
import cn.uaj.adminmaster.mbg.model.XHostSummaryByStagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryByStagesMapper {
    int countByExample(XHostSummaryByStagesExample example);

    int deleteByExample(XHostSummaryByStagesExample example);

    int insert(XHostSummaryByStages record);

    int insertSelective(XHostSummaryByStages record);

    List<XHostSummaryByStages> selectByExample(XHostSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") XHostSummaryByStages record, @Param("example") XHostSummaryByStagesExample example);

    int updateByExample(@Param("record") XHostSummaryByStages record, @Param("example") XHostSummaryByStagesExample example);
}