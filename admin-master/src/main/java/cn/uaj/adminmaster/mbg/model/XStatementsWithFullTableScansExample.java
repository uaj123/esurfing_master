package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XStatementsWithFullTableScansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XStatementsWithFullTableScansExample() {
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

        public Criteria andNoIndexUsedCountIsNull() {
            addCriterion("no_index_used_count is null");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountIsNotNull() {
            addCriterion("no_index_used_count is not null");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountEqualTo(Long value) {
            addCriterion("no_index_used_count =", value, "noIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountNotEqualTo(Long value) {
            addCriterion("no_index_used_count <>", value, "noIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountGreaterThan(Long value) {
            addCriterion("no_index_used_count >", value, "noIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountGreaterThanOrEqualTo(Long value) {
            addCriterion("no_index_used_count >=", value, "noIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountLessThan(Long value) {
            addCriterion("no_index_used_count <", value, "noIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountLessThanOrEqualTo(Long value) {
            addCriterion("no_index_used_count <=", value, "noIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountIn(List<Long> values) {
            addCriterion("no_index_used_count in", values, "noIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountNotIn(List<Long> values) {
            addCriterion("no_index_used_count not in", values, "noIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountBetween(Long value1, Long value2) {
            addCriterion("no_index_used_count between", value1, value2, "noIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedCountNotBetween(Long value1, Long value2) {
            addCriterion("no_index_used_count not between", value1, value2, "noIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountIsNull() {
            addCriterion("no_good_index_used_count is null");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountIsNotNull() {
            addCriterion("no_good_index_used_count is not null");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountEqualTo(Long value) {
            addCriterion("no_good_index_used_count =", value, "noGoodIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountNotEqualTo(Long value) {
            addCriterion("no_good_index_used_count <>", value, "noGoodIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountGreaterThan(Long value) {
            addCriterion("no_good_index_used_count >", value, "noGoodIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountGreaterThanOrEqualTo(Long value) {
            addCriterion("no_good_index_used_count >=", value, "noGoodIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountLessThan(Long value) {
            addCriterion("no_good_index_used_count <", value, "noGoodIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountLessThanOrEqualTo(Long value) {
            addCriterion("no_good_index_used_count <=", value, "noGoodIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountIn(List<Long> values) {
            addCriterion("no_good_index_used_count in", values, "noGoodIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountNotIn(List<Long> values) {
            addCriterion("no_good_index_used_count not in", values, "noGoodIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountBetween(Long value1, Long value2) {
            addCriterion("no_good_index_used_count between", value1, value2, "noGoodIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedCountNotBetween(Long value1, Long value2) {
            addCriterion("no_good_index_used_count not between", value1, value2, "noGoodIndexUsedCount");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctIsNull() {
            addCriterion("no_index_used_pct is null");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctIsNotNull() {
            addCriterion("no_index_used_pct is not null");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctEqualTo(BigDecimal value) {
            addCriterion("no_index_used_pct =", value, "noIndexUsedPct");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctNotEqualTo(BigDecimal value) {
            addCriterion("no_index_used_pct <>", value, "noIndexUsedPct");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctGreaterThan(BigDecimal value) {
            addCriterion("no_index_used_pct >", value, "noIndexUsedPct");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("no_index_used_pct >=", value, "noIndexUsedPct");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctLessThan(BigDecimal value) {
            addCriterion("no_index_used_pct <", value, "noIndexUsedPct");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctLessThanOrEqualTo(BigDecimal value) {
            addCriterion("no_index_used_pct <=", value, "noIndexUsedPct");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctIn(List<BigDecimal> values) {
            addCriterion("no_index_used_pct in", values, "noIndexUsedPct");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctNotIn(List<BigDecimal> values) {
            addCriterion("no_index_used_pct not in", values, "noIndexUsedPct");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_index_used_pct between", value1, value2, "noIndexUsedPct");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedPctNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_index_used_pct not between", value1, value2, "noIndexUsedPct");
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

        public Criteria andRowsSentEqualTo(Long value) {
            addCriterion("rows_sent =", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotEqualTo(Long value) {
            addCriterion("rows_sent <>", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThan(Long value) {
            addCriterion("rows_sent >", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_sent >=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThan(Long value) {
            addCriterion("rows_sent <", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThanOrEqualTo(Long value) {
            addCriterion("rows_sent <=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentIn(List<Long> values) {
            addCriterion("rows_sent in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotIn(List<Long> values) {
            addCriterion("rows_sent not in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentBetween(Long value1, Long value2) {
            addCriterion("rows_sent between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotBetween(Long value1, Long value2) {
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

        public Criteria andRowsExaminedEqualTo(Long value) {
            addCriterion("rows_examined =", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotEqualTo(Long value) {
            addCriterion("rows_examined <>", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedGreaterThan(Long value) {
            addCriterion("rows_examined >", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_examined >=", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedLessThan(Long value) {
            addCriterion("rows_examined <", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedLessThanOrEqualTo(Long value) {
            addCriterion("rows_examined <=", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIn(List<Long> values) {
            addCriterion("rows_examined in", values, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotIn(List<Long> values) {
            addCriterion("rows_examined not in", values, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedBetween(Long value1, Long value2) {
            addCriterion("rows_examined between", value1, value2, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotBetween(Long value1, Long value2) {
            addCriterion("rows_examined not between", value1, value2, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgIsNull() {
            addCriterion("rows_sent_avg is null");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgIsNotNull() {
            addCriterion("rows_sent_avg is not null");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg =", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgNotEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg <>", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgGreaterThan(BigDecimal value) {
            addCriterion("rows_sent_avg >", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg >=", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgLessThan(BigDecimal value) {
            addCriterion("rows_sent_avg <", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg <=", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgIn(List<BigDecimal> values) {
            addCriterion("rows_sent_avg in", values, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgNotIn(List<BigDecimal> values) {
            addCriterion("rows_sent_avg not in", values, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_sent_avg between", value1, value2, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_sent_avg not between", value1, value2, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgIsNull() {
            addCriterion("rows_examined_avg is null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgIsNotNull() {
            addCriterion("rows_examined_avg is not null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg =", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgNotEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg <>", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgGreaterThan(BigDecimal value) {
            addCriterion("rows_examined_avg >", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg >=", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgLessThan(BigDecimal value) {
            addCriterion("rows_examined_avg <", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg <=", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgIn(List<BigDecimal> values) {
            addCriterion("rows_examined_avg in", values, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgNotIn(List<BigDecimal> values) {
            addCriterion("rows_examined_avg not in", values, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_examined_avg between", value1, value2, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_examined_avg not between", value1, value2, "rowsExaminedAvg");
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