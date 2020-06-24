package cn.uaj.mall.entity.sms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
/**
 * tableName = sms_coupon_history
 */
public class SmsCouponHistory implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="优惠券id")
    private Long couponId;

    @ApiModelProperty(value="会员id")
    private Long memberId;

    @ApiModelProperty(value="会员名字")
    private String memberNickName;

    @ApiModelProperty(value="获取方式[0->后台赠送；1->主动领取]")
    private Boolean getType;

    @ApiModelProperty(value="创建时间")
    private Date createTime;

    @ApiModelProperty(value="使用状态[0->未使用；1->已使用；2->已过期]")
    private Boolean useType;

    @ApiModelProperty(value="使用时间")
    private Date useTime;

    @ApiModelProperty(value="订单id")
    private Long orderId;

    @ApiModelProperty(value="订单号")
    private Long orderSn;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public Boolean getGetType() {
        return getType;
    }

    public void setGetType(Boolean getType) {
        this.getType = getType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getUseType() {
        return useType;
    }

    public void setUseType(Boolean useType) {
        this.useType = useType;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponId=").append(couponId);
        sb.append(", memberId=").append(memberId);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", getType=").append(getType);
        sb.append(", createTime=").append(createTime);
        sb.append(", useType=").append(useType);
        sb.append(", useTime=").append(useTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
