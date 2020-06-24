package cn.uaj.mall.entity.sms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
/**
 * tableName = sms_member_price
 */
public class SmsMemberPrice implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="sku_id")
    private Long skuId;

    @ApiModelProperty(value="会员等级id")
    private Long memberLevelId;

    @ApiModelProperty(value="会员等级名")
    private String memberLevelName;

    @ApiModelProperty(value="会员对应价格")
    private BigDecimal memberPrice;

    @ApiModelProperty(value="可否叠加其他优惠[0-不可叠加优惠，1-可叠加]")
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

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
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
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", memberLevelName=").append(memberLevelName);
        sb.append(", memberPrice=").append(memberPrice);
        sb.append(", addOther=").append(addOther);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
