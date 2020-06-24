package cn.uaj.mall.entity.pms;

import java.util.ArrayList;
import java.util.List;

public class PmsAttrGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsAttrGroupExample() {
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

        public Criteria andAttrGroupIdIsNull() {
            addCriterion("attr_group_id is null");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdIsNotNull() {
            addCriterion("attr_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdEqualTo(Long value) {
            addCriterion("attr_group_id =", value, "attrGroupId");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdNotEqualTo(Long value) {
            addCriterion("attr_group_id <>", value, "attrGroupId");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdGreaterThan(Long value) {
            addCriterion("attr_group_id >", value, "attrGroupId");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("attr_group_id >=", value, "attrGroupId");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdLessThan(Long value) {
            addCriterion("attr_group_id <", value, "attrGroupId");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("attr_group_id <=", value, "attrGroupId");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdIn(List<Long> values) {
            addCriterion("attr_group_id in", values, "attrGroupId");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdNotIn(List<Long> values) {
            addCriterion("attr_group_id not in", values, "attrGroupId");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdBetween(Long value1, Long value2) {
            addCriterion("attr_group_id between", value1, value2, "attrGroupId");
            return (Criteria) this;
        }

        public Criteria andAttrGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("attr_group_id not between", value1, value2, "attrGroupId");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameIsNull() {
            addCriterion("attr_group_name is null");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameIsNotNull() {
            addCriterion("attr_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameEqualTo(String value) {
            addCriterion("attr_group_name =", value, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameNotEqualTo(String value) {
            addCriterion("attr_group_name <>", value, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameGreaterThan(String value) {
            addCriterion("attr_group_name >", value, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("attr_group_name >=", value, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameLessThan(String value) {
            addCriterion("attr_group_name <", value, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameLessThanOrEqualTo(String value) {
            addCriterion("attr_group_name <=", value, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameLike(String value) {
            addCriterion("attr_group_name like", value, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameNotLike(String value) {
            addCriterion("attr_group_name not like", value, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameIn(List<String> values) {
            addCriterion("attr_group_name in", values, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameNotIn(List<String> values) {
            addCriterion("attr_group_name not in", values, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameBetween(String value1, String value2) {
            addCriterion("attr_group_name between", value1, value2, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andAttrGroupNameNotBetween(String value1, String value2) {
            addCriterion("attr_group_name not between", value1, value2, "attrGroupName");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("descript is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("descript is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("descript =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("descript <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("descript >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("descript >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("descript <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("descript <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("descript like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("descript not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("descript in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("descript not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("descript between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("descript not between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andCatelogIdIsNull() {
            addCriterion("catelog_id is null");
            return (Criteria) this;
        }

        public Criteria andCatelogIdIsNotNull() {
            addCriterion("catelog_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatelogIdEqualTo(Long value) {
            addCriterion("catelog_id =", value, "catelogId");
            return (Criteria) this;
        }

        public Criteria andCatelogIdNotEqualTo(Long value) {
            addCriterion("catelog_id <>", value, "catelogId");
            return (Criteria) this;
        }

        public Criteria andCatelogIdGreaterThan(Long value) {
            addCriterion("catelog_id >", value, "catelogId");
            return (Criteria) this;
        }

        public Criteria andCatelogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("catelog_id >=", value, "catelogId");
            return (Criteria) this;
        }

        public Criteria andCatelogIdLessThan(Long value) {
            addCriterion("catelog_id <", value, "catelogId");
            return (Criteria) this;
        }

        public Criteria andCatelogIdLessThanOrEqualTo(Long value) {
            addCriterion("catelog_id <=", value, "catelogId");
            return (Criteria) this;
        }

        public Criteria andCatelogIdIn(List<Long> values) {
            addCriterion("catelog_id in", values, "catelogId");
            return (Criteria) this;
        }

        public Criteria andCatelogIdNotIn(List<Long> values) {
            addCriterion("catelog_id not in", values, "catelogId");
            return (Criteria) this;
        }

        public Criteria andCatelogIdBetween(Long value1, Long value2) {
            addCriterion("catelog_id between", value1, value2, "catelogId");
            return (Criteria) this;
        }

        public Criteria andCatelogIdNotBetween(Long value1, Long value2) {
            addCriterion("catelog_id not between", value1, value2, "catelogId");
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