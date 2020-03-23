package cn.uaj.service;

import cn.uaj.entity.Orders;
import com.github.pagehelper.PageHelper;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/14 21:21
 */
public interface IOrdersService {

    /**
     * 查询全部订单
     * @return
     */
    public List<Orders> findAll(Integer page,Integer size) throws Exception;

    /**
     * 根据id查询订单详情
     * @return
     */
    Orders findOrdersById(Integer id) throws Exception;
}
