package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XUserSummaryByFileIoType;
import cn.uaj.adminmaster.mbg.model.XUserSummaryByFileIoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByFileIoTypeMapper {
    int countByExample(XUserSummaryByFileIoTypeExample example);

    int deleteByExample(XUserSummaryByFileIoTypeExample example);

    int insert(XUserSummaryByFileIoType record);

    int insertSelective(XUserSummaryByFileIoType record);

    List<XUserSummaryByFileIoType> selectByExample(XUserSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByFileIoType record, @Param("example") XUserSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") XUserSummaryByFileIoType record, @Param("example") XUserSummaryByFileIoTypeExample example);
}