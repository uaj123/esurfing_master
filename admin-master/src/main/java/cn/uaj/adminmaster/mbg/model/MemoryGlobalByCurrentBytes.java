package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class MemoryGlobalByCurrentBytes implements Serializable {
    private String eventName;

    private Long currentCount;

    private Long highCount;

    private String currentAlloc;

    private String currentAvgAlloc;

    private String highAlloc;

    private String highAvgAlloc;

    private static final long serialVersionUID = 1L;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Long getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
    }

    public Long getHighCount() {
        return highCount;
    }

    public void setHighCount(Long highCount) {
        this.highCount = highCount;
    }

    public String getCurrentAlloc() {
        return currentAlloc;
    }

    public void setCurrentAlloc(String currentAlloc) {
        this.currentAlloc = currentAlloc;
    }

    public String getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(String currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    public String getHighAlloc() {
        return highAlloc;
    }

    public void setHighAlloc(String highAlloc) {
        this.highAlloc = highAlloc;
    }

    public String getHighAvgAlloc() {
        return highAvgAlloc;
    }

    public void setHighAvgAlloc(String highAvgAlloc) {
        this.highAvgAlloc = highAvgAlloc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eventName=").append(eventName);
        sb.append(", currentCount=").append(currentCount);
        sb.append(", highCount=").append(highCount);
        sb.append(", currentAlloc=").append(currentAlloc);
        sb.append(", currentAvgAlloc=").append(currentAvgAlloc);
        sb.append(", highAlloc=").append(highAlloc);
        sb.append(", highAvgAlloc=").append(highAvgAlloc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}