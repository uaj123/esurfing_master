package cn.uaj.service;

import cn.uaj.entity.Permission;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 21:12
 */
public interface IPermissionService {

    /**
     * 查询全部
     * @return
     */
    public List<Permission> findAllPermission();

    public void savePermission(Permission p);

    void deletePermission(Integer id) throws Exception;

    void deletePermissionFromRole(Integer id) throws Exception;
}
