package cn.uaj.mall.entity.pms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 * tableName = pms_attr_group
 */
public class PmsAttrGroup implements Serializable {
    @ApiModelProperty(value="分组id")
    private Long attrGroupId;

    @ApiModelProperty(value="组名")
    private String attrGroupName;

    @ApiModelProperty(value="排序")
    private Integer sort;

    @ApiModelProperty(value="描述")
    private String descript;

    @ApiModelProperty(value="组图标")
    private String icon;

    @ApiModelProperty(value="所属分类id")
    private Long catelogId;

    private static final long serialVersionUID = 1L;

    public Long getAttrGroupId() {
        return attrGroupId;
    }

    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    public String getAttrGroupName() {
        return attrGroupName;
    }

    public void setAttrGroupName(String attrGroupName) {
        this.attrGroupName = attrGroupName;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attrGroupId=").append(attrGroupId);
        sb.append(", attrGroupName=").append(attrGroupName);
        sb.append(", sort=").append(sort);
        sb.append(", descript=").append(descript);
        sb.append(", icon=").append(icon);
        sb.append(", catelogId=").append(catelogId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
