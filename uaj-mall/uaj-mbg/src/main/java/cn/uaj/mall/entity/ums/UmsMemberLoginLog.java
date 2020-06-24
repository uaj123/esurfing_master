package cn.uaj.mall.entity.ums;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
/**
 * tableName = ums_member_login_log
 */
public class UmsMemberLoginLog implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="member_id")
    private Long memberId;

    @ApiModelProperty(value="创建时间")
    private Date createTime;

    @ApiModelProperty(value="ip")
    private String ip;

    @ApiModelProperty(value="city")
    private String city;

    @ApiModelProperty(value="登录类型[1-web，2-app]")
    private Boolean loginType;

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getLoginType() {
        return loginType;
    }

    public void setLoginType(Boolean loginType) {
        this.loginType = loginType;
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
        sb.append(", ip=").append(ip);
        sb.append(", city=").append(city);
        sb.append(", loginType=").append(loginType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
