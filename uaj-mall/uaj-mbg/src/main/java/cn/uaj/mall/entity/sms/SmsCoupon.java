package cn.uaj.mall.entity.sms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * tableName = sms_coupon
 */
public class SmsCoupon implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]")
    private Boolean couponType;

    @ApiModelProperty(value="优惠券图片")
    private String couponImg;

    @ApiModelProperty(value="优惠卷名字")
    private String couponName;

    @ApiModelProperty(value="数量")
    private Integer num;

    @ApiModelProperty(value="金额")
    private BigDecimal amount;

    @ApiModelProperty(value="每人限领张数")
    private Integer perLimit;

    @ApiModelProperty(value="使用门槛")
    private BigDecimal minPoint;

    @ApiModelProperty(value="开始时间")
    private Date startTime;

    @ApiModelProperty(value="结束时间")
    private Date endTime;

    @ApiModelProperty(value="使用类型[0->全场通用；1->指定分类；2->指定商品]")
    private Boolean useType;

    @ApiModelProperty(value="备注")
    private String note;

    @ApiModelProperty(value="发行数量")
    private Integer publishCount;

    @ApiModelProperty(value="已使用数量")
    private Integer useCount;

    @ApiModelProperty(value="领取数量")
    private Integer receiveCount;

    @ApiModelProperty(value="可以领取的开始日期")
    private Date enableStartTime;

    @ApiModelProperty(value="可以领取的结束日期")
    private Date enableEndTime;

    @ApiModelProperty(value="优惠码")
    private String code;

    @ApiModelProperty(value="可以领取的会员等级[0->不限等级，其他-对应等级]")
    private Boolean memberLevel;

    @ApiModelProperty(value="发布状态[0-未发布，1-已发布]")
    private Boolean publish;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCouponType() {
        return couponType;
    }

    public void setCouponType(Boolean couponType) {
        this.couponType = couponType;
    }

    public String getCouponImg() {
        return couponImg;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPerLimit() {
        return perLimit;
    }

    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    public BigDecimal getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getUseType() {
        return useType;
    }

    public void setUseType(Boolean useType) {
        this.useType = useType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    public Date getEnableStartTime() {
        return enableStartTime;
    }

    public void setEnableStartTime(Date enableStartTime) {
        this.enableStartTime = enableStartTime;
    }

    public Date getEnableEndTime() {
        return enableEndTime;
    }

    public void setEnableEndTime(Date enableEndTime) {
        this.enableEndTime = enableEndTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Boolean memberLevel) {
        this.memberLevel = memberLevel;
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", couponType=").append(couponType);
        sb.append(", couponImg=").append(couponImg);
        sb.append(", couponName=").append(couponName);
        sb.append(", num=").append(num);
        sb.append(", amount=").append(amount);
        sb.append(", perLimit=").append(perLimit);
        sb.append(", minPoint=").append(minPoint);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", useType=").append(useType);
        sb.append(", note=").append(note);
        sb.append(", publishCount=").append(publishCount);
        sb.append(", useCount=").append(useCount);
        sb.append(", receiveCount=").append(receiveCount);
        sb.append(", enableStartTime=").append(enableStartTime);
        sb.append(", enableEndTime=").append(enableEndTime);
        sb.append(", code=").append(code);
        sb.append(", memberLevel=").append(memberLevel);
        sb.append(", publish=").append(publish);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
