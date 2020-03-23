package cn.uaj.service.impl;

import cn.uaj.dao.IUserDao;
import cn.uaj.entity.User;
import cn.uaj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/3/19 20:50
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer userId) {
        return userDao.findById(userId);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
