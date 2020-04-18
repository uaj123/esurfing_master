package cn.uaj.adminmaster.service;

import cn.uaj.adminmaster.dto.UmsAdminParam;
import cn.uaj.adminmaster.mbg.model.UmsAdmin;
import cn.uaj.adminmaster.mbg.model.UmsPermission;

import java.util.List;

/**
 * 后台管理员的Service
 * @Author: wushaojie
 * @Date: 2020/4/18 17:26
 */
public interface UmsAdminService {

    /**
     * 获取用户所有权限(包括角色权限和+-权限）
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(Long adminId);

    /**
     * 根据用户名获取后台管理员
     * @param username
     * @return
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     * @param umsAdminParam
     * @return
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username,String password);

}
