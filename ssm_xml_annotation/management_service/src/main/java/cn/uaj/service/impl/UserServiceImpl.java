package cn.uaj.service.impl;

import cn.uaj.dao.IUserDao;
import cn.uaj.entity.Role;
import cn.uaj.entity.UserInfo;
import cn.uaj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 14:45
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = null;

        try {
            userInfo = iUserDao.findUserInfoByName(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*处理自己的用户对象封装成UserDetails*/
        assert userInfo != null;
        return new User(userInfo.getUsername(),userInfo.getPassword(), userInfo.getStatus() != 0,true,true,true,getAuthority(userInfo.getRoles()));
    }

    /*返回一个List集合，装有角色描述信息*/

    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles){
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role :roles) {
            /*ROLE_是角色前缀*/
            list.add(new SimpleGrantedAuthority("ROLE_"+ role.getRoleName()));
        }
        return list;
    }

    @Override
    public List<UserInfo> findAllUserInfo() throws Exception {
        return iUserDao.findAllUserInfo().isEmpty() ? null : iUserDao.findAllUserInfo();
    }

    @Override
    public void saveUserInfo(UserInfo userInfo) throws Exception{
        /*对密码进行加密处理*/
        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
        iUserDao.saveUserInfo(userInfo);
    }

    @Override
    public UserInfo findUserInfoById(Integer id) throws Exception {
        return iUserDao.findUserInfoById(id);
    }

    @Override
    public List<Role> findOtherRoles(Integer userId) throws Exception {
        return iUserDao.findOtherRoles(userId);
    }

    @Override
    public void addRoleToUser(Integer userId, Integer[] roleIds) throws Exception {
        for (Integer roleId :roleIds) {
            iUserDao.addRoleToUser(userId,roleId);
        }

    }

    @Override
    public void updatePassword(String newPassword, Integer id) throws Exception {
        iUserDao.updatePassword(newPassword,id);
    }
}
