package cn.uaj.mall.entity.oms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
/**
 * tableName = oms_refund_info
 */
public class OmsRefundInfo implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="退款的订单")
    private Long orderReturnId;

    @ApiModelProperty(value="退款金额")
    private BigDecimal refund;

    @ApiModelProperty(value="退款交易流水号")
    private String refundSn;

    @ApiModelProperty(value="退款状态")
    private Boolean refundStatus;

    @ApiModelProperty(value="退款渠道[1-支付宝，2-微信，3-银联，4-汇款]")
    private Byte refundChannel;

    private String refundContent;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderReturnId() {
        return orderReturnId;
    }

    public void setOrderReturnId(Long orderReturnId) {
        this.orderReturnId = orderReturnId;
    }

    public BigDecimal getRefund() {
        return refund;
    }

    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn;
    }

    public Boolean getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Boolean refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Byte getRefundChannel() {
        return refundChannel;
    }

    public void setRefundChannel(Byte refundChannel) {
        this.refundChannel = refundChannel;
    }

    public String getRefundContent() {
        return refundContent;
    }

    public void setRefundContent(String refundContent) {
        this.refundContent = refundContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderReturnId=").append(orderReturnId);
        sb.append(", refund=").append(refund);
        sb.append(", refundSn=").append(refundSn);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", refundChannel=").append(refundChannel);
        sb.append(", refundContent=").append(refundContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
