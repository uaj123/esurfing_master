package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XHostSummaryByFileIo;
import cn.uaj.adminmaster.mbg.model.XHostSummaryByFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryByFileIoMapper {
    int countByExample(XHostSummaryByFileIoExample example);

    int deleteByExample(XHostSummaryByFileIoExample example);

    int insert(XHostSummaryByFileIo record);

    int insertSelective(XHostSummaryByFileIo record);

    List<XHostSummaryByFileIo> selectByExample(XHostSummaryByFileIoExample example);

    int updateByExampleSelective(@Param("record") XHostSummaryByFileIo record, @Param("example") XHostSummaryByFileIoExample example);

    int updateByExample(@Param("record") XHostSummaryByFileIo record, @Param("example") XHostSummaryByFileIoExample example);
}