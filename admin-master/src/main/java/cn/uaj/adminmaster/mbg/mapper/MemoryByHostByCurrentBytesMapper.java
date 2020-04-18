package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.MemoryByHostByCurrentBytes;
import cn.uaj.adminmaster.mbg.model.MemoryByHostByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByHostByCurrentBytesMapper {
    int countByExample(MemoryByHostByCurrentBytesExample example);

    int deleteByExample(MemoryByHostByCurrentBytesExample example);

    int insert(MemoryByHostByCurrentBytes record);

    int insertSelective(MemoryByHostByCurrentBytes record);

    List<MemoryByHostByCurrentBytes> selectByExampleWithBLOBs(MemoryByHostByCurrentBytesExample example);

    List<MemoryByHostByCurrentBytes> selectByExample(MemoryByHostByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByHostByCurrentBytes record, @Param("example") MemoryByHostByCurrentBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") MemoryByHostByCurrentBytes record, @Param("example") MemoryByHostByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByHostByCurrentBytes record, @Param("example") MemoryByHostByCurrentBytesExample example);
}