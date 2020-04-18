package cn.uaj.adminmaster.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SchemaTableLockWaitsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchemaTableLockWaitsExample() {
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

        public Criteria andObjectSchemaIsNull() {
            addCriterion("object_schema is null");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIsNotNull() {
            addCriterion("object_schema is not null");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaEqualTo(String value) {
            addCriterion("object_schema =", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotEqualTo(String value) {
            addCriterion("object_schema <>", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaGreaterThan(String value) {
            addCriterion("object_schema >", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("object_schema >=", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLessThan(String value) {
            addCriterion("object_schema <", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLessThanOrEqualTo(String value) {
            addCriterion("object_schema <=", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLike(String value) {
            addCriterion("object_schema like", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotLike(String value) {
            addCriterion("object_schema not like", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIn(List<String> values) {
            addCriterion("object_schema in", values, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotIn(List<String> values) {
            addCriterion("object_schema not in", values, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaBetween(String value1, String value2) {
            addCriterion("object_schema between", value1, value2, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotBetween(String value1, String value2) {
            addCriterion("object_schema not between", value1, value2, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNull() {
            addCriterion("object_name is null");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNotNull() {
            addCriterion("object_name is not null");
            return (Criteria) this;
        }

        public Criteria andObjectNameEqualTo(String value) {
            addCriterion("object_name =", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotEqualTo(String value) {
            addCriterion("object_name <>", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThan(String value) {
            addCriterion("object_name >", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("object_name >=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThan(String value) {
            addCriterion("object_name <", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThanOrEqualTo(String value) {
            addCriterion("object_name <=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLike(String value) {
            addCriterion("object_name like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotLike(String value) {
            addCriterion("object_name not like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameIn(List<String> values) {
            addCriterion("object_name in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotIn(List<String> values) {
            addCriterion("object_name not in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameBetween(String value1, String value2) {
            addCriterion("object_name between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotBetween(String value1, String value2) {
            addCriterion("object_name not between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdIsNull() {
            addCriterion("waiting_thread_id is null");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdIsNotNull() {
            addCriterion("waiting_thread_id is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdEqualTo(Long value) {
            addCriterion("waiting_thread_id =", value, "waitingThreadId");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdNotEqualTo(Long value) {
            addCriterion("waiting_thread_id <>", value, "waitingThreadId");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdGreaterThan(Long value) {
            addCriterion("waiting_thread_id >", value, "waitingThreadId");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("waiting_thread_id >=", value, "waitingThreadId");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdLessThan(Long value) {
            addCriterion("waiting_thread_id <", value, "waitingThreadId");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("waiting_thread_id <=", value, "waitingThreadId");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdIn(List<Long> values) {
            addCriterion("waiting_thread_id in", values, "waitingThreadId");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdNotIn(List<Long> values) {
            addCriterion("waiting_thread_id not in", values, "waitingThreadId");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdBetween(Long value1, Long value2) {
            addCriterion("waiting_thread_id between", value1, value2, "waitingThreadId");
            return (Criteria) this;
        }

        public Criteria andWaitingThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("waiting_thread_id not between", value1, value2, "waitingThreadId");
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

        public Criteria andWaitingLockTypeIsNull() {
            addCriterion("waiting_lock_type is null");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeIsNotNull() {
            addCriterion("waiting_lock_type is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeEqualTo(String value) {
            addCriterion("waiting_lock_type =", value, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeNotEqualTo(String value) {
            addCriterion("waiting_lock_type <>", value, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeGreaterThan(String value) {
            addCriterion("waiting_lock_type >", value, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_lock_type >=", value, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeLessThan(String value) {
            addCriterion("waiting_lock_type <", value, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeLessThanOrEqualTo(String value) {
            addCriterion("waiting_lock_type <=", value, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeLike(String value) {
            addCriterion("waiting_lock_type like", value, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeNotLike(String value) {
            addCriterion("waiting_lock_type not like", value, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeIn(List<String> values) {
            addCriterion("waiting_lock_type in", values, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeNotIn(List<String> values) {
            addCriterion("waiting_lock_type not in", values, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeBetween(String value1, String value2) {
            addCriterion("waiting_lock_type between", value1, value2, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockTypeNotBetween(String value1, String value2) {
            addCriterion("waiting_lock_type not between", value1, value2, "waitingLockType");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationIsNull() {
            addCriterion("waiting_lock_duration is null");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationIsNotNull() {
            addCriterion("waiting_lock_duration is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationEqualTo(String value) {
            addCriterion("waiting_lock_duration =", value, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationNotEqualTo(String value) {
            addCriterion("waiting_lock_duration <>", value, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationGreaterThan(String value) {
            addCriterion("waiting_lock_duration >", value, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_lock_duration >=", value, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationLessThan(String value) {
            addCriterion("waiting_lock_duration <", value, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationLessThanOrEqualTo(String value) {
            addCriterion("waiting_lock_duration <=", value, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationLike(String value) {
            addCriterion("waiting_lock_duration like", value, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationNotLike(String value) {
            addCriterion("waiting_lock_duration not like", value, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationIn(List<String> values) {
            addCriterion("waiting_lock_duration in", values, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationNotIn(List<String> values) {
            addCriterion("waiting_lock_duration not in", values, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationBetween(String value1, String value2) {
            addCriterion("waiting_lock_duration between", value1, value2, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingLockDurationNotBetween(String value1, String value2) {
            addCriterion("waiting_lock_duration not between", value1, value2, "waitingLockDuration");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsIsNull() {
            addCriterion("waiting_query_secs is null");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsIsNotNull() {
            addCriterion("waiting_query_secs is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsEqualTo(Long value) {
            addCriterion("waiting_query_secs =", value, "waitingQuerySecs");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsNotEqualTo(Long value) {
            addCriterion("waiting_query_secs <>", value, "waitingQuerySecs");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsGreaterThan(Long value) {
            addCriterion("waiting_query_secs >", value, "waitingQuerySecs");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsGreaterThanOrEqualTo(Long value) {
            addCriterion("waiting_query_secs >=", value, "waitingQuerySecs");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsLessThan(Long value) {
            addCriterion("waiting_query_secs <", value, "waitingQuerySecs");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsLessThanOrEqualTo(Long value) {
            addCriterion("waiting_query_secs <=", value, "waitingQuerySecs");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsIn(List<Long> values) {
            addCriterion("waiting_query_secs in", values, "waitingQuerySecs");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsNotIn(List<Long> values) {
            addCriterion("waiting_query_secs not in", values, "waitingQuerySecs");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsBetween(Long value1, Long value2) {
            addCriterion("waiting_query_secs between", value1, value2, "waitingQuerySecs");
            return (Criteria) this;
        }

        public Criteria andWaitingQuerySecsNotBetween(Long value1, Long value2) {
            addCriterion("waiting_query_secs not between", value1, value2, "waitingQuerySecs");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedIsNull() {
            addCriterion("waiting_query_rows_affected is null");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedIsNotNull() {
            addCriterion("waiting_query_rows_affected is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedEqualTo(Long value) {
            addCriterion("waiting_query_rows_affected =", value, "waitingQueryRowsAffected");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedNotEqualTo(Long value) {
            addCriterion("waiting_query_rows_affected <>", value, "waitingQueryRowsAffected");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedGreaterThan(Long value) {
            addCriterion("waiting_query_rows_affected >", value, "waitingQueryRowsAffected");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedGreaterThanOrEqualTo(Long value) {
            addCriterion("waiting_query_rows_affected >=", value, "waitingQueryRowsAffected");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedLessThan(Long value) {
            addCriterion("waiting_query_rows_affected <", value, "waitingQueryRowsAffected");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedLessThanOrEqualTo(Long value) {
            addCriterion("waiting_query_rows_affected <=", value, "waitingQueryRowsAffected");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedIn(List<Long> values) {
            addCriterion("waiting_query_rows_affected in", values, "waitingQueryRowsAffected");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedNotIn(List<Long> values) {
            addCriterion("waiting_query_rows_affected not in", values, "waitingQueryRowsAffected");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedBetween(Long value1, Long value2) {
            addCriterion("waiting_query_rows_affected between", value1, value2, "waitingQueryRowsAffected");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsAffectedNotBetween(Long value1, Long value2) {
            addCriterion("waiting_query_rows_affected not between", value1, value2, "waitingQueryRowsAffected");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedIsNull() {
            addCriterion("waiting_query_rows_examined is null");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedIsNotNull() {
            addCriterion("waiting_query_rows_examined is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedEqualTo(Long value) {
            addCriterion("waiting_query_rows_examined =", value, "waitingQueryRowsExamined");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedNotEqualTo(Long value) {
            addCriterion("waiting_query_rows_examined <>", value, "waitingQueryRowsExamined");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedGreaterThan(Long value) {
            addCriterion("waiting_query_rows_examined >", value, "waitingQueryRowsExamined");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedGreaterThanOrEqualTo(Long value) {
            addCriterion("waiting_query_rows_examined >=", value, "waitingQueryRowsExamined");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedLessThan(Long value) {
            addCriterion("waiting_query_rows_examined <", value, "waitingQueryRowsExamined");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedLessThanOrEqualTo(Long value) {
            addCriterion("waiting_query_rows_examined <=", value, "waitingQueryRowsExamined");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedIn(List<Long> values) {
            addCriterion("waiting_query_rows_examined in", values, "waitingQueryRowsExamined");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedNotIn(List<Long> values) {
            addCriterion("waiting_query_rows_examined not in", values, "waitingQueryRowsExamined");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedBetween(Long value1, Long value2) {
            addCriterion("waiting_query_rows_examined between", value1, value2, "waitingQueryRowsExamined");
            return (Criteria) this;
        }

        public Criteria andWaitingQueryRowsExaminedNotBetween(Long value1, Long value2) {
            addCriterion("waiting_query_rows_examined not between", value1, value2, "waitingQueryRowsExamined");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdIsNull() {
            addCriterion("blocking_thread_id is null");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdIsNotNull() {
            addCriterion("blocking_thread_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdEqualTo(Long value) {
            addCriterion("blocking_thread_id =", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdNotEqualTo(Long value) {
            addCriterion("blocking_thread_id <>", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdGreaterThan(Long value) {
            addCriterion("blocking_thread_id >", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("blocking_thread_id >=", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdLessThan(Long value) {
            addCriterion("blocking_thread_id <", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("blocking_thread_id <=", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdIn(List<Long> values) {
            addCriterion("blocking_thread_id in", values, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdNotIn(List<Long> values) {
            addCriterion("blocking_thread_id not in", values, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdBetween(Long value1, Long value2) {
            addCriterion("blocking_thread_id between", value1, value2, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("blocking_thread_id not between", value1, value2, "blockingThreadId");
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

        public Criteria andBlockingLockTypeIsNull() {
            addCriterion("blocking_lock_type is null");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeIsNotNull() {
            addCriterion("blocking_lock_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeEqualTo(String value) {
            addCriterion("blocking_lock_type =", value, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeNotEqualTo(String value) {
            addCriterion("blocking_lock_type <>", value, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeGreaterThan(String value) {
            addCriterion("blocking_lock_type >", value, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("blocking_lock_type >=", value, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeLessThan(String value) {
            addCriterion("blocking_lock_type <", value, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeLessThanOrEqualTo(String value) {
            addCriterion("blocking_lock_type <=", value, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeLike(String value) {
            addCriterion("blocking_lock_type like", value, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeNotLike(String value) {
            addCriterion("blocking_lock_type not like", value, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeIn(List<String> values) {
            addCriterion("blocking_lock_type in", values, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeNotIn(List<String> values) {
            addCriterion("blocking_lock_type not in", values, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeBetween(String value1, String value2) {
            addCriterion("blocking_lock_type between", value1, value2, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockTypeNotBetween(String value1, String value2) {
            addCriterion("blocking_lock_type not between", value1, value2, "blockingLockType");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationIsNull() {
            addCriterion("blocking_lock_duration is null");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationIsNotNull() {
            addCriterion("blocking_lock_duration is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationEqualTo(String value) {
            addCriterion("blocking_lock_duration =", value, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationNotEqualTo(String value) {
            addCriterion("blocking_lock_duration <>", value, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationGreaterThan(String value) {
            addCriterion("blocking_lock_duration >", value, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationGreaterThanOrEqualTo(String value) {
            addCriterion("blocking_lock_duration >=", value, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationLessThan(String value) {
            addCriterion("blocking_lock_duration <", value, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationLessThanOrEqualTo(String value) {
            addCriterion("blocking_lock_duration <=", value, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationLike(String value) {
            addCriterion("blocking_lock_duration like", value, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationNotLike(String value) {
            addCriterion("blocking_lock_duration not like", value, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationIn(List<String> values) {
            addCriterion("blocking_lock_duration in", values, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationNotIn(List<String> values) {
            addCriterion("blocking_lock_duration not in", values, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationBetween(String value1, String value2) {
            addCriterion("blocking_lock_duration between", value1, value2, "blockingLockDuration");
            return (Criteria) this;
        }

        public Criteria andBlockingLockDurationNotBetween(String value1, String value2) {
            addCriterion("blocking_lock_duration not between", value1, value2, "blockingLockDuration");
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