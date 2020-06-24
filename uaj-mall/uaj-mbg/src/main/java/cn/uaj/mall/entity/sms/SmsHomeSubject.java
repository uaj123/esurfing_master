package cn.uaj.mall.entity.sms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 * tableName = sms_home_subject
 */
public class SmsHomeSubject implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="专题名字")
    private String name;

    @ApiModelProperty(value="专题标题")
    private String title;

    @ApiModelProperty(value="专题副标题")
    private String subTitle;

    @ApiModelProperty(value="显示状态")
    private Boolean status;

    @ApiModelProperty(value="详情连接")
    private String url;

    @ApiModelProperty(value="排序")
    private Integer sort;

    @ApiModelProperty(value="专题图片地址")
    private String img;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", title=").append(title);
        sb.append(", subTitle=").append(subTitle);
        sb.append(", status=").append(status);
        sb.append(", url=").append(url);
        sb.append(", sort=").append(sort);
        sb.append(", img=").append(img);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
