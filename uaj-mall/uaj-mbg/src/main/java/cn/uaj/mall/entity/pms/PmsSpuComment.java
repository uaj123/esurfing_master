package cn.uaj.mall.entity.pms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
/**
 * tableName = pms_spu_comment
 */
public class PmsSpuComment implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="sku_id")
    private Long skuId;

    @ApiModelProperty(value="spu_id")
    private Long spuId;

    @ApiModelProperty(value="商品名字")
    private String spuName;

    @ApiModelProperty(value="会员昵称")
    private String memberNickName;

    @ApiModelProperty(value="星级")
    private Boolean star;

    @ApiModelProperty(value="会员ip")
    private String memberIp;

    @ApiModelProperty(value="创建时间")
    private Date createTime;

    @ApiModelProperty(value="显示状态[0-不显示，1-显示]")
    private Boolean showStatus;

    @ApiModelProperty(value="购买时属性组合")
    private String spuAttributes;

    @ApiModelProperty(value="点赞数")
    private Integer likesCount;

    @ApiModelProperty(value="回复数")
    private Integer replyCount;

    @ApiModelProperty(value="评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]")
    private String resources;

    @ApiModelProperty(value="用户头像")
    private String memberIcon;

    @ApiModelProperty(value="评论类型[0 - 对商品的直接评论，1 - 对评论的回复]")
    private Byte commentType;

    @ApiModelProperty(value="内容")
    private String content;

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

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public Boolean getStar() {
        return star;
    }

    public void setStar(Boolean star) {
        this.star = star;
    }

    public String getMemberIp() {
        return memberIp;
    }

    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Boolean showStatus) {
        this.showStatus = showStatus;
    }

    public String getSpuAttributes() {
        return spuAttributes;
    }

    public void setSpuAttributes(String spuAttributes) {
        this.spuAttributes = spuAttributes;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    public Byte getCommentType() {
        return commentType;
    }

    public void setCommentType(Byte commentType) {
        this.commentType = commentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", skuId=").append(skuId);
        sb.append(", spuId=").append(spuId);
        sb.append(", spuName=").append(spuName);
        sb.append(", memberNickName=").append(memberNickName);
        sb.append(", star=").append(star);
        sb.append(", memberIp=").append(memberIp);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", spuAttributes=").append(spuAttributes);
        sb.append(", likesCount=").append(likesCount);
        sb.append(", replyCount=").append(replyCount);
        sb.append(", resources=").append(resources);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", commentType=").append(commentType);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
