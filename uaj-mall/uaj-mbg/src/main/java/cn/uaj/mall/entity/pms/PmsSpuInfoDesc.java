package cn.uaj.mall.entity.pms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 * tableName = pms_spu_info_desc
 */
public class PmsSpuInfoDesc implements Serializable {
    @ApiModelProperty(value="商品id")
    private Long spuId;

    @ApiModelProperty(value="商品介绍")
    private String decript;

    private static final long serialVersionUID = 1L;

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getDecript() {
        return decript;
    }

    public void setDecript(String decript) {
        this.decript = decript;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spuId=").append(spuId);
        sb.append(", decript=").append(decript);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
