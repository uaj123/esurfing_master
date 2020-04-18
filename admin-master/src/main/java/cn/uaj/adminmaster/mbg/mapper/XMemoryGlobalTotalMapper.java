package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XMemoryGlobalTotal;
import cn.uaj.adminmaster.mbg.model.XMemoryGlobalTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XMemoryGlobalTotalMapper {
    int countByExample(XMemoryGlobalTotalExample example);

    int deleteByExample(XMemoryGlobalTotalExample example);

    int insert(XMemoryGlobalTotal record);

    int insertSelective(XMemoryGlobalTotal record);

    List<XMemoryGlobalTotal> selectByExample(XMemoryGlobalTotalExample example);

    int updateByExampleSelective(@Param("record") XMemoryGlobalTotal record, @Param("example") XMemoryGlobalTotalExample example);

    int updateByExample(@Param("record") XMemoryGlobalTotal record, @Param("example") XMemoryGlobalTotalExample example);
}