package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class IoGlobalByFileByLatency implements Serializable {
    private String file;

    private Long total;

    private Long countRead;

    private Long countWrite;

    private Long countMisc;

    private String totalLatency;

    private String readLatency;

    private String writeLatency;

    private String miscLatency;

    private static final long serialVersionUID = 1L;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getCountRead() {
        return countRead;
    }

    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    public Long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    public Long getCountMisc() {
        return countMisc;
    }

    public void setCountMisc(Long countMisc) {
        this.countMisc = countMisc;
    }

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    public String getReadLatency() {
        return readLatency;
    }

    public void setReadLatency(String readLatency) {
        this.readLatency = readLatency;
    }

    public String getWriteLatency() {
        return writeLatency;
    }

    public void setWriteLatency(String writeLatency) {
        this.writeLatency = writeLatency;
    }

    public String getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(String miscLatency) {
        this.miscLatency = miscLatency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", file=").append(file);
        sb.append(", total=").append(total);
        sb.append(", countRead=").append(countRead);
        sb.append(", countWrite=").append(countWrite);
        sb.append(", countMisc=").append(countMisc);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", readLatency=").append(readLatency);
        sb.append(", writeLatency=").append(writeLatency);
        sb.append(", miscLatency=").append(miscLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}