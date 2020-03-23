package cn.uaj.service;

import cn.uaj.entity.SysLog;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/19 21:54
 */

public interface ISysLogService {
    List<SysLog> findAll() throws Exception;

    void save(SysLog sysLog) throws Exception;
}
