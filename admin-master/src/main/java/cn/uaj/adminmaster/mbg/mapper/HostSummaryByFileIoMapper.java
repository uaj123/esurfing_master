package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.HostSummaryByFileIo;
import cn.uaj.adminmaster.mbg.model.HostSummaryByFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByFileIoMapper {
    int countByExample(HostSummaryByFileIoExample example);

    int deleteByExample(HostSummaryByFileIoExample example);

    int insert(HostSummaryByFileIo record);

    int insertSelective(HostSummaryByFileIo record);

    List<HostSummaryByFileIo> selectByExampleWithBLOBs(HostSummaryByFileIoExample example);

    List<HostSummaryByFileIo> selectByExample(HostSummaryByFileIoExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByFileIo record, @Param("example") HostSummaryByFileIoExample example);

    int updateByExampleWithBLOBs(@Param("record") HostSummaryByFileIo record, @Param("example") HostSummaryByFileIoExample example);

    int updateByExample(@Param("record") HostSummaryByFileIo record, @Param("example") HostSummaryByFileIoExample example);
}