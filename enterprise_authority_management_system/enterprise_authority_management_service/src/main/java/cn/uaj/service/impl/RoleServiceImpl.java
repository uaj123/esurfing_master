package cn.uaj.service.impl;

import cn.uaj.dao.IRoleDao;
import cn.uaj.entity.Permission;
import cn.uaj.entity.Role;
import cn.uaj.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.Permissions;
import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 18:04
 */
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao iRoleDao;
    @Override
    public List<Role> findAllRole() throws Exception {
        List<Role> roleList = iRoleDao.findAllRole();
        return roleList.isEmpty() ? null : roleList;
    }

    @Override
    public void saveRole(Role role) throws Exception {
        iRoleDao.saveRole(role);
    }

    @Override
    public Role findRoleById(Integer id) throws Exception {
        return iRoleDao.findRoleById(id);
    }

    @Override
    public List<Permission> findOtherPermissionsById(Integer roleId) throws Exception {
        List<Permission> otherPermissions = iRoleDao.findOtherPermissionsById(roleId);
        return otherPermissions.isEmpty() ? null : otherPermissions;
    }

    @Override
    public void savePermissionToRole(Integer roleId, Integer[] permissionIds) throws Exception {
        for (Integer permissionId :permissionIds) {
            iRoleDao.savePermissionToRole(roleId,permissionId);
        }

    }

    @Override
    public void deleteRoleFromUser(Integer id) throws Exception {
        iRoleDao.deleteRoleFromUserByRoleId(id);
    }

    @Override
    public void deleteRole(Integer id) throws Exception {
        iRoleDao.deleteRoleById(id);
    }


}
