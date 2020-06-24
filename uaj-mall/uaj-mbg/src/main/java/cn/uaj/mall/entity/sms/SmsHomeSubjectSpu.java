package cn.uaj.mall.entity.sms;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
/**
 * tableName = sms_home_subject_spu
 */
public class SmsHomeSubjectSpu implements Serializable {
    @ApiModelProperty(value="id")
    private Long id;

    @ApiModelProperty(value="专题名字")
    private String name;

    @ApiModelProperty(value="专题id")
    private Long subjectId;

    @ApiModelProperty(value="spu_id")
    private Long spuId;

    @ApiModelProperty(value="排序")
    private Integer sort;

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

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", spuId=").append(spuId);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
