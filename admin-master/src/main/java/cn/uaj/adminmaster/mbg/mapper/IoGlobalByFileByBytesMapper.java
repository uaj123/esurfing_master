package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.IoGlobalByFileByBytes;
import cn.uaj.adminmaster.mbg.model.IoGlobalByFileByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByFileByBytesMapper {
    int countByExample(IoGlobalByFileByBytesExample example);

    int deleteByExample(IoGlobalByFileByBytesExample example);

    int insert(IoGlobalByFileByBytes record);

    int insertSelective(IoGlobalByFileByBytes record);

    List<IoGlobalByFileByBytes> selectByExampleWithBLOBs(IoGlobalByFileByBytesExample example);

    List<IoGlobalByFileByBytes> selectByExample(IoGlobalByFileByBytesExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByFileByBytes record, @Param("example") IoGlobalByFileByBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") IoGlobalByFileByBytes record, @Param("example") IoGlobalByFileByBytesExample example);

    int updateByExample(@Param("record") IoGlobalByFileByBytes record, @Param("example") IoGlobalByFileByBytesExample example);
}