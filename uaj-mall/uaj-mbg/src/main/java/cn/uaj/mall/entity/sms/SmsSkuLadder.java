package cn.uaj.mall.entity.sms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
/**
 * tableName = sms_sku_ladder
 */
public class SmsSkuLadder implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="spu_id")
    private Long skuId;

    @ApiModelProperty(value="满几件")
    private Integer fullCount;

    @ApiModelProperty(value="打几折")
    private BigDecimal discount;

    @ApiModelProperty(value="折后价")
    private BigDecimal price;

    @ApiModelProperty(value="是否叠加其他优惠[0-不可叠加，1-可叠加]")
    private Boolean addOther;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getFullCount() {
        return fullCount;
    }

    public void setFullCount(Integer fullCount) {
        this.fullCount = fullCount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getAddOther() {
        return addOther;
    }

    public void setAddOther(Boolean addOther) {
        this.addOther = addOther;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", fullCount=").append(fullCount);
        sb.append(", discount=").append(discount);
        sb.append(", price=").append(price);
        sb.append(", addOther=").append(addOther);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
