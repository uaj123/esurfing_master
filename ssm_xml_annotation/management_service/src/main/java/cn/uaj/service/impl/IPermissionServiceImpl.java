package cn.uaj.service.impl;

import cn.uaj.dao.IPermissionDao;
import cn.uaj.service.IPermissionService;
import cn.uaj.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 21:13
 */
@Service
public class IPermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao iPermissionDao;

    @Override
    public List<Permission> findAllPermission() {
        List<Permission> permissionList = iPermissionDao.findAllPermission();
        return permissionList.isEmpty() ? null : permissionList;
    }

    @Override
    public void savePermission(Permission permission) {
        iPermissionDao.savePermission(permission);
    }

    @Override
    public void deletePermission(Integer id) throws Exception {
        iPermissionDao.deletePermissionById(id);
    }

    @Override
    public void deletePermissionFromRole(Integer id) throws Exception {
        iPermissionDao.deletePermissionFromRoleByPermissionId(id);
    }
}
