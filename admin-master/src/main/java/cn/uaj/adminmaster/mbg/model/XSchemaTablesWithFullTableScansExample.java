package cn.uaj.adminmaster.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class XSchemaTablesWithFullTableScansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XSchemaTablesWithFullTableScansExample() {
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

        public Criteria andObjectSchemaIsNull() {
            addCriterion("object_schema is null");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIsNotNull() {
            addCriterion("object_schema is not null");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaEqualTo(String value) {
            addCriterion("object_schema =", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotEqualTo(String value) {
            addCriterion("object_schema <>", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaGreaterThan(String value) {
            addCriterion("object_schema >", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("object_schema >=", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLessThan(String value) {
            addCriterion("object_schema <", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLessThanOrEqualTo(String value) {
            addCriterion("object_schema <=", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLike(String value) {
            addCriterion("object_schema like", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotLike(String value) {
            addCriterion("object_schema not like", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIn(List<String> values) {
            addCriterion("object_schema in", values, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotIn(List<String> values) {
            addCriterion("object_schema not in", values, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaBetween(String value1, String value2) {
            addCriterion("object_schema between", value1, value2, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotBetween(String value1, String value2) {
            addCriterion("object_schema not between", value1, value2, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNull() {
            addCriterion("object_name is null");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNotNull() {
            addCriterion("object_name is not null");
            return (Criteria) this;
        }

        public Criteria andObjectNameEqualTo(String value) {
            addCriterion("object_name =", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotEqualTo(String value) {
            addCriterion("object_name <>", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThan(String value) {
            addCriterion("object_name >", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("object_name >=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThan(String value) {
            addCriterion("object_name <", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThanOrEqualTo(String value) {
            addCriterion("object_name <=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLike(String value) {
            addCriterion("object_name like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotLike(String value) {
            addCriterion("object_name not like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameIn(List<String> values) {
            addCriterion("object_name in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotIn(List<String> values) {
            addCriterion("object_name not in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameBetween(String value1, String value2) {
            addCriterion("object_name between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotBetween(String value1, String value2) {
            addCriterion("object_name not between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedIsNull() {
            addCriterion("rows_full_scanned is null");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedIsNotNull() {
            addCriterion("rows_full_scanned is not null");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedEqualTo(Long value) {
            addCriterion("rows_full_scanned =", value, "rowsFullScanned");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedNotEqualTo(Long value) {
            addCriterion("rows_full_scanned <>", value, "rowsFullScanned");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedGreaterThan(Long value) {
            addCriterion("rows_full_scanned >", value, "rowsFullScanned");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_full_scanned >=", value, "rowsFullScanned");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedLessThan(Long value) {
            addCriterion("rows_full_scanned <", value, "rowsFullScanned");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedLessThanOrEqualTo(Long value) {
            addCriterion("rows_full_scanned <=", value, "rowsFullScanned");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedIn(List<Long> values) {
            addCriterion("rows_full_scanned in", values, "rowsFullScanned");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedNotIn(List<Long> values) {
            addCriterion("rows_full_scanned not in", values, "rowsFullScanned");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedBetween(Long value1, Long value2) {
            addCriterion("rows_full_scanned between", value1, value2, "rowsFullScanned");
            return (Criteria) this;
        }

        public Criteria andRowsFullScannedNotBetween(Long value1, Long value2) {
            addCriterion("rows_full_scanned not between", value1, value2, "rowsFullScanned");
            return (Criteria) this;
        }

        public Criteria andLatencyIsNull() {
            addCriterion("latency is null");
            return (Criteria) this;
        }

        public Criteria andLatencyIsNotNull() {
            addCriterion("latency is not null");
            return (Criteria) this;
        }

        public Criteria andLatencyEqualTo(Long value) {
            addCriterion("latency =", value, "latency");
            return (Criteria) this;
        }

        public Criteria andLatencyNotEqualTo(Long value) {
            addCriterion("latency <>", value, "latency");
            return (Criteria) this;
        }

        public Criteria andLatencyGreaterThan(Long value) {
            addCriterion("latency >", value, "latency");
            return (Criteria) this;
        }

        public Criteria andLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("latency >=", value, "latency");
            return (Criteria) this;
        }

        public Criteria andLatencyLessThan(Long value) {
            addCriterion("latency <", value, "latency");
            return (Criteria) this;
        }

        public Criteria andLatencyLessThanOrEqualTo(Long value) {
            addCriterion("latency <=", value, "latency");
            return (Criteria) this;
        }

        public Criteria andLatencyIn(List<Long> values) {
            addCriterion("latency in", values, "latency");
            return (Criteria) this;
        }

        public Criteria andLatencyNotIn(List<Long> values) {
            addCriterion("latency not in", values, "latency");
            return (Criteria) this;
        }

        public Criteria andLatencyBetween(Long value1, Long value2) {
            addCriterion("latency between", value1, value2, "latency");
            return (Criteria) this;
        }

        public Criteria andLatencyNotBetween(Long value1, Long value2) {
            addCriterion("latency not between", value1, value2, "latency");
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