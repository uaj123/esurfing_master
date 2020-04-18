package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.MemoryByUserByCurrentBytes;
import cn.uaj.adminmaster.mbg.model.MemoryByUserByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoryByUserByCurrentBytesMapper {
    int countByExample(MemoryByUserByCurrentBytesExample example);

    int deleteByExample(MemoryByUserByCurrentBytesExample example);

    int insert(MemoryByUserByCurrentBytes record);

    int insertSelective(MemoryByUserByCurrentBytes record);

    List<MemoryByUserByCurrentBytes> selectByExampleWithBLOBs(MemoryByUserByCurrentBytesExample example);

    List<MemoryByUserByCurrentBytes> selectByExample(MemoryByUserByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") MemoryByUserByCurrentBytes record, @Param("example") MemoryByUserByCurrentBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") MemoryByUserByCurrentBytes record, @Param("example") MemoryByUserByCurrentBytesExample example);

    int updateByExample(@Param("record") MemoryByUserByCurrentBytes record, @Param("example") MemoryByUserByCurrentBytesExample example);
}