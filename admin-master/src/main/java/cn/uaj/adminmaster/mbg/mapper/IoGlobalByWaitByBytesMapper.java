package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.IoGlobalByWaitByBytes;
import cn.uaj.adminmaster.mbg.model.IoGlobalByWaitByBytesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IoGlobalByWaitByBytesMapper {
    int countByExample(IoGlobalByWaitByBytesExample example);

    int deleteByExample(IoGlobalByWaitByBytesExample example);

    int insert(IoGlobalByWaitByBytes record);

    int insertSelective(IoGlobalByWaitByBytes record);

    List<IoGlobalByWaitByBytes> selectByExampleWithBLOBs(IoGlobalByWaitByBytesExample example);

    List<IoGlobalByWaitByBytes> selectByExample(IoGlobalByWaitByBytesExample example);

    int updateByExampleSelective(@Param("record") IoGlobalByWaitByBytes record, @Param("example") IoGlobalByWaitByBytesExample example);

    int updateByExampleWithBLOBs(@Param("record") IoGlobalByWaitByBytes record, @Param("example") IoGlobalByWaitByBytesExample example);

    int updateByExample(@Param("record") IoGlobalByWaitByBytes record, @Param("example") IoGlobalByWaitByBytesExample example);
}