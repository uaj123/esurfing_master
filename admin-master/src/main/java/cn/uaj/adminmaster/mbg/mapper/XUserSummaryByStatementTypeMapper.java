package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XUserSummaryByStatementType;
import cn.uaj.adminmaster.mbg.model.XUserSummaryByStatementTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByStatementTypeMapper {
    int countByExample(XUserSummaryByStatementTypeExample example);

    int deleteByExample(XUserSummaryByStatementTypeExample example);

    int insert(XUserSummaryByStatementType record);

    int insertSelective(XUserSummaryByStatementType record);

    List<XUserSummaryByStatementType> selectByExample(XUserSummaryByStatementTypeExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByStatementType record, @Param("example") XUserSummaryByStatementTypeExample example);

    int updateByExample(@Param("record") XUserSummaryByStatementType record, @Param("example") XUserSummaryByStatementTypeExample example);
}