package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.InnodbBufferStatsBySchema;
import cn.uaj.adminmaster.mbg.model.InnodbBufferStatsBySchemaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferStatsBySchemaMapper {
    int countByExample(InnodbBufferStatsBySchemaExample example);

    int deleteByExample(InnodbBufferStatsBySchemaExample example);

    int insert(InnodbBufferStatsBySchema record);

    int insertSelective(InnodbBufferStatsBySchema record);

    List<InnodbBufferStatsBySchema> selectByExampleWithBLOBs(InnodbBufferStatsBySchemaExample example);

    List<InnodbBufferStatsBySchema> selectByExample(InnodbBufferStatsBySchemaExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferStatsBySchema record, @Param("example") InnodbBufferStatsBySchemaExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbBufferStatsBySchema record, @Param("example") InnodbBufferStatsBySchemaExample example);

    int updateByExample(@Param("record") InnodbBufferStatsBySchema record, @Param("example") InnodbBufferStatsBySchemaExample example);
}