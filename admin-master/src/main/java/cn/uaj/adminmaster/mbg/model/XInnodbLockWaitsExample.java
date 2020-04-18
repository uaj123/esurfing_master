package cn.uaj.adminmaster.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XInnodbLockWaitsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XInnodbLockWaitsExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andWaitStartedIsNull() {
            addCriterion("wait_started is null");
            return (Criteria) this;
        }

        public Criteria andWaitStartedIsNotNull() {
            addCriterion("wait_started is not null");
            return (Criteria) this;
        }

        public Criteria andWaitStartedEqualTo(Date value) {
            addCriterion("wait_started =", value, "waitStarted");
            return (Criteria) this;
        }

        public Criteria andWaitStartedNotEqualTo(Date value) {
            addCriterion("wait_started <>", value, "waitStarted");
            return (Criteria) this;
        }

        public Criteria andWaitStartedGreaterThan(Date value) {
            addCriterion("wait_started >", value, "waitStarted");
            return (Criteria) this;
        }

        public Criteria andWaitStartedGreaterThanOrEqualTo(Date value) {
            addCriterion("wait_started >=", value, "waitStarted");
            return (Criteria) this;
        }

        public Criteria andWaitStartedLessThan(Date value) {
            addCriterion("wait_started <", value, "waitStarted");
            return (Criteria) this;
        }

        public Criteria andWaitStartedLessThanOrEqualTo(Date value) {
            addCriterion("wait_started <=", value, "waitStarted");
            return (Criteria) this;
        }

        public Criteria andWaitStartedIn(List<Date> values) {
            addCriterion("wait_started in", values, "waitStarted");
            return (Criteria) this;
        }

        public Criteria andWaitStartedNotIn(List<Date> values) {
            addCriterion("wait_started not in", values, "waitStarted");
            return (Criteria) this;
        }

        public Criteria andWaitStartedBetween(Date value1, Date value2) {
            addCriterion("wait_started between", value1, value2, "waitStarted");
            return (Criteria) this;
        }

        public Criteria andWaitStartedNotBetween(Date value1, Date value2) {
            addCriterion("wait_started not between", value1, value2, "waitStarted");
            return (Criteria) this;
        }

        public Criteria andWaitAgeIsNull() {
            addCriterion("wait_age is null");
            return (Criteria) this;
        }

        public Criteria andWaitAgeIsNotNull() {
            addCriterion("wait_age is not null");
            return (Criteria) this;
        }

        public Criteria andWaitAgeEqualTo(Date value) {
            addCriterionForJDBCTime("wait_age =", value, "waitAge");
            return (Criteria) this;
        }

        public Criteria andWaitAgeNotEqualTo(Date value) {
            addCriterionForJDBCTime("wait_age <>", value, "waitAge");
            return (Criteria) this;
        }

        public Criteria andWaitAgeGreaterThan(Date value) {
            addCriterionForJDBCTime("wait_age >", value, "waitAge");
            return (Criteria) this;
        }

        public Criteria andWaitAgeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("wait_age >=", value, "waitAge");
            return (Criteria) this;
        }

        public Criteria andWaitAgeLessThan(Date value) {
            addCriterionForJDBCTime("wait_age <", value, "waitAge");
            return (Criteria) this;
        }

        public Criteria andWaitAgeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("wait_age <=", value, "waitAge");
            return (Criteria) this;
        }

        public Criteria andWaitAgeIn(List<Date> values) {
            addCriterionForJDBCTime("wait_age in", values, "waitAge");
            return (Criteria) this;
        }

        public Criteria andWaitAgeNotIn(List<Date> values) {
            addCriterionForJDBCTime("wait_age not in", values, "waitAge");
            return (Criteria) this;
        }

        public Criteria andWaitAgeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("wait_age between", value1, value2, "waitAge");
            return (Criteria) this;
        }

        public Criteria andWaitAgeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("wait_age not between", value1, value2, "waitAge");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsIsNull() {
            addCriterion("wait_age_secs is null");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsIsNotNull() {
            addCriterion("wait_age_secs is not null");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsEqualTo(Long value) {
            addCriterion("wait_age_secs =", value, "waitAgeSecs");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsNotEqualTo(Long value) {
            addCriterion("wait_age_secs <>", value, "waitAgeSecs");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsGreaterThan(Long value) {
            addCriterion("wait_age_secs >", value, "waitAgeSecs");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsGreaterThanOrEqualTo(Long value) {
            addCriterion("wait_age_secs >=", value, "waitAgeSecs");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsLessThan(Long value) {
            addCriterion("wait_age_secs <", value, "waitAgeSecs");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsLessThanOrEqualTo(Long value) {
            addCriterion("wait_age_secs <=", value, "waitAgeSecs");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsIn(List<Long> values) {
            addCriterion("wait_age_secs in", values, "waitAgeSecs");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsNotIn(List<Long> values) {
            addCriterion("wait_age_secs not in", values, "waitAgeSecs");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsBetween(Long value1, Long value2) {
            addCriterion("wait_age_secs between", value1, value2, "waitAgeSecs");
            return (Criteria) this;
        }

        public Criteria andWaitAgeSecsNotBetween(Long value1, Long value2) {
            addCriterion("wait_age_secs not between", value1, value2, "waitAgeSecs");
            return (Criteria) this;
        }

        public Criteria andLockedTableIsNull() {
            addCriterion("locked_table is null");
            return (Criteria) this;
        }

        public Criteria andLockedTableIsNotNull() {
            addCriterion("locked_table is not null");
            return (Criteria) this;
        }

        public Criteria andLockedTableEqualTo(String value) {
            addCriterion("locked_table =", value, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableNotEqualTo(String value) {
            addCriterion("locked_table <>", value, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableGreaterThan(String value) {
            addCriterion("locked_table >", value, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableGreaterThanOrEqualTo(String value) {
            addCriterion("locked_table >=", value, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableLessThan(String value) {
            addCriterion("locked_table <", value, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableLessThanOrEqualTo(String value) {
            addCriterion("locked_table <=", value, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableLike(String value) {
            addCriterion("locked_table like", value, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableNotLike(String value) {
            addCriterion("locked_table not like", value, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableIn(List<String> values) {
            addCriterion("locked_table in", values, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableNotIn(List<String> values) {
            addCriterion("locked_table not in", values, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableBetween(String value1, String value2) {
            addCriterion("locked_table between", value1, value2, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedTableNotBetween(String value1, String value2) {
            addCriterion("locked_table not between", value1, value2, "lockedTable");
            return (Criteria) this;
        }

        public Criteria andLockedIndexIsNull() {
            addCriterion("locked_index is null");
            return (Criteria) this;
        }

        public Criteria andLockedIndexIsNotNull() {
            addCriterion("locked_index is not null");
            return (Criteria) this;
        }

        public Criteria andLockedIndexEqualTo(String value) {
            addCriterion("locked_index =", value, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexNotEqualTo(String value) {
            addCriterion("locked_index <>", value, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexGreaterThan(String value) {
            addCriterion("locked_index >", value, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexGreaterThanOrEqualTo(String value) {
            addCriterion("locked_index >=", value, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexLessThan(String value) {
            addCriterion("locked_index <", value, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexLessThanOrEqualTo(String value) {
            addCriterion("locked_index <=", value, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexLike(String value) {
            addCriterion("locked_index like", value, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexNotLike(String value) {
            addCriterion("locked_index not like", value, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexIn(List<String> values) {
            addCriterion("locked_index in", values, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexNotIn(List<String> values) {
            addCriterion("locked_index not in", values, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexBetween(String value1, String value2) {
            addCriterion("locked_index between", value1, value2, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedIndexNotBetween(String value1, String value2) {
            addCriterion("locked_index not between", value1, value2, "lockedIndex");
            return (Criteria) this;
        }

        public Criteria andLockedTypeIsNull() {
            addCriterion("locked_type is null");
            return (Criteria) this;
        }

        public Criteria andLockedTypeIsNotNull() {
            addCriterion("locked_type is not null");
            return (Criteria) this;
        }

        public Criteria andLockedTypeEqualTo(String value) {
            addCriterion("locked_type =", value, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeNotEqualTo(String value) {
            addCriterion("locked_type <>", value, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeGreaterThan(String value) {
            addCriterion("locked_type >", value, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("locked_type >=", value, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeLessThan(String value) {
            addCriterion("locked_type <", value, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeLessThanOrEqualTo(String value) {
            addCriterion("locked_type <=", value, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeLike(String value) {
            addCriterion("locked_type like", value, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeNotLike(String value) {
            addCriterion("locked_type not like", value, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeIn(List<String> values) {
            addCriterion("locked_type in", values, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeNotIn(List<String> values) {
            addCriterion("locked_type not in", values, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeBetween(String value1, String value2) {
            addCriterion("locked_type between", value1, value2, "lockedType");
            return (Criteria) this;
        }

        public Criteria andLockedTypeNotBetween(String value1, String value2) {
            addCriterion("locked_type not between", value1, value2, "lockedType");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdIsNull() {
            addCriterion("waiting_trx_id is null");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdIsNotNull() {
            addCriterion("waiting_trx_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdEqualTo(String value) {
            addCriterion("waiting_trx_id =", value, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdNotEqualTo(String value) {
            addCriterion("waiting_trx_id <>", value, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdGreaterThan(String value) {
            addCriterion("waiting_trx_id >", value, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_trx_id >=", value, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdLessThan(String value) {
            addCriterion("waiting_trx_id <", value, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdLessThanOrEqualTo(String value) {
            addCriterion("waiting_trx_id <=", value, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdLike(String value) {
            addCriterion("waiting_trx_id like", value, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdNotLike(String value) {
            addCriterion("waiting_trx_id not like", value, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdIn(List<String> values) {
            addCriterion("waiting_trx_id in", values, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdNotIn(List<String> values) {
            addCriterion("waiting_trx_id not in", values, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdBetween(String value1, String value2) {
            addCriterion("waiting_trx_id between", value1, value2, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxIdNotBetween(String value1, String value2) {
            addCriterion("waiting_trx_id not between", value1, value2, "waitingTrxId");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedIsNull() {
            addCriterion("waiting_trx_started is null");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedIsNotNull() {
            addCriterion("waiting_trx_started is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedEqualTo(Date value) {
            addCriterion("waiting_trx_started =", value, "waitingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedNotEqualTo(Date value) {
            addCriterion("waiting_trx_started <>", value, "waitingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedGreaterThan(Date value) {
            addCriterion("waiting_trx_started >", value, "waitingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedGreaterThanOrEqualTo(Date value) {
            addCriterion("waiting_trx_started >=", value, "waitingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedLessThan(Date value) {
            addCriterion("waiting_trx_started <", value, "waitingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedLessThanOrEqualTo(Date value) {
            addCriterion("waiting_trx_started <=", value, "waitingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedIn(List<Date> values) {
            addCriterion("waiting_trx_started in", values, "waitingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedNotIn(List<Date> values) {
            addCriterion("waiting_trx_started not in", values, "waitingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedBetween(Date value1, Date value2) {
            addCriterion("waiting_trx_started between", value1, value2, "waitingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxStartedNotBetween(Date value1, Date value2) {
            addCriterion("waiting_trx_started not between", value1, value2, "waitingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeIsNull() {
            addCriterion("waiting_trx_age is null");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeIsNotNull() {
            addCriterion("waiting_trx_age is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeEqualTo(Date value) {
            addCriterionForJDBCTime("waiting_trx_age =", value, "waitingTrxAge");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeNotEqualTo(Date value) {
            addCriterionForJDBCTime("waiting_trx_age <>", value, "waitingTrxAge");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeGreaterThan(Date value) {
            addCriterionForJDBCTime("waiting_trx_age >", value, "waitingTrxAge");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("waiting_trx_age >=", value, "waitingTrxAge");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeLessThan(Date value) {
            addCriterionForJDBCTime("waiting_trx_age <", value, "waitingTrxAge");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("waiting_trx_age <=", value, "waitingTrxAge");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeIn(List<Date> values) {
            addCriterionForJDBCTime("waiting_trx_age in", values, "waitingTrxAge");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeNotIn(List<Date> values) {
            addCriterionForJDBCTime("waiting_trx_age not in", values, "waitingTrxAge");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("waiting_trx_age between", value1, value2, "waitingTrxAge");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxAgeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("waiting_trx_age not between", value1, value2, "waitingTrxAge");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedIsNull() {
            addCriterion("waiting_trx_rows_locked is null");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedIsNotNull() {
            addCriterion("waiting_trx_rows_locked is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedEqualTo(Long value) {
            addCriterion("waiting_trx_rows_locked =", value, "waitingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedNotEqualTo(Long value) {
            addCriterion("waiting_trx_rows_locked <>", value, "waitingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedGreaterThan(Long value) {
            addCriterion("waiting_trx_rows_locked >", value, "waitingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedGreaterThanOrEqualTo(Long value) {
            addCriterion("waiting_trx_rows_locked >=", value, "waitingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedLessThan(Long value) {
            addCriterion("waiting_trx_rows_locked <", value, "waitingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedLessThanOrEqualTo(Long value) {
            addCriterion("waiting_trx_rows_locked <=", value, "waitingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedIn(List<Long> values) {
            addCriterion("waiting_trx_rows_locked in", values, "waitingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedNotIn(List<Long> values) {
            addCriterion("waiting_trx_rows_locked not in", values, "waitingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedBetween(Long value1, Long value2) {
            addCriterion("waiting_trx_rows_locked between", value1, value2, "waitingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsLockedNotBetween(Long value1, Long value2) {
            addCriterion("waiting_trx_rows_locked not between", value1, value2, "waitingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedIsNull() {
            addCriterion("waiting_trx_rows_modified is null");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedIsNotNull() {
            addCriterion("waiting_trx_rows_modified is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedEqualTo(Long value) {
            addCriterion("waiting_trx_rows_modified =", value, "waitingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedNotEqualTo(Long value) {
            addCriterion("waiting_trx_rows_modified <>", value, "waitingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedGreaterThan(Long value) {
            addCriterion("waiting_trx_rows_modified >", value, "waitingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("waiting_trx_rows_modified >=", value, "waitingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedLessThan(Long value) {
            addCriterion("waiting_trx_rows_modified <", value, "waitingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedLessThanOrEqualTo(Long value) {
            addCriterion("waiting_trx_rows_modified <=", value, "waitingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedIn(List<Long> values) {
            addCriterion("waiting_trx_rows_modified in", values, "waitingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedNotIn(List<Long> values) {
            addCriterion("waiting_trx_rows_modified not in", values, "waitingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedBetween(Long value1, Long value2) {
            addCriterion("waiting_trx_rows_modified between", value1, value2, "waitingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andWaitingTrxRowsModifiedNotBetween(Long value1, Long value2) {
            addCriterion("waiting_trx_rows_modified not between", value1, value2, "waitingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andWaitingPidIsNull() {
            addCriterion("waiting_pid is null");
            return (Criteria) this;
        }

        public Criteria andWaitingPidIsNotNull() {
            addCriterion("waiting_pid is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingPidEqualTo(Long value) {
            addCriterion("waiting_pid =", value, "waitingPid");
            return (Criteria) this;
        }

        public Criteria andWaitingPidNotEqualTo(Long value) {
            addCriterion("waiting_pid <>", value, "waitingPid");
            return (Criteria) this;
        }

        public Criteria andWaitingPidGreaterThan(Long value) {
            addCriterion("waiting_pid >", value, "waitingPid");
            return (Criteria) this;
        }

        public Criteria andWaitingPidGreaterThanOrEqualTo(Long value) {
            addCriterion("waiting_pid >=", value, "waitingPid");
            return (Criteria) this;
        }

        public Criteria andWaitingPidLessThan(Long value) {
            addCriterion("waiting_pid <", value, "waitingPid");
            return (Criteria) this;
        }

        public Criteria andWaitingPidLessThanOrEqualTo(Long value) {
            addCriterion("waiting_pid <=", value, "waitingPid");
            return (Criteria) this;
        }

        public Criteria andWaitingPidIn(List<Long> values) {
            addCriterion("waiting_pid in", values, "waitingPid");
            return (Criteria) this;
        }

        public Criteria andWaitingPidNotIn(List<Long> values) {
            addCriterion("waiting_pid not in", values, "waitingPid");
            return (Criteria) this;
        }

        public Criteria andWaitingPidBetween(Long value1, Long value2) {
            addCriterion("waiting_pid between", value1, value2, "waitingPid");
            return (Criteria) this;
        }

        public Criteria andWaitingPidNotBetween(Long value1, Long value2) {
            addCriterion("waiting_pid not between", value1, value2, "waitingPid");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryIsNull() {
            addCriterion("waiting_query is null");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryIsNotNull() {
            addCriterion("waiting_query is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryEqualTo(String value) {
            addCriterion("waiting_query =", value, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryNotEqualTo(String value) {
            addCriterion("waiting_query <>", value, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryGreaterThan(String value) {
            addCriterion("waiting_query >", value, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_query >=", value, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryLessThan(String value) {
            addCriterion("waiting_query <", value, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryLessThanOrEqualTo(String value) {
            addCriterion("waiting_query <=", value, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryLike(String value) {
            addCriterion("waiting_query like", value, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryNotLike(String value) {
            addCriterion("waiting_query not like", value, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryIn(List<String> values) {
            addCriterion("waiting_query in", values, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryNotIn(List<String> values) {
            addCriterion("waiting_query not in", values, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryBetween(String value1, String value2) {
            addCriterion("waiting_query between", value1, value2, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryNotBetween(String value1, String value2) {
            addCriterion("waiting_query not between", value1, value2, "waitingQuery");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdIsNull() {
            addCriterion("waiting_lock_id is null");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdIsNotNull() {
            addCriterion("waiting_lock_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdEqualTo(String value) {
            addCriterion("waiting_lock_id =", value, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdNotEqualTo(String value) {
            addCriterion("waiting_lock_id <>", value, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdGreaterThan(String value) {
            addCriterion("waiting_lock_id >", value, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_lock_id >=", value, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdLessThan(String value) {
            addCriterion("waiting_lock_id <", value, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdLessThanOrEqualTo(String value) {
            addCriterion("waiting_lock_id <=", value, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdLike(String value) {
            addCriterion("waiting_lock_id like", value, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdNotLike(String value) {
            addCriterion("waiting_lock_id not like", value, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdIn(List<String> values) {
            addCriterion("waiting_lock_id in", values, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdNotIn(List<String> values) {
            addCriterion("waiting_lock_id not in", values, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdBetween(String value1, String value2) {
            addCriterion("waiting_lock_id between", value1, value2, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockIdNotBetween(String value1, String value2) {
            addCriterion("waiting_lock_id not between", value1, value2, "waitingLockId");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeIsNull() {
            addCriterion("waiting_lock_mode is null");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeIsNotNull() {
            addCriterion("waiting_lock_mode is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeEqualTo(String value) {
            addCriterion("waiting_lock_mode =", value, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeNotEqualTo(String value) {
            addCriterion("waiting_lock_mode <>", value, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeGreaterThan(String value) {
            addCriterion("waiting_lock_mode >", value, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_lock_mode >=", value, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeLessThan(String value) {
            addCriterion("waiting_lock_mode <", value, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeLessThanOrEqualTo(String value) {
            addCriterion("waiting_lock_mode <=", value, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeLike(String value) {
            addCriterion("waiting_lock_mode like", value, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeNotLike(String value) {
            addCriterion("waiting_lock_mode not like", value, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeIn(List<String> values) {
            addCriterion("waiting_lock_mode in", values, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeNotIn(List<String> values) {
            addCriterion("waiting_lock_mode not in", values, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeBetween(String value1, String value2) {
            addCriterion("waiting_lock_mode between", value1, value2, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andWaitingLockModeNotBetween(String value1, String value2) {
            addCriterion("waiting_lock_mode not between", value1, value2, "waitingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdIsNull() {
            addCriterion("blocking_trx_id is null");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdIsNotNull() {
            addCriterion("blocking_trx_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdEqualTo(String value) {
            addCriterion("blocking_trx_id =", value, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdNotEqualTo(String value) {
            addCriterion("blocking_trx_id <>", value, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdGreaterThan(String value) {
            addCriterion("blocking_trx_id >", value, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdGreaterThanOrEqualTo(String value) {
            addCriterion("blocking_trx_id >=", value, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdLessThan(String value) {
            addCriterion("blocking_trx_id <", value, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdLessThanOrEqualTo(String value) {
            addCriterion("blocking_trx_id <=", value, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdLike(String value) {
            addCriterion("blocking_trx_id like", value, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdNotLike(String value) {
            addCriterion("blocking_trx_id not like", value, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdIn(List<String> values) {
            addCriterion("blocking_trx_id in", values, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdNotIn(List<String> values) {
            addCriterion("blocking_trx_id not in", values, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdBetween(String value1, String value2) {
            addCriterion("blocking_trx_id between", value1, value2, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxIdNotBetween(String value1, String value2) {
            addCriterion("blocking_trx_id not between", value1, value2, "blockingTrxId");
            return (Criteria) this;
        }

        public Criteria andBlockingPidIsNull() {
            addCriterion("blocking_pid is null");
            return (Criteria) this;
        }

        public Criteria andBlockingPidIsNotNull() {
            addCriterion("blocking_pid is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingPidEqualTo(Long value) {
            addCriterion("blocking_pid =", value, "blockingPid");
            return (Criteria) this;
        }

        public Criteria andBlockingPidNotEqualTo(Long value) {
            addCriterion("blocking_pid <>", value, "blockingPid");
            return (Criteria) this;
        }

        public Criteria andBlockingPidGreaterThan(Long value) {
            addCriterion("blocking_pid >", value, "blockingPid");
            return (Criteria) this;
        }

        public Criteria andBlockingPidGreaterThanOrEqualTo(Long value) {
            addCriterion("blocking_pid >=", value, "blockingPid");
            return (Criteria) this;
        }

        public Criteria andBlockingPidLessThan(Long value) {
            addCriterion("blocking_pid <", value, "blockingPid");
            return (Criteria) this;
        }

        public Criteria andBlockingPidLessThanOrEqualTo(Long value) {
            addCriterion("blocking_pid <=", value, "blockingPid");
            return (Criteria) this;
        }

        public Criteria andBlockingPidIn(List<Long> values) {
            addCriterion("blocking_pid in", values, "blockingPid");
            return (Criteria) this;
        }

        public Criteria andBlockingPidNotIn(List<Long> values) {
            addCriterion("blocking_pid not in", values, "blockingPid");
            return (Criteria) this;
        }

        public Criteria andBlockingPidBetween(Long value1, Long value2) {
            addCriterion("blocking_pid between", value1, value2, "blockingPid");
            return (Criteria) this;
        }

        public Criteria andBlockingPidNotBetween(Long value1, Long value2) {
            addCriterion("blocking_pid not between", value1, value2, "blockingPid");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryIsNull() {
            addCriterion("blocking_query is null");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryIsNotNull() {
            addCriterion("blocking_query is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryEqualTo(String value) {
            addCriterion("blocking_query =", value, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryNotEqualTo(String value) {
            addCriterion("blocking_query <>", value, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryGreaterThan(String value) {
            addCriterion("blocking_query >", value, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryGreaterThanOrEqualTo(String value) {
            addCriterion("blocking_query >=", value, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryLessThan(String value) {
            addCriterion("blocking_query <", value, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryLessThanOrEqualTo(String value) {
            addCriterion("blocking_query <=", value, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryLike(String value) {
            addCriterion("blocking_query like", value, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryNotLike(String value) {
            addCriterion("blocking_query not like", value, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryIn(List<String> values) {
            addCriterion("blocking_query in", values, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryNotIn(List<String> values) {
            addCriterion("blocking_query not in", values, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryBetween(String value1, String value2) {
            addCriterion("blocking_query between", value1, value2, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingQueryNotBetween(String value1, String value2) {
            addCriterion("blocking_query not between", value1, value2, "blockingQuery");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdIsNull() {
            addCriterion("blocking_lock_id is null");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdIsNotNull() {
            addCriterion("blocking_lock_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdEqualTo(String value) {
            addCriterion("blocking_lock_id =", value, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdNotEqualTo(String value) {
            addCriterion("blocking_lock_id <>", value, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdGreaterThan(String value) {
            addCriterion("blocking_lock_id >", value, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdGreaterThanOrEqualTo(String value) {
            addCriterion("blocking_lock_id >=", value, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdLessThan(String value) {
            addCriterion("blocking_lock_id <", value, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdLessThanOrEqualTo(String value) {
            addCriterion("blocking_lock_id <=", value, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdLike(String value) {
            addCriterion("blocking_lock_id like", value, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdNotLike(String value) {
            addCriterion("blocking_lock_id not like", value, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdIn(List<String> values) {
            addCriterion("blocking_lock_id in", values, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdNotIn(List<String> values) {
            addCriterion("blocking_lock_id not in", values, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdBetween(String value1, String value2) {
            addCriterion("blocking_lock_id between", value1, value2, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockIdNotBetween(String value1, String value2) {
            addCriterion("blocking_lock_id not between", value1, value2, "blockingLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeIsNull() {
            addCriterion("blocking_lock_mode is null");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeIsNotNull() {
            addCriterion("blocking_lock_mode is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeEqualTo(String value) {
            addCriterion("blocking_lock_mode =", value, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeNotEqualTo(String value) {
            addCriterion("blocking_lock_mode <>", value, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeGreaterThan(String value) {
            addCriterion("blocking_lock_mode >", value, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeGreaterThanOrEqualTo(String value) {
            addCriterion("blocking_lock_mode >=", value, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeLessThan(String value) {
            addCriterion("blocking_lock_mode <", value, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeLessThanOrEqualTo(String value) {
            addCriterion("blocking_lock_mode <=", value, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeLike(String value) {
            addCriterion("blocking_lock_mode like", value, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeNotLike(String value) {
            addCriterion("blocking_lock_mode not like", value, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeIn(List<String> values) {
            addCriterion("blocking_lock_mode in", values, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeNotIn(List<String> values) {
            addCriterion("blocking_lock_mode not in", values, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeBetween(String value1, String value2) {
            addCriterion("blocking_lock_mode between", value1, value2, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingLockModeNotBetween(String value1, String value2) {
            addCriterion("blocking_lock_mode not between", value1, value2, "blockingLockMode");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedIsNull() {
            addCriterion("blocking_trx_started is null");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedIsNotNull() {
            addCriterion("blocking_trx_started is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedEqualTo(Date value) {
            addCriterion("blocking_trx_started =", value, "blockingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedNotEqualTo(Date value) {
            addCriterion("blocking_trx_started <>", value, "blockingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedGreaterThan(Date value) {
            addCriterion("blocking_trx_started >", value, "blockingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedGreaterThanOrEqualTo(Date value) {
            addCriterion("blocking_trx_started >=", value, "blockingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedLessThan(Date value) {
            addCriterion("blocking_trx_started <", value, "blockingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedLessThanOrEqualTo(Date value) {
            addCriterion("blocking_trx_started <=", value, "blockingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedIn(List<Date> values) {
            addCriterion("blocking_trx_started in", values, "blockingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedNotIn(List<Date> values) {
            addCriterion("blocking_trx_started not in", values, "blockingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedBetween(Date value1, Date value2) {
            addCriterion("blocking_trx_started between", value1, value2, "blockingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxStartedNotBetween(Date value1, Date value2) {
            addCriterion("blocking_trx_started not between", value1, value2, "blockingTrxStarted");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeIsNull() {
            addCriterion("blocking_trx_age is null");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeIsNotNull() {
            addCriterion("blocking_trx_age is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeEqualTo(Date value) {
            addCriterionForJDBCTime("blocking_trx_age =", value, "blockingTrxAge");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeNotEqualTo(Date value) {
            addCriterionForJDBCTime("blocking_trx_age <>", value, "blockingTrxAge");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeGreaterThan(Date value) {
            addCriterionForJDBCTime("blocking_trx_age >", value, "blockingTrxAge");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("blocking_trx_age >=", value, "blockingTrxAge");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeLessThan(Date value) {
            addCriterionForJDBCTime("blocking_trx_age <", value, "blockingTrxAge");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("blocking_trx_age <=", value, "blockingTrxAge");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeIn(List<Date> values) {
            addCriterionForJDBCTime("blocking_trx_age in", values, "blockingTrxAge");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeNotIn(List<Date> values) {
            addCriterionForJDBCTime("blocking_trx_age not in", values, "blockingTrxAge");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("blocking_trx_age between", value1, value2, "blockingTrxAge");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxAgeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("blocking_trx_age not between", value1, value2, "blockingTrxAge");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedIsNull() {
            addCriterion("blocking_trx_rows_locked is null");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedIsNotNull() {
            addCriterion("blocking_trx_rows_locked is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedEqualTo(Long value) {
            addCriterion("blocking_trx_rows_locked =", value, "blockingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedNotEqualTo(Long value) {
            addCriterion("blocking_trx_rows_locked <>", value, "blockingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedGreaterThan(Long value) {
            addCriterion("blocking_trx_rows_locked >", value, "blockingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedGreaterThanOrEqualTo(Long value) {
            addCriterion("blocking_trx_rows_locked >=", value, "blockingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedLessThan(Long value) {
            addCriterion("blocking_trx_rows_locked <", value, "blockingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedLessThanOrEqualTo(Long value) {
            addCriterion("blocking_trx_rows_locked <=", value, "blockingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedIn(List<Long> values) {
            addCriterion("blocking_trx_rows_locked in", values, "blockingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedNotIn(List<Long> values) {
            addCriterion("blocking_trx_rows_locked not in", values, "blockingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedBetween(Long value1, Long value2) {
            addCriterion("blocking_trx_rows_locked between", value1, value2, "blockingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsLockedNotBetween(Long value1, Long value2) {
            addCriterion("blocking_trx_rows_locked not between", value1, value2, "blockingTrxRowsLocked");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedIsNull() {
            addCriterion("blocking_trx_rows_modified is null");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedIsNotNull() {
            addCriterion("blocking_trx_rows_modified is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedEqualTo(Long value) {
            addCriterion("blocking_trx_rows_modified =", value, "blockingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedNotEqualTo(Long value) {
            addCriterion("blocking_trx_rows_modified <>", value, "blockingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedGreaterThan(Long value) {
            addCriterion("blocking_trx_rows_modified >", value, "blockingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("blocking_trx_rows_modified >=", value, "blockingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedLessThan(Long value) {
            addCriterion("blocking_trx_rows_modified <", value, "blockingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedLessThanOrEqualTo(Long value) {
            addCriterion("blocking_trx_rows_modified <=", value, "blockingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedIn(List<Long> values) {
            addCriterion("blocking_trx_rows_modified in", values, "blockingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedNotIn(List<Long> values) {
            addCriterion("blocking_trx_rows_modified not in", values, "blockingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedBetween(Long value1, Long value2) {
            addCriterion("blocking_trx_rows_modified between", value1, value2, "blockingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andBlockingTrxRowsModifiedNotBetween(Long value1, Long value2) {
            addCriterion("blocking_trx_rows_modified not between", value1, value2, "blockingTrxRowsModified");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryIsNull() {
            addCriterion("sql_kill_blocking_query is null");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryIsNotNull() {
            addCriterion("sql_kill_blocking_query is not null");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryEqualTo(String value) {
            addCriterion("sql_kill_blocking_query =", value, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryNotEqualTo(String value) {
            addCriterion("sql_kill_blocking_query <>", value, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryGreaterThan(String value) {
            addCriterion("sql_kill_blocking_query >", value, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryGreaterThanOrEqualTo(String value) {
            addCriterion("sql_kill_blocking_query >=", value, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryLessThan(String value) {
            addCriterion("sql_kill_blocking_query <", value, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryLessThanOrEqualTo(String value) {
            addCriterion("sql_kill_blocking_query <=", value, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryLike(String value) {
            addCriterion("sql_kill_blocking_query like", value, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryNotLike(String value) {
            addCriterion("sql_kill_blocking_query not like", value, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryIn(List<String> values) {
            addCriterion("sql_kill_blocking_query in", values, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryNotIn(List<String> values) {
            addCriterion("sql_kill_blocking_query not in", values, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryBetween(String value1, String value2) {
            addCriterion("sql_kill_blocking_query between", value1, value2, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingQueryNotBetween(String value1, String value2) {
            addCriterion("sql_kill_blocking_query not between", value1, value2, "sqlKillBlockingQuery");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionIsNull() {
            addCriterion("sql_kill_blocking_connection is null");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionIsNotNull() {
            addCriterion("sql_kill_blocking_connection is not null");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionEqualTo(String value) {
            addCriterion("sql_kill_blocking_connection =", value, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionNotEqualTo(String value) {
            addCriterion("sql_kill_blocking_connection <>", value, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionGreaterThan(String value) {
            addCriterion("sql_kill_blocking_connection >", value, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionGreaterThanOrEqualTo(String value) {
            addCriterion("sql_kill_blocking_connection >=", value, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionLessThan(String value) {
            addCriterion("sql_kill_blocking_connection <", value, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionLessThanOrEqualTo(String value) {
            addCriterion("sql_kill_blocking_connection <=", value, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionLike(String value) {
            addCriterion("sql_kill_blocking_connection like", value, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionNotLike(String value) {
            addCriterion("sql_kill_blocking_connection not like", value, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionIn(List<String> values) {
            addCriterion("sql_kill_blocking_connection in", values, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionNotIn(List<String> values) {
            addCriterion("sql_kill_blocking_connection not in", values, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionBetween(String value1, String value2) {
            addCriterion("sql_kill_blocking_connection between", value1, value2, "sqlKillBlockingConnection");
            return (Criteria) this;
        }

        public Criteria andSqlKillBlockingConnectionNotBetween(String value1, String value2) {
            addCriterion("sql_kill_blocking_connection not between", value1, value2, "sqlKillBlockingConnection");
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