package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.UserSummaryByFileIo;
import cn.uaj.adminmaster.mbg.model.UserSummaryByFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByFileIoMapper {
    int countByExample(UserSummaryByFileIoExample example);

    int deleteByExample(UserSummaryByFileIoExample example);

    int insert(UserSummaryByFileIo record);

    int insertSelective(UserSummaryByFileIo record);

    List<UserSummaryByFileIo> selectByExampleWithBLOBs(UserSummaryByFileIoExample example);

    List<UserSummaryByFileIo> selectByExample(UserSummaryByFileIoExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByFileIo record, @Param("example") UserSummaryByFileIoExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSummaryByFileIo record, @Param("example") UserSummaryByFileIoExample example);

    int updateByExample(@Param("record") UserSummaryByFileIo record, @Param("example") UserSummaryByFileIoExample example);
}