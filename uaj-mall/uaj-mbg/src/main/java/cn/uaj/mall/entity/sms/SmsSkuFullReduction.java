package cn.uaj.mall.entity.sms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
/**
 * tableName = sms_sku_full_reduction
 */
public class SmsSkuFullReduction implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="spu_id")
    private Long skuId;

    @ApiModelProperty(value="满多少")
    private BigDecimal fullPrice;

    @ApiModelProperty(value="减多少")
    private BigDecimal reducePrice;

    @ApiModelProperty(value="是否参与其他优惠")
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

    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
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
        sb.append(", fullPrice=").append(fullPrice);
        sb.append(", reducePrice=").append(reducePrice);
        sb.append(", addOther=").append(addOther);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
