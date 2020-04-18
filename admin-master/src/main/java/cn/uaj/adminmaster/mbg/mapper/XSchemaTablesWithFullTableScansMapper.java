package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XSchemaTablesWithFullTableScans;
import cn.uaj.adminmaster.mbg.model.XSchemaTablesWithFullTableScansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaTablesWithFullTableScansMapper {
    int countByExample(XSchemaTablesWithFullTableScansExample example);

    int deleteByExample(XSchemaTablesWithFullTableScansExample example);

    int insert(XSchemaTablesWithFullTableScans record);

    int insertSelective(XSchemaTablesWithFullTableScans record);

    List<XSchemaTablesWithFullTableScans> selectByExample(XSchemaTablesWithFullTableScansExample example);

    int updateByExampleSelective(@Param("record") XSchemaTablesWithFullTableScans record, @Param("example") XSchemaTablesWithFullTableScansExample example);

    int updateByExample(@Param("record") XSchemaTablesWithFullTableScans record, @Param("example") XSchemaTablesWithFullTableScansExample example);
}