package cn.uaj.service.impl;

import cn.uaj.dao.ISysLogDao;
import cn.uaj.entity.SysLog;
import cn.uaj.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/19 21:54
 */
@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {
    @Autowired
    private ISysLogDao iSysLogDao;
    @Override
    public List<SysLog> findAll() throws Exception {
        List<SysLog> sysLogList= iSysLogDao.findAll();
        return sysLogList.isEmpty() ? null : sysLogList;
    }

    @Override
    public void save(SysLog sysLog) throws Exception {
        iSysLogDao.save(sysLog);
    }
}
