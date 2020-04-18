package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class StatementsWithTempTables implements Serializable {
    private String db;

    private Long execCount;

    private Long memoryTmpTables;

    private Long diskTmpTables;

    private BigDecimal avgTmpTablesPerQuery;

    private BigDecimal tmpTablesToDiskPct;

    private Date firstSeen;

    private Date lastSeen;

    private String digest;

    private String query;

    private String totalLatency;

    private static final long serialVersionUID = 1L;

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public Long getExecCount() {
        return execCount;
    }

    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    public Long getMemoryTmpTables() {
        return memoryTmpTables;
    }

    public void setMemoryTmpTables(Long memoryTmpTables) {
        this.memoryTmpTables = memoryTmpTables;
    }

    public Long getDiskTmpTables() {
        return diskTmpTables;
    }

    public void setDiskTmpTables(Long diskTmpTables) {
        this.diskTmpTables = diskTmpTables;
    }

    public BigDecimal getAvgTmpTablesPerQuery() {
        return avgTmpTablesPerQuery;
    }

    public void setAvgTmpTablesPerQuery(BigDecimal avgTmpTablesPerQuery) {
        this.avgTmpTablesPerQuery = avgTmpTablesPerQuery;
    }

    public BigDecimal getTmpTablesToDiskPct() {
        return tmpTablesToDiskPct;
    }

    public void setTmpTablesToDiskPct(BigDecimal tmpTablesToDiskPct) {
        this.tmpTablesToDiskPct = tmpTablesToDiskPct;
    }

    public Date getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", db=").append(db);
        sb.append(", execCount=").append(execCount);
        sb.append(", memoryTmpTables=").append(memoryTmpTables);
        sb.append(", diskTmpTables=").append(diskTmpTables);
        sb.append(", avgTmpTablesPerQuery=").append(avgTmpTablesPerQuery);
        sb.append(", tmpTablesToDiskPct=").append(tmpTablesToDiskPct);
        sb.append(", firstSeen=").append(firstSeen);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", digest=").append(digest);
        sb.append(", query=").append(query);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}