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
     * 根据id查询user
     * @return
     * @param i
     */
    public User findById(int i);

    /**
     * 模糊查询user
     * @return
     */
    public List<User> findLike(String string);

    /**
     * 根据QueryVo查询user
     * @return
     */
    List<User> findByVo(QueryVo queryVo);

    /**
     * 根据条件查询
     * @param user
     * @return
     */
    List<User> findByCondition(User user);

    /**
     * 根据id集合查询
     * @param queryVo
     * @return
     */
    List<User> findIndsId(QueryVo queryVo);
}
