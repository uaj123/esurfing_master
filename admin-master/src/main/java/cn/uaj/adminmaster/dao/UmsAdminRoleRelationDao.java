package cn.uaj.adminmaster.dao;

import cn.uaj.adminmaster.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 * @Author: wushaojie
 * @Date: 2020/4/18 19:31
 */
public interface UmsAdminRoleRelationDao {
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

}
