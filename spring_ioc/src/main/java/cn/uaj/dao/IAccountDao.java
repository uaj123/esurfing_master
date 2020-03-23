package cn.uaj.dao;

/**
 * @author wushaojie
 * @date 2020/1/14 16:36
 */

import cn.uaj.entity.Account;


import java.util.List;

/**
 * 账户的持久层接口
 */
public interface IAccountDao {
    /**
     * 查询全部账户
     * @return
     */
    List<Account> findAll();
}
