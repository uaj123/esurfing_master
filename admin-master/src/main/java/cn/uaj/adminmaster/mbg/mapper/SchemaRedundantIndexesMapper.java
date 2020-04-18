package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.SchemaRedundantIndexes;
import cn.uaj.adminmaster.mbg.model.SchemaRedundantIndexesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaRedundantIndexesMapper {
    int countByExample(SchemaRedundantIndexesExample example);

    int deleteByExample(SchemaRedundantIndexesExample example);

    int insert(SchemaRedundantIndexes record);

    int insertSelective(SchemaRedundantIndexes record);

    List<SchemaRedundantIndexes> selectByExampleWithBLOBs(SchemaRedundantIndexesExample example);

    List<SchemaRedundantIndexes> selectByExample(SchemaRedundantIndexesExample example);

    int updateByExampleSelective(@Param("record") SchemaRedundantIndexes record, @Param("example") SchemaRedundantIndexesExample example);

    int updateByExampleWithBLOBs(@Param("record") SchemaRedundantIndexes record, @Param("example") SchemaRedundantIndexesExample example);

    int updateByExample(@Param("record") SchemaRedundantIndexes record, @Param("example") SchemaRedundantIndexesExample example);
}