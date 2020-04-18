package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SchemaTableStatistics implements Serializable {
    private String tableSchema;

    private String tableName;

    private Long rowsFetched;

    private Long rowsInserted;

    private Long rowsUpdated;

    private Long rowsDeleted;

    private BigDecimal ioReadRequests;

    private BigDecimal ioWriteRequests;

    private BigDecimal ioMiscRequests;

    private String totalLatency;

    private String fetchLatency;

    private String insertLatency;

    private String updateLatency;

    private String deleteLatency;

    private String ioRead;

    private String ioReadLatency;

    private String ioWrite;

    private String ioWriteLatency;

    private String ioMiscLatency;

    private static final long serialVersionUID = 1L;

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getRowsFetched() {
        return rowsFetched;
    }

    public void setRowsFetched(Long rowsFetched) {
        this.rowsFetched = rowsFetched;
    }

    public Long getRowsInserted() {
        return rowsInserted;
    }

    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    public Long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    public Long getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    public BigDecimal getIoReadRequests() {
        return ioReadRequests;
    }

    public void setIoReadRequests(BigDecimal ioReadRequests) {
        this.ioReadRequests = ioReadRequests;
    }

    public BigDecimal getIoWriteRequests() {
        return ioWriteRequests;
    }

    public void setIoWriteRequests(BigDecimal ioWriteRequests) {
        this.ioWriteRequests = ioWriteRequests;
    }

    public BigDecimal getIoMiscRequests() {
        return ioMiscRequests;
    }

    public void setIoMiscRequests(BigDecimal ioMiscRequests) {
        this.ioMiscRequests = ioMiscRequests;
    }

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    public String getFetchLatency() {
        return fetchLatency;
    }

    public void setFetchLatency(String fetchLatency) {
        this.fetchLatency = fetchLatency;
    }

    public String getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency;
    }

    public String getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency;
    }

    public String getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    public String getIoRead() {
        return ioRead;
    }

    public void setIoRead(String ioRead) {
        this.ioRead = ioRead;
    }

    public String getIoReadLatency() {
        return ioReadLatency;
    }

    public void setIoReadLatency(String ioReadLatency) {
        this.ioReadLatency = ioReadLatency;
    }

    public String getIoWrite() {
        return ioWrite;
    }

    public void setIoWrite(String ioWrite) {
        this.ioWrite = ioWrite;
    }

    public String getIoWriteLatency() {
        return ioWriteLatency;
    }

    public void setIoWriteLatency(String ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency;
    }

    public String getIoMiscLatency() {
        return ioMiscLatency;
    }

    public void setIoMiscLatency(String ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", rowsFetched=").append(rowsFetched);
        sb.append(", rowsInserted=").append(rowsInserted);
        sb.append(", rowsUpdated=").append(rowsUpdated);
        sb.append(", rowsDeleted=").append(rowsDeleted);
        sb.append(", ioReadRequests=").append(ioReadRequests);
        sb.append(", ioWriteRequests=").append(ioWriteRequests);
        sb.append(", ioMiscRequests=").append(ioMiscRequests);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", fetchLatency=").append(fetchLatency);
        sb.append(", insertLatency=").append(insertLatency);
        sb.append(", updateLatency=").append(updateLatency);
        sb.append(", deleteLatency=").append(deleteLatency);
        sb.append(", ioRead=").append(ioRead);
        sb.append(", ioReadLatency=").append(ioReadLatency);
        sb.append(", ioWrite=").append(ioWrite);
        sb.append(", ioWriteLatency=").append(ioWriteLatency);
        sb.append(", ioMiscLatency=").append(ioMiscLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}