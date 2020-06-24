package cn.uaj.mall.entity.ums;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UmsMemberLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsMemberLevelExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGrowthPointIsNull() {
            addCriterion("growth_point is null");
            return (Criteria) this;
        }

        public Criteria andGrowthPointIsNotNull() {
            addCriterion("growth_point is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthPointEqualTo(Integer value) {
            addCriterion("growth_point =", value, "growthPoint");
            return (Criteria) this;
        }

        public Criteria andGrowthPointNotEqualTo(Integer value) {
            addCriterion("growth_point <>", value, "growthPoint");
            return (Criteria) this;
        }

        public Criteria andGrowthPointGreaterThan(Integer value) {
            addCriterion("growth_point >", value, "growthPoint");
            return (Criteria) this;
        }

        public Criteria andGrowthPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth_point >=", value, "growthPoint");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLessThan(Integer value) {
            addCriterion("growth_point <", value, "growthPoint");
            return (Criteria) this;
        }

        public Criteria andGrowthPointLessThanOrEqualTo(Integer value) {
            addCriterion("growth_point <=", value, "growthPoint");
            return (Criteria) this;
        }

        public Criteria andGrowthPointIn(List<Integer> values) {
            addCriterion("growth_point in", values, "growthPoint");
            return (Criteria) this;
        }

        public Criteria andGrowthPointNotIn(List<Integer> values) {
            addCriterion("growth_point not in", values, "growthPoint");
            return (Criteria) this;
        }

        public Criteria andGrowthPointBetween(Integer value1, Integer value2) {
            addCriterion("growth_point between", value1, value2, "growthPoint");
            return (Criteria) this;
        }

        public Criteria andGrowthPointNotBetween(Integer value1, Integer value2) {
            addCriterion("growth_point not between", value1, value2, "growthPoint");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusIsNull() {
            addCriterion("default_status is null");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusIsNotNull() {
            addCriterion("default_status is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusEqualTo(Byte value) {
            addCriterion("default_status =", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusNotEqualTo(Byte value) {
            addCriterion("default_status <>", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusGreaterThan(Byte value) {
            addCriterion("default_status >", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("default_status >=", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusLessThan(Byte value) {
            addCriterion("default_status <", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusLessThanOrEqualTo(Byte value) {
            addCriterion("default_status <=", value, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusIn(List<Byte> values) {
            addCriterion("default_status in", values, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusNotIn(List<Byte> values) {
            addCriterion("default_status not in", values, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusBetween(Byte value1, Byte value2) {
            addCriterion("default_status between", value1, value2, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andDefaultStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("default_status not between", value1, value2, "defaultStatus");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointIsNull() {
            addCriterion("free_freight_point is null");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointIsNotNull() {
            addCriterion("free_freight_point is not null");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointEqualTo(BigDecimal value) {
            addCriterion("free_freight_point =", value, "freeFreightPoint");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointNotEqualTo(BigDecimal value) {
            addCriterion("free_freight_point <>", value, "freeFreightPoint");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointGreaterThan(BigDecimal value) {
            addCriterion("free_freight_point >", value, "freeFreightPoint");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("free_freight_point >=", value, "freeFreightPoint");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointLessThan(BigDecimal value) {
            addCriterion("free_freight_point <", value, "freeFreightPoint");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("free_freight_point <=", value, "freeFreightPoint");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointIn(List<BigDecimal> values) {
            addCriterion("free_freight_point in", values, "freeFreightPoint");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointNotIn(List<BigDecimal> values) {
            addCriterion("free_freight_point not in", values, "freeFreightPoint");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_freight_point between", value1, value2, "freeFreightPoint");
            return (Criteria) this;
        }

        public Criteria andFreeFreightPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_freight_point not between", value1, value2, "freeFreightPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointIsNull() {
            addCriterion("comment_growth_point is null");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointIsNotNull() {
            addCriterion("comment_growth_point is not null");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointEqualTo(Integer value) {
            addCriterion("comment_growth_point =", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointNotEqualTo(Integer value) {
            addCriterion("comment_growth_point <>", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointGreaterThan(Integer value) {
            addCriterion("comment_growth_point >", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_growth_point >=", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointLessThan(Integer value) {
            addCriterion("comment_growth_point <", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointLessThanOrEqualTo(Integer value) {
            addCriterion("comment_growth_point <=", value, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointIn(List<Integer> values) {
            addCriterion("comment_growth_point in", values, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointNotIn(List<Integer> values) {
            addCriterion("comment_growth_point not in", values, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointBetween(Integer value1, Integer value2) {
            addCriterion("comment_growth_point between", value1, value2, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andCommentGrowthPointNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_growth_point not between", value1, value2, "commentGrowthPoint");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightIsNull() {
            addCriterion("priviledge_free_freight is null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightIsNotNull() {
            addCriterion("priviledge_free_freight is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightEqualTo(Byte value) {
            addCriterion("priviledge_free_freight =", value, "priviledgeFreeFreight");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightNotEqualTo(Byte value) {
            addCriterion("priviledge_free_freight <>", value, "priviledgeFreeFreight");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightGreaterThan(Byte value) {
            addCriterion("priviledge_free_freight >", value, "priviledgeFreeFreight");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightGreaterThanOrEqualTo(Byte value) {
            addCriterion("priviledge_free_freight >=", value, "priviledgeFreeFreight");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightLessThan(Byte value) {
            addCriterion("priviledge_free_freight <", value, "priviledgeFreeFreight");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightLessThanOrEqualTo(Byte value) {
            addCriterion("priviledge_free_freight <=", value, "priviledgeFreeFreight");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightIn(List<Byte> values) {
            addCriterion("priviledge_free_freight in", values, "priviledgeFreeFreight");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightNotIn(List<Byte> values) {
            addCriterion("priviledge_free_freight not in", values, "priviledgeFreeFreight");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightBetween(Byte value1, Byte value2) {
            addCriterion("priviledge_free_freight between", value1, value2, "priviledgeFreeFreight");
            return (Criteria) this;
        }

        public Criteria andPriviledgeFreeFreightNotBetween(Byte value1, Byte value2) {
            addCriterion("priviledge_free_freight not between", value1, value2, "priviledgeFreeFreight");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceIsNull() {
            addCriterion("priviledge_member_price is null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceIsNotNull() {
            addCriterion("priviledge_member_price is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceEqualTo(Byte value) {
            addCriterion("priviledge_member_price =", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceNotEqualTo(Byte value) {
            addCriterion("priviledge_member_price <>", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceGreaterThan(Byte value) {
            addCriterion("priviledge_member_price >", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceGreaterThanOrEqualTo(Byte value) {
            addCriterion("priviledge_member_price >=", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceLessThan(Byte value) {
            addCriterion("priviledge_member_price <", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceLessThanOrEqualTo(Byte value) {
            addCriterion("priviledge_member_price <=", value, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceIn(List<Byte> values) {
            addCriterion("priviledge_member_price in", values, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceNotIn(List<Byte> values) {
            addCriterion("priviledge_member_price not in", values, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceBetween(Byte value1, Byte value2) {
            addCriterion("priviledge_member_price between", value1, value2, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeMemberPriceNotBetween(Byte value1, Byte value2) {
            addCriterion("priviledge_member_price not between", value1, value2, "priviledgeMemberPrice");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayIsNull() {
            addCriterion("priviledge_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayIsNotNull() {
            addCriterion("priviledge_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayEqualTo(Byte value) {
            addCriterion("priviledge_birthday =", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayNotEqualTo(Byte value) {
            addCriterion("priviledge_birthday <>", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayGreaterThan(Byte value) {
            addCriterion("priviledge_birthday >", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayGreaterThanOrEqualTo(Byte value) {
            addCriterion("priviledge_birthday >=", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayLessThan(Byte value) {
            addCriterion("priviledge_birthday <", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayLessThanOrEqualTo(Byte value) {
            addCriterion("priviledge_birthday <=", value, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayIn(List<Byte> values) {
            addCriterion("priviledge_birthday in", values, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayNotIn(List<Byte> values) {
            addCriterion("priviledge_birthday not in", values, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayBetween(Byte value1, Byte value2) {
            addCriterion("priviledge_birthday between", value1, value2, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andPriviledgeBirthdayNotBetween(Byte value1, Byte value2) {
            addCriterion("priviledge_birthday not between", value1, value2, "priviledgeBirthday");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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