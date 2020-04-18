package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XSchemaTableLockWaits;
import cn.uaj.adminmaster.mbg.model.XSchemaTableLockWaitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaTableLockWaitsMapper {
    int countByExample(XSchemaTableLockWaitsExample example);

    int deleteByExample(XSchemaTableLockWaitsExample example);

    int insert(XSchemaTableLockWaits record);

    int insertSelective(XSchemaTableLockWaits record);

    List<XSchemaTableLockWaits> selectByExampleWithBLOBs(XSchemaTableLockWaitsExample example);

    List<XSchemaTableLockWaits> selectByExample(XSchemaTableLockWaitsExample example);

    int updateByExampleSelective(@Param("record") XSchemaTableLockWaits record, @Param("example") XSchemaTableLockWaitsExample example);

    int updateByExampleWithBLOBs(@Param("record") XSchemaTableLockWaits record, @Param("example") XSchemaTableLockWaitsExample example);

    int updateByExample(@Param("record") XSchemaTableLockWaits record, @Param("example") XSchemaTableLockWaitsExample example);
}