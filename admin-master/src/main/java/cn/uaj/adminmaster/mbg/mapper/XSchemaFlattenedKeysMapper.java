package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XSchemaFlattenedKeys;
import cn.uaj.adminmaster.mbg.model.XSchemaFlattenedKeysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaFlattenedKeysMapper {
    int countByExample(XSchemaFlattenedKeysExample example);

    int deleteByExample(XSchemaFlattenedKeysExample example);

    int insert(XSchemaFlattenedKeys record);

    int insertSelective(XSchemaFlattenedKeys record);

    List<XSchemaFlattenedKeys> selectByExampleWithBLOBs(XSchemaFlattenedKeysExample example);

    List<XSchemaFlattenedKeys> selectByExample(XSchemaFlattenedKeysExample example);

    int updateByExampleSelective(@Param("record") XSchemaFlattenedKeys record, @Param("example") XSchemaFlattenedKeysExample example);

    int updateByExampleWithBLOBs(@Param("record") XSchemaFlattenedKeys record, @Param("example") XSchemaFlattenedKeysExample example);

    int updateByExample(@Param("record") XSchemaFlattenedKeys record, @Param("example") XSchemaFlattenedKeysExample example);
}