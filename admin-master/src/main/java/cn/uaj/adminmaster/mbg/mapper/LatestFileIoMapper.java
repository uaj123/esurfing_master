package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.LatestFileIo;
import cn.uaj.adminmaster.mbg.model.LatestFileIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LatestFileIoMapper {
    int countByExample(LatestFileIoExample example);

    int deleteByExample(LatestFileIoExample example);

    int insert(LatestFileIo record);

    int insertSelective(LatestFileIo record);

    List<LatestFileIo> selectByExampleWithBLOBs(LatestFileIoExample example);

    List<LatestFileIo> selectByExample(LatestFileIoExample example);

    int updateByExampleSelective(@Param("record") LatestFileIo record, @Param("example") LatestFileIoExample example);

    int updateByExampleWithBLOBs(@Param("record") LatestFileIo record, @Param("example") LatestFileIoExample example);

    int updateByExample(@Param("record") LatestFileIo record, @Param("example") LatestFileIoExample example);
}