package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SchemaIndexStatistics implements Serializable {
    private String tableSchema;

    private String tableName;

    private String indexName;

    private Long rowsSelected;

    private Long rowsInserted;

    private Long rowsUpdated;

    private Long rowsDeleted;

    private String selectLatency;

    private String insertLatency;

    private String updateLatency;

    private String deleteLatency;

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

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public Long getRowsSelected() {
        return rowsSelected;
    }

    public void setRowsSelected(Long rowsSelected) {
        this.rowsSelected = rowsSelected;
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

    public String getSelectLatency() {
        return selectLatency;
    }

    public void setSelectLatency(String selectLatency) {
        this.selectLatency = selectLatency;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", indexName=").append(indexName);
        sb.append(", rowsSelected=").append(rowsSelected);
        sb.append(", rowsInserted=").append(rowsInserted);
        sb.append(", rowsUpdated=").append(rowsUpdated);
        sb.append(", rowsDeleted=").append(rowsDeleted);
        sb.append(", selectLatency=").append(selectLatency);
        sb.append(", insertLatency=").append(insertLatency);
        sb.append(", updateLatency=").append(updateLatency);
        sb.append(", deleteLatency=").append(deleteLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}