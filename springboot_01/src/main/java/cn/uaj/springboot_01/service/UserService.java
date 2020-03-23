package cn.uaj.springboot_01.service;

import cn.uaj.springboot_01.entity.User;
import cn.uaj.springboot_01.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/3/18 22:37
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    @Transactional
    public User selectUser(Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    public List<User> selectUsers() {
        List<User> userList = userMapper.selectUsers();
        return userList;
    }
}
