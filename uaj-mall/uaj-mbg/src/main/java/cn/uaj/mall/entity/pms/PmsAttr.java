package cn.uaj.mall.entity.pms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 * tableName = pms_attr
 */
public class PmsAttr implements Serializable {
    @ApiModelProperty(value="属性id")
    private Long attrId;

    @ApiModelProperty(value="属性名")
    private String attrName;

    @ApiModelProperty(value="是否需要检索[0-不需要，1-需要]")
    private Byte searchType;

    @ApiModelProperty(value="属性图标")
    private String icon;

    @ApiModelProperty(value="可选值列表[用逗号分隔]")
    private String valueSelect;

    @ApiModelProperty(value="属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]")
    private Byte attrType;

    @ApiModelProperty(value="启用状态[0 - 禁用，1 - 启用]")
    private Long enable;

    @ApiModelProperty(value="所属分类")
    private Long catelogId;

    @ApiModelProperty(value="快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整")
    private Byte showDesc;

    private static final long serialVersionUID = 1L;

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

    public Byte getSearchType() {
        return searchType;
    }

    public void setSearchType(Byte searchType) {
        this.searchType = searchType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getValueSelect() {
        return valueSelect;
    }

    public void setValueSelect(String valueSelect) {
        this.valueSelect = valueSelect;
    }

    public Byte getAttrType() {
        return attrType;
    }

    public void setAttrType(Byte attrType) {
        this.attrType = attrType;
    }

    public Long getEnable() {
        return enable;
    }

    public void setEnable(Long enable) {
        this.enable = enable;
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

    public Byte getShowDesc() {
        return showDesc;
    }

    public void setShowDesc(Byte showDesc) {
        this.showDesc = showDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attrId=").append(attrId);
        sb.append(", attrName=").append(attrName);
        sb.append(", searchType=").append(searchType);
        sb.append(", icon=").append(icon);
        sb.append(", valueSelect=").append(valueSelect);
        sb.append(", attrType=").append(attrType);
        sb.append(", enable=").append(enable);
        sb.append(", catelogId=").append(catelogId);
        sb.append(", showDesc=").append(showDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
