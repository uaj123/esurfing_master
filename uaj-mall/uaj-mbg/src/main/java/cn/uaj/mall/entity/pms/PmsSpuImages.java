package cn.uaj.mall.entity.pms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 * tableName = pms_spu_images
 */
public class PmsSpuImages implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="spu_id")
    private Long spuId;

    @ApiModelProperty(value="图片名")
    private String imgName;

    @ApiModelProperty(value="图片地址")
    private String imgUrl;

    @ApiModelProperty(value="顺序")
    private Integer imgSort;

    @ApiModelProperty(value="是否默认图")
    private Byte defaultImg;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
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

    public Byte getDefaultImg() {
        return defaultImg;
    }

    public void setDefaultImg(Byte defaultImg) {
        this.defaultImg = defaultImg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", spuId=").append(spuId);
        sb.append(", imgName=").append(imgName);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", imgSort=").append(imgSort);
        sb.append(", defaultImg=").append(defaultImg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
