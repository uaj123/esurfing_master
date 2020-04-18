package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SchemaRedundantIndexes implements Serializable {
    private String tableSchema;

    private String tableName;

    private String redundantIndexName;

    private Long redundantIndexNonUnique;

    private String dominantIndexName;

    private Long dominantIndexNonUnique;

    private Integer subpartExists;

    private String sqlDropIndex;

    private String redundantIndexColumns;

    private String dominantIndexColumns;

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

    public String getRedundantIndexName() {
        return redundantIndexName;
    }

    public void setRedundantIndexName(String redundantIndexName) {
        this.redundantIndexName = redundantIndexName;
    }

    public Long getRedundantIndexNonUnique() {
        return redundantIndexNonUnique;
    }

    public void setRedundantIndexNonUnique(Long redundantIndexNonUnique) {
        this.redundantIndexNonUnique = redundantIndexNonUnique;
    }

    public String getDominantIndexName() {
        return dominantIndexName;
    }

    public void setDominantIndexName(String dominantIndexName) {
        this.dominantIndexName = dominantIndexName;
    }

    public Long getDominantIndexNonUnique() {
        return dominantIndexNonUnique;
    }

    public void setDominantIndexNonUnique(Long dominantIndexNonUnique) {
        this.dominantIndexNonUnique = dominantIndexNonUnique;
    }

    public Integer getSubpartExists() {
        return subpartExists;
    }

    public void setSubpartExists(Integer subpartExists) {
        this.subpartExists = subpartExists;
    }

    public String getSqlDropIndex() {
        return sqlDropIndex;
    }

    public void setSqlDropIndex(String sqlDropIndex) {
        this.sqlDropIndex = sqlDropIndex;
    }

    public String getRedundantIndexColumns() {
        return redundantIndexColumns;
    }

    public void setRedundantIndexColumns(String redundantIndexColumns) {
        this.redundantIndexColumns = redundantIndexColumns;
    }

    public String getDominantIndexColumns() {
        return dominantIndexColumns;
    }

    public void setDominantIndexColumns(String dominantIndexColumns) {
        this.dominantIndexColumns = dominantIndexColumns;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", redundantIndexName=").append(redundantIndexName);
        sb.append(", redundantIndexNonUnique=").append(redundantIndexNonUnique);
        sb.append(", dominantIndexName=").append(dominantIndexName);
        sb.append(", dominantIndexNonUnique=").append(dominantIndexNonUnique);
        sb.append(", subpartExists=").append(subpartExists);
        sb.append(", sqlDropIndex=").append(sqlDropIndex);
        sb.append(", redundantIndexColumns=").append(redundantIndexColumns);
        sb.append(", dominantIndexColumns=").append(dominantIndexColumns);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}