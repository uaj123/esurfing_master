package cn.uaj.dao;

import cn.uaj.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/13 22:44
 */
public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from user")
    /*当实体中属性和数据库表字段不一致时，可以使用注解@Results和@ResultMap解决对应关系表示*/
    /*一对多，一般使用延迟加载和many=@Many()*/
    @Results(id = "userMap",value =
            {
                    @Result(id = true,column = "id",property = "id"),
                    @Result(column = "username",property = "username"),
                    @Result(column = "address",property = "address"),
                    @Result(column = "sex",property = "sex"),
                    @Result(column = "birthday",property = "birthday"),
                    @Result(property = "accountList",column = "id",
                            many=@Many(select = "cn.uaj.dao.IAccountDao.findAccountByUid",fetchType = FetchType.LAZY))
            })
    List<User> findAll();

    /**
     * 保存用户信息
     * @param user
     */
    @Insert("insert into user (username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
    void saveUser(User user);

    /**
     * 修改用户信息
     * @param user
     */
    @Update("update user set username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} where id=#{id}")
    void updateUser(User user);

    /**
     * 根据id删除user
     * @param userId
     */
    @Delete("delete from user where id = #{id}")
    void deleteUser(Integer userId);

    /**
     * 根据姓名模糊查找
     * @param username
     * @return
     */
    @Select("select * from user where username like #{username}")
    List<User> findByName(String username);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    @ResultMap("userMap")
    User findById(Integer id);

    /**
     * 查询用户总记录数
     * @return
     */
    @Select("select count(*) from user")
    int findTotalCount();
}
