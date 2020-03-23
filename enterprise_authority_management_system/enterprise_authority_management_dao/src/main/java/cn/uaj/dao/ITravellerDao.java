package cn.uaj.dao;

import cn.uaj.entity.Traveller;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: wushaojie
 * @Date: 2020/2/15 21:48
 */
@Repository
public interface ITravellerDao {

    /**
     * 根据根据中间表order_traveller查询的travellerId查找旅客信息
     * @param id
     * @return
     */
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    public Traveller findByOrdersId(Integer id) throws Exception;
}
