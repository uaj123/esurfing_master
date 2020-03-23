package cn.uaj.dao;

import cn.uaj.entity.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 15:35
 */
@Repository
public interface IPermissionDao {

    /**
     * 根据角色id查询所有对应的资源权限
     *
     * @param roleId
     * @return
     */
    @Select("select * from permission where id in (select permissionId from role_permission where roleId = #{roleId})")
    public List<Permission> findPermissionByRoleId(Integer roleId);

    /**
     * 查询所有权限
     *
     * @return
     */
    @Select("select * from permission")
    public List<Permission> findAllPermission();

    /**
     * 添加权限
     * @param p
     */
    @Insert("insert into permission(permissionName,url) value(#{permissionName},#{url})")
    public void savePermission(Permission p);

    @Delete("delete from permission where id = #{id}")
    void deletePermissionById(Integer id) throws Exception;

    @Delete("delete from role_permission where permissionId = #{permissionId}")
    void deletePermissionFromRoleByPermissionId(Integer permissionId) throws Exception;
}
