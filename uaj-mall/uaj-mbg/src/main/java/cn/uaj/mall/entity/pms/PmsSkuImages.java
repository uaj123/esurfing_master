package cn.uaj.mall.entity.pms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 * tableName = pms_sku_images
 */
public class PmsSkuImages implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="sku_id")
    private Long skuId;

    @ApiModelProperty(value="图片地址")
    private String imgUrl;

    @ApiModelProperty(value="排序")
    private Integer imgSort;

    @ApiModelProperty(value="默认图[0 - 不是默认图，1 - 是默认图]")
    private Integer defaultImg;

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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getImgSort() {
        return imgSort;
    }

    public void setImgSort(Integer imgSort) {
        this.imgSort = imgSort;
    }

    public Integer getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(Integer defaultImg) {
        this.defaultImg = defaultImg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", imgSort=").append(imgSort);
        sb.append(", defaultImg=").append(defaultImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
