package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XIoGlobalByWaitByBytesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XIoGlobalByWaitByBytesExample() {
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

        public Criteria andEventNameIsNull() {
            addCriterion("event_name is null");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNotNull() {
            addCriterion("event_name is not null");
            return (Criteria) this;
        }

        public Criteria andEventNameEqualTo(String value) {
            addCriterion("event_name =", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotEqualTo(String value) {
            addCriterion("event_name <>", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThan(String value) {
            addCriterion("event_name >", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("event_name >=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThan(String value) {
            addCriterion("event_name <", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThanOrEqualTo(String value) {
            addCriterion("event_name <=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLike(String value) {
            addCriterion("event_name like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotLike(String value) {
            addCriterion("event_name not like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameIn(List<String> values) {
            addCriterion("event_name in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotIn(List<String> values) {
            addCriterion("event_name not in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameBetween(String value1, String value2) {
            addCriterion("event_name between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotBetween(String value1, String value2) {
            addCriterion("event_name not between", value1, value2, "eventName");
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

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
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

        public Criteria andMinLatencyIsNull() {
            addCriterion("min_latency is null");
            return (Criteria) this;
        }

        public Criteria andMinLatencyIsNotNull() {
            addCriterion("min_latency is not null");
            return (Criteria) this;
        }

        public Criteria andMinLatencyEqualTo(Long value) {
            addCriterion("min_latency =", value, "minLatency");
            return (Criteria) this;
        }

        public Criteria andMinLatencyNotEqualTo(Long value) {
            addCriterion("min_latency <>", value, "minLatency");
            return (Criteria) this;
        }

        public Criteria andMinLatencyGreaterThan(Long value) {
            addCriterion("min_latency >", value, "minLatency");
            return (Criteria) this;
        }

        public Criteria andMinLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("min_latency >=", value, "minLatency");
            return (Criteria) this;
        }

        public Criteria andMinLatencyLessThan(Long value) {
            addCriterion("min_latency <", value, "minLatency");
            return (Criteria) this;
        }

        public Criteria andMinLatencyLessThanOrEqualTo(Long value) {
            addCriterion("min_latency <=", value, "minLatency");
            return (Criteria) this;
        }

        public Criteria andMinLatencyIn(List<Long> values) {
            addCriterion("min_latency in", values, "minLatency");
            return (Criteria) this;
        }

        public Criteria andMinLatencyNotIn(List<Long> values) {
            addCriterion("min_latency not in", values, "minLatency");
            return (Criteria) this;
        }

        public Criteria andMinLatencyBetween(Long value1, Long value2) {
            addCriterion("min_latency between", value1, value2, "minLatency");
            return (Criteria) this;
        }

        public Criteria andMinLatencyNotBetween(Long value1, Long value2) {
            addCriterion("min_latency not between", value1, value2, "minLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyIsNull() {
            addCriterion("avg_latency is null");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyIsNotNull() {
            addCriterion("avg_latency is not null");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyEqualTo(Long value) {
            addCriterion("avg_latency =", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotEqualTo(Long value) {
            addCriterion("avg_latency <>", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyGreaterThan(Long value) {
            addCriterion("avg_latency >", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("avg_latency >=", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyLessThan(Long value) {
            addCriterion("avg_latency <", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyLessThanOrEqualTo(Long value) {
            addCriterion("avg_latency <=", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyIn(List<Long> values) {
            addCriterion("avg_latency in", values, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotIn(List<Long> values) {
            addCriterion("avg_latency not in", values, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyBetween(Long value1, Long value2) {
            addCriterion("avg_latency between", value1, value2, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotBetween(Long value1, Long value2) {
            addCriterion("avg_latency not between", value1, value2, "avgLatency");
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

        public Criteria andCountReadIsNull() {
            addCriterion("count_read is null");
            return (Criteria) this;
        }

        public Criteria andCountReadIsNotNull() {
            addCriterion("count_read is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadEqualTo(Long value) {
            addCriterion("count_read =", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotEqualTo(Long value) {
            addCriterion("count_read <>", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThan(Long value) {
            addCriterion("count_read >", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThanOrEqualTo(Long value) {
            addCriterion("count_read >=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThan(Long value) {
            addCriterion("count_read <", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThanOrEqualTo(Long value) {
            addCriterion("count_read <=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadIn(List<Long> values) {
            addCriterion("count_read in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotIn(List<Long> values) {
            addCriterion("count_read not in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadBetween(Long value1, Long value2) {
            addCriterion("count_read between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotBetween(Long value1, Long value2) {
            addCriterion("count_read not between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadIsNull() {
            addCriterion("total_read is null");
            return (Criteria) this;
        }

        public Criteria andTotalReadIsNotNull() {
            addCriterion("total_read is not null");
            return (Criteria) this;
        }

        public Criteria andTotalReadEqualTo(Long value) {
            addCriterion("total_read =", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadNotEqualTo(Long value) {
            addCriterion("total_read <>", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadGreaterThan(Long value) {
            addCriterion("total_read >", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadGreaterThanOrEqualTo(Long value) {
            addCriterion("total_read >=", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadLessThan(Long value) {
            addCriterion("total_read <", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadLessThanOrEqualTo(Long value) {
            addCriterion("total_read <=", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadIn(List<Long> values) {
            addCriterion("total_read in", values, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadNotIn(List<Long> values) {
            addCriterion("total_read not in", values, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadBetween(Long value1, Long value2) {
            addCriterion("total_read between", value1, value2, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadNotBetween(Long value1, Long value2) {
            addCriterion("total_read not between", value1, value2, "totalRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadIsNull() {
            addCriterion("avg_read is null");
            return (Criteria) this;
        }

        public Criteria andAvgReadIsNotNull() {
            addCriterion("avg_read is not null");
            return (Criteria) this;
        }

        public Criteria andAvgReadEqualTo(BigDecimal value) {
            addCriterion("avg_read =", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadNotEqualTo(BigDecimal value) {
            addCriterion("avg_read <>", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadGreaterThan(BigDecimal value) {
            addCriterion("avg_read >", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_read >=", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadLessThan(BigDecimal value) {
            addCriterion("avg_read <", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_read <=", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadIn(List<BigDecimal> values) {
            addCriterion("avg_read in", values, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadNotIn(List<BigDecimal> values) {
            addCriterion("avg_read not in", values, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_read between", value1, value2, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_read not between", value1, value2, "avgRead");
            return (Criteria) this;
        }

        public Criteria andCountWriteIsNull() {
            addCriterion("count_write is null");
            return (Criteria) this;
        }

        public Criteria andCountWriteIsNotNull() {
            addCriterion("count_write is not null");
            return (Criteria) this;
        }

        public Criteria andCountWriteEqualTo(Long value) {
            addCriterion("count_write =", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotEqualTo(Long value) {
            addCriterion("count_write <>", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThan(Long value) {
            addCriterion("count_write >", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("count_write >=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThan(Long value) {
            addCriterion("count_write <", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThanOrEqualTo(Long value) {
            addCriterion("count_write <=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteIn(List<Long> values) {
            addCriterion("count_write in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotIn(List<Long> values) {
            addCriterion("count_write not in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteBetween(Long value1, Long value2) {
            addCriterion("count_write between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotBetween(Long value1, Long value2) {
            addCriterion("count_write not between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenIsNull() {
            addCriterion("total_written is null");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenIsNotNull() {
            addCriterion("total_written is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenEqualTo(Long value) {
            addCriterion("total_written =", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenNotEqualTo(Long value) {
            addCriterion("total_written <>", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenGreaterThan(Long value) {
            addCriterion("total_written >", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenGreaterThanOrEqualTo(Long value) {
            addCriterion("total_written >=", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenLessThan(Long value) {
            addCriterion("total_written <", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenLessThanOrEqualTo(Long value) {
            addCriterion("total_written <=", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenIn(List<Long> values) {
            addCriterion("total_written in", values, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenNotIn(List<Long> values) {
            addCriterion("total_written not in", values, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenBetween(Long value1, Long value2) {
            addCriterion("total_written between", value1, value2, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenNotBetween(Long value1, Long value2) {
            addCriterion("total_written not between", value1, value2, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenIsNull() {
            addCriterion("avg_written is null");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenIsNotNull() {
            addCriterion("avg_written is not null");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenEqualTo(BigDecimal value) {
            addCriterion("avg_written =", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenNotEqualTo(BigDecimal value) {
            addCriterion("avg_written <>", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenGreaterThan(BigDecimal value) {
            addCriterion("avg_written >", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_written >=", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenLessThan(BigDecimal value) {
            addCriterion("avg_written <", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_written <=", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenIn(List<BigDecimal> values) {
            addCriterion("avg_written in", values, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenNotIn(List<BigDecimal> values) {
            addCriterion("avg_written not in", values, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_written between", value1, value2, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_written not between", value1, value2, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedIsNull() {
            addCriterion("total_requested is null");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedIsNotNull() {
            addCriterion("total_requested is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedEqualTo(Long value) {
            addCriterion("total_requested =", value, "totalRequested");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedNotEqualTo(Long value) {
            addCriterion("total_requested <>", value, "totalRequested");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedGreaterThan(Long value) {
            addCriterion("total_requested >", value, "totalRequested");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedGreaterThanOrEqualTo(Long value) {
            addCriterion("total_requested >=", value, "totalRequested");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedLessThan(Long value) {
            addCriterion("total_requested <", value, "totalRequested");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedLessThanOrEqualTo(Long value) {
            addCriterion("total_requested <=", value, "totalRequested");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedIn(List<Long> values) {
            addCriterion("total_requested in", values, "totalRequested");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedNotIn(List<Long> values) {
            addCriterion("total_requested not in", values, "totalRequested");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedBetween(Long value1, Long value2) {
            addCriterion("total_requested between", value1, value2, "totalRequested");
            return (Criteria) this;
        }

        public Criteria andTotalRequestedNotBetween(Long value1, Long value2) {
            addCriterion("total_requested not between", value1, value2, "totalRequested");
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