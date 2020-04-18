package cn.uaj.adminmaster.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SessionSslStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SessionSslStatusExample() {
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

        public Criteria andThreadIdIsNull() {
            addCriterion("thread_id is null");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNotNull() {
            addCriterion("thread_id is not null");
            return (Criteria) this;
        }

        public Criteria andThreadIdEqualTo(Long value) {
            addCriterion("thread_id =", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotEqualTo(Long value) {
            addCriterion("thread_id <>", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThan(Long value) {
            addCriterion("thread_id >", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("thread_id >=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThan(Long value) {
            addCriterion("thread_id <", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("thread_id <=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIn(List<Long> values) {
            addCriterion("thread_id in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotIn(List<Long> values) {
            addCriterion("thread_id not in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdBetween(Long value1, Long value2) {
            addCriterion("thread_id between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("thread_id not between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andSslVersionIsNull() {
            addCriterion("ssl_version is null");
            return (Criteria) this;
        }

        public Criteria andSslVersionIsNotNull() {
            addCriterion("ssl_version is not null");
            return (Criteria) this;
        }

        public Criteria andSslVersionEqualTo(String value) {
            addCriterion("ssl_version =", value, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionNotEqualTo(String value) {
            addCriterion("ssl_version <>", value, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionGreaterThan(String value) {
            addCriterion("ssl_version >", value, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionGreaterThanOrEqualTo(String value) {
            addCriterion("ssl_version >=", value, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionLessThan(String value) {
            addCriterion("ssl_version <", value, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionLessThanOrEqualTo(String value) {
            addCriterion("ssl_version <=", value, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionLike(String value) {
            addCriterion("ssl_version like", value, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionNotLike(String value) {
            addCriterion("ssl_version not like", value, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionIn(List<String> values) {
            addCriterion("ssl_version in", values, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionNotIn(List<String> values) {
            addCriterion("ssl_version not in", values, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionBetween(String value1, String value2) {
            addCriterion("ssl_version between", value1, value2, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslVersionNotBetween(String value1, String value2) {
            addCriterion("ssl_version not between", value1, value2, "sslVersion");
            return (Criteria) this;
        }

        public Criteria andSslCipherIsNull() {
            addCriterion("ssl_cipher is null");
            return (Criteria) this;
        }

        public Criteria andSslCipherIsNotNull() {
            addCriterion("ssl_cipher is not null");
            return (Criteria) this;
        }

        public Criteria andSslCipherEqualTo(String value) {
            addCriterion("ssl_cipher =", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherNotEqualTo(String value) {
            addCriterion("ssl_cipher <>", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherGreaterThan(String value) {
            addCriterion("ssl_cipher >", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherGreaterThanOrEqualTo(String value) {
            addCriterion("ssl_cipher >=", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherLessThan(String value) {
            addCriterion("ssl_cipher <", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherLessThanOrEqualTo(String value) {
            addCriterion("ssl_cipher <=", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherLike(String value) {
            addCriterion("ssl_cipher like", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherNotLike(String value) {
            addCriterion("ssl_cipher not like", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherIn(List<String> values) {
            addCriterion("ssl_cipher in", values, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherNotIn(List<String> values) {
            addCriterion("ssl_cipher not in", values, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherBetween(String value1, String value2) {
            addCriterion("ssl_cipher between", value1, value2, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherNotBetween(String value1, String value2) {
            addCriterion("ssl_cipher not between", value1, value2, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedIsNull() {
            addCriterion("ssl_sessions_reused is null");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedIsNotNull() {
            addCriterion("ssl_sessions_reused is not null");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedEqualTo(String value) {
            addCriterion("ssl_sessions_reused =", value, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedNotEqualTo(String value) {
            addCriterion("ssl_sessions_reused <>", value, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedGreaterThan(String value) {
            addCriterion("ssl_sessions_reused >", value, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedGreaterThanOrEqualTo(String value) {
            addCriterion("ssl_sessions_reused >=", value, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedLessThan(String value) {
            addCriterion("ssl_sessions_reused <", value, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedLessThanOrEqualTo(String value) {
            addCriterion("ssl_sessions_reused <=", value, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedLike(String value) {
            addCriterion("ssl_sessions_reused like", value, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedNotLike(String value) {
            addCriterion("ssl_sessions_reused not like", value, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedIn(List<String> values) {
            addCriterion("ssl_sessions_reused in", values, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedNotIn(List<String> values) {
            addCriterion("ssl_sessions_reused not in", values, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedBetween(String value1, String value2) {
            addCriterion("ssl_sessions_reused between", value1, value2, "sslSessionsReused");
            return (Criteria) this;
        }

        public Criteria andSslSessionsReusedNotBetween(String value1, String value2) {
            addCriterion("ssl_sessions_reused not between", value1, value2, "sslSessionsReused");
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