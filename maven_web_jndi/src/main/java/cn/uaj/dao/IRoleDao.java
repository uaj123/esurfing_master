package cn.uaj.dao;

import cn.uaj.entity.Role;

import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/13 11:34
 */
public interface IRoleDao {
    /**
     * 查询全部role
     * @return
     */
    public List<Role> findAll();
}
