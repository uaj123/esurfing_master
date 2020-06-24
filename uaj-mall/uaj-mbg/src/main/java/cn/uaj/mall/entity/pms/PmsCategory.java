package cn.uaj.mall.entity.pms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 * tableName = pms_category
 */
public class PmsCategory implements Serializable {
    @ApiModelProperty(value="分类id")
    private Long catId;

    @ApiModelProperty(value="分类名称")
    private String name;

    @ApiModelProperty(value="父分类id")
    private Long parentCid;

    @ApiModelProperty(value="层级")
    private Integer catLevel;

    @ApiModelProperty(value="是否显示[0-不显示，1显示]")
    private Byte showStatus;

    @ApiModelProperty(value="排序")
    private Integer sort;

    @ApiModelProperty(value="图标地址")
    private String icon;

    @ApiModelProperty(value="计量单位")
    private String productUnit;

    @ApiModelProperty(value="商品数量")
    private Integer productCount;

    private static final long serialVersionUID = 1L;

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentCid() {
        return parentCid;
    }

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public Integer getCatLevel() {
        return catLevel;
    }

    public void setCatLevel(Integer catLevel) {
        this.catLevel = catLevel;
    }

    public Byte getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Byte showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catId=").append(catId);
        sb.append(", name=").append(name);
        sb.append(", parentCid=").append(parentCid);
        sb.append(", catLevel=").append(catLevel);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", sort=").append(sort);
        sb.append(", icon=").append(icon);
        sb.append(", productUnit=").append(productUnit);
        sb.append(", productCount=").append(productCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
