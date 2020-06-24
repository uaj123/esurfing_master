package cn.uaj.mall.entity.pms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 * tableName = pms_sku_sale_attr_value
 */
public class PmsSkuSaleAttrValue implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="sku_id")
    private Long skuId;

    @ApiModelProperty(value="attr_id")
    private Long attrId;

    @ApiModelProperty(value="销售属性名")
    private String attrName;

    @ApiModelProperty(value="销售属性值")
    private String attrValue;

    @ApiModelProperty(value="顺序")
    private Integer attrSort;

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

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public Integer getAttrSort() {
        return attrSort;
    }

    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", attrId=").append(attrId);
        sb.append(", attrName=").append(attrName);
        sb.append(", attrValue=").append(attrValue);
        sb.append(", attrSort=").append(attrSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
