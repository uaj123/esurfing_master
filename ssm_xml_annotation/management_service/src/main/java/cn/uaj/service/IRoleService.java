package cn.uaj.service;

import cn.uaj.entity.Permission;
import cn.uaj.entity.Role;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 18:04
 */
public interface IRoleService {

    public List<Role> findAllRole() throws Exception;

    public void saveRole(Role role) throws Exception;

    public Role findRoleById(Integer id) throws Exception;

    List<Permission> findOtherPermissionsById(Integer roleId) throws Exception;

    void savePermissionToRole(Integer roleId, Integer[] permissionIds) throws Exception;

    void deleteRoleFromUser(Integer id) throws Exception;

    void deleteRole(Integer id) throws Exception;

}
