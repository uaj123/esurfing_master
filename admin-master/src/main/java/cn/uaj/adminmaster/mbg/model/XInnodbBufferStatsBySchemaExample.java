package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XInnodbBufferStatsBySchemaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XInnodbBufferStatsBySchemaExample() {
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

        public Criteria andAllocatedIsNull() {
            addCriterion("allocated is null");
            return (Criteria) this;
        }

        public Criteria andAllocatedIsNotNull() {
            addCriterion("allocated is not null");
            return (Criteria) this;
        }

        public Criteria andAllocatedEqualTo(BigDecimal value) {
            addCriterion("allocated =", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotEqualTo(BigDecimal value) {
            addCriterion("allocated <>", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedGreaterThan(BigDecimal value) {
            addCriterion("allocated >", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("allocated >=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedLessThan(BigDecimal value) {
            addCriterion("allocated <", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("allocated <=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedIn(List<BigDecimal> values) {
            addCriterion("allocated in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotIn(List<BigDecimal> values) {
            addCriterion("allocated not in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allocated between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allocated not between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("data is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("data is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(BigDecimal value) {
            addCriterion("data =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(BigDecimal value) {
            addCriterion("data <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(BigDecimal value) {
            addCriterion("data >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("data >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(BigDecimal value) {
            addCriterion("data <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(BigDecimal value) {
            addCriterion("data <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<BigDecimal> values) {
            addCriterion("data in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<BigDecimal> values) {
            addCriterion("data not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("data between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("data not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(Long value) {
            addCriterion("pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(Long value) {
            addCriterion("pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(Long value) {
            addCriterion("pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(Long value) {
            addCriterion("pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(Long value) {
            addCriterion("pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(Long value) {
            addCriterion("pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<Long> values) {
            addCriterion("pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<Long> values) {
            addCriterion("pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(Long value1, Long value2) {
            addCriterion("pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(Long value1, Long value2) {
            addCriterion("pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesHashedIsNull() {
            addCriterion("pages_hashed is null");
            return (Criteria) this;
        }

        public Criteria andPagesHashedIsNotNull() {
            addCriterion("pages_hashed is not null");
            return (Criteria) this;
        }

        public Criteria andPagesHashedEqualTo(Long value) {
            addCriterion("pages_hashed =", value, "pagesHashed");
            return (Criteria) this;
        }

        public Criteria andPagesHashedNotEqualTo(Long value) {
            addCriterion("pages_hashed <>", value, "pagesHashed");
            return (Criteria) this;
        }

        public Criteria andPagesHashedGreaterThan(Long value) {
            addCriterion("pages_hashed >", value, "pagesHashed");
            return (Criteria) this;
        }

        public Criteria andPagesHashedGreaterThanOrEqualTo(Long value) {
            addCriterion("pages_hashed >=", value, "pagesHashed");
            return (Criteria) this;
        }

        public Criteria andPagesHashedLessThan(Long value) {
            addCriterion("pages_hashed <", value, "pagesHashed");
            return (Criteria) this;
        }

        public Criteria andPagesHashedLessThanOrEqualTo(Long value) {
            addCriterion("pages_hashed <=", value, "pagesHashed");
            return (Criteria) this;
        }

        public Criteria andPagesHashedIn(List<Long> values) {
            addCriterion("pages_hashed in", values, "pagesHashed");
            return (Criteria) this;
        }

        public Criteria andPagesHashedNotIn(List<Long> values) {
            addCriterion("pages_hashed not in", values, "pagesHashed");
            return (Criteria) this;
        }

        public Criteria andPagesHashedBetween(Long value1, Long value2) {
            addCriterion("pages_hashed between", value1, value2, "pagesHashed");
            return (Criteria) this;
        }

        public Criteria andPagesHashedNotBetween(Long value1, Long value2) {
            addCriterion("pages_hashed not between", value1, value2, "pagesHashed");
            return (Criteria) this;
        }

        public Criteria andPagesOldIsNull() {
            addCriterion("pages_old is null");
            return (Criteria) this;
        }

        public Criteria andPagesOldIsNotNull() {
            addCriterion("pages_old is not null");
            return (Criteria) this;
        }

        public Criteria andPagesOldEqualTo(Long value) {
            addCriterion("pages_old =", value, "pagesOld");
            return (Criteria) this;
        }

        public Criteria andPagesOldNotEqualTo(Long value) {
            addCriterion("pages_old <>", value, "pagesOld");
            return (Criteria) this;
        }

        public Criteria andPagesOldGreaterThan(Long value) {
            addCriterion("pages_old >", value, "pagesOld");
            return (Criteria) this;
        }

        public Criteria andPagesOldGreaterThanOrEqualTo(Long value) {
            addCriterion("pages_old >=", value, "pagesOld");
            return (Criteria) this;
        }

        public Criteria andPagesOldLessThan(Long value) {
            addCriterion("pages_old <", value, "pagesOld");
            return (Criteria) this;
        }

        public Criteria andPagesOldLessThanOrEqualTo(Long value) {
            addCriterion("pages_old <=", value, "pagesOld");
            return (Criteria) this;
        }

        public Criteria andPagesOldIn(List<Long> values) {
            addCriterion("pages_old in", values, "pagesOld");
            return (Criteria) this;
        }

        public Criteria andPagesOldNotIn(List<Long> values) {
            addCriterion("pages_old not in", values, "pagesOld");
            return (Criteria) this;
        }

        public Criteria andPagesOldBetween(Long value1, Long value2) {
            addCriterion("pages_old between", value1, value2, "pagesOld");
            return (Criteria) this;
        }

        public Criteria andPagesOldNotBetween(Long value1, Long value2) {
            addCriterion("pages_old not between", value1, value2, "pagesOld");
            return (Criteria) this;
        }

        public Criteria andRowsCachedIsNull() {
            addCriterion("rows_cached is null");
            return (Criteria) this;
        }

        public Criteria andRowsCachedIsNotNull() {
            addCriterion("rows_cached is not null");
            return (Criteria) this;
        }

        public Criteria andRowsCachedEqualTo(BigDecimal value) {
            addCriterion("rows_cached =", value, "rowsCached");
            return (Criteria) this;
        }

        public Criteria andRowsCachedNotEqualTo(BigDecimal value) {
            addCriterion("rows_cached <>", value, "rowsCached");
            return (Criteria) this;
        }

        public Criteria andRowsCachedGreaterThan(BigDecimal value) {
            addCriterion("rows_cached >", value, "rowsCached");
            return (Criteria) this;
        }

        public Criteria andRowsCachedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_cached >=", value, "rowsCached");
            return (Criteria) this;
        }

        public Criteria andRowsCachedLessThan(BigDecimal value) {
            addCriterion("rows_cached <", value, "rowsCached");
            return (Criteria) this;
        }

        public Criteria andRowsCachedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_cached <=", value, "rowsCached");
            return (Criteria) this;
        }

        public Criteria andRowsCachedIn(List<BigDecimal> values) {
            addCriterion("rows_cached in", values, "rowsCached");
            return (Criteria) this;
        }

        public Criteria andRowsCachedNotIn(List<BigDecimal> values) {
            addCriterion("rows_cached not in", values, "rowsCached");
            return (Criteria) this;
        }

        public Criteria andRowsCachedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_cached between", value1, value2, "rowsCached");
            return (Criteria) this;
        }

        public Criteria andRowsCachedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_cached not between", value1, value2, "rowsCached");
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