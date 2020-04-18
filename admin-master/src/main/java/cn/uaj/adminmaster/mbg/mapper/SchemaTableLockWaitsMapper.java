package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.SchemaTableLockWaits;
import cn.uaj.adminmaster.mbg.model.SchemaTableLockWaitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableLockWaitsMapper {
    int countByExample(SchemaTableLockWaitsExample example);

    int deleteByExample(SchemaTableLockWaitsExample example);

    int insert(SchemaTableLockWaits record);

    int insertSelective(SchemaTableLockWaits record);

    List<SchemaTableLockWaits> selectByExampleWithBLOBs(SchemaTableLockWaitsExample example);

    List<SchemaTableLockWaits> selectByExample(SchemaTableLockWaitsExample example);

    int updateByExampleSelective(@Param("record") SchemaTableLockWaits record, @Param("example") SchemaTableLockWaitsExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaTableLockWaits record, @Param("example") SchemaTableLockWaitsExample example);

    int updateByExample(@Param("record") SchemaTableLockWaits record, @Param("example") SchemaTableLockWaitsExample example);
}