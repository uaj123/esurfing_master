package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.StatementsWithRuntimesIn95thPercentile;
import cn.uaj.adminmaster.mbg.model.StatementsWithRuntimesIn95thPercentileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithRuntimesIn95thPercentileMapper {
    int countByExample(StatementsWithRuntimesIn95thPercentileExample example);

    int deleteByExample(StatementsWithRuntimesIn95thPercentileExample example);

    int insert(StatementsWithRuntimesIn95thPercentile record);

    int insertSelective(StatementsWithRuntimesIn95thPercentile record);

    List<StatementsWithRuntimesIn95thPercentile> selectByExampleWithBLOBs(StatementsWithRuntimesIn95thPercentileExample example);

    List<StatementsWithRuntimesIn95thPercentile> selectByExample(StatementsWithRuntimesIn95thPercentileExample example);

    int updateByExampleSelective(@Param("record") StatementsWithRuntimesIn95thPercentile record, @Param("example") StatementsWithRuntimesIn95thPercentileExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithRuntimesIn95thPercentile record, @Param("example") StatementsWithRuntimesIn95thPercentileExample example);

    int updateByExample(@Param("record") StatementsWithRuntimesIn95thPercentile record, @Param("example") StatementsWithRuntimesIn95thPercentileExample example);
}