package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.UserSummaryByStages;
import cn.uaj.adminmaster.mbg.model.UserSummaryByStagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByStagesMapper {
    int countByExample(UserSummaryByStagesExample example);

    int deleteByExample(UserSummaryByStagesExample example);

    int insert(UserSummaryByStages record);

    int insertSelective(UserSummaryByStages record);

    List<UserSummaryByStages> selectByExampleWithBLOBs(UserSummaryByStagesExample example);

    List<UserSummaryByStages> selectByExample(UserSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByStages record, @Param("example") UserSummaryByStagesExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSummaryByStages record, @Param("example") UserSummaryByStagesExample example);

    int updateByExample(@Param("record") UserSummaryByStages record, @Param("example") UserSummaryByStagesExample example);
}