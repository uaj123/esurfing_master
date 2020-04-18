package cn.uaj.adminmaster.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class VersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VersionExample() {
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

        public Criteria andSysVersionIsNull() {
            addCriterion("sys_version is null");
            return (Criteria) this;
        }

        public Criteria andSysVersionIsNotNull() {
            addCriterion("sys_version is not null");
            return (Criteria) this;
        }

        public Criteria andSysVersionEqualTo(String value) {
            addCriterion("sys_version =", value, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionNotEqualTo(String value) {
            addCriterion("sys_version <>", value, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionGreaterThan(String value) {
            addCriterion("sys_version >", value, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionGreaterThanOrEqualTo(String value) {
            addCriterion("sys_version >=", value, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionLessThan(String value) {
            addCriterion("sys_version <", value, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionLessThanOrEqualTo(String value) {
            addCriterion("sys_version <=", value, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionLike(String value) {
            addCriterion("sys_version like", value, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionNotLike(String value) {
            addCriterion("sys_version not like", value, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionIn(List<String> values) {
            addCriterion("sys_version in", values, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionNotIn(List<String> values) {
            addCriterion("sys_version not in", values, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionBetween(String value1, String value2) {
            addCriterion("sys_version between", value1, value2, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andSysVersionNotBetween(String value1, String value2) {
            addCriterion("sys_version not between", value1, value2, "sysVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionIsNull() {
            addCriterion("mysql_version is null");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionIsNotNull() {
            addCriterion("mysql_version is not null");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionEqualTo(String value) {
            addCriterion("mysql_version =", value, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionNotEqualTo(String value) {
            addCriterion("mysql_version <>", value, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionGreaterThan(String value) {
            addCriterion("mysql_version >", value, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionGreaterThanOrEqualTo(String value) {
            addCriterion("mysql_version >=", value, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionLessThan(String value) {
            addCriterion("mysql_version <", value, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionLessThanOrEqualTo(String value) {
            addCriterion("mysql_version <=", value, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionLike(String value) {
            addCriterion("mysql_version like", value, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionNotLike(String value) {
            addCriterion("mysql_version not like", value, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionIn(List<String> values) {
            addCriterion("mysql_version in", values, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionNotIn(List<String> values) {
            addCriterion("mysql_version not in", values, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionBetween(String value1, String value2) {
            addCriterion("mysql_version between", value1, value2, "mysqlVersion");
            return (Criteria) this;
        }

        public Criteria andMysqlVersionNotBetween(String value1, String value2) {
            addCriterion("mysql_version not between", value1, value2, "mysqlVersion");
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