package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.StatementsWithSorting;
import cn.uaj.adminmaster.mbg.model.StatementsWithSortingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithSortingMapper {
    int countByExample(StatementsWithSortingExample example);

    int deleteByExample(StatementsWithSortingExample example);

    int insert(StatementsWithSorting record);

    int insertSelective(StatementsWithSorting record);

    List<StatementsWithSorting> selectByExampleWithBLOBs(StatementsWithSortingExample example);

    List<StatementsWithSorting> selectByExample(StatementsWithSortingExample example);

    int updateByExampleSelective(@Param("record") StatementsWithSorting record, @Param("example") StatementsWithSortingExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithSorting record, @Param("example") StatementsWithSortingExample example);

    int updateByExample(@Param("record") StatementsWithSorting record, @Param("example") StatementsWithSortingExample example);
}