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
    /**
     * 保存user
     * @param user
     */
    public void saveUser(User user);

    /**
     * 修改user
     * @param user
     */
    public void updateUser(User user);

    /**
     * 根据id删除user
     * @param
     */
    public void deleteUser(User user);

    /**
     * 根据id查询user
     * @return
     * @param
     */
    public User findById(int id);

    /**
     * 模糊查询user
     * @return
     */
    public List<User> findLike(String string);

    /**
     * 查询总记录数
     * @return
     */
    int totalCount();
}
