package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XUserSummaryByFileIo;
import cn.uaj.adminmaster.mbg.model.XUserSummaryByFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByFileIoMapper {
    int countByExample(XUserSummaryByFileIoExample example);

    int deleteByExample(XUserSummaryByFileIoExample example);

    int insert(XUserSummaryByFileIo record);

    int insertSelective(XUserSummaryByFileIo record);

    List<XUserSummaryByFileIo> selectByExample(XUserSummaryByFileIoExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByFileIo record, @Param("example") XUserSummaryByFileIoExample example);

    int updateByExample(@Param("record") XUserSummaryByFileIo record, @Param("example") XUserSummaryByFileIoExample example);
}