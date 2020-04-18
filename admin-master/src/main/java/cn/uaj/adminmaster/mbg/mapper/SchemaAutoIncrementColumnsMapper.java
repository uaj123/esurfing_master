package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.SchemaAutoIncrementColumns;
import cn.uaj.adminmaster.mbg.model.SchemaAutoIncrementColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaAutoIncrementColumnsMapper {
    int countByExample(SchemaAutoIncrementColumnsExample example);

    int deleteByExample(SchemaAutoIncrementColumnsExample example);

    int insert(SchemaAutoIncrementColumns record);

    int insertSelective(SchemaAutoIncrementColumns record);

    List<SchemaAutoIncrementColumns> selectByExampleWithBLOBs(SchemaAutoIncrementColumnsExample example);

    List<SchemaAutoIncrementColumns> selectByExample(SchemaAutoIncrementColumnsExample example);

    int updateByExampleSelective(@Param("record") SchemaAutoIncrementColumns record, @Param("example") SchemaAutoIncrementColumnsExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaAutoIncrementColumns record, @Param("example") SchemaAutoIncrementColumnsExample example);

    int updateByExample(@Param("record") SchemaAutoIncrementColumns record, @Param("example") SchemaAutoIncrementColumnsExample example);
}