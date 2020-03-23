package cn.uaj.dao;

import cn.uaj.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @auther wushaojie
 * @date 2020/1/9 21:48
 */
public interface IUserDao {
    /*使用注解配置*/
    @Select("select * from user")
    public List<User> findAll();
}
