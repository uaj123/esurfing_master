package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.UserSummaryByFileIoType;
import cn.uaj.adminmaster.mbg.model.UserSummaryByFileIoTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSummaryByFileIoTypeMapper {
    int countByExample(UserSummaryByFileIoTypeExample example);

    int deleteByExample(UserSummaryByFileIoTypeExample example);

    int insert(UserSummaryByFileIoType record);

    int insertSelective(UserSummaryByFileIoType record);

    List<UserSummaryByFileIoType> selectByExampleWithBLOBs(UserSummaryByFileIoTypeExample example);

    List<UserSummaryByFileIoType> selectByExample(UserSummaryByFileIoTypeExample example);

    int updateByExampleSelective(@Param("record") UserSummaryByFileIoType record, @Param("example") UserSummaryByFileIoTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSummaryByFileIoType record, @Param("example") UserSummaryByFileIoTypeExample example);

    int updateByExample(@Param("record") UserSummaryByFileIoType record, @Param("example") UserSummaryByFileIoTypeExample example);
}