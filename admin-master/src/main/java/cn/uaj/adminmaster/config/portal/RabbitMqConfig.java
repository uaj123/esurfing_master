package cn.uaj.adminmaster.config.portal;
import cn.uaj.adminmaster.domain.portal.QueueEnum;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 消息队列配置
 * @Author: wushaojie
 * @Date: 2020/4/20 20:52
 */
@Configuration
public class RabbitMqConfig {
    /**
     * 订单消息实际消费队列所绑定的交换机
     * @return
     */
    @Bean
    DirectExchange orderDirect(){
        return (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_ORDER_CANCEL.getExchange())
                .durable(true)
                .build();
    }

    /**
     * 订单延迟队列队列所绑定的交换机
     * @return
     */
    @Bean
    DirectExchange orderTtlDirect(){
        return  (DirectExchange) ExchangeBuilder
                .directExchange(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getExchange())
                .durable(true)
                .build();
    }

    /**
     * 订单实际消费队列
     * @return
     */
    @Bean
    public Queue orderQueue(){
        return new Queue(QueueEnum.QUEUE_ORDER_CANCEL.getName());
    }

    /**
     * 订单延迟队列(死信队列)
     * @return
     */
    @Bean
    public Queue orderTtlQueue(){
        return QueueBuilder.durable(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getName())
                .withArgument("x-dead-letter-exchange",QueueEnum.QUEUE_ORDER_CANCEL.getExchange()) // 到期后转发的交换机
                .withArgument("x-dead-letter-routing-key",QueueEnum.QUEUE_ORDER_CANCEL.getRouteKey()) // 到期后转发的路由键
                .build();
    }

    /**
     * 将订单队列绑定到交换机
     * @param orderDirect
     * @param orderQueue
     * @return
     */
    @Bean
    Binding orderBinding(DirectExchange orderDirect,Queue orderQueue){
        return BindingBuilder.bind(orderQueue)
                .to(orderDirect)
                .with(QueueEnum.QUEUE_ORDER_CANCEL.getRouteKey());
    }

    /**
     * 将订单延迟队列绑定到交换机
     * @param orderTtlDirect
     * @param orderTtlQueue
     * @return
     */
    @Bean
    Binding orderTtlBinding(DirectExchange orderTtlDirect,Queue orderTtlQueue){
        return BindingBuilder.bind(orderTtlQueue)
                .to(orderTtlDirect)
                .with(QueueEnum.QUEUE_TTL_ORDER_CANCEL.getRouteKey());
    }
}















