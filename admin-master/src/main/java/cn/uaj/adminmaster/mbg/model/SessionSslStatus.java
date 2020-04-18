package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SessionSslStatus implements Serializable {
    private Long threadId;

    private String sslVersion;

    private String sslCipher;

    private String sslSessionsReused;

    private static final long serialVersionUID = 1L;

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public String getSslVersion() {
        return sslVersion;
    }

    public void setSslVersion(String sslVersion) {
        this.sslVersion = sslVersion;
    }

    public String getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    public String getSslSessionsReused() {
        return sslSessionsReused;
    }

    public void setSslSessionsReused(String sslSessionsReused) {
        this.sslSessionsReused = sslSessionsReused;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", threadId=").append(threadId);
        sb.append(", sslVersion=").append(sslVersion);
        sb.append(", sslCipher=").append(sslCipher);
        sb.append(", sslSessionsReused=").append(sslSessionsReused);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}