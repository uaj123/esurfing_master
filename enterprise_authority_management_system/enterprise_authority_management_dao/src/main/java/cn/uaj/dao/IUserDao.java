package cn.uaj.dao;

import cn.uaj.entity.Role;
import cn.uaj.entity.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/17 14:38
 */
@Repository
public interface IUserDao {
    /**
     * 根据用户名查找用户信息进行登陆
     * @param username
     * @return
     */
    @Select("select * from users where username = #{username}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "phoneNum",column = "phoneNum"),
            @Result(property = "email",column = "email"),
            @Result(property = "status",column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.uaj.dao.IRoleDao.findRoleByUserId"))
    })
    public UserInfo findUserInfoByName(String username) throws Exception;


    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from users")
    public List<UserInfo> findAllUserInfo() throws Exception;

    /**
     * 添加用户
     * @param userInfo
     */
    @Insert("insert into users(username,password,phoneNum,email,status) values(#{username},#{password},#{phoneNum},#{email},#{status})")
    public void saveUserInfo(UserInfo userInfo) throws Exception;

    /**
     * 根据用户id查询用户详情
     * @param id
     * @return
     * @throws Exception
     */
    @Select("select * from users where id = #{id}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(property = "username",column = "username"),
            @Result(column = "password",property = "password"),
            @Result(property = "phoneNum",column = "phoneNum"),
            @Result(property = "email",column = "email"),
            @Result(property = "status",column = "status"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.uaj.dao.IRoleDao.findRoleByUserId"))
    })
    public UserInfo findUserInfoById(Integer id) throws Exception;

    /**
     * 根据用户id查询其他没有的角色
     * @param userId
     * @return
     */
    @Select("select * from role where id not in (select roleId from users_role where userId=#{userId})")
    List<Role> findOtherRoles(Integer userId) throws Exception;

    /**
     * 向指定用户添加角色
     * 使用mybatis注解配置使用ognl表达式时，方法上的参数如果有多个，必须使用@Param(“参数名”)注解声明
     * @param userId
     * @param roleId
     */
    @Insert("insert into users_role (userId,roleId) values(#{userId},#{roleId})")
    void addRoleToUser(@Param("userId")Integer userId, @Param("roleId")Integer roleId);

    /**
     * 修改密码
     * @param newPassword
     * @param id
     * @throws Exception
     */
    @Update("update set users password = #{newPassword} where id = #{id}")
    void updatePassword(@RequestParam("password") String newPassword,@RequestParam("id") Integer id) throws Exception;
}
