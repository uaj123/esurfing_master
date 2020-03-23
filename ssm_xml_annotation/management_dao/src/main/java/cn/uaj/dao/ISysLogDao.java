package cn.uaj.dao;

import cn.uaj.entity.SysLog;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/19 21:57
 */
@Repository
public interface ISysLogDao {
    @Update("insert into syslog(visitTime,username,ip,url,executionTime,method) values(#{visitTime},#{username},#{ip},#{url},#{executionTime},#{method})")
    void save(SysLog sysLog) throws Exception;
    @Select("select * from sysLog")
    List<SysLog> findAll() throws Exception;

}
