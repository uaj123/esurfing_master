package cn.uaj.mall.entity.oms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OmsRefundInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsRefundInfoExample() {
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

        public Criteria andOrderReturnIdIsNull() {
            addCriterion("order_return_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdIsNotNull() {
            addCriterion("order_return_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdEqualTo(Long value) {
            addCriterion("order_return_id =", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdNotEqualTo(Long value) {
            addCriterion("order_return_id <>", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdGreaterThan(Long value) {
            addCriterion("order_return_id >", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_return_id >=", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdLessThan(Long value) {
            addCriterion("order_return_id <", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdLessThanOrEqualTo(Long value) {
            addCriterion("order_return_id <=", value, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdIn(List<Long> values) {
            addCriterion("order_return_id in", values, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdNotIn(List<Long> values) {
            addCriterion("order_return_id not in", values, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdBetween(Long value1, Long value2) {
            addCriterion("order_return_id between", value1, value2, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andOrderReturnIdNotBetween(Long value1, Long value2) {
            addCriterion("order_return_id not between", value1, value2, "orderReturnId");
            return (Criteria) this;
        }

        public Criteria andRefundIsNull() {
            addCriterion("refund is null");
            return (Criteria) this;
        }

        public Criteria andRefundIsNotNull() {
            addCriterion("refund is not null");
            return (Criteria) this;
        }

        public Criteria andRefundEqualTo(BigDecimal value) {
            addCriterion("refund =", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotEqualTo(BigDecimal value) {
            addCriterion("refund <>", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThan(BigDecimal value) {
            addCriterion("refund >", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund >=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThan(BigDecimal value) {
            addCriterion("refund <", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund <=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundIn(List<BigDecimal> values) {
            addCriterion("refund in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotIn(List<BigDecimal> values) {
            addCriterion("refund not in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund not between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundSnIsNull() {
            addCriterion("refund_sn is null");
            return (Criteria) this;
        }

        public Criteria andRefundSnIsNotNull() {
            addCriterion("refund_sn is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSnEqualTo(String value) {
            addCriterion("refund_sn =", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotEqualTo(String value) {
            addCriterion("refund_sn <>", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnGreaterThan(String value) {
            addCriterion("refund_sn >", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnGreaterThanOrEqualTo(String value) {
            addCriterion("refund_sn >=", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLessThan(String value) {
            addCriterion("refund_sn <", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLessThanOrEqualTo(String value) {
            addCriterion("refund_sn <=", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnLike(String value) {
            addCriterion("refund_sn like", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotLike(String value) {
            addCriterion("refund_sn not like", value, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnIn(List<String> values) {
            addCriterion("refund_sn in", values, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotIn(List<String> values) {
            addCriterion("refund_sn not in", values, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnBetween(String value1, String value2) {
            addCriterion("refund_sn between", value1, value2, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundSnNotBetween(String value1, String value2) {
            addCriterion("refund_sn not between", value1, value2, "refundSn");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Boolean value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Boolean value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Boolean value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Boolean value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Boolean> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Boolean> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundChannelIsNull() {
            addCriterion("refund_channel is null");
            return (Criteria) this;
        }

        public Criteria andRefundChannelIsNotNull() {
            addCriterion("refund_channel is not null");
            return (Criteria) this;
        }

        public Criteria andRefundChannelEqualTo(Byte value) {
            addCriterion("refund_channel =", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelNotEqualTo(Byte value) {
            addCriterion("refund_channel <>", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelGreaterThan(Byte value) {
            addCriterion("refund_channel >", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_channel >=", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelLessThan(Byte value) {
            addCriterion("refund_channel <", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelLessThanOrEqualTo(Byte value) {
            addCriterion("refund_channel <=", value, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelIn(List<Byte> values) {
            addCriterion("refund_channel in", values, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelNotIn(List<Byte> values) {
            addCriterion("refund_channel not in", values, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelBetween(Byte value1, Byte value2) {
            addCriterion("refund_channel between", value1, value2, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_channel not between", value1, value2, "refundChannel");
            return (Criteria) this;
        }

        public Criteria andRefundContentIsNull() {
            addCriterion("refund_content is null");
            return (Criteria) this;
        }

        public Criteria andRefundContentIsNotNull() {
            addCriterion("refund_content is not null");
            return (Criteria) this;
        }

        public Criteria andRefundContentEqualTo(String value) {
            addCriterion("refund_content =", value, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentNotEqualTo(String value) {
            addCriterion("refund_content <>", value, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentGreaterThan(String value) {
            addCriterion("refund_content >", value, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentGreaterThanOrEqualTo(String value) {
            addCriterion("refund_content >=", value, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentLessThan(String value) {
            addCriterion("refund_content <", value, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentLessThanOrEqualTo(String value) {
            addCriterion("refund_content <=", value, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentLike(String value) {
            addCriterion("refund_content like", value, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentNotLike(String value) {
            addCriterion("refund_content not like", value, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentIn(List<String> values) {
            addCriterion("refund_content in", values, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentNotIn(List<String> values) {
            addCriterion("refund_content not in", values, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentBetween(String value1, String value2) {
            addCriterion("refund_content between", value1, value2, "refundContent");
            return (Criteria) this;
        }

        public Criteria andRefundContentNotBetween(String value1, String value2) {
            addCriterion("refund_content not between", value1, value2, "refundContent");
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