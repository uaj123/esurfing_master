package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XMemoryByUserByCurrentBytesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XMemoryByUserByCurrentBytesExample() {
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

        public Criteria andCurrentCountUsedIsNull() {
            addCriterion("current_count_used is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedIsNotNull() {
            addCriterion("current_count_used is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedEqualTo(BigDecimal value) {
            addCriterion("current_count_used =", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedNotEqualTo(BigDecimal value) {
            addCriterion("current_count_used <>", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedGreaterThan(BigDecimal value) {
            addCriterion("current_count_used >", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_count_used >=", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedLessThan(BigDecimal value) {
            addCriterion("current_count_used <", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_count_used <=", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedIn(List<BigDecimal> values) {
            addCriterion("current_count_used in", values, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedNotIn(List<BigDecimal> values) {
            addCriterion("current_count_used not in", values, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_count_used between", value1, value2, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_count_used not between", value1, value2, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedIsNull() {
            addCriterion("current_allocated is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedIsNotNull() {
            addCriterion("current_allocated is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedEqualTo(BigDecimal value) {
            addCriterion("current_allocated =", value, "currentAllocated");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedNotEqualTo(BigDecimal value) {
            addCriterion("current_allocated <>", value, "currentAllocated");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedGreaterThan(BigDecimal value) {
            addCriterion("current_allocated >", value, "currentAllocated");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_allocated >=", value, "currentAllocated");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedLessThan(BigDecimal value) {
            addCriterion("current_allocated <", value, "currentAllocated");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_allocated <=", value, "currentAllocated");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedIn(List<BigDecimal> values) {
            addCriterion("current_allocated in", values, "currentAllocated");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedNotIn(List<BigDecimal> values) {
            addCriterion("current_allocated not in", values, "currentAllocated");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_allocated between", value1, value2, "currentAllocated");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocatedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_allocated not between", value1, value2, "currentAllocated");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocIsNull() {
            addCriterion("current_avg_alloc is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocIsNotNull() {
            addCriterion("current_avg_alloc is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocEqualTo(BigDecimal value) {
            addCriterion("current_avg_alloc =", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocNotEqualTo(BigDecimal value) {
            addCriterion("current_avg_alloc <>", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocGreaterThan(BigDecimal value) {
            addCriterion("current_avg_alloc >", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_avg_alloc >=", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocLessThan(BigDecimal value) {
            addCriterion("current_avg_alloc <", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_avg_alloc <=", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocIn(List<BigDecimal> values) {
            addCriterion("current_avg_alloc in", values, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocNotIn(List<BigDecimal> values) {
            addCriterion("current_avg_alloc not in", values, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_avg_alloc between", value1, value2, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_avg_alloc not between", value1, value2, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocIsNull() {
            addCriterion("current_max_alloc is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocIsNotNull() {
            addCriterion("current_max_alloc is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocEqualTo(Long value) {
            addCriterion("current_max_alloc =", value, "currentMaxAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocNotEqualTo(Long value) {
            addCriterion("current_max_alloc <>", value, "currentMaxAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocGreaterThan(Long value) {
            addCriterion("current_max_alloc >", value, "currentMaxAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocGreaterThanOrEqualTo(Long value) {
            addCriterion("current_max_alloc >=", value, "currentMaxAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocLessThan(Long value) {
            addCriterion("current_max_alloc <", value, "currentMaxAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocLessThanOrEqualTo(Long value) {
            addCriterion("current_max_alloc <=", value, "currentMaxAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocIn(List<Long> values) {
            addCriterion("current_max_alloc in", values, "currentMaxAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocNotIn(List<Long> values) {
            addCriterion("current_max_alloc not in", values, "currentMaxAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocBetween(Long value1, Long value2) {
            addCriterion("current_max_alloc between", value1, value2, "currentMaxAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentMaxAllocNotBetween(Long value1, Long value2) {
            addCriterion("current_max_alloc not between", value1, value2, "currentMaxAlloc");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedIsNull() {
            addCriterion("total_allocated is null");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedIsNotNull() {
            addCriterion("total_allocated is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedEqualTo(BigDecimal value) {
            addCriterion("total_allocated =", value, "totalAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedNotEqualTo(BigDecimal value) {
            addCriterion("total_allocated <>", value, "totalAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedGreaterThan(BigDecimal value) {
            addCriterion("total_allocated >", value, "totalAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_allocated >=", value, "totalAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedLessThan(BigDecimal value) {
            addCriterion("total_allocated <", value, "totalAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_allocated <=", value, "totalAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedIn(List<BigDecimal> values) {
            addCriterion("total_allocated in", values, "totalAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedNotIn(List<BigDecimal> values) {
            addCriterion("total_allocated not in", values, "totalAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_allocated between", value1, value2, "totalAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalAllocatedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_allocated not between", value1, value2, "totalAllocated");
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