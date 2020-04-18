package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.StatementAnalysis;
import cn.uaj.adminmaster.mbg.model.StatementAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementAnalysisMapper {
    int countByExample(StatementAnalysisExample example);

    int deleteByExample(StatementAnalysisExample example);

    int insert(StatementAnalysis record);

    int insertSelective(StatementAnalysis record);

    List<StatementAnalysis> selectByExampleWithBLOBs(StatementAnalysisExample example);

    List<StatementAnalysis> selectByExample(StatementAnalysisExample example);

    int updateByExampleSelective(@Param("record") StatementAnalysis record, @Param("example") StatementAnalysisExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementAnalysis record, @Param("example") StatementAnalysisExample example);

    int updateByExample(@Param("record") StatementAnalysis record, @Param("example") StatementAnalysisExample example);
}