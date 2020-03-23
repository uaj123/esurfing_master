package cn.uaj.service;

import cn.uaj.entity.Role;
import cn.uaj.entity.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;


import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 14:41
 */
public interface IUserService extends UserDetailsService {

    /**
     * 查询全部用户
     * @return
     */
    public List<UserInfo> findAllUserInfo() throws Exception;


    /**
     * 添加用户
     * @param userInfo
     */
    public void saveUserInfo(UserInfo userInfo) throws Exception;

    public UserInfo findUserInfoById(Integer id) throws Exception;

    public List<Role> findOtherRoles(Integer userId) throws Exception;

    void addRoleToUser(Integer userId, Integer[] roleIds) throws Exception;

    void updatePassword(String newPassword, Integer id) throws Exception;
}
