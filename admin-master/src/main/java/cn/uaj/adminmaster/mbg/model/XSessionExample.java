package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XSessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XSessionExample() {
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

        public Criteria andThdIdIsNull() {
            addCriterion("thd_id is null");
            return (Criteria) this;
        }

        public Criteria andThdIdIsNotNull() {
            addCriterion("thd_id is not null");
            return (Criteria) this;
        }

        public Criteria andThdIdEqualTo(Long value) {
            addCriterion("thd_id =", value, "thdId");
            return (Criteria) this;
        }

        public Criteria andThdIdNotEqualTo(Long value) {
            addCriterion("thd_id <>", value, "thdId");
            return (Criteria) this;
        }

        public Criteria andThdIdGreaterThan(Long value) {
            addCriterion("thd_id >", value, "thdId");
            return (Criteria) this;
        }

        public Criteria andThdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("thd_id >=", value, "thdId");
            return (Criteria) this;
        }

        public Criteria andThdIdLessThan(Long value) {
            addCriterion("thd_id <", value, "thdId");
            return (Criteria) this;
        }

        public Criteria andThdIdLessThanOrEqualTo(Long value) {
            addCriterion("thd_id <=", value, "thdId");
            return (Criteria) this;
        }

        public Criteria andThdIdIn(List<Long> values) {
            addCriterion("thd_id in", values, "thdId");
            return (Criteria) this;
        }

        public Criteria andThdIdNotIn(List<Long> values) {
            addCriterion("thd_id not in", values, "thdId");
            return (Criteria) this;
        }

        public Criteria andThdIdBetween(Long value1, Long value2) {
            addCriterion("thd_id between", value1, value2, "thdId");
            return (Criteria) this;
        }

        public Criteria andThdIdNotBetween(Long value1, Long value2) {
            addCriterion("thd_id not between", value1, value2, "thdId");
            return (Criteria) this;
        }

        public Criteria andConnIdIsNull() {
            addCriterion("conn_id is null");
            return (Criteria) this;
        }

        public Criteria andConnIdIsNotNull() {
            addCriterion("conn_id is not null");
            return (Criteria) this;
        }

        public Criteria andConnIdEqualTo(Long value) {
            addCriterion("conn_id =", value, "connId");
            return (Criteria) this;
        }

        public Criteria andConnIdNotEqualTo(Long value) {
            addCriterion("conn_id <>", value, "connId");
            return (Criteria) this;
        }

        public Criteria andConnIdGreaterThan(Long value) {
            addCriterion("conn_id >", value, "connId");
            return (Criteria) this;
        }

        public Criteria andConnIdGreaterThanOrEqualTo(Long value) {
            addCriterion("conn_id >=", value, "connId");
            return (Criteria) this;
        }

        public Criteria andConnIdLessThan(Long value) {
            addCriterion("conn_id <", value, "connId");
            return (Criteria) this;
        }

        public Criteria andConnIdLessThanOrEqualTo(Long value) {
            addCriterion("conn_id <=", value, "connId");
            return (Criteria) this;
        }

        public Criteria andConnIdIn(List<Long> values) {
            addCriterion("conn_id in", values, "connId");
            return (Criteria) this;
        }

        public Criteria andConnIdNotIn(List<Long> values) {
            addCriterion("conn_id not in", values, "connId");
            return (Criteria) this;
        }

        public Criteria andConnIdBetween(Long value1, Long value2) {
            addCriterion("conn_id between", value1, value2, "connId");
            return (Criteria) this;
        }

        public Criteria andConnIdNotBetween(Long value1, Long value2) {
            addCriterion("conn_id not between", value1, value2, "connId");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
            return (Criteria) this;
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

        public Criteria andCommandIsNull() {
            addCriterion("command is null");
            return (Criteria) this;
        }

        public Criteria andCommandIsNotNull() {
            addCriterion("command is not null");
            return (Criteria) this;
        }

        public Criteria andCommandEqualTo(String value) {
            addCriterion("command =", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotEqualTo(String value) {
            addCriterion("command <>", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThan(String value) {
            addCriterion("command >", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandGreaterThanOrEqualTo(String value) {
            addCriterion("command >=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThan(String value) {
            addCriterion("command <", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLessThanOrEqualTo(String value) {
            addCriterion("command <=", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandLike(String value) {
            addCriterion("command like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotLike(String value) {
            addCriterion("command not like", value, "command");
            return (Criteria) this;
        }

        public Criteria andCommandIn(List<String> values) {
            addCriterion("command in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotIn(List<String> values) {
            addCriterion("command not in", values, "command");
            return (Criteria) this;
        }

        public Criteria andCommandBetween(String value1, String value2) {
            addCriterion("command between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andCommandNotBetween(String value1, String value2) {
            addCriterion("command not between", value1, value2, "command");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Long value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Long value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Long value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Long value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Long value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Long> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Long> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Long value1, Long value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Long value1, Long value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyIsNull() {
            addCriterion("statement_latency is null");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyIsNotNull() {
            addCriterion("statement_latency is not null");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyEqualTo(Long value) {
            addCriterion("statement_latency =", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyNotEqualTo(Long value) {
            addCriterion("statement_latency <>", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyGreaterThan(Long value) {
            addCriterion("statement_latency >", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("statement_latency >=", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyLessThan(Long value) {
            addCriterion("statement_latency <", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyLessThanOrEqualTo(Long value) {
            addCriterion("statement_latency <=", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyIn(List<Long> values) {
            addCriterion("statement_latency in", values, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyNotIn(List<Long> values) {
            addCriterion("statement_latency not in", values, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyBetween(Long value1, Long value2) {
            addCriterion("statement_latency between", value1, value2, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyNotBetween(Long value1, Long value2) {
            addCriterion("statement_latency not between", value1, value2, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andProgressIsNull() {
            addCriterion("progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(BigDecimal value) {
            addCriterion("progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(BigDecimal value) {
            addCriterion("progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(BigDecimal value) {
            addCriterion("progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(BigDecimal value) {
            addCriterion("progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(BigDecimal value) {
            addCriterion("progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<BigDecimal> values) {
            addCriterion("progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<BigDecimal> values) {
            addCriterion("progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("progress not between", value1, value2, "progress");
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

        public Criteria andLockLatencyEqualTo(Long value) {
            addCriterion("lock_latency =", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyNotEqualTo(Long value) {
            addCriterion("lock_latency <>", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyGreaterThan(Long value) {
            addCriterion("lock_latency >", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("lock_latency >=", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyLessThan(Long value) {
            addCriterion("lock_latency <", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyLessThanOrEqualTo(Long value) {
            addCriterion("lock_latency <=", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyIn(List<Long> values) {
            addCriterion("lock_latency in", values, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyNotIn(List<Long> values) {
            addCriterion("lock_latency not in", values, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyBetween(Long value1, Long value2) {
            addCriterion("lock_latency between", value1, value2, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyNotBetween(Long value1, Long value2) {
            addCriterion("lock_latency not between", value1, value2, "lockLatency");
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

        public Criteria andRowsAffectedIsNull() {
            addCriterion("rows_affected is null");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIsNotNull() {
            addCriterion("rows_affected is not null");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedEqualTo(Long value) {
            addCriterion("rows_affected =", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotEqualTo(Long value) {
            addCriterion("rows_affected <>", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedGreaterThan(Long value) {
            addCriterion("rows_affected >", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_affected >=", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedLessThan(Long value) {
            addCriterion("rows_affected <", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedLessThanOrEqualTo(Long value) {
            addCriterion("rows_affected <=", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIn(List<Long> values) {
            addCriterion("rows_affected in", values, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotIn(List<Long> values) {
            addCriterion("rows_affected not in", values, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedBetween(Long value1, Long value2) {
            addCriterion("rows_affected between", value1, value2, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotBetween(Long value1, Long value2) {
            addCriterion("rows_affected not between", value1, value2, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andTmpTablesIsNull() {
            addCriterion("tmp_tables is null");
            return (Criteria) this;
        }

        public Criteria andTmpTablesIsNotNull() {
            addCriterion("tmp_tables is not null");
            return (Criteria) this;
        }

        public Criteria andTmpTablesEqualTo(Long value) {
            addCriterion("tmp_tables =", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesNotEqualTo(Long value) {
            addCriterion("tmp_tables <>", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesGreaterThan(Long value) {
            addCriterion("tmp_tables >", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("tmp_tables >=", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesLessThan(Long value) {
            addCriterion("tmp_tables <", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesLessThanOrEqualTo(Long value) {
            addCriterion("tmp_tables <=", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesIn(List<Long> values) {
            addCriterion("tmp_tables in", values, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesNotIn(List<Long> values) {
            addCriterion("tmp_tables not in", values, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesBetween(Long value1, Long value2) {
            addCriterion("tmp_tables between", value1, value2, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesNotBetween(Long value1, Long value2) {
            addCriterion("tmp_tables not between", value1, value2, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesIsNull() {
            addCriterion("tmp_disk_tables is null");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesIsNotNull() {
            addCriterion("tmp_disk_tables is not null");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesEqualTo(Long value) {
            addCriterion("tmp_disk_tables =", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesNotEqualTo(Long value) {
            addCriterion("tmp_disk_tables <>", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesGreaterThan(Long value) {
            addCriterion("tmp_disk_tables >", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("tmp_disk_tables >=", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesLessThan(Long value) {
            addCriterion("tmp_disk_tables <", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesLessThanOrEqualTo(Long value) {
            addCriterion("tmp_disk_tables <=", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesIn(List<Long> values) {
            addCriterion("tmp_disk_tables in", values, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesNotIn(List<Long> values) {
            addCriterion("tmp_disk_tables not in", values, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesBetween(Long value1, Long value2) {
            addCriterion("tmp_disk_tables between", value1, value2, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesNotBetween(Long value1, Long value2) {
            addCriterion("tmp_disk_tables not between", value1, value2, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andFullScanIsNull() {
            addCriterion("full_scan is null");
            return (Criteria) this;
        }

        public Criteria andFullScanIsNotNull() {
            addCriterion("full_scan is not null");
            return (Criteria) this;
        }

        public Criteria andFullScanEqualTo(String value) {
            addCriterion("full_scan =", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanNotEqualTo(String value) {
            addCriterion("full_scan <>", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanGreaterThan(String value) {
            addCriterion("full_scan >", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanGreaterThanOrEqualTo(String value) {
            addCriterion("full_scan >=", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanLessThan(String value) {
            addCriterion("full_scan <", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanLessThanOrEqualTo(String value) {
            addCriterion("full_scan <=", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanLike(String value) {
            addCriterion("full_scan like", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanNotLike(String value) {
            addCriterion("full_scan not like", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanIn(List<String> values) {
            addCriterion("full_scan in", values, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanNotIn(List<String> values) {
            addCriterion("full_scan not in", values, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanBetween(String value1, String value2) {
            addCriterion("full_scan between", value1, value2, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanNotBetween(String value1, String value2) {
            addCriterion("full_scan not between", value1, value2, "fullScan");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyIsNull() {
            addCriterion("last_statement_latency is null");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyIsNotNull() {
            addCriterion("last_statement_latency is not null");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyEqualTo(Long value) {
            addCriterion("last_statement_latency =", value, "lastStatementLatency");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyNotEqualTo(Long value) {
            addCriterion("last_statement_latency <>", value, "lastStatementLatency");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyGreaterThan(Long value) {
            addCriterion("last_statement_latency >", value, "lastStatementLatency");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("last_statement_latency >=", value, "lastStatementLatency");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyLessThan(Long value) {
            addCriterion("last_statement_latency <", value, "lastStatementLatency");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyLessThanOrEqualTo(Long value) {
            addCriterion("last_statement_latency <=", value, "lastStatementLatency");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyIn(List<Long> values) {
            addCriterion("last_statement_latency in", values, "lastStatementLatency");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyNotIn(List<Long> values) {
            addCriterion("last_statement_latency not in", values, "lastStatementLatency");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyBetween(Long value1, Long value2) {
            addCriterion("last_statement_latency between", value1, value2, "lastStatementLatency");
            return (Criteria) this;
        }

        public Criteria andLastStatementLatencyNotBetween(Long value1, Long value2) {
            addCriterion("last_statement_latency not between", value1, value2, "lastStatementLatency");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryIsNull() {
            addCriterion("current_memory is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryIsNotNull() {
            addCriterion("current_memory is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryEqualTo(BigDecimal value) {
            addCriterion("current_memory =", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryNotEqualTo(BigDecimal value) {
            addCriterion("current_memory <>", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryGreaterThan(BigDecimal value) {
            addCriterion("current_memory >", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_memory >=", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryLessThan(BigDecimal value) {
            addCriterion("current_memory <", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_memory <=", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryIn(List<BigDecimal> values) {
            addCriterion("current_memory in", values, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryNotIn(List<BigDecimal> values) {
            addCriterion("current_memory not in", values, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_memory between", value1, value2, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_memory not between", value1, value2, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andLastWaitIsNull() {
            addCriterion("last_wait is null");
            return (Criteria) this;
        }

        public Criteria andLastWaitIsNotNull() {
            addCriterion("last_wait is not null");
            return (Criteria) this;
        }

        public Criteria andLastWaitEqualTo(String value) {
            addCriterion("last_wait =", value, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitNotEqualTo(String value) {
            addCriterion("last_wait <>", value, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitGreaterThan(String value) {
            addCriterion("last_wait >", value, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitGreaterThanOrEqualTo(String value) {
            addCriterion("last_wait >=", value, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitLessThan(String value) {
            addCriterion("last_wait <", value, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitLessThanOrEqualTo(String value) {
            addCriterion("last_wait <=", value, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitLike(String value) {
            addCriterion("last_wait like", value, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitNotLike(String value) {
            addCriterion("last_wait not like", value, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitIn(List<String> values) {
            addCriterion("last_wait in", values, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitNotIn(List<String> values) {
            addCriterion("last_wait not in", values, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitBetween(String value1, String value2) {
            addCriterion("last_wait between", value1, value2, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitNotBetween(String value1, String value2) {
            addCriterion("last_wait not between", value1, value2, "lastWait");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyIsNull() {
            addCriterion("last_wait_latency is null");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyIsNotNull() {
            addCriterion("last_wait_latency is not null");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyEqualTo(String value) {
            addCriterion("last_wait_latency =", value, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyNotEqualTo(String value) {
            addCriterion("last_wait_latency <>", value, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyGreaterThan(String value) {
            addCriterion("last_wait_latency >", value, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("last_wait_latency >=", value, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyLessThan(String value) {
            addCriterion("last_wait_latency <", value, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyLessThanOrEqualTo(String value) {
            addCriterion("last_wait_latency <=", value, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyLike(String value) {
            addCriterion("last_wait_latency like", value, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyNotLike(String value) {
            addCriterion("last_wait_latency not like", value, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyIn(List<String> values) {
            addCriterion("last_wait_latency in", values, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyNotIn(List<String> values) {
            addCriterion("last_wait_latency not in", values, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyBetween(String value1, String value2) {
            addCriterion("last_wait_latency between", value1, value2, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andLastWaitLatencyNotBetween(String value1, String value2) {
            addCriterion("last_wait_latency not between", value1, value2, "lastWaitLatency");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyIsNull() {
            addCriterion("trx_latency is null");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyIsNotNull() {
            addCriterion("trx_latency is not null");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyEqualTo(Long value) {
            addCriterion("trx_latency =", value, "trxLatency");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyNotEqualTo(Long value) {
            addCriterion("trx_latency <>", value, "trxLatency");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyGreaterThan(Long value) {
            addCriterion("trx_latency >", value, "trxLatency");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("trx_latency >=", value, "trxLatency");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyLessThan(Long value) {
            addCriterion("trx_latency <", value, "trxLatency");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyLessThanOrEqualTo(Long value) {
            addCriterion("trx_latency <=", value, "trxLatency");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyIn(List<Long> values) {
            addCriterion("trx_latency in", values, "trxLatency");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyNotIn(List<Long> values) {
            addCriterion("trx_latency not in", values, "trxLatency");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyBetween(Long value1, Long value2) {
            addCriterion("trx_latency between", value1, value2, "trxLatency");
            return (Criteria) this;
        }

        public Criteria andTrxLatencyNotBetween(Long value1, Long value2) {
            addCriterion("trx_latency not between", value1, value2, "trxLatency");
            return (Criteria) this;
        }

        public Criteria andTrxStateIsNull() {
            addCriterion("trx_state is null");
            return (Criteria) this;
        }

        public Criteria andTrxStateIsNotNull() {
            addCriterion("trx_state is not null");
            return (Criteria) this;
        }

        public Criteria andTrxStateEqualTo(String value) {
            addCriterion("trx_state =", value, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateNotEqualTo(String value) {
            addCriterion("trx_state <>", value, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateGreaterThan(String value) {
            addCriterion("trx_state >", value, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateGreaterThanOrEqualTo(String value) {
            addCriterion("trx_state >=", value, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateLessThan(String value) {
            addCriterion("trx_state <", value, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateLessThanOrEqualTo(String value) {
            addCriterion("trx_state <=", value, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateLike(String value) {
            addCriterion("trx_state like", value, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateNotLike(String value) {
            addCriterion("trx_state not like", value, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateIn(List<String> values) {
            addCriterion("trx_state in", values, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateNotIn(List<String> values) {
            addCriterion("trx_state not in", values, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateBetween(String value1, String value2) {
            addCriterion("trx_state between", value1, value2, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxStateNotBetween(String value1, String value2) {
            addCriterion("trx_state not between", value1, value2, "trxState");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitIsNull() {
            addCriterion("trx_autocommit is null");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitIsNotNull() {
            addCriterion("trx_autocommit is not null");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitEqualTo(String value) {
            addCriterion("trx_autocommit =", value, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitNotEqualTo(String value) {
            addCriterion("trx_autocommit <>", value, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitGreaterThan(String value) {
            addCriterion("trx_autocommit >", value, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitGreaterThanOrEqualTo(String value) {
            addCriterion("trx_autocommit >=", value, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitLessThan(String value) {
            addCriterion("trx_autocommit <", value, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitLessThanOrEqualTo(String value) {
            addCriterion("trx_autocommit <=", value, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitLike(String value) {
            addCriterion("trx_autocommit like", value, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitNotLike(String value) {
            addCriterion("trx_autocommit not like", value, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitIn(List<String> values) {
            addCriterion("trx_autocommit in", values, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitNotIn(List<String> values) {
            addCriterion("trx_autocommit not in", values, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitBetween(String value1, String value2) {
            addCriterion("trx_autocommit between", value1, value2, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andTrxAutocommitNotBetween(String value1, String value2) {
            addCriterion("trx_autocommit not between", value1, value2, "trxAutocommit");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andProgramNameIsNull() {
            addCriterion("program_name is null");
            return (Criteria) this;
        }

        public Criteria andProgramNameIsNotNull() {
            addCriterion("program_name is not null");
            return (Criteria) this;
        }

        public Criteria andProgramNameEqualTo(String value) {
            addCriterion("program_name =", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotEqualTo(String value) {
            addCriterion("program_name <>", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameGreaterThan(String value) {
            addCriterion("program_name >", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameGreaterThanOrEqualTo(String value) {
            addCriterion("program_name >=", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLessThan(String value) {
            addCriterion("program_name <", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLessThanOrEqualTo(String value) {
            addCriterion("program_name <=", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameLike(String value) {
            addCriterion("program_name like", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotLike(String value) {
            addCriterion("program_name not like", value, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameIn(List<String> values) {
            addCriterion("program_name in", values, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotIn(List<String> values) {
            addCriterion("program_name not in", values, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameBetween(String value1, String value2) {
            addCriterion("program_name between", value1, value2, "programName");
            return (Criteria) this;
        }

        public Criteria andProgramNameNotBetween(String value1, String value2) {
            addCriterion("program_name not between", value1, value2, "programName");
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