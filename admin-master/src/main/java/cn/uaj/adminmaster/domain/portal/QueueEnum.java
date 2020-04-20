package cn.uaj.adminmaster.domain.portal;

import lombok.Getter;

/**
 * 消息队列枚举设置
 * 用于延迟消息队列及处理取消订单消息队列的常量定义，包括交换机名称、队列名称、路由键名称。
 * @Author: wushaojie
 * @Date: 2020/4/20 20:43
 */
@Getter
public enum QueueEnum {
    /**
     * 消息通知队列
     */
    QUEUE_ORDER_CANCEL("adminmaster.order.direct","adminmaster.order.cancel","adminmaster.order.cancel"),
    /**
     * 消息队列通知ttl队列
     */
    QUEUE_TTL_ORDER_CANCEL("adminmaster.order.direct.ttl","adminmaster.order.cancel.ttl","adminmaster.order.cancel.ttl");

    /**
     * 交换名称
     */
    private String exchange;
    /**
     * 队列名称
     */
    private String name;
    /**
     * 路由键
     */
    private String routeKey;
    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}
