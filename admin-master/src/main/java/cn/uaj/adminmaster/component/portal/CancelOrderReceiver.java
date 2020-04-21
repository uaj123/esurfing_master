package cn.uaj.adminmaster.component.portal;

import cn.uaj.adminmaster.service.portal.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

/**
 * 取消订单消息的处理者
 * @Author: wushaojie
 * @Date: 2020/4/21 15:31
 */
@Component
@RabbitListener(queues = "adminmaster.order.cancel") // 取消订单的消息队列(adminmaster.order.cancel)
public class CancelOrderReceiver {
    private static Logger LOGGER = LoggerFactory.getLogger(CancelOrderReceiver.class);
    @Autowired
    private OmsPortalOrderService portalOrderService;

    @RabbitHandler
    public void handle(Long orderId){
        LOGGER.info("receive delay message orderId:{}",orderId);
        portalOrderService.cancelOrder(orderId);
    }
}
