package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class InnodbBufferStatsByTable implements Serializable {
    private Long pages;

    private Long pagesHashed;

    private Long pagesOld;

    private BigDecimal rowsCached;

    private String objectSchema;

    private String objectName;

    private String allocated;

    private String data;

    private static final long serialVersionUID = 1L;

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Long getPagesHashed() {
        return pagesHashed;
    }

    public void setPagesHashed(Long pagesHashed) {
        this.pagesHashed = pagesHashed;
    }

    public Long getPagesOld() {
        return pagesOld;
    }

    public void setPagesOld(Long pagesOld) {
        this.pagesOld = pagesOld;
    }

    public BigDecimal getRowsCached() {
        return rowsCached;
    }

    public void setRowsCached(BigDecimal rowsCached) {
        this.rowsCached = rowsCached;
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getAllocated() {
        return allocated;
    }

    public void setAllocated(String allocated) {
        this.allocated = allocated;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pages=").append(pages);
        sb.append(", pagesHashed=").append(pagesHashed);
        sb.append(", pagesOld=").append(pagesOld);
        sb.append(", rowsCached=").append(rowsCached);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", allocated=").append(allocated);
        sb.append(", data=").append(data);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}