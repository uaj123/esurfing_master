package cn.uaj.adminmaster.service.impl;

import cn.uaj.adminmaster.common.CommonResult;
import cn.uaj.adminmaster.component.portal.CancelOrderSender;
import cn.uaj.adminmaster.domain.portal.OrderParam;
import cn.uaj.adminmaster.service.portal.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 前台订单管理Service的实现类
 * @Author: wushaojie
 * @Date: 2020/4/21 15:50
 */
@Service
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {
    private static Logger LOGGER = LoggerFactory.getLogger(OmsPortalOrderServiceImpl.class);
    @Autowired
    private CancelOrderSender cancelOrderSender;
    @Override
    public CommonResult generateOrder(OrderParam orderParam) {
        // todo 执行一系列下单操作，具体查看项目源码
        LOGGER.info("process generateOrder");
        sendDelayMessageCancelOrder(11L);
        return CommonResult.success(null,"下单成功");
    }

    @Override
    public void cancelOrder(Long orderId) {
        // todo 执行一系列取消订单操作，具体查看项目源码
        LOGGER.info("process cancelOrder orderId:{}",orderId);
    }

    private void sendDelayMessageCancelOrder(Long orderId){
        // 获取订单超时时间，假设30分钟
        long delayTimes = 30 * 60 * 1000;
        // 发送延迟消息
        cancelOrderSender.sendMessage(orderId,delayTimes);
    }
}
