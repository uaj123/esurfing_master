package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XPsDigestAvgLatencyDistribution;
import cn.uaj.adminmaster.mbg.model.XPsDigestAvgLatencyDistributionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XPsDigestAvgLatencyDistributionMapper {
    int countByExample(XPsDigestAvgLatencyDistributionExample example);

    int deleteByExample(XPsDigestAvgLatencyDistributionExample example);

    int insert(XPsDigestAvgLatencyDistribution record);

    int insertSelective(XPsDigestAvgLatencyDistribution record);

    List<XPsDigestAvgLatencyDistribution> selectByExample(XPsDigestAvgLatencyDistributionExample example);

    int updateByExampleSelective(@Param("record") XPsDigestAvgLatencyDistribution record, @Param("example") XPsDigestAvgLatencyDistributionExample example);

    int updateByExample(@Param("record") XPsDigestAvgLatencyDistribution record, @Param("example") XPsDigestAvgLatencyDistributionExample example);
}