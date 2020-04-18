package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.MemoryByThreadByCurrentBytes;
import cn.uaj.adminmaster.mbg.model.MemoryByThreadByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByThreadByCurrentBytesMapper {
    int countByExample(MemoryByThreadByCurrentBytesExample example);

    int deleteByExample(MemoryByThreadByCurrentBytesExample example);

    int insert(MemoryByThreadByCurrentBytes record);

    int insertSelective(MemoryByThreadByCurrentBytes record);

    List<MemoryByThreadByCurrentBytes> selectByExampleWithBLOBs(MemoryByThreadByCurrentBytesExample example);

    List<MemoryByThreadByCurrentBytes> selectByExample(MemoryByThreadByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByThreadByCurrentBytes record, @Param("example") MemoryByThreadByCurrentBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") MemoryByThreadByCurrentBytes record, @Param("example") MemoryByThreadByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByThreadByCurrentBytes record, @Param("example") MemoryByThreadByCurrentBytesExample example);
}