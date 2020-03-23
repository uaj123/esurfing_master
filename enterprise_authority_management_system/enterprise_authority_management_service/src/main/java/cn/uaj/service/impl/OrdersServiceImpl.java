package cn.uaj.service.impl;

import cn.uaj.dao.IOrdersDao;
import cn.uaj.entity.Orders;
import cn.uaj.service.IOrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/14 21:22
 */
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao iOrdersDao;

    @Override
    public List<Orders> findAll(Integer page,Integer size) throws Exception{
        /*pageNum表示页码数,pageSize表示每页显示的条数*/
        PageHelper.startPage(page,size);
        List<Orders> ordersList = iOrdersDao.findAll();
        return  ordersList.isEmpty() ? null : ordersList;
    }

    @Override
    public Orders findOrdersById(Integer id) throws Exception {
        return iOrdersDao.findOrdersById(id);
    }
}
