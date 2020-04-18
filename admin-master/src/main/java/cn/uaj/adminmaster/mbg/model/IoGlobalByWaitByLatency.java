package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class IoGlobalByWaitByLatency implements Serializable {
    private String eventName;

    private Long total;

    private Long countRead;

    private Long countWrite;

    private String totalLatency;

    private String avgLatency;

    private String maxLatency;

    private String readLatency;

    private String writeLatency;

    private String miscLatency;

    private String totalRead;

    private String avgRead;

    private String totalWritten;

    private String avgWritten;

    private static final long serialVersionUID = 1L;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
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

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    public String getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
    }

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
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

    public String getTotalRead() {
        return totalRead;
    }

    public void setTotalRead(String totalRead) {
        this.totalRead = totalRead;
    }

    public String getAvgRead() {
        return avgRead;
    }

    public void setAvgRead(String avgRead) {
        this.avgRead = avgRead;
    }

    public String getTotalWritten() {
        return totalWritten;
    }

    public void setTotalWritten(String totalWritten) {
        this.totalWritten = totalWritten;
    }

    public String getAvgWritten() {
        return avgWritten;
    }

    public void setAvgWritten(String avgWritten) {
        this.avgWritten = avgWritten;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eventName=").append(eventName);
        sb.append(", total=").append(total);
        sb.append(", countRead=").append(countRead);
        sb.append(", countWrite=").append(countWrite);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", avgLatency=").append(avgLatency);
        sb.append(", maxLatency=").append(maxLatency);
        sb.append(", readLatency=").append(readLatency);
        sb.append(", writeLatency=").append(writeLatency);
        sb.append(", miscLatency=").append(miscLatency);
        sb.append(", totalRead=").append(totalRead);
        sb.append(", avgRead=").append(avgRead);
        sb.append(", totalWritten=").append(totalWritten);
        sb.append(", avgWritten=").append(avgWritten);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}