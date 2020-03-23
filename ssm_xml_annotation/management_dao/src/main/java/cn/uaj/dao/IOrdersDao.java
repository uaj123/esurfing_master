package cn.uaj.dao;

import com.github.pagehelper.PageHelper;
import cn.uaj.entity.Member;
import cn.uaj.entity.Orders;
import cn.uaj.entity.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/14 21:17
 */
public interface IOrdersDao {

    /**
     * 查询全部订单
     * @return
     */
    public List<Orders> findAll() throws Exception;


    @Select("select * from orders where id=#{ordersId}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "orderNum",property = "orderNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "orderStatus",property = "orderStatus"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "productId",property = "product",javaType = Product.class,one = @One(select = "cn.uaj.dao.IProductDao.findByProductId")),
            @Result(property = "member",column = "memberId",javaType = Member.class,one = @One(select = "cn.uaj.dao.IMemberDao.findById")),
            @Result(property = "travellers",column = "id",javaType =java.util.List.class,many = @Many(select = "cn.uaj.dao.ITravellerDao.findByOrdersId"))

    })
    public Orders findOrdersById(Integer ordersId) throws Exception;
}
