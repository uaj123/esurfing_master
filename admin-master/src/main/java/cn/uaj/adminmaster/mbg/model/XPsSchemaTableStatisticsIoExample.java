package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XPsSchemaTableStatisticsIoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XPsSchemaTableStatisticsIoExample() {
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

        public Criteria andCountReadIsNull() {
            addCriterion("count_read is null");
            return (Criteria) this;
        }

        public Criteria andCountReadIsNotNull() {
            addCriterion("count_read is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadEqualTo(BigDecimal value) {
            addCriterion("count_read =", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotEqualTo(BigDecimal value) {
            addCriterion("count_read <>", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThan(BigDecimal value) {
            addCriterion("count_read >", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_read >=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThan(BigDecimal value) {
            addCriterion("count_read <", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_read <=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadIn(List<BigDecimal> values) {
            addCriterion("count_read in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotIn(List<BigDecimal> values) {
            addCriterion("count_read not in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_read between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_read not between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadIsNull() {
            addCriterion("sum_number_of_bytes_read is null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadIsNotNull() {
            addCriterion("sum_number_of_bytes_read is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read =", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadNotEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read <>", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadGreaterThan(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read >", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read >=", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadLessThan(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read <", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read <=", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadIn(List<BigDecimal> values) {
            addCriterion("sum_number_of_bytes_read in", values, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadNotIn(List<BigDecimal> values) {
            addCriterion("sum_number_of_bytes_read not in", values, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_number_of_bytes_read between", value1, value2, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_number_of_bytes_read not between", value1, value2, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadIsNull() {
            addCriterion("sum_timer_read is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadIsNotNull() {
            addCriterion("sum_timer_read is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadEqualTo(BigDecimal value) {
            addCriterion("sum_timer_read =", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNotEqualTo(BigDecimal value) {
            addCriterion("sum_timer_read <>", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadGreaterThan(BigDecimal value) {
            addCriterion("sum_timer_read >", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_read >=", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadLessThan(BigDecimal value) {
            addCriterion("sum_timer_read <", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_read <=", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadIn(List<BigDecimal> values) {
            addCriterion("sum_timer_read in", values, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNotIn(List<BigDecimal> values) {
            addCriterion("sum_timer_read not in", values, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_read between", value1, value2, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_read not between", value1, value2, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andCountWriteIsNull() {
            addCriterion("count_write is null");
            return (Criteria) this;
        }

        public Criteria andCountWriteIsNotNull() {
            addCriterion("count_write is not null");
            return (Criteria) this;
        }

        public Criteria andCountWriteEqualTo(BigDecimal value) {
            addCriterion("count_write =", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotEqualTo(BigDecimal value) {
            addCriterion("count_write <>", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThan(BigDecimal value) {
            addCriterion("count_write >", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_write >=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThan(BigDecimal value) {
            addCriterion("count_write <", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_write <=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteIn(List<BigDecimal> values) {
            addCriterion("count_write in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotIn(List<BigDecimal> values) {
            addCriterion("count_write not in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_write between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_write not between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteIsNull() {
            addCriterion("sum_number_of_bytes_write is null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteIsNotNull() {
            addCriterion("sum_number_of_bytes_write is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write =", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteNotEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write <>", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteGreaterThan(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write >", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write >=", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteLessThan(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write <", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write <=", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteIn(List<BigDecimal> values) {
            addCriterion("sum_number_of_bytes_write in", values, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteNotIn(List<BigDecimal> values) {
            addCriterion("sum_number_of_bytes_write not in", values, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_number_of_bytes_write between", value1, value2, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_number_of_bytes_write not between", value1, value2, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteIsNull() {
            addCriterion("sum_timer_write is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteIsNotNull() {
            addCriterion("sum_timer_write is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteEqualTo(BigDecimal value) {
            addCriterion("sum_timer_write =", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNotEqualTo(BigDecimal value) {
            addCriterion("sum_timer_write <>", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteGreaterThan(BigDecimal value) {
            addCriterion("sum_timer_write >", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_write >=", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLessThan(BigDecimal value) {
            addCriterion("sum_timer_write <", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_write <=", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteIn(List<BigDecimal> values) {
            addCriterion("sum_timer_write in", values, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNotIn(List<BigDecimal> values) {
            addCriterion("sum_timer_write not in", values, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_write between", value1, value2, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_write not between", value1, value2, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andCountMiscIsNull() {
            addCriterion("count_misc is null");
            return (Criteria) this;
        }

        public Criteria andCountMiscIsNotNull() {
            addCriterion("count_misc is not null");
            return (Criteria) this;
        }

        public Criteria andCountMiscEqualTo(BigDecimal value) {
            addCriterion("count_misc =", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscNotEqualTo(BigDecimal value) {
            addCriterion("count_misc <>", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscGreaterThan(BigDecimal value) {
            addCriterion("count_misc >", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_misc >=", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscLessThan(BigDecimal value) {
            addCriterion("count_misc <", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_misc <=", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscIn(List<BigDecimal> values) {
            addCriterion("count_misc in", values, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscNotIn(List<BigDecimal> values) {
            addCriterion("count_misc not in", values, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_misc between", value1, value2, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_misc not between", value1, value2, "countMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscIsNull() {
            addCriterion("sum_timer_misc is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscIsNotNull() {
            addCriterion("sum_timer_misc is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscEqualTo(BigDecimal value) {
            addCriterion("sum_timer_misc =", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscNotEqualTo(BigDecimal value) {
            addCriterion("sum_timer_misc <>", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscGreaterThan(BigDecimal value) {
            addCriterion("sum_timer_misc >", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_misc >=", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscLessThan(BigDecimal value) {
            addCriterion("sum_timer_misc <", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_misc <=", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscIn(List<BigDecimal> values) {
            addCriterion("sum_timer_misc in", values, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscNotIn(List<BigDecimal> values) {
            addCriterion("sum_timer_misc not in", values, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_misc between", value1, value2, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_misc not between", value1, value2, "sumTimerMisc");
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