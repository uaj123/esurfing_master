package cn.uaj.mall.entity.pms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
/**
 * tableName = pms_sku_info
 */
public class PmsSkuInfo implements Serializable {
    @ApiModelProperty(value="skuId")
    private Long skuId;

    @ApiModelProperty(value="spuId")
    private Long spuId;

    @ApiModelProperty(value="sku名称")
    private String skuName;

    @ApiModelProperty(value="sku介绍描述")
    private String skuDesc;

    @ApiModelProperty(value="所属分类id")
    private Long catalogId;

    @ApiModelProperty(value="品牌id")
    private Long brandId;

    @ApiModelProperty(value="默认图片")
    private String skuDefaultImg;

    @ApiModelProperty(value="标题")
    private String skuTitle;

    @ApiModelProperty(value="副标题")
    private String skuSubtitle;

    @ApiModelProperty(value="价格")
    private BigDecimal price;

    @ApiModelProperty(value="销量")
    private Long saleCount;

    private static final long serialVersionUID = 1L;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getSkuDesc() {
        return skuDesc;
    }

    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getSkuDefaultImg() {
        return skuDefaultImg;
    }

    public void setSkuDefaultImg(String skuDefaultImg) {
        this.skuDefaultImg = skuDefaultImg;
    }

    public String getSkuTitle() {
        return skuTitle;
    }

    public void setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
    }

    public String getSkuSubtitle() {
        return skuSubtitle;
    }

    public void setSkuSubtitle(String skuSubtitle) {
        this.skuSubtitle = skuSubtitle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Long saleCount) {
        this.saleCount = saleCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", skuId=").append(skuId);
        sb.append(", spuId=").append(spuId);
        sb.append(", skuName=").append(skuName);
        sb.append(", skuDesc=").append(skuDesc);
        sb.append(", catalogId=").append(catalogId);
        sb.append(", brandId=").append(brandId);
        sb.append(", skuDefaultImg=").append(skuDefaultImg);
        sb.append(", skuTitle=").append(skuTitle);
        sb.append(", skuSubtitle=").append(skuSubtitle);
        sb.append(", price=").append(price);
        sb.append(", saleCount=").append(saleCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
