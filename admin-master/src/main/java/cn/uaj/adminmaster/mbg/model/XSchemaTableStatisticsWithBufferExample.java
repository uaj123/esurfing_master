package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XSchemaTableStatisticsWithBufferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XSchemaTableStatisticsWithBufferExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTableSchemaIsNull() {
            addCriterion("table_schema is null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNotNull() {
            addCriterion("table_schema is not null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaEqualTo(String value) {
            addCriterion("table_schema =", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotEqualTo(String value) {
            addCriterion("table_schema <>", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThan(String value) {
            addCriterion("table_schema >", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("table_schema >=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThan(String value) {
            addCriterion("table_schema <", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("table_schema <=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLike(String value) {
            addCriterion("table_schema like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotLike(String value) {
            addCriterion("table_schema not like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIn(List<String> values) {
            addCriterion("table_schema in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotIn(List<String> values) {
            addCriterion("table_schema not in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaBetween(String value1, String value2) {
            addCriterion("table_schema between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotBetween(String value1, String value2) {
            addCriterion("table_schema not between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedIsNull() {
            addCriterion("rows_fetched is null");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedIsNotNull() {
            addCriterion("rows_fetched is not null");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedEqualTo(Long value) {
            addCriterion("rows_fetched =", value, "rowsFetched");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedNotEqualTo(Long value) {
            addCriterion("rows_fetched <>", value, "rowsFetched");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedGreaterThan(Long value) {
            addCriterion("rows_fetched >", value, "rowsFetched");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_fetched >=", value, "rowsFetched");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedLessThan(Long value) {
            addCriterion("rows_fetched <", value, "rowsFetched");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedLessThanOrEqualTo(Long value) {
            addCriterion("rows_fetched <=", value, "rowsFetched");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedIn(List<Long> values) {
            addCriterion("rows_fetched in", values, "rowsFetched");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedNotIn(List<Long> values) {
            addCriterion("rows_fetched not in", values, "rowsFetched");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedBetween(Long value1, Long value2) {
            addCriterion("rows_fetched between", value1, value2, "rowsFetched");
            return (Criteria) this;
        }

        public Criteria andRowsFetchedNotBetween(Long value1, Long value2) {
            addCriterion("rows_fetched not between", value1, value2, "rowsFetched");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyIsNull() {
            addCriterion("fetch_latency is null");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyIsNotNull() {
            addCriterion("fetch_latency is not null");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyEqualTo(Long value) {
            addCriterion("fetch_latency =", value, "fetchLatency");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyNotEqualTo(Long value) {
            addCriterion("fetch_latency <>", value, "fetchLatency");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyGreaterThan(Long value) {
            addCriterion("fetch_latency >", value, "fetchLatency");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("fetch_latency >=", value, "fetchLatency");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyLessThan(Long value) {
            addCriterion("fetch_latency <", value, "fetchLatency");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyLessThanOrEqualTo(Long value) {
            addCriterion("fetch_latency <=", value, "fetchLatency");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyIn(List<Long> values) {
            addCriterion("fetch_latency in", values, "fetchLatency");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyNotIn(List<Long> values) {
            addCriterion("fetch_latency not in", values, "fetchLatency");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyBetween(Long value1, Long value2) {
            addCriterion("fetch_latency between", value1, value2, "fetchLatency");
            return (Criteria) this;
        }

        public Criteria andFetchLatencyNotBetween(Long value1, Long value2) {
            addCriterion("fetch_latency not between", value1, value2, "fetchLatency");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedIsNull() {
            addCriterion("rows_inserted is null");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedIsNotNull() {
            addCriterion("rows_inserted is not null");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedEqualTo(Long value) {
            addCriterion("rows_inserted =", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedNotEqualTo(Long value) {
            addCriterion("rows_inserted <>", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedGreaterThan(Long value) {
            addCriterion("rows_inserted >", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_inserted >=", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedLessThan(Long value) {
            addCriterion("rows_inserted <", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedLessThanOrEqualTo(Long value) {
            addCriterion("rows_inserted <=", value, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedIn(List<Long> values) {
            addCriterion("rows_inserted in", values, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedNotIn(List<Long> values) {
            addCriterion("rows_inserted not in", values, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedBetween(Long value1, Long value2) {
            addCriterion("rows_inserted between", value1, value2, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andRowsInsertedNotBetween(Long value1, Long value2) {
            addCriterion("rows_inserted not between", value1, value2, "rowsInserted");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyIsNull() {
            addCriterion("insert_latency is null");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyIsNotNull() {
            addCriterion("insert_latency is not null");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyEqualTo(Long value) {
            addCriterion("insert_latency =", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyNotEqualTo(Long value) {
            addCriterion("insert_latency <>", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyGreaterThan(Long value) {
            addCriterion("insert_latency >", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("insert_latency >=", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyLessThan(Long value) {
            addCriterion("insert_latency <", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyLessThanOrEqualTo(Long value) {
            addCriterion("insert_latency <=", value, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyIn(List<Long> values) {
            addCriterion("insert_latency in", values, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyNotIn(List<Long> values) {
            addCriterion("insert_latency not in", values, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyBetween(Long value1, Long value2) {
            addCriterion("insert_latency between", value1, value2, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andInsertLatencyNotBetween(Long value1, Long value2) {
            addCriterion("insert_latency not between", value1, value2, "insertLatency");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedIsNull() {
            addCriterion("rows_updated is null");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedIsNotNull() {
            addCriterion("rows_updated is not null");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedEqualTo(Long value) {
            addCriterion("rows_updated =", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedNotEqualTo(Long value) {
            addCriterion("rows_updated <>", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedGreaterThan(Long value) {
            addCriterion("rows_updated >", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_updated >=", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedLessThan(Long value) {
            addCriterion("rows_updated <", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedLessThanOrEqualTo(Long value) {
            addCriterion("rows_updated <=", value, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedIn(List<Long> values) {
            addCriterion("rows_updated in", values, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedNotIn(List<Long> values) {
            addCriterion("rows_updated not in", values, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedBetween(Long value1, Long value2) {
            addCriterion("rows_updated between", value1, value2, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andRowsUpdatedNotBetween(Long value1, Long value2) {
            addCriterion("rows_updated not between", value1, value2, "rowsUpdated");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyIsNull() {
            addCriterion("update_latency is null");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyIsNotNull() {
            addCriterion("update_latency is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyEqualTo(Long value) {
            addCriterion("update_latency =", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyNotEqualTo(Long value) {
            addCriterion("update_latency <>", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyGreaterThan(Long value) {
            addCriterion("update_latency >", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("update_latency >=", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyLessThan(Long value) {
            addCriterion("update_latency <", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyLessThanOrEqualTo(Long value) {
            addCriterion("update_latency <=", value, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyIn(List<Long> values) {
            addCriterion("update_latency in", values, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyNotIn(List<Long> values) {
            addCriterion("update_latency not in", values, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyBetween(Long value1, Long value2) {
            addCriterion("update_latency between", value1, value2, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andUpdateLatencyNotBetween(Long value1, Long value2) {
            addCriterion("update_latency not between", value1, value2, "updateLatency");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedIsNull() {
            addCriterion("rows_deleted is null");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedIsNotNull() {
            addCriterion("rows_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedEqualTo(Long value) {
            addCriterion("rows_deleted =", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedNotEqualTo(Long value) {
            addCriterion("rows_deleted <>", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedGreaterThan(Long value) {
            addCriterion("rows_deleted >", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_deleted >=", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedLessThan(Long value) {
            addCriterion("rows_deleted <", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedLessThanOrEqualTo(Long value) {
            addCriterion("rows_deleted <=", value, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedIn(List<Long> values) {
            addCriterion("rows_deleted in", values, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedNotIn(List<Long> values) {
            addCriterion("rows_deleted not in", values, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedBetween(Long value1, Long value2) {
            addCriterion("rows_deleted between", value1, value2, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andRowsDeletedNotBetween(Long value1, Long value2) {
            addCriterion("rows_deleted not between", value1, value2, "rowsDeleted");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyIsNull() {
            addCriterion("delete_latency is null");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyIsNotNull() {
            addCriterion("delete_latency is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyEqualTo(Long value) {
            addCriterion("delete_latency =", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyNotEqualTo(Long value) {
            addCriterion("delete_latency <>", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyGreaterThan(Long value) {
            addCriterion("delete_latency >", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("delete_latency >=", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyLessThan(Long value) {
            addCriterion("delete_latency <", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyLessThanOrEqualTo(Long value) {
            addCriterion("delete_latency <=", value, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyIn(List<Long> values) {
            addCriterion("delete_latency in", values, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyNotIn(List<Long> values) {
            addCriterion("delete_latency not in", values, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyBetween(Long value1, Long value2) {
            addCriterion("delete_latency between", value1, value2, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andDeleteLatencyNotBetween(Long value1, Long value2) {
            addCriterion("delete_latency not between", value1, value2, "deleteLatency");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsIsNull() {
            addCriterion("io_read_requests is null");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsIsNotNull() {
            addCriterion("io_read_requests is not null");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsEqualTo(BigDecimal value) {
            addCriterion("io_read_requests =", value, "ioReadRequests");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsNotEqualTo(BigDecimal value) {
            addCriterion("io_read_requests <>", value, "ioReadRequests");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsGreaterThan(BigDecimal value) {
            addCriterion("io_read_requests >", value, "ioReadRequests");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_read_requests >=", value, "ioReadRequests");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsLessThan(BigDecimal value) {
            addCriterion("io_read_requests <", value, "ioReadRequests");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_read_requests <=", value, "ioReadRequests");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsIn(List<BigDecimal> values) {
            addCriterion("io_read_requests in", values, "ioReadRequests");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsNotIn(List<BigDecimal> values) {
            addCriterion("io_read_requests not in", values, "ioReadRequests");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_read_requests between", value1, value2, "ioReadRequests");
            return (Criteria) this;
        }

        public Criteria andIoReadRequestsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_read_requests not between", value1, value2, "ioReadRequests");
            return (Criteria) this;
        }

        public Criteria andIoReadIsNull() {
            addCriterion("io_read is null");
            return (Criteria) this;
        }

        public Criteria andIoReadIsNotNull() {
            addCriterion("io_read is not null");
            return (Criteria) this;
        }

        public Criteria andIoReadEqualTo(BigDecimal value) {
            addCriterion("io_read =", value, "ioRead");
            return (Criteria) this;
        }

        public Criteria andIoReadNotEqualTo(BigDecimal value) {
            addCriterion("io_read <>", value, "ioRead");
            return (Criteria) this;
        }

        public Criteria andIoReadGreaterThan(BigDecimal value) {
            addCriterion("io_read >", value, "ioRead");
            return (Criteria) this;
        }

        public Criteria andIoReadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_read >=", value, "ioRead");
            return (Criteria) this;
        }

        public Criteria andIoReadLessThan(BigDecimal value) {
            addCriterion("io_read <", value, "ioRead");
            return (Criteria) this;
        }

        public Criteria andIoReadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_read <=", value, "ioRead");
            return (Criteria) this;
        }

        public Criteria andIoReadIn(List<BigDecimal> values) {
            addCriterion("io_read in", values, "ioRead");
            return (Criteria) this;
        }

        public Criteria andIoReadNotIn(List<BigDecimal> values) {
            addCriterion("io_read not in", values, "ioRead");
            return (Criteria) this;
        }

        public Criteria andIoReadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_read between", value1, value2, "ioRead");
            return (Criteria) this;
        }

        public Criteria andIoReadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_read not between", value1, value2, "ioRead");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyIsNull() {
            addCriterion("io_read_latency is null");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyIsNotNull() {
            addCriterion("io_read_latency is not null");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyEqualTo(BigDecimal value) {
            addCriterion("io_read_latency =", value, "ioReadLatency");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyNotEqualTo(BigDecimal value) {
            addCriterion("io_read_latency <>", value, "ioReadLatency");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyGreaterThan(BigDecimal value) {
            addCriterion("io_read_latency >", value, "ioReadLatency");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_read_latency >=", value, "ioReadLatency");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyLessThan(BigDecimal value) {
            addCriterion("io_read_latency <", value, "ioReadLatency");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_read_latency <=", value, "ioReadLatency");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyIn(List<BigDecimal> values) {
            addCriterion("io_read_latency in", values, "ioReadLatency");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyNotIn(List<BigDecimal> values) {
            addCriterion("io_read_latency not in", values, "ioReadLatency");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_read_latency between", value1, value2, "ioReadLatency");
            return (Criteria) this;
        }

        public Criteria andIoReadLatencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_read_latency not between", value1, value2, "ioReadLatency");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsIsNull() {
            addCriterion("io_write_requests is null");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsIsNotNull() {
            addCriterion("io_write_requests is not null");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsEqualTo(BigDecimal value) {
            addCriterion("io_write_requests =", value, "ioWriteRequests");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsNotEqualTo(BigDecimal value) {
            addCriterion("io_write_requests <>", value, "ioWriteRequests");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsGreaterThan(BigDecimal value) {
            addCriterion("io_write_requests >", value, "ioWriteRequests");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_write_requests >=", value, "ioWriteRequests");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsLessThan(BigDecimal value) {
            addCriterion("io_write_requests <", value, "ioWriteRequests");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_write_requests <=", value, "ioWriteRequests");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsIn(List<BigDecimal> values) {
            addCriterion("io_write_requests in", values, "ioWriteRequests");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsNotIn(List<BigDecimal> values) {
            addCriterion("io_write_requests not in", values, "ioWriteRequests");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_write_requests between", value1, value2, "ioWriteRequests");
            return (Criteria) this;
        }

        public Criteria andIoWriteRequestsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_write_requests not between", value1, value2, "ioWriteRequests");
            return (Criteria) this;
        }

        public Criteria andIoWriteIsNull() {
            addCriterion("io_write is null");
            return (Criteria) this;
        }

        public Criteria andIoWriteIsNotNull() {
            addCriterion("io_write is not null");
            return (Criteria) this;
        }

        public Criteria andIoWriteEqualTo(BigDecimal value) {
            addCriterion("io_write =", value, "ioWrite");
            return (Criteria) this;
        }

        public Criteria andIoWriteNotEqualTo(BigDecimal value) {
            addCriterion("io_write <>", value, "ioWrite");
            return (Criteria) this;
        }

        public Criteria andIoWriteGreaterThan(BigDecimal value) {
            addCriterion("io_write >", value, "ioWrite");
            return (Criteria) this;
        }

        public Criteria andIoWriteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_write >=", value, "ioWrite");
            return (Criteria) this;
        }

        public Criteria andIoWriteLessThan(BigDecimal value) {
            addCriterion("io_write <", value, "ioWrite");
            return (Criteria) this;
        }

        public Criteria andIoWriteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_write <=", value, "ioWrite");
            return (Criteria) this;
        }

        public Criteria andIoWriteIn(List<BigDecimal> values) {
            addCriterion("io_write in", values, "ioWrite");
            return (Criteria) this;
        }

        public Criteria andIoWriteNotIn(List<BigDecimal> values) {
            addCriterion("io_write not in", values, "ioWrite");
            return (Criteria) this;
        }

        public Criteria andIoWriteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_write between", value1, value2, "ioWrite");
            return (Criteria) this;
        }

        public Criteria andIoWriteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_write not between", value1, value2, "ioWrite");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyIsNull() {
            addCriterion("io_write_latency is null");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyIsNotNull() {
            addCriterion("io_write_latency is not null");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyEqualTo(BigDecimal value) {
            addCriterion("io_write_latency =", value, "ioWriteLatency");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyNotEqualTo(BigDecimal value) {
            addCriterion("io_write_latency <>", value, "ioWriteLatency");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyGreaterThan(BigDecimal value) {
            addCriterion("io_write_latency >", value, "ioWriteLatency");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_write_latency >=", value, "ioWriteLatency");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyLessThan(BigDecimal value) {
            addCriterion("io_write_latency <", value, "ioWriteLatency");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_write_latency <=", value, "ioWriteLatency");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyIn(List<BigDecimal> values) {
            addCriterion("io_write_latency in", values, "ioWriteLatency");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyNotIn(List<BigDecimal> values) {
            addCriterion("io_write_latency not in", values, "ioWriteLatency");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_write_latency between", value1, value2, "ioWriteLatency");
            return (Criteria) this;
        }

        public Criteria andIoWriteLatencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_write_latency not between", value1, value2, "ioWriteLatency");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsIsNull() {
            addCriterion("io_misc_requests is null");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsIsNotNull() {
            addCriterion("io_misc_requests is not null");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsEqualTo(BigDecimal value) {
            addCriterion("io_misc_requests =", value, "ioMiscRequests");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsNotEqualTo(BigDecimal value) {
            addCriterion("io_misc_requests <>", value, "ioMiscRequests");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsGreaterThan(BigDecimal value) {
            addCriterion("io_misc_requests >", value, "ioMiscRequests");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_misc_requests >=", value, "ioMiscRequests");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsLessThan(BigDecimal value) {
            addCriterion("io_misc_requests <", value, "ioMiscRequests");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_misc_requests <=", value, "ioMiscRequests");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsIn(List<BigDecimal> values) {
            addCriterion("io_misc_requests in", values, "ioMiscRequests");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsNotIn(List<BigDecimal> values) {
            addCriterion("io_misc_requests not in", values, "ioMiscRequests");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_misc_requests between", value1, value2, "ioMiscRequests");
            return (Criteria) this;
        }

        public Criteria andIoMiscRequestsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_misc_requests not between", value1, value2, "ioMiscRequests");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyIsNull() {
            addCriterion("io_misc_latency is null");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyIsNotNull() {
            addCriterion("io_misc_latency is not null");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyEqualTo(BigDecimal value) {
            addCriterion("io_misc_latency =", value, "ioMiscLatency");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyNotEqualTo(BigDecimal value) {
            addCriterion("io_misc_latency <>", value, "ioMiscLatency");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyGreaterThan(BigDecimal value) {
            addCriterion("io_misc_latency >", value, "ioMiscLatency");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_misc_latency >=", value, "ioMiscLatency");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyLessThan(BigDecimal value) {
            addCriterion("io_misc_latency <", value, "ioMiscLatency");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_misc_latency <=", value, "ioMiscLatency");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyIn(List<BigDecimal> values) {
            addCriterion("io_misc_latency in", values, "ioMiscLatency");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyNotIn(List<BigDecimal> values) {
            addCriterion("io_misc_latency not in", values, "ioMiscLatency");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_misc_latency between", value1, value2, "ioMiscLatency");
            return (Criteria) this;
        }

        public Criteria andIoMiscLatencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_misc_latency not between", value1, value2, "ioMiscLatency");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedIsNull() {
            addCriterion("innodb_buffer_allocated is null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedIsNotNull() {
            addCriterion("innodb_buffer_allocated is not null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_allocated =", value, "innodbBufferAllocated");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedNotEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_allocated <>", value, "innodbBufferAllocated");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedGreaterThan(BigDecimal value) {
            addCriterion("innodb_buffer_allocated >", value, "innodbBufferAllocated");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_allocated >=", value, "innodbBufferAllocated");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedLessThan(BigDecimal value) {
            addCriterion("innodb_buffer_allocated <", value, "innodbBufferAllocated");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_allocated <=", value, "innodbBufferAllocated");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedIn(List<BigDecimal> values) {
            addCriterion("innodb_buffer_allocated in", values, "innodbBufferAllocated");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedNotIn(List<BigDecimal> values) {
            addCriterion("innodb_buffer_allocated not in", values, "innodbBufferAllocated");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("innodb_buffer_allocated between", value1, value2, "innodbBufferAllocated");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferAllocatedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("innodb_buffer_allocated not between", value1, value2, "innodbBufferAllocated");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataIsNull() {
            addCriterion("innodb_buffer_data is null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataIsNotNull() {
            addCriterion("innodb_buffer_data is not null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_data =", value, "innodbBufferData");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataNotEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_data <>", value, "innodbBufferData");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataGreaterThan(BigDecimal value) {
            addCriterion("innodb_buffer_data >", value, "innodbBufferData");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_data >=", value, "innodbBufferData");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataLessThan(BigDecimal value) {
            addCriterion("innodb_buffer_data <", value, "innodbBufferData");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataLessThanOrEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_data <=", value, "innodbBufferData");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataIn(List<BigDecimal> values) {
            addCriterion("innodb_buffer_data in", values, "innodbBufferData");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataNotIn(List<BigDecimal> values) {
            addCriterion("innodb_buffer_data not in", values, "innodbBufferData");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("innodb_buffer_data between", value1, value2, "innodbBufferData");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferDataNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("innodb_buffer_data not between", value1, value2, "innodbBufferData");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeIsNull() {
            addCriterion("innodb_buffer_free is null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeIsNotNull() {
            addCriterion("innodb_buffer_free is not null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_free =", value, "innodbBufferFree");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeNotEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_free <>", value, "innodbBufferFree");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeGreaterThan(BigDecimal value) {
            addCriterion("innodb_buffer_free >", value, "innodbBufferFree");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_free >=", value, "innodbBufferFree");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeLessThan(BigDecimal value) {
            addCriterion("innodb_buffer_free <", value, "innodbBufferFree");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_free <=", value, "innodbBufferFree");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeIn(List<BigDecimal> values) {
            addCriterion("innodb_buffer_free in", values, "innodbBufferFree");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeNotIn(List<BigDecimal> values) {
            addCriterion("innodb_buffer_free not in", values, "innodbBufferFree");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("innodb_buffer_free between", value1, value2, "innodbBufferFree");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferFreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("innodb_buffer_free not between", value1, value2, "innodbBufferFree");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesIsNull() {
            addCriterion("innodb_buffer_pages is null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesIsNotNull() {
            addCriterion("innodb_buffer_pages is not null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesEqualTo(Long value) {
            addCriterion("innodb_buffer_pages =", value, "innodbBufferPages");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesNotEqualTo(Long value) {
            addCriterion("innodb_buffer_pages <>", value, "innodbBufferPages");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesGreaterThan(Long value) {
            addCriterion("innodb_buffer_pages >", value, "innodbBufferPages");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesGreaterThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages >=", value, "innodbBufferPages");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesLessThan(Long value) {
            addCriterion("innodb_buffer_pages <", value, "innodbBufferPages");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesLessThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages <=", value, "innodbBufferPages");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesIn(List<Long> values) {
            addCriterion("innodb_buffer_pages in", values, "innodbBufferPages");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesNotIn(List<Long> values) {
            addCriterion("innodb_buffer_pages not in", values, "innodbBufferPages");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages between", value1, value2, "innodbBufferPages");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesNotBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages not between", value1, value2, "innodbBufferPages");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedIsNull() {
            addCriterion("innodb_buffer_pages_hashed is null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedIsNotNull() {
            addCriterion("innodb_buffer_pages_hashed is not null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_hashed =", value, "innodbBufferPagesHashed");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedNotEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_hashed <>", value, "innodbBufferPagesHashed");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedGreaterThan(Long value) {
            addCriterion("innodb_buffer_pages_hashed >", value, "innodbBufferPagesHashed");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedGreaterThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_hashed >=", value, "innodbBufferPagesHashed");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedLessThan(Long value) {
            addCriterion("innodb_buffer_pages_hashed <", value, "innodbBufferPagesHashed");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedLessThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_hashed <=", value, "innodbBufferPagesHashed");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedIn(List<Long> values) {
            addCriterion("innodb_buffer_pages_hashed in", values, "innodbBufferPagesHashed");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedNotIn(List<Long> values) {
            addCriterion("innodb_buffer_pages_hashed not in", values, "innodbBufferPagesHashed");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages_hashed between", value1, value2, "innodbBufferPagesHashed");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesHashedNotBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages_hashed not between", value1, value2, "innodbBufferPagesHashed");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldIsNull() {
            addCriterion("innodb_buffer_pages_old is null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldIsNotNull() {
            addCriterion("innodb_buffer_pages_old is not null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_old =", value, "innodbBufferPagesOld");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldNotEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_old <>", value, "innodbBufferPagesOld");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldGreaterThan(Long value) {
            addCriterion("innodb_buffer_pages_old >", value, "innodbBufferPagesOld");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldGreaterThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_old >=", value, "innodbBufferPagesOld");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldLessThan(Long value) {
            addCriterion("innodb_buffer_pages_old <", value, "innodbBufferPagesOld");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldLessThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_old <=", value, "innodbBufferPagesOld");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldIn(List<Long> values) {
            addCriterion("innodb_buffer_pages_old in", values, "innodbBufferPagesOld");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldNotIn(List<Long> values) {
            addCriterion("innodb_buffer_pages_old not in", values, "innodbBufferPagesOld");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages_old between", value1, value2, "innodbBufferPagesOld");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferPagesOldNotBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages_old not between", value1, value2, "innodbBufferPagesOld");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedIsNull() {
            addCriterion("innodb_buffer_rows_cached is null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedIsNotNull() {
            addCriterion("innodb_buffer_rows_cached is not null");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached =", value, "innodbBufferRowsCached");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedNotEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached <>", value, "innodbBufferRowsCached");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedGreaterThan(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached >", value, "innodbBufferRowsCached");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached >=", value, "innodbBufferRowsCached");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedLessThan(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached <", value, "innodbBufferRowsCached");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached <=", value, "innodbBufferRowsCached");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedIn(List<BigDecimal> values) {
            addCriterion("innodb_buffer_rows_cached in", values, "innodbBufferRowsCached");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedNotIn(List<BigDecimal> values) {
            addCriterion("innodb_buffer_rows_cached not in", values, "innodbBufferRowsCached");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("innodb_buffer_rows_cached between", value1, value2, "innodbBufferRowsCached");
            return (Criteria) this;
        }

        public Criteria andInnodbBufferRowsCachedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("innodb_buffer_rows_cached not between", value1, value2, "innodbBufferRowsCached");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}