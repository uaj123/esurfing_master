package cn.uaj.mall.entity.oms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * tableName = oms_payment_info
 */
public class OmsPaymentInfo implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="订单号（对外业务号）")
    private String orderSn;

    @ApiModelProperty(value="订单id")
    private Long orderId;

    @ApiModelProperty(value="支付宝交易流水号")
    private String alipayTradeNo;

    @ApiModelProperty(value="支付总金额")
    private BigDecimal totalAmount;

    @ApiModelProperty(value="交易内容")
    private String subject;

    @ApiModelProperty(value="支付状态")
    private String paymentStatus;

    @ApiModelProperty(value="创建时间")
    private Date createTime;

    @ApiModelProperty(value="确认时间")
    private Date confirmTime;

    @ApiModelProperty(value="回调内容")
    private String callbackContent;

    @ApiModelProperty(value="回调时间")
    private Date callbackTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getAlipayTradeNo() {
        return alipayTradeNo;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getCallbackContent() {
        return callbackContent;
    }

    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent;
    }

    public Date getCallbackTime() {
        return callbackTime;
    }

    public void setCallbackTime(Date callbackTime) {
        this.callbackTime = callbackTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", orderId=").append(orderId);
        sb.append(", alipayTradeNo=").append(alipayTradeNo);
        sb.append(", totalAmount=").append(totalAmount);
        sb.append(", subject=").append(subject);
        sb.append(", paymentStatus=").append(paymentStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", callbackContent=").append(callbackContent);
        sb.append(", callbackTime=").append(callbackTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
