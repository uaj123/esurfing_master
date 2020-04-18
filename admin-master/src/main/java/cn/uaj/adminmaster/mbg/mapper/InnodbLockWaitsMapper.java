package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.InnodbLockWaits;
import cn.uaj.adminmaster.mbg.model.InnodbLockWaitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbLockWaitsMapper {
    int countByExample(InnodbLockWaitsExample example);

    int deleteByExample(InnodbLockWaitsExample example);

    int insert(InnodbLockWaits record);

    int insertSelective(InnodbLockWaits record);

    List<InnodbLockWaits> selectByExampleWithBLOBs(InnodbLockWaitsExample example);

    List<InnodbLockWaits> selectByExample(InnodbLockWaitsExample example);

    int updateByExampleSelective(@Param("record") InnodbLockWaits record, @Param("example") InnodbLockWaitsExample example);

    int updateByExampleWithBLOBs(@Param("record") InnodbLockWaits record, @Param("example") InnodbLockWaitsExample example);

    int updateByExample(@Param("record") InnodbLockWaits record, @Param("example") InnodbLockWaitsExample example);
}