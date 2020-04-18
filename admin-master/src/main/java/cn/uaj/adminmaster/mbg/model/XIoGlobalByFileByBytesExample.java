package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XIoGlobalByFileByBytesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XIoGlobalByFileByBytesExample() {
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

        public Criteria andTotalReadIsNull() {
            addCriterion("total_read is null");
            return (Criteria) this;
        }

        public Criteria andTotalReadIsNotNull() {
            addCriterion("total_read is not null");
            return (Criteria) this;
        }

        public Criteria andTotalReadEqualTo(Long value) {
            addCriterion("total_read =", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadNotEqualTo(Long value) {
            addCriterion("total_read <>", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadGreaterThan(Long value) {
            addCriterion("total_read >", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadGreaterThanOrEqualTo(Long value) {
            addCriterion("total_read >=", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadLessThan(Long value) {
            addCriterion("total_read <", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadLessThanOrEqualTo(Long value) {
            addCriterion("total_read <=", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadIn(List<Long> values) {
            addCriterion("total_read in", values, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadNotIn(List<Long> values) {
            addCriterion("total_read not in", values, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadBetween(Long value1, Long value2) {
            addCriterion("total_read between", value1, value2, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadNotBetween(Long value1, Long value2) {
            addCriterion("total_read not between", value1, value2, "totalRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadIsNull() {
            addCriterion("avg_read is null");
            return (Criteria) this;
        }

        public Criteria andAvgReadIsNotNull() {
            addCriterion("avg_read is not null");
            return (Criteria) this;
        }

        public Criteria andAvgReadEqualTo(BigDecimal value) {
            addCriterion("avg_read =", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadNotEqualTo(BigDecimal value) {
            addCriterion("avg_read <>", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadGreaterThan(BigDecimal value) {
            addCriterion("avg_read >", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_read >=", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadLessThan(BigDecimal value) {
            addCriterion("avg_read <", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_read <=", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadIn(List<BigDecimal> values) {
            addCriterion("avg_read in", values, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadNotIn(List<BigDecimal> values) {
            addCriterion("avg_read not in", values, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_read between", value1, value2, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_read not between", value1, value2, "avgRead");
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

        public Criteria andTotalWrittenIsNull() {
            addCriterion("total_written is null");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenIsNotNull() {
            addCriterion("total_written is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenEqualTo(Long value) {
            addCriterion("total_written =", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenNotEqualTo(Long value) {
            addCriterion("total_written <>", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenGreaterThan(Long value) {
            addCriterion("total_written >", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenGreaterThanOrEqualTo(Long value) {
            addCriterion("total_written >=", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenLessThan(Long value) {
            addCriterion("total_written <", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenLessThanOrEqualTo(Long value) {
            addCriterion("total_written <=", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenIn(List<Long> values) {
            addCriterion("total_written in", values, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenNotIn(List<Long> values) {
            addCriterion("total_written not in", values, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenBetween(Long value1, Long value2) {
            addCriterion("total_written between", value1, value2, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenNotBetween(Long value1, Long value2) {
            addCriterion("total_written not between", value1, value2, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWriteIsNull() {
            addCriterion("avg_write is null");
            return (Criteria) this;
        }

        public Criteria andAvgWriteIsNotNull() {
            addCriterion("avg_write is not null");
            return (Criteria) this;
        }

        public Criteria andAvgWriteEqualTo(BigDecimal value) {
            addCriterion("avg_write =", value, "avgWrite");
            return (Criteria) this;
        }

        public Criteria andAvgWriteNotEqualTo(BigDecimal value) {
            addCriterion("avg_write <>", value, "avgWrite");
            return (Criteria) this;
        }

        public Criteria andAvgWriteGreaterThan(BigDecimal value) {
            addCriterion("avg_write >", value, "avgWrite");
            return (Criteria) this;
        }

        public Criteria andAvgWriteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_write >=", value, "avgWrite");
            return (Criteria) this;
        }

        public Criteria andAvgWriteLessThan(BigDecimal value) {
            addCriterion("avg_write <", value, "avgWrite");
            return (Criteria) this;
        }

        public Criteria andAvgWriteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_write <=", value, "avgWrite");
            return (Criteria) this;
        }

        public Criteria andAvgWriteIn(List<BigDecimal> values) {
            addCriterion("avg_write in", values, "avgWrite");
            return (Criteria) this;
        }

        public Criteria andAvgWriteNotIn(List<BigDecimal> values) {
            addCriterion("avg_write not in", values, "avgWrite");
            return (Criteria) this;
        }

        public Criteria andAvgWriteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_write between", value1, value2, "avgWrite");
            return (Criteria) this;
        }

        public Criteria andAvgWriteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_write not between", value1, value2, "avgWrite");
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

        public Criteria andWritePctIsNull() {
            addCriterion("write_pct is null");
            return (Criteria) this;
        }

        public Criteria andWritePctIsNotNull() {
            addCriterion("write_pct is not null");
            return (Criteria) this;
        }

        public Criteria andWritePctEqualTo(BigDecimal value) {
            addCriterion("write_pct =", value, "writePct");
            return (Criteria) this;
        }

        public Criteria andWritePctNotEqualTo(BigDecimal value) {
            addCriterion("write_pct <>", value, "writePct");
            return (Criteria) this;
        }

        public Criteria andWritePctGreaterThan(BigDecimal value) {
            addCriterion("write_pct >", value, "writePct");
            return (Criteria) this;
        }

        public Criteria andWritePctGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("write_pct >=", value, "writePct");
            return (Criteria) this;
        }

        public Criteria andWritePctLessThan(BigDecimal value) {
            addCriterion("write_pct <", value, "writePct");
            return (Criteria) this;
        }

        public Criteria andWritePctLessThanOrEqualTo(BigDecimal value) {
            addCriterion("write_pct <=", value, "writePct");
            return (Criteria) this;
        }

        public Criteria andWritePctIn(List<BigDecimal> values) {
            addCriterion("write_pct in", values, "writePct");
            return (Criteria) this;
        }

        public Criteria andWritePctNotIn(List<BigDecimal> values) {
            addCriterion("write_pct not in", values, "writePct");
            return (Criteria) this;
        }

        public Criteria andWritePctBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("write_pct between", value1, value2, "writePct");
            return (Criteria) this;
        }

        public Criteria andWritePctNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("write_pct not between", value1, value2, "writePct");
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