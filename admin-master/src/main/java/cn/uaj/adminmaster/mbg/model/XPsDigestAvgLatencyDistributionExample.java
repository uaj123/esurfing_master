package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XPsDigestAvgLatencyDistributionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XPsDigestAvgLatencyDistributionExample() {
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

        public Criteria andCntIsNull() {
            addCriterion("cnt is null");
            return (Criteria) this;
        }

        public Criteria andCntIsNotNull() {
            addCriterion("cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCntEqualTo(Long value) {
            addCriterion("cnt =", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntNotEqualTo(Long value) {
            addCriterion("cnt <>", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntGreaterThan(Long value) {
            addCriterion("cnt >", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntGreaterThanOrEqualTo(Long value) {
            addCriterion("cnt >=", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntLessThan(Long value) {
            addCriterion("cnt <", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntLessThanOrEqualTo(Long value) {
            addCriterion("cnt <=", value, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntIn(List<Long> values) {
            addCriterion("cnt in", values, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntNotIn(List<Long> values) {
            addCriterion("cnt not in", values, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntBetween(Long value1, Long value2) {
            addCriterion("cnt between", value1, value2, "cnt");
            return (Criteria) this;
        }

        public Criteria andCntNotBetween(Long value1, Long value2) {
            addCriterion("cnt not between", value1, value2, "cnt");
            return (Criteria) this;
        }

        public Criteria andAvgUsIsNull() {
            addCriterion("avg_us is null");
            return (Criteria) this;
        }

        public Criteria andAvgUsIsNotNull() {
            addCriterion("avg_us is not null");
            return (Criteria) this;
        }

        public Criteria andAvgUsEqualTo(BigDecimal value) {
            addCriterion("avg_us =", value, "avgUs");
            return (Criteria) this;
        }

        public Criteria andAvgUsNotEqualTo(BigDecimal value) {
            addCriterion("avg_us <>", value, "avgUs");
            return (Criteria) this;
        }

        public Criteria andAvgUsGreaterThan(BigDecimal value) {
            addCriterion("avg_us >", value, "avgUs");
            return (Criteria) this;
        }

        public Criteria andAvgUsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_us >=", value, "avgUs");
            return (Criteria) this;
        }

        public Criteria andAvgUsLessThan(BigDecimal value) {
            addCriterion("avg_us <", value, "avgUs");
            return (Criteria) this;
        }

        public Criteria andAvgUsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_us <=", value, "avgUs");
            return (Criteria) this;
        }

        public Criteria andAvgUsIn(List<BigDecimal> values) {
            addCriterion("avg_us in", values, "avgUs");
            return (Criteria) this;
        }

        public Criteria andAvgUsNotIn(List<BigDecimal> values) {
            addCriterion("avg_us not in", values, "avgUs");
            return (Criteria) this;
        }

        public Criteria andAvgUsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_us between", value1, value2, "avgUs");
            return (Criteria) this;
        }

        public Criteria andAvgUsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_us not between", value1, value2, "avgUs");
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