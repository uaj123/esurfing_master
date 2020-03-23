package cn.uaj.dao;

import cn.uaj.entity.Permission;
import cn.uaj.entity.Role;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 15:28
 */
@Repository
public interface IRoleDao {

    /**
     * 根据用户id查询出所有对应的角色
     * @param userId
     * @return
     * @throws Exception
     */
    @Select("select * from role where id in (select roleId from users_role where userId = #{userId})")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.uaj.dao.IPermissionDao.findPermissionByRoleId"))
    })
    public List<Role> findRoleByUserId(Integer userId) throws Exception;

    /**
     * 查询所有角色
     * @return
     */
    @Select("select * from role")
    public List<Role> findAllRole() throws Exception;

    /**
     * 添加角色
     * @param role
     * @throws Exception
     */
    @Insert("insert into role (roleName,roleDesc) values (#{roleName},#{roleDesc})")
    public void saveRole(Role role) throws Exception;
    /**
     * 根据用户id查询出所有对应的角色
     * @param id
     * @return
     * @throws Exception
     */
    @Select("select * from role where id = (#{id})")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.uaj.dao.IPermissionDao.findPermissionByRoleId"))
    })
    public Role findRoleById(Integer id) throws Exception;

    /**
     * 查询该角色未拥有的权限
     * @param roleId
     * @return
     * @throws Exception
     */
    @Select("select * from permission where id not in (select permissionId from role_permission where roleId = #{roleId})")
    public List<Permission> findOtherPermissionsById(Integer roleId) throws Exception;

    /**
     * 向指定角色添加权限
     * @param roleId
     * @param permissionId
     * @throws Exception
     */
    @Insert("insert into role_permission (permissionId,roleId) values (#{permissionId},#{roleId})")
    void savePermissionToRole(@Param("roleId") Integer roleId,@Param("permissionId") Integer permissionId) throws Exception;

    @Delete("delete from users_role where roleId = #{roleId}")
    void deleteRoleFromUserByRoleId(Integer roleId) throws Exception;

    @Delete("delete from role where id = #{id}")
    void deleteRoleById(Integer id) throws Exception;
}
