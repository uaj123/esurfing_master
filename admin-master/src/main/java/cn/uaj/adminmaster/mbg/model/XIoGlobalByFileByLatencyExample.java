package cn.uaj.adminmaster.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class XIoGlobalByFileByLatencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XIoGlobalByFileByLatencyExample() {
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

        public Criteria andFileIsNull() {
            addCriterion("file is null");
            return (Criteria) this;
        }

        public Criteria andFileIsNotNull() {
            addCriterion("file is not null");
            return (Criteria) this;
        }

        public Criteria andFileEqualTo(String value) {
            addCriterion("file =", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotEqualTo(String value) {
            addCriterion("file <>", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThan(String value) {
            addCriterion("file >", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThanOrEqualTo(String value) {
            addCriterion("file >=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThan(String value) {
            addCriterion("file <", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThanOrEqualTo(String value) {
            addCriterion("file <=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLike(String value) {
            addCriterion("file like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotLike(String value) {
            addCriterion("file not like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileIn(List<String> values) {
            addCriterion("file in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotIn(List<String> values) {
            addCriterion("file not in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileBetween(String value1, String value2) {
            addCriterion("file between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotBetween(String value1, String value2) {
            addCriterion("file not between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIsNull() {
            addCriterion("total_latency is null");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIsNotNull() {
            addCriterion("total_latency is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyEqualTo(Long value) {
            addCriterion("total_latency =", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotEqualTo(Long value) {
            addCriterion("total_latency <>", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThan(Long value) {
            addCriterion("total_latency >", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("total_latency >=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThan(Long value) {
            addCriterion("total_latency <", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThanOrEqualTo(Long value) {
            addCriterion("total_latency <=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIn(List<Long> values) {
            addCriterion("total_latency in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotIn(List<Long> values) {
            addCriterion("total_latency not in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyBetween(Long value1, Long value2) {
            addCriterion("total_latency between", value1, value2, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotBetween(Long value1, Long value2) {
            addCriterion("total_latency not between", value1, value2, "totalLatency");
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

        public Criteria andCountReadEqualTo(Long value) {
            addCriterion("count_read =", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotEqualTo(Long value) {
            addCriterion("count_read <>", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThan(Long value) {
            addCriterion("count_read >", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThanOrEqualTo(Long value) {
            addCriterion("count_read >=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThan(Long value) {
            addCriterion("count_read <", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThanOrEqualTo(Long value) {
            addCriterion("count_read <=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadIn(List<Long> values) {
            addCriterion("count_read in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotIn(List<Long> values) {
            addCriterion("count_read not in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadBetween(Long value1, Long value2) {
            addCriterion("count_read between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotBetween(Long value1, Long value2) {
            addCriterion("count_read not between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andReadLatencyIsNull() {
            addCriterion("read_latency is null");
            return (Criteria) this;
        }

        public Criteria andReadLatencyIsNotNull() {
            addCriterion("read_latency is not null");
            return (Criteria) this;
        }

        public Criteria andReadLatencyEqualTo(Long value) {
            addCriterion("read_latency =", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyNotEqualTo(Long value) {
            addCriterion("read_latency <>", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyGreaterThan(Long value) {
            addCriterion("read_latency >", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("read_latency >=", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyLessThan(Long value) {
            addCriterion("read_latency <", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyLessThanOrEqualTo(Long value) {
            addCriterion("read_latency <=", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyIn(List<Long> values) {
            addCriterion("read_latency in", values, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyNotIn(List<Long> values) {
            addCriterion("read_latency not in", values, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyBetween(Long value1, Long value2) {
            addCriterion("read_latency between", value1, value2, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyNotBetween(Long value1, Long value2) {
            addCriterion("read_latency not between", value1, value2, "readLatency");
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

        public Criteria andCountWriteEqualTo(Long value) {
            addCriterion("count_write =", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotEqualTo(Long value) {
            addCriterion("count_write <>", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThan(Long value) {
            addCriterion("count_write >", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("count_write >=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThan(Long value) {
            addCriterion("count_write <", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThanOrEqualTo(Long value) {
            addCriterion("count_write <=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteIn(List<Long> values) {
            addCriterion("count_write in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotIn(List<Long> values) {
            addCriterion("count_write not in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteBetween(Long value1, Long value2) {
            addCriterion("count_write between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotBetween(Long value1, Long value2) {
            addCriterion("count_write not between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyIsNull() {
            addCriterion("write_latency is null");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyIsNotNull() {
            addCriterion("write_latency is not null");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyEqualTo(Long value) {
            addCriterion("write_latency =", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyNotEqualTo(Long value) {
            addCriterion("write_latency <>", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyGreaterThan(Long value) {
            addCriterion("write_latency >", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("write_latency >=", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyLessThan(Long value) {
            addCriterion("write_latency <", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyLessThanOrEqualTo(Long value) {
            addCriterion("write_latency <=", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyIn(List<Long> values) {
            addCriterion("write_latency in", values, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyNotIn(List<Long> values) {
            addCriterion("write_latency not in", values, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyBetween(Long value1, Long value2) {
            addCriterion("write_latency between", value1, value2, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyNotBetween(Long value1, Long value2) {
            addCriterion("write_latency not between", value1, value2, "writeLatency");
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

        public Criteria andCountMiscEqualTo(Long value) {
            addCriterion("count_misc =", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscNotEqualTo(Long value) {
            addCriterion("count_misc <>", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscGreaterThan(Long value) {
            addCriterion("count_misc >", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscGreaterThanOrEqualTo(Long value) {
            addCriterion("count_misc >=", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscLessThan(Long value) {
            addCriterion("count_misc <", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscLessThanOrEqualTo(Long value) {
            addCriterion("count_misc <=", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscIn(List<Long> values) {
            addCriterion("count_misc in", values, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscNotIn(List<Long> values) {
            addCriterion("count_misc not in", values, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscBetween(Long value1, Long value2) {
            addCriterion("count_misc between", value1, value2, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscNotBetween(Long value1, Long value2) {
            addCriterion("count_misc not between", value1, value2, "countMisc");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyIsNull() {
            addCriterion("misc_latency is null");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyIsNotNull() {
            addCriterion("misc_latency is not null");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyEqualTo(Long value) {
            addCriterion("misc_latency =", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyNotEqualTo(Long value) {
            addCriterion("misc_latency <>", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyGreaterThan(Long value) {
            addCriterion("misc_latency >", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("misc_latency >=", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyLessThan(Long value) {
            addCriterion("misc_latency <", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyLessThanOrEqualTo(Long value) {
            addCriterion("misc_latency <=", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyIn(List<Long> values) {
            addCriterion("misc_latency in", values, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyNotIn(List<Long> values) {
            addCriterion("misc_latency not in", values, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyBetween(Long value1, Long value2) {
            addCriterion("misc_latency between", value1, value2, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyNotBetween(Long value1, Long value2) {
            addCriterion("misc_latency not between", value1, value2, "miscLatency");
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