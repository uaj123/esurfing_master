package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.Processlist;
import cn.uaj.adminmaster.mbg.model.ProcesslistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcesslistMapper {
    int countByExample(ProcesslistExample example);

    int deleteByExample(ProcesslistExample example);

    int insert(Processlist record);

    int insertSelective(Processlist record);

    List<Processlist> selectByExampleWithBLOBs(ProcesslistExample example);

    List<Processlist> selectByExample(ProcesslistExample example);

    int updateByExampleSelective(@Param("record") Processlist record, @Param("example") ProcesslistExample example);

    int updateByExampleWithBLOBs(@Param("record") Processlist record, @Param("example") ProcesslistExample example);

    int updateByExample(@Param("record") Processlist record, @Param("example") ProcesslistExample example);
}