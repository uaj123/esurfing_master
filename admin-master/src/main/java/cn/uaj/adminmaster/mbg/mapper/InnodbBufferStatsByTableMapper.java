package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.InnodbBufferStatsByTable;
import cn.uaj.adminmaster.mbg.model.InnodbBufferStatsByTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferStatsByTableMapper {
    int countByExample(InnodbBufferStatsByTableExample example);

    int deleteByExample(InnodbBufferStatsByTableExample example);

    int insert(InnodbBufferStatsByTable record);

    int insertSelective(InnodbBufferStatsByTable record);

    List<InnodbBufferStatsByTable> selectByExampleWithBLOBs(InnodbBufferStatsByTableExample example);

    List<InnodbBufferStatsByTable> selectByExample(InnodbBufferStatsByTableExample example);

    int updateByExampleSelective(@Param("record") InnodbBufferStatsByTable record, @Param("example") InnodbBufferStatsByTableExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbBufferStatsByTable record, @Param("example") InnodbBufferStatsByTableExample example);

    int updateByExample(@Param("record") InnodbBufferStatsByTable record, @Param("example") InnodbBufferStatsByTableExample example);
}