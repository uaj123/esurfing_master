package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.SchemaUnusedIndexes;
import cn.uaj.adminmaster.mbg.model.SchemaUnusedIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaUnusedIndexesMapper {
    int countByExample(SchemaUnusedIndexesExample example);

    int deleteByExample(SchemaUnusedIndexesExample example);

    int insert(SchemaUnusedIndexes record);

    int insertSelective(SchemaUnusedIndexes record);

    List<SchemaUnusedIndexes> selectByExample(SchemaUnusedIndexesExample example);

    int updateByExampleSelective(@Param("record") SchemaUnusedIndexes record, @Param("example") SchemaUnusedIndexesExample example);

    int updateByExample(@Param("record") SchemaUnusedIndexes record, @Param("example") SchemaUnusedIndexesExample example);
}