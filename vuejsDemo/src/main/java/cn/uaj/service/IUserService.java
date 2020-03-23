package cn.uaj.service;

import cn.uaj.entity.User;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/3/19 20:49
 */
public interface IUserService {
    /**
     * 查询用户列表
     */
    List<User> findAll();

    /**
     * 根据id查询
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);
}
