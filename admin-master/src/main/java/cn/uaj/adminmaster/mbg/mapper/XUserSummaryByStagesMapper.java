package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XUserSummaryByStages;
import cn.uaj.adminmaster.mbg.model.XUserSummaryByStagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByStagesMapper {
    int countByExample(XUserSummaryByStagesExample example);

    int deleteByExample(XUserSummaryByStagesExample example);

    int insert(XUserSummaryByStages record);

    int insertSelective(XUserSummaryByStages record);

    List<XUserSummaryByStages> selectByExample(XUserSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByStages record, @Param("example") XUserSummaryByStagesExample example);

    int updateByExample(@Param("record") XUserSummaryByStages record, @Param("example") XUserSummaryByStagesExample example);
}