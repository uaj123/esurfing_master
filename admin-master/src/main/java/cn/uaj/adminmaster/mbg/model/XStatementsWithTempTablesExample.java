package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XStatementsWithTempTablesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XStatementsWithTempTablesExample() {
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

        public Criteria andDbIsNull() {
            addCriterion("db is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("db is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("db =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("db <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("db >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("db >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("db <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("db <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("db like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("db not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("db in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("db not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("db between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("db not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andExecCountIsNull() {
            addCriterion("exec_count is null");
            return (Criteria) this;
        }

        public Criteria andExecCountIsNotNull() {
            addCriterion("exec_count is not null");
            return (Criteria) this;
        }

        public Criteria andExecCountEqualTo(Long value) {
            addCriterion("exec_count =", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountNotEqualTo(Long value) {
            addCriterion("exec_count <>", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountGreaterThan(Long value) {
            addCriterion("exec_count >", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountGreaterThanOrEqualTo(Long value) {
            addCriterion("exec_count >=", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountLessThan(Long value) {
            addCriterion("exec_count <", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountLessThanOrEqualTo(Long value) {
            addCriterion("exec_count <=", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountIn(List<Long> values) {
            addCriterion("exec_count in", values, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountNotIn(List<Long> values) {
            addCriterion("exec_count not in", values, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountBetween(Long value1, Long value2) {
            addCriterion("exec_count between", value1, value2, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountNotBetween(Long value1, Long value2) {
            addCriterion("exec_count not between", value1, value2, "execCount");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIsNull() {
            addCriterion("total_latency is null");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIsNotNull() {
            addCriterion("total_latency is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyEqualTo(Long value) {
            addCriterion("total_latency =", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotEqualTo(Long value) {
            addCriterion("total_latency <>", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThan(Long value) {
            addCriterion("total_latency >", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("total_latency >=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThan(Long value) {
            addCriterion("total_latency <", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThanOrEqualTo(Long value) {
            addCriterion("total_latency <=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIn(List<Long> values) {
            addCriterion("total_latency in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotIn(List<Long> values) {
            addCriterion("total_latency not in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyBetween(Long value1, Long value2) {
            addCriterion("total_latency between", value1, value2, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotBetween(Long value1, Long value2) {
            addCriterion("total_latency not between", value1, value2, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesIsNull() {
            addCriterion("memory_tmp_tables is null");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesIsNotNull() {
            addCriterion("memory_tmp_tables is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesEqualTo(Long value) {
            addCriterion("memory_tmp_tables =", value, "memoryTmpTables");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesNotEqualTo(Long value) {
            addCriterion("memory_tmp_tables <>", value, "memoryTmpTables");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesGreaterThan(Long value) {
            addCriterion("memory_tmp_tables >", value, "memoryTmpTables");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("memory_tmp_tables >=", value, "memoryTmpTables");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesLessThan(Long value) {
            addCriterion("memory_tmp_tables <", value, "memoryTmpTables");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesLessThanOrEqualTo(Long value) {
            addCriterion("memory_tmp_tables <=", value, "memoryTmpTables");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesIn(List<Long> values) {
            addCriterion("memory_tmp_tables in", values, "memoryTmpTables");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesNotIn(List<Long> values) {
            addCriterion("memory_tmp_tables not in", values, "memoryTmpTables");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesBetween(Long value1, Long value2) {
            addCriterion("memory_tmp_tables between", value1, value2, "memoryTmpTables");
            return (Criteria) this;
        }

        public Criteria andMemoryTmpTablesNotBetween(Long value1, Long value2) {
            addCriterion("memory_tmp_tables not between", value1, value2, "memoryTmpTables");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesIsNull() {
            addCriterion("disk_tmp_tables is null");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesIsNotNull() {
            addCriterion("disk_tmp_tables is not null");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesEqualTo(Long value) {
            addCriterion("disk_tmp_tables =", value, "diskTmpTables");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesNotEqualTo(Long value) {
            addCriterion("disk_tmp_tables <>", value, "diskTmpTables");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesGreaterThan(Long value) {
            addCriterion("disk_tmp_tables >", value, "diskTmpTables");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("disk_tmp_tables >=", value, "diskTmpTables");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesLessThan(Long value) {
            addCriterion("disk_tmp_tables <", value, "diskTmpTables");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesLessThanOrEqualTo(Long value) {
            addCriterion("disk_tmp_tables <=", value, "diskTmpTables");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesIn(List<Long> values) {
            addCriterion("disk_tmp_tables in", values, "diskTmpTables");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesNotIn(List<Long> values) {
            addCriterion("disk_tmp_tables not in", values, "diskTmpTables");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesBetween(Long value1, Long value2) {
            addCriterion("disk_tmp_tables between", value1, value2, "diskTmpTables");
            return (Criteria) this;
        }

        public Criteria andDiskTmpTablesNotBetween(Long value1, Long value2) {
            addCriterion("disk_tmp_tables not between", value1, value2, "diskTmpTables");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryIsNull() {
            addCriterion("avg_tmp_tables_per_query is null");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryIsNotNull() {
            addCriterion("avg_tmp_tables_per_query is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryEqualTo(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query =", value, "avgTmpTablesPerQuery");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryNotEqualTo(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query <>", value, "avgTmpTablesPerQuery");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryGreaterThan(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query >", value, "avgTmpTablesPerQuery");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query >=", value, "avgTmpTablesPerQuery");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryLessThan(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query <", value, "avgTmpTablesPerQuery");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query <=", value, "avgTmpTablesPerQuery");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryIn(List<BigDecimal> values) {
            addCriterion("avg_tmp_tables_per_query in", values, "avgTmpTablesPerQuery");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryNotIn(List<BigDecimal> values) {
            addCriterion("avg_tmp_tables_per_query not in", values, "avgTmpTablesPerQuery");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_tmp_tables_per_query between", value1, value2, "avgTmpTablesPerQuery");
            return (Criteria) this;
        }

        public Criteria andAvgTmpTablesPerQueryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_tmp_tables_per_query not between", value1, value2, "avgTmpTablesPerQuery");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctIsNull() {
            addCriterion("tmp_tables_to_disk_pct is null");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctIsNotNull() {
            addCriterion("tmp_tables_to_disk_pct is not null");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctEqualTo(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct =", value, "tmpTablesToDiskPct");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctNotEqualTo(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct <>", value, "tmpTablesToDiskPct");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctGreaterThan(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct >", value, "tmpTablesToDiskPct");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct >=", value, "tmpTablesToDiskPct");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctLessThan(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct <", value, "tmpTablesToDiskPct");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct <=", value, "tmpTablesToDiskPct");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctIn(List<BigDecimal> values) {
            addCriterion("tmp_tables_to_disk_pct in", values, "tmpTablesToDiskPct");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctNotIn(List<BigDecimal> values) {
            addCriterion("tmp_tables_to_disk_pct not in", values, "tmpTablesToDiskPct");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tmp_tables_to_disk_pct between", value1, value2, "tmpTablesToDiskPct");
            return (Criteria) this;
        }

        public Criteria andTmpTablesToDiskPctNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tmp_tables_to_disk_pct not between", value1, value2, "tmpTablesToDiskPct");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNull() {
            addCriterion("first_seen is null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNotNull() {
            addCriterion("first_seen is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenEqualTo(Date value) {
            addCriterion("first_seen =", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotEqualTo(Date value) {
            addCriterion("first_seen <>", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThan(Date value) {
            addCriterion("first_seen >", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("first_seen >=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThan(Date value) {
            addCriterion("first_seen <", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThanOrEqualTo(Date value) {
            addCriterion("first_seen <=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIn(List<Date> values) {
            addCriterion("first_seen in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotIn(List<Date> values) {
            addCriterion("first_seen not in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenBetween(Date value1, Date value2) {
            addCriterion("first_seen between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotBetween(Date value1, Date value2) {
            addCriterion("first_seen not between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenIsNull() {
            addCriterion("last_seen is null");
            return (Criteria) this;
        }

        public Criteria andLastSeenIsNotNull() {
            addCriterion("last_seen is not null");
            return (Criteria) this;
        }

        public Criteria andLastSeenEqualTo(Date value) {
            addCriterion("last_seen =", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotEqualTo(Date value) {
            addCriterion("last_seen <>", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenGreaterThan(Date value) {
            addCriterion("last_seen >", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("last_seen >=", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenLessThan(Date value) {
            addCriterion("last_seen <", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenLessThanOrEqualTo(Date value) {
            addCriterion("last_seen <=", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenIn(List<Date> values) {
            addCriterion("last_seen in", values, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotIn(List<Date> values) {
            addCriterion("last_seen not in", values, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenBetween(Date value1, Date value2) {
            addCriterion("last_seen between", value1, value2, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotBetween(Date value1, Date value2) {
            addCriterion("last_seen not between", value1, value2, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andDigestIsNull() {
            addCriterion("digest is null");
            return (Criteria) this;
        }

        public Criteria andDigestIsNotNull() {
            addCriterion("digest is not null");
            return (Criteria) this;
        }

        public Criteria andDigestEqualTo(String value) {
            addCriterion("digest =", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotEqualTo(String value) {
            addCriterion("digest <>", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThan(String value) {
            addCriterion("digest >", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThanOrEqualTo(String value) {
            addCriterion("digest >=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThan(String value) {
            addCriterion("digest <", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThanOrEqualTo(String value) {
            addCriterion("digest <=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLike(String value) {
            addCriterion("digest like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotLike(String value) {
            addCriterion("digest not like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestIn(List<String> values) {
            addCriterion("digest in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotIn(List<String> values) {
            addCriterion("digest not in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestBetween(String value1, String value2) {
            addCriterion("digest between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotBetween(String value1, String value2) {
            addCriterion("digest not between", value1, value2, "digest");
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