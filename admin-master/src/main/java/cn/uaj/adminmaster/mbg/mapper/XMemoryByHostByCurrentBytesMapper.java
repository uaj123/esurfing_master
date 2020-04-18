package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XMemoryByHostByCurrentBytes;
import cn.uaj.adminmaster.mbg.model.XMemoryByHostByCurrentBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryByHostByCurrentBytesMapper {
    int countByExample(XMemoryByHostByCurrentBytesExample example);

    int deleteByExample(XMemoryByHostByCurrentBytesExample example);

    int insert(XMemoryByHostByCurrentBytes record);

    int insertSelective(XMemoryByHostByCurrentBytes record);

    List<XMemoryByHostByCurrentBytes> selectByExample(XMemoryByHostByCurrentBytesExample example);

    int updateByExampleSelective(@Param("record") XMemoryByHostByCurrentBytes record, @Param("example") XMemoryByHostByCurrentBytesExample example);

    int updateByExample(@Param("record") XMemoryByHostByCurrentBytes record, @Param("example") XMemoryByHostByCurrentBytesExample example);
}