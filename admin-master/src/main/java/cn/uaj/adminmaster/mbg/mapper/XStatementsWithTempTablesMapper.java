package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XStatementsWithTempTables;
import cn.uaj.adminmaster.mbg.model.XStatementsWithTempTablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XStatementsWithTempTablesMapper {
    int countByExample(XStatementsWithTempTablesExample example);

    int deleteByExample(XStatementsWithTempTablesExample example);

    int insert(XStatementsWithTempTables record);

    int insertSelective(XStatementsWithTempTables record);

    List<XStatementsWithTempTables> selectByExampleWithBLOBs(XStatementsWithTempTablesExample example);

    List<XStatementsWithTempTables> selectByExample(XStatementsWithTempTablesExample example);

    int updateByExampleSelective(@Param("record") XStatementsWithTempTables record, @Param("example") XStatementsWithTempTablesExample example);

    int updateByExampleWithBLOBs(@Param("record") XStatementsWithTempTables record, @Param("example") XStatementsWithTempTablesExample example);

    int updateByExample(@Param("record") XStatementsWithTempTables record, @Param("example") XStatementsWithTempTablesExample example);
}