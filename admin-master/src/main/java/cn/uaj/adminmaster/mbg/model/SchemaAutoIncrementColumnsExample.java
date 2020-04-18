package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SchemaAutoIncrementColumnsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchemaAutoIncrementColumnsExample() {
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

        public Criteria andTableSchemaIsNull() {
            addCriterion("table_schema is null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNotNull() {
            addCriterion("table_schema is not null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaEqualTo(String value) {
            addCriterion("table_schema =", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotEqualTo(String value) {
            addCriterion("table_schema <>", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThan(String value) {
            addCriterion("table_schema >", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("table_schema >=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThan(String value) {
            addCriterion("table_schema <", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("table_schema <=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLike(String value) {
            addCriterion("table_schema like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotLike(String value) {
            addCriterion("table_schema not like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIn(List<String> values) {
            addCriterion("table_schema in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotIn(List<String> values) {
            addCriterion("table_schema not in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaBetween(String value1, String value2) {
            addCriterion("table_schema between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotBetween(String value1, String value2) {
            addCriterion("table_schema not between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNull() {
            addCriterion("column_name is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("column_name is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("column_name =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("column_name <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("column_name >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("column_name >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("column_name <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("column_name <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("column_name like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("column_name not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("column_name in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("column_name not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("column_name between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("column_name not between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andIsSignedIsNull() {
            addCriterion("is_signed is null");
            return (Criteria) this;
        }

        public Criteria andIsSignedIsNotNull() {
            addCriterion("is_signed is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignedEqualTo(Integer value) {
            addCriterion("is_signed =", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedNotEqualTo(Integer value) {
            addCriterion("is_signed <>", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedGreaterThan(Integer value) {
            addCriterion("is_signed >", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_signed >=", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedLessThan(Integer value) {
            addCriterion("is_signed <", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedLessThanOrEqualTo(Integer value) {
            addCriterion("is_signed <=", value, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedIn(List<Integer> values) {
            addCriterion("is_signed in", values, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedNotIn(List<Integer> values) {
            addCriterion("is_signed not in", values, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedBetween(Integer value1, Integer value2) {
            addCriterion("is_signed between", value1, value2, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsSignedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_signed not between", value1, value2, "isSigned");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedIsNull() {
            addCriterion("is_unsigned is null");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedIsNotNull() {
            addCriterion("is_unsigned is not null");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedEqualTo(Integer value) {
            addCriterion("is_unsigned =", value, "isUnsigned");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedNotEqualTo(Integer value) {
            addCriterion("is_unsigned <>", value, "isUnsigned");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedGreaterThan(Integer value) {
            addCriterion("is_unsigned >", value, "isUnsigned");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_unsigned >=", value, "isUnsigned");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedLessThan(Integer value) {
            addCriterion("is_unsigned <", value, "isUnsigned");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedLessThanOrEqualTo(Integer value) {
            addCriterion("is_unsigned <=", value, "isUnsigned");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedIn(List<Integer> values) {
            addCriterion("is_unsigned in", values, "isUnsigned");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedNotIn(List<Integer> values) {
            addCriterion("is_unsigned not in", values, "isUnsigned");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedBetween(Integer value1, Integer value2) {
            addCriterion("is_unsigned between", value1, value2, "isUnsigned");
            return (Criteria) this;
        }

        public Criteria andIsUnsignedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_unsigned not between", value1, value2, "isUnsigned");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNull() {
            addCriterion("max_value is null");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNotNull() {
            addCriterion("max_value is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValueEqualTo(Long value) {
            addCriterion("max_value =", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotEqualTo(Long value) {
            addCriterion("max_value <>", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThan(Long value) {
            addCriterion("max_value >", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThanOrEqualTo(Long value) {
            addCriterion("max_value >=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThan(Long value) {
            addCriterion("max_value <", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThanOrEqualTo(Long value) {
            addCriterion("max_value <=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIn(List<Long> values) {
            addCriterion("max_value in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotIn(List<Long> values) {
            addCriterion("max_value not in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueBetween(Long value1, Long value2) {
            addCriterion("max_value between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotBetween(Long value1, Long value2) {
            addCriterion("max_value not between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementIsNull() {
            addCriterion("auto_increment is null");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementIsNotNull() {
            addCriterion("auto_increment is not null");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementEqualTo(Long value) {
            addCriterion("auto_increment =", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNotEqualTo(Long value) {
            addCriterion("auto_increment <>", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementGreaterThan(Long value) {
            addCriterion("auto_increment >", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementGreaterThanOrEqualTo(Long value) {
            addCriterion("auto_increment >=", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementLessThan(Long value) {
            addCriterion("auto_increment <", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementLessThanOrEqualTo(Long value) {
            addCriterion("auto_increment <=", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementIn(List<Long> values) {
            addCriterion("auto_increment in", values, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNotIn(List<Long> values) {
            addCriterion("auto_increment not in", values, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementBetween(Long value1, Long value2) {
            addCriterion("auto_increment between", value1, value2, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNotBetween(Long value1, Long value2) {
            addCriterion("auto_increment not between", value1, value2, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioIsNull() {
            addCriterion("auto_increment_ratio is null");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioIsNotNull() {
            addCriterion("auto_increment_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioEqualTo(BigDecimal value) {
            addCriterion("auto_increment_ratio =", value, "autoIncrementRatio");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioNotEqualTo(BigDecimal value) {
            addCriterion("auto_increment_ratio <>", value, "autoIncrementRatio");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioGreaterThan(BigDecimal value) {
            addCriterion("auto_increment_ratio >", value, "autoIncrementRatio");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_increment_ratio >=", value, "autoIncrementRatio");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioLessThan(BigDecimal value) {
            addCriterion("auto_increment_ratio <", value, "autoIncrementRatio");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_increment_ratio <=", value, "autoIncrementRatio");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioIn(List<BigDecimal> values) {
            addCriterion("auto_increment_ratio in", values, "autoIncrementRatio");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioNotIn(List<BigDecimal> values) {
            addCriterion("auto_increment_ratio not in", values, "autoIncrementRatio");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_increment_ratio between", value1, value2, "autoIncrementRatio");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_increment_ratio not between", value1, value2, "autoIncrementRatio");
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