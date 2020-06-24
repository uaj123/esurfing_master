package cn.uaj.mall.entity.pms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 * tableName = pms_brand
 */
public class PmsBrand implements Serializable {
    @ApiModelProperty(value="品牌id")
    private Long brandId;

    @ApiModelProperty(value="品牌名")
    private String name;

    @ApiModelProperty(value="品牌logo地址")
    private String logo;

    @ApiModelProperty(value="显示状态[0-不显示；1-显示]")
    private Byte showStatus;

    @ApiModelProperty(value="检索首字母")
    private String firstLetter;

    @ApiModelProperty(value="排序")
    private Integer sort;

    @ApiModelProperty(value="介绍")
    private String descript;

    private static final long serialVersionUID = 1L;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Byte getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Byte showStatus) {
        this.showStatus = showStatus;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", brandId=").append(brandId);
        sb.append(", name=").append(name);
        sb.append(", logo=").append(logo);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", firstLetter=").append(firstLetter);
        sb.append(", sort=").append(sort);
        sb.append(", descript=").append(descript);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
