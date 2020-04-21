package cn.uaj.adminmaster.service.portal;

import cn.uaj.adminmaster.common.CommonResult;
import cn.uaj.adminmaster.domain.portal.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * 前台订单管理service
 * @Author: wushaojie
 * @Date: 2020/4/21 15:38
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     * @param orderParam
     * @return
     */
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     * @param orderId
     */
    @Transactional
    void cancelOrder(Long orderId);
}
