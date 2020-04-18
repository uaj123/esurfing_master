package cn.uaj.adminmaster.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class MemoryGlobalByCurrentBytesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemoryGlobalByCurrentBytesExample() {
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

        public Criteria andCurrentCountIsNull() {
            addCriterion("current_count is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCountIsNotNull() {
            addCriterion("current_count is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCountEqualTo(Long value) {
            addCriterion("current_count =", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountNotEqualTo(Long value) {
            addCriterion("current_count <>", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountGreaterThan(Long value) {
            addCriterion("current_count >", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountGreaterThanOrEqualTo(Long value) {
            addCriterion("current_count >=", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountLessThan(Long value) {
            addCriterion("current_count <", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountLessThanOrEqualTo(Long value) {
            addCriterion("current_count <=", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountIn(List<Long> values) {
            addCriterion("current_count in", values, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountNotIn(List<Long> values) {
            addCriterion("current_count not in", values, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountBetween(Long value1, Long value2) {
            addCriterion("current_count between", value1, value2, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountNotBetween(Long value1, Long value2) {
            addCriterion("current_count not between", value1, value2, "currentCount");
            return (Criteria) this;
        }

        public Criteria andHighCountIsNull() {
            addCriterion("high_count is null");
            return (Criteria) this;
        }

        public Criteria andHighCountIsNotNull() {
            addCriterion("high_count is not null");
            return (Criteria) this;
        }

        public Criteria andHighCountEqualTo(Long value) {
            addCriterion("high_count =", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountNotEqualTo(Long value) {
            addCriterion("high_count <>", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountGreaterThan(Long value) {
            addCriterion("high_count >", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountGreaterThanOrEqualTo(Long value) {
            addCriterion("high_count >=", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountLessThan(Long value) {
            addCriterion("high_count <", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountLessThanOrEqualTo(Long value) {
            addCriterion("high_count <=", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountIn(List<Long> values) {
            addCriterion("high_count in", values, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountNotIn(List<Long> values) {
            addCriterion("high_count not in", values, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountBetween(Long value1, Long value2) {
            addCriterion("high_count between", value1, value2, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountNotBetween(Long value1, Long value2) {
            addCriterion("high_count not between", value1, value2, "highCount");
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