package cn.uaj.service;

/**
 * @author wushaojie
 * @date 2020/1/14 16:36
 */

import cn.uaj.entity.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface IAccountService {
    /**
     * 查询全部
     * @return
     */
    List<Account> findAll();
}
