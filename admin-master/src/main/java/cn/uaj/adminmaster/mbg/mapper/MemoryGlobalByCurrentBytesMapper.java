package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.MemoryGlobalByCurrentBytes;
import cn.uaj.adminmaster.mbg.model.MemoryGlobalByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryGlobalByCurrentBytesMapper {
    int countByExample(MemoryGlobalByCurrentBytesExample example);

    int deleteByExample(MemoryGlobalByCurrentBytesExample example);

    int insert(MemoryGlobalByCurrentBytes record);

    int insertSelective(MemoryGlobalByCurrentBytes record);

    List<MemoryGlobalByCurrentBytes> selectByExampleWithBLOBs(MemoryGlobalByCurrentBytesExample example);

    List<MemoryGlobalByCurrentBytes> selectByExample(MemoryGlobalByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryGlobalByCurrentBytes record, @Param("example") MemoryGlobalByCurrentBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") MemoryGlobalByCurrentBytes record, @Param("example") MemoryGlobalByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryGlobalByCurrentBytes record, @Param("example") MemoryGlobalByCurrentBytesExample example);
}