package cn.uaj.dao;

import cn.uaj.entity.Member;

/**
 * @Author: wushaojie
 * @Date: 2020/2/15 21:48
 */
public interface IMemberDao {

    /**
     * 根据id查询会员信息
     * @param id
     * @return
     */
    public Member findById(Integer id) throws Exception;
}
