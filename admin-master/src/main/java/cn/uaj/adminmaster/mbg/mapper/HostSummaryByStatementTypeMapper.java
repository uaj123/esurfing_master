package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.HostSummaryByStatementType;
import cn.uaj.adminmaster.mbg.model.HostSummaryByStatementTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByStatementTypeMapper {
    int countByExample(HostSummaryByStatementTypeExample example);

    int deleteByExample(HostSummaryByStatementTypeExample example);

    int insert(HostSummaryByStatementType record);

    int insertSelective(HostSummaryByStatementType record);

    List<HostSummaryByStatementType> selectByExampleWithBLOBs(HostSummaryByStatementTypeExample example);

    List<HostSummaryByStatementType> selectByExample(HostSummaryByStatementTypeExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByStatementType record, @Param("example") HostSummaryByStatementTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") HostSummaryByStatementType record, @Param("example") HostSummaryByStatementTypeExample example);

    int updateByExample(@Param("record") HostSummaryByStatementType record, @Param("example") HostSummaryByStatementTypeExample example);
}