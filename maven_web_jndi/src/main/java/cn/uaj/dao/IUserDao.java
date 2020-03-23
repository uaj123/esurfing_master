package cn.uaj.dao;

import cn.uaj.entity.QueryVo;
import cn.uaj.entity.User;

import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/10 17:21
 */
public interface IUserDao {
    /**
     * 查询所有user
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
     * @param id
     */
    public void deleteUser(Integer id);

    /**
     * 根据id查询user
     * @return
     * @param i
     */
    public List<User> findById(int i);

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

    /**
     * 根据QueryVo查询user
     * @return
     */
    List<User> findByVo(QueryVo queryVo);
}
