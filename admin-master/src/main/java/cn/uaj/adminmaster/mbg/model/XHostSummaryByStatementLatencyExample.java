package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XHostSummaryByStatementLatencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XHostSummaryByStatementLatencyExample() {
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

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
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

        public Criteria andTotalLatencyEqualTo(BigDecimal value) {
            addCriterion("total_latency =", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotEqualTo(BigDecimal value) {
            addCriterion("total_latency <>", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThan(BigDecimal value) {
            addCriterion("total_latency >", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_latency >=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThan(BigDecimal value) {
            addCriterion("total_latency <", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_latency <=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIn(List<BigDecimal> values) {
            addCriterion("total_latency in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotIn(List<BigDecimal> values) {
            addCriterion("total_latency not in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_latency between", value1, value2, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_latency not between", value1, value2, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyIsNull() {
            addCriterion("max_latency is null");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyIsNotNull() {
            addCriterion("max_latency is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyEqualTo(Long value) {
            addCriterion("max_latency =", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotEqualTo(Long value) {
            addCriterion("max_latency <>", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyGreaterThan(Long value) {
            addCriterion("max_latency >", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("max_latency >=", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyLessThan(Long value) {
            addCriterion("max_latency <", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyLessThanOrEqualTo(Long value) {
            addCriterion("max_latency <=", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyIn(List<Long> values) {
            addCriterion("max_latency in", values, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotIn(List<Long> values) {
            addCriterion("max_latency not in", values, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyBetween(Long value1, Long value2) {
            addCriterion("max_latency between", value1, value2, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotBetween(Long value1, Long value2) {
            addCriterion("max_latency not between", value1, value2, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyIsNull() {
            addCriterion("lock_latency is null");
            return (Criteria) this;
        }

        public Criteria andLockLatencyIsNotNull() {
            addCriterion("lock_latency is not null");
            return (Criteria) this;
        }

        public Criteria andLockLatencyEqualTo(BigDecimal value) {
            addCriterion("lock_latency =", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyNotEqualTo(BigDecimal value) {
            addCriterion("lock_latency <>", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyGreaterThan(BigDecimal value) {
            addCriterion("lock_latency >", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lock_latency >=", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyLessThan(BigDecimal value) {
            addCriterion("lock_latency <", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lock_latency <=", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyIn(List<BigDecimal> values) {
            addCriterion("lock_latency in", values, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyNotIn(List<BigDecimal> values) {
            addCriterion("lock_latency not in", values, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lock_latency between", value1, value2, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lock_latency not between", value1, value2, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andRowsSentIsNull() {
            addCriterion("rows_sent is null");
            return (Criteria) this;
        }

        public Criteria andRowsSentIsNotNull() {
            addCriterion("rows_sent is not null");
            return (Criteria) this;
        }

        public Criteria andRowsSentEqualTo(BigDecimal value) {
            addCriterion("rows_sent =", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotEqualTo(BigDecimal value) {
            addCriterion("rows_sent <>", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThan(BigDecimal value) {
            addCriterion("rows_sent >", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_sent >=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThan(BigDecimal value) {
            addCriterion("rows_sent <", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_sent <=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentIn(List<BigDecimal> values) {
            addCriterion("rows_sent in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotIn(List<BigDecimal> values) {
            addCriterion("rows_sent not in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_sent between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_sent not between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIsNull() {
            addCriterion("rows_examined is null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIsNotNull() {
            addCriterion("rows_examined is not null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedEqualTo(BigDecimal value) {
            addCriterion("rows_examined =", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotEqualTo(BigDecimal value) {
            addCriterion("rows_examined <>", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedGreaterThan(BigDecimal value) {
            addCriterion("rows_examined >", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_examined >=", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedLessThan(BigDecimal value) {
            addCriterion("rows_examined <", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_examined <=", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIn(List<BigDecimal> values) {
            addCriterion("rows_examined in", values, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotIn(List<BigDecimal> values) {
            addCriterion("rows_examined not in", values, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_examined between", value1, value2, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_examined not between", value1, value2, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIsNull() {
            addCriterion("rows_affected is null");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIsNotNull() {
            addCriterion("rows_affected is not null");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedEqualTo(BigDecimal value) {
            addCriterion("rows_affected =", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotEqualTo(BigDecimal value) {
            addCriterion("rows_affected <>", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedGreaterThan(BigDecimal value) {
            addCriterion("rows_affected >", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_affected >=", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedLessThan(BigDecimal value) {
            addCriterion("rows_affected <", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_affected <=", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIn(List<BigDecimal> values) {
            addCriterion("rows_affected in", values, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotIn(List<BigDecimal> values) {
            addCriterion("rows_affected not in", values, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_affected between", value1, value2, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_affected not between", value1, value2, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andFullScansIsNull() {
            addCriterion("full_scans is null");
            return (Criteria) this;
        }

        public Criteria andFullScansIsNotNull() {
            addCriterion("full_scans is not null");
            return (Criteria) this;
        }

        public Criteria andFullScansEqualTo(BigDecimal value) {
            addCriterion("full_scans =", value, "fullScans");
            return (Criteria) this;
        }

        public Criteria andFullScansNotEqualTo(BigDecimal value) {
            addCriterion("full_scans <>", value, "fullScans");
            return (Criteria) this;
        }

        public Criteria andFullScansGreaterThan(BigDecimal value) {
            addCriterion("full_scans >", value, "fullScans");
            return (Criteria) this;
        }

        public Criteria andFullScansGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("full_scans >=", value, "fullScans");
            return (Criteria) this;
        }

        public Criteria andFullScansLessThan(BigDecimal value) {
            addCriterion("full_scans <", value, "fullScans");
            return (Criteria) this;
        }

        public Criteria andFullScansLessThanOrEqualTo(BigDecimal value) {
            addCriterion("full_scans <=", value, "fullScans");
            return (Criteria) this;
        }

        public Criteria andFullScansIn(List<BigDecimal> values) {
            addCriterion("full_scans in", values, "fullScans");
            return (Criteria) this;
        }

        public Criteria andFullScansNotIn(List<BigDecimal> values) {
            addCriterion("full_scans not in", values, "fullScans");
            return (Criteria) this;
        }

        public Criteria andFullScansBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("full_scans between", value1, value2, "fullScans");
            return (Criteria) this;
        }

        public Criteria andFullScansNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("full_scans not between", value1, value2, "fullScans");
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