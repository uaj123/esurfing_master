package cn.uaj.adminmaster.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class XSchemaFlattenedKeys implements Serializable {
    private String tableSchema;

    private String tableName;

    private String indexName;

    private Long nonUnique;

    private Long subpartExists;

    private String indexColumns;

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

    public Long getNonUnique() {
        return nonUnique;
    }

    public void setNonUnique(Long nonUnique) {
        this.nonUnique = nonUnique;
    }

    public Long getSubpartExists() {
        return subpartExists;
    }

    public void setSubpartExists(Long subpartExists) {
        this.subpartExists = subpartExists;
    }

    public String getIndexColumns() {
        return indexColumns;
    }

    public void setIndexColumns(String indexColumns) {
        this.indexColumns = indexColumns;
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
        sb.append(", nonUnique=").append(nonUnique);
        sb.append(", subpartExists=").append(subpartExists);
        sb.append(", indexColumns=").append(indexColumns);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}