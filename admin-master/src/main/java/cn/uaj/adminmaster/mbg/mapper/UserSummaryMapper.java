package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.UserSummary;
import cn.uaj.adminmaster.mbg.model.UserSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryMapper {
    int countByExample(UserSummaryExample example);

    int deleteByExample(UserSummaryExample example);

    int insert(UserSummary record);

    int insertSelective(UserSummary record);

    List<UserSummary> selectByExampleWithBLOBs(UserSummaryExample example);

    List<UserSummary> selectByExample(UserSummaryExample example);

    int updateByExampleSelective(@Param("record") UserSummary record, @Param("example") UserSummaryExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSummary record, @Param("example") UserSummaryExample example);

    int updateByExample(@Param("record") UserSummary record, @Param("example") UserSummaryExample example);
}