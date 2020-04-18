package cn.uaj.adminmaster.mbg.mapper;

import cn.uaj.adminmaster.mbg.model.Session;
import cn.uaj.adminmaster.mbg.model.SessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionMapper {
    int countByExample(SessionExample example);

    int deleteByExample(SessionExample example);

    int insert(Session record);

    int insertSelective(Session record);

    List<Session> selectByExampleWithBLOBs(SessionExample example);

    List<Session> selectByExample(SessionExample example);

    int updateByExampleSelective(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByExampleWithBLOBs(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);
}