package cn.uaj.mall.entity.oms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
/**
 * tableName = oms_order_item
 */
public class OmsOrderItem implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="order_id")
    private Long orderId;

    @ApiModelProperty(value="order_sn")
    private String orderSn;

    @ApiModelProperty(value="spu_id")
    private Long spuId;

    @ApiModelProperty(value="spu_name")
    private String spuName;

    @ApiModelProperty(value="spu_pic")
    private String spuPic;

    @ApiModelProperty(value="品牌")
    private String spuBrand;

    @ApiModelProperty(value="商品分类id")
    private Long categoryId;

    @ApiModelProperty(value="商品sku编号")
    private Long skuId;

    @ApiModelProperty(value="商品sku名字")
    private String skuName;

    @ApiModelProperty(value="商品sku图片")
    private String skuPic;

    @ApiModelProperty(value="商品sku价格")
    private BigDecimal skuPrice;

    @ApiModelProperty(value="商品购买的数量")
    private Integer skuQuantity;

    @ApiModelProperty(value="商品销售属性组合（JSON）")
    private String skuAttrsVals;

    @ApiModelProperty(value="商品促销分解金额")
    private BigDecimal promotionAmount;

    @ApiModelProperty(value="优惠券优惠分解金额")
    private BigDecimal couponAmount;

    @ApiModelProperty(value="积分优惠分解金额")
    private BigDecimal integrationAmount;

    @ApiModelProperty(value="该商品经过优惠后的分解金额")
    private BigDecimal realAmount;

    @ApiModelProperty(value="赠送积分")
    private Integer giftIntegration;

    @ApiModelProperty(value="赠送成长值")
    private Integer giftGrowth;

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

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getSpuPic() {
        return spuPic;
    }

    public void setSpuPic(String spuPic) {
        this.spuPic = spuPic;
    }

    public String getSpuBrand() {
        return spuBrand;
    }

    public void setSpuBrand(String spuBrand) {
        this.spuBrand = spuBrand;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuPic() {
        return skuPic;
    }

    public void setSkuPic(String skuPic) {
        this.skuPic = skuPic;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getSkuQuantity() {
        return skuQuantity;
    }

    public void setSkuQuantity(Integer skuQuantity) {
        this.skuQuantity = skuQuantity;
    }

    public String getSkuAttrsVals() {
        return skuAttrsVals;
    }

    public void setSkuAttrsVals(String skuAttrsVals) {
        this.skuAttrsVals = skuAttrsVals;
    }

    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", spuId=").append(spuId);
        sb.append(", spuName=").append(spuName);
        sb.append(", spuPic=").append(spuPic);
        sb.append(", spuBrand=").append(spuBrand);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", skuId=").append(skuId);
        sb.append(", skuName=").append(skuName);
        sb.append(", skuPic=").append(skuPic);
        sb.append(", skuPrice=").append(skuPrice);
        sb.append(", skuQuantity=").append(skuQuantity);
        sb.append(", skuAttrsVals=").append(skuAttrsVals);
        sb.append(", promotionAmount=").append(promotionAmount);
        sb.append(", couponAmount=").append(couponAmount);
        sb.append(", integrationAmount=").append(integrationAmount);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", giftIntegration=").append(giftIntegration);
        sb.append(", giftGrowth=").append(giftGrowth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
