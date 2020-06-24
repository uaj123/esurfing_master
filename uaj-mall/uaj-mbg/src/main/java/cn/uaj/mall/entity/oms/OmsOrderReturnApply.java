package cn.uaj.mall.entity.oms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * tableName = oms_order_return_apply
 */

public class OmsOrderReturnApply implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="order_id")
    private Long orderId;

    @ApiModelProperty(value="退货商品id")
    private Long skuId;

    @ApiModelProperty(value="订单编号")
    private String orderSn;

    @ApiModelProperty(value="申请时间")
    private Date createTime;

    @ApiModelProperty(value="会员用户名")
    private String memberUsername;

    @ApiModelProperty(value="退款金额")
    private BigDecimal returnAmount;

    @ApiModelProperty(value="退货人姓名")
    private String returnName;

    @ApiModelProperty(value="退货人电话")
    private String returnPhone;

    @ApiModelProperty(value="申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]")
    private Boolean status;

    @ApiModelProperty(value="处理时间")
    private Date handleTime;

    @ApiModelProperty(value="商品图片")
    private String skuImg;

    @ApiModelProperty(value="商品名称")
    private String skuName;

    @ApiModelProperty(value="商品品牌")
    private String skuBrand;

    @ApiModelProperty(value="商品销售属性(JSON)")
    private String skuAttrsVals;

    @ApiModelProperty(value="退货数量")
    private Integer skuCount;

    @ApiModelProperty(value="商品单价")
    private BigDecimal skuPrice;

    @ApiModelProperty(value="商品实际支付单价")
    private BigDecimal skuRealPrice;

    @ApiModelProperty(value="原因")
    private String reason;

    @ApiModelProperty(value="描述")
    private String description述;

    @ApiModelProperty(value="凭证图片，以逗号隔开")
    private String descPics;

    @ApiModelProperty(value="处理备注")
    private String handleNote;

    @ApiModelProperty(value="处理人员")
    private String handleMan;

    @ApiModelProperty(value="收货人")
    private String receiveMan;

    @ApiModelProperty(value="收货时间")
    private Date receiveTime;

    @ApiModelProperty(value="收货备注")
    private String receiveNote;

    @ApiModelProperty(value="收货电话")
    private String receivePhone;

    @ApiModelProperty(value="公司收货地址")
    private String companyAddress;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getSkuImg() {
        return skuImg;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuBrand() {
        return skuBrand;
    }

    public void setSkuBrand(String skuBrand) {
        this.skuBrand = skuBrand;
    }

    public String getSkuAttrsVals() {
        return skuAttrsVals;
    }

    public void setSkuAttrsVals(String skuAttrsVals) {
        this.skuAttrsVals = skuAttrsVals;
    }

    public Integer getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public BigDecimal getSkuRealPrice() {
        return skuRealPrice;
    }

    public void setSkuRealPrice(BigDecimal skuRealPrice) {
        this.skuRealPrice = skuRealPrice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription述() {
        return description述;
    }

    public void setDescription述(String description述) {
        this.description述 = description述;
    }

    public String getDescPics() {
        return descPics;
    }

    public void setDescPics(String descPics) {
        this.descPics = descPics;
    }

    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }

    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }

    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getReceiveNote() {
        return receiveNote;
    }

    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", skuId=").append(skuId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", createTime=").append(createTime);
        sb.append(", memberUsername=").append(memberUsername);
        sb.append(", returnAmount=").append(returnAmount);
        sb.append(", returnName=").append(returnName);
        sb.append(", returnPhone=").append(returnPhone);
        sb.append(", status=").append(status);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", skuImg=").append(skuImg);
        sb.append(", skuName=").append(skuName);
        sb.append(", skuBrand=").append(skuBrand);
        sb.append(", skuAttrsVals=").append(skuAttrsVals);
        sb.append(", skuCount=").append(skuCount);
        sb.append(", skuPrice=").append(skuPrice);
        sb.append(", skuRealPrice=").append(skuRealPrice);
        sb.append(", reason=").append(reason);
        sb.append(", description述=").append(description述);
        sb.append(", descPics=").append(descPics);
        sb.append(", handleNote=").append(handleNote);
        sb.append(", handleMan=").append(handleMan);
        sb.append(", receiveMan=").append(receiveMan);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", receiveNote=").append(receiveNote);
        sb.append(", receivePhone=").append(receivePhone);
        sb.append(", companyAddress=").append(companyAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
