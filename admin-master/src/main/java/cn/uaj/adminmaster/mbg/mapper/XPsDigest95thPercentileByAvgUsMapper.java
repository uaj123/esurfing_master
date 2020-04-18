package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XPsDigest95thPercentileByAvgUs;
import cn.uaj.adminmaster.mbg.model.XPsDigest95thPercentileByAvgUsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XPsDigest95thPercentileByAvgUsMapper {
    int countByExample(XPsDigest95thPercentileByAvgUsExample example);

    int deleteByExample(XPsDigest95thPercentileByAvgUsExample example);

    int insert(XPsDigest95thPercentileByAvgUs record);

    int insertSelective(XPsDigest95thPercentileByAvgUs record);

    List<XPsDigest95thPercentileByAvgUs> selectByExample(XPsDigest95thPercentileByAvgUsExample example);

    int updateByExampleSelective(@Param("record") XPsDigest95thPercentileByAvgUs record, @Param("example") XPsDigest95thPercentileByAvgUsExample example);

    int updateByExample(@Param("record") XPsDigest95thPercentileByAvgUs record, @Param("example") XPsDigest95thPercentileByAvgUsExample example);
}