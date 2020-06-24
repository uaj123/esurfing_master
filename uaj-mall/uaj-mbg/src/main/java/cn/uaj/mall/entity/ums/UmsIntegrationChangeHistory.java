package cn.uaj.mall.entity.ums;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
/**
 * tableName = ums_integration_change_history
 */
public class UmsIntegrationChangeHistory implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="member_id")
    private Long memberId;

    @ApiModelProperty(value="create_time")
    private Date createTime;

    @ApiModelProperty(value="变化的值")
    private Integer changeCount;

    @ApiModelProperty(value="备注")
    private String note;

    @ApiModelProperty(value="来源[0->购物；1->管理员修改;2->活动]")
    private Byte sourceTyoe;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Byte getSourceTyoe() {
        return sourceTyoe;
    }

    public void setSourceTyoe(Byte sourceTyoe) {
        this.sourceTyoe = sourceTyoe;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", createTime=").append(createTime);
        sb.append(", changeCount=").append(changeCount);
        sb.append(", note=").append(note);
        sb.append(", sourceTyoe=").append(sourceTyoe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
