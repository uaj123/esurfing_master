package cn.uaj.dao;

import cn.uaj.entity.User;

import java.util.List;


/**
 * @auther wushaojie
 * @date 2020/1/9 19:15
 */
public interface IUserDao {
    /**
     * 查询全部
     * @return
     */
    public List<User> findAll();

}
