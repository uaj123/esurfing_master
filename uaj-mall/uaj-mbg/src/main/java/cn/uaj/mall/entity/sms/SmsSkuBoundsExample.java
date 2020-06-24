package cn.uaj.mall.entity.sms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SmsSkuBoundsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsSkuBoundsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsIsNull() {
            addCriterion("grow_bounds is null");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsIsNotNull() {
            addCriterion("grow_bounds is not null");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsEqualTo(BigDecimal value) {
            addCriterion("grow_bounds =", value, "growBounds");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsNotEqualTo(BigDecimal value) {
            addCriterion("grow_bounds <>", value, "growBounds");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsGreaterThan(BigDecimal value) {
            addCriterion("grow_bounds >", value, "growBounds");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("grow_bounds >=", value, "growBounds");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsLessThan(BigDecimal value) {
            addCriterion("grow_bounds <", value, "growBounds");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("grow_bounds <=", value, "growBounds");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsIn(List<BigDecimal> values) {
            addCriterion("grow_bounds in", values, "growBounds");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsNotIn(List<BigDecimal> values) {
            addCriterion("grow_bounds not in", values, "growBounds");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grow_bounds between", value1, value2, "growBounds");
            return (Criteria) this;
        }

        public Criteria andGrowBoundsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("grow_bounds not between", value1, value2, "growBounds");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsIsNull() {
            addCriterion("buy_bounds is null");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsIsNotNull() {
            addCriterion("buy_bounds is not null");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsEqualTo(BigDecimal value) {
            addCriterion("buy_bounds =", value, "buyBounds");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsNotEqualTo(BigDecimal value) {
            addCriterion("buy_bounds <>", value, "buyBounds");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsGreaterThan(BigDecimal value) {
            addCriterion("buy_bounds >", value, "buyBounds");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_bounds >=", value, "buyBounds");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsLessThan(BigDecimal value) {
            addCriterion("buy_bounds <", value, "buyBounds");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("buy_bounds <=", value, "buyBounds");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsIn(List<BigDecimal> values) {
            addCriterion("buy_bounds in", values, "buyBounds");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsNotIn(List<BigDecimal> values) {
            addCriterion("buy_bounds not in", values, "buyBounds");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_bounds between", value1, value2, "buyBounds");
            return (Criteria) this;
        }

        public Criteria andBuyBoundsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("buy_bounds not between", value1, value2, "buyBounds");
            return (Criteria) this;
        }

        public Criteria andWorkIsNull() {
            addCriterion("work is null");
            return (Criteria) this;
        }

        public Criteria andWorkIsNotNull() {
            addCriterion("work is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEqualTo(Boolean value) {
            addCriterion("work =", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotEqualTo(Boolean value) {
            addCriterion("work <>", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThan(Boolean value) {
            addCriterion("work >", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("work >=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThan(Boolean value) {
            addCriterion("work <", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThanOrEqualTo(Boolean value) {
            addCriterion("work <=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkIn(List<Boolean> values) {
            addCriterion("work in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotIn(List<Boolean> values) {
            addCriterion("work not in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkBetween(Boolean value1, Boolean value2) {
            addCriterion("work between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("work not between", value1, value2, "work");
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