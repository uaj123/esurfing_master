package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.XStatementAnalysis;
import cn.uaj.adminmaster.mbg.model.XStatementAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XStatementAnalysisMapper {
    int countByExample(XStatementAnalysisExample example);

    int deleteByExample(XStatementAnalysisExample example);

    int insert(XStatementAnalysis record);

    int insertSelective(XStatementAnalysis record);

    List<XStatementAnalysis> selectByExampleWithBLOBs(XStatementAnalysisExample example);

    List<XStatementAnalysis> selectByExample(XStatementAnalysisExample example);

    int updateByExampleSelective(@Param("record") XStatementAnalysis record, @Param("example") XStatementAnalysisExample example);

    int updateByExampleWithBLOBs(@Param("record") XStatementAnalysis record, @Param("example") XStatementAnalysisExample example);

    int updateByExample(@Param("record") XStatementAnalysis record, @Param("example") XStatementAnalysisExample example);
}