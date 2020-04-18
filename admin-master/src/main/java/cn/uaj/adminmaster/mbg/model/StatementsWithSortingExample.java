package cn.uaj.adminmaster.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatementsWithSortingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatementsWithSortingExample() {
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

        public Criteria andDbIsNull() {
            addCriterion("db is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("db is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("db =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("db <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("db >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("db >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("db <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("db <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("db like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("db not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("db in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("db not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("db between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("db not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andExecCountIsNull() {
            addCriterion("exec_count is null");
            return (Criteria) this;
        }

        public Criteria andExecCountIsNotNull() {
            addCriterion("exec_count is not null");
            return (Criteria) this;
        }

        public Criteria andExecCountEqualTo(Long value) {
            addCriterion("exec_count =", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountNotEqualTo(Long value) {
            addCriterion("exec_count <>", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountGreaterThan(Long value) {
            addCriterion("exec_count >", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountGreaterThanOrEqualTo(Long value) {
            addCriterion("exec_count >=", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountLessThan(Long value) {
            addCriterion("exec_count <", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountLessThanOrEqualTo(Long value) {
            addCriterion("exec_count <=", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountIn(List<Long> values) {
            addCriterion("exec_count in", values, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountNotIn(List<Long> values) {
            addCriterion("exec_count not in", values, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountBetween(Long value1, Long value2) {
            addCriterion("exec_count between", value1, value2, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountNotBetween(Long value1, Long value2) {
            addCriterion("exec_count not between", value1, value2, "execCount");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesIsNull() {
            addCriterion("sort_merge_passes is null");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesIsNotNull() {
            addCriterion("sort_merge_passes is not null");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesEqualTo(Long value) {
            addCriterion("sort_merge_passes =", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesNotEqualTo(Long value) {
            addCriterion("sort_merge_passes <>", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesGreaterThan(Long value) {
            addCriterion("sort_merge_passes >", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesGreaterThanOrEqualTo(Long value) {
            addCriterion("sort_merge_passes >=", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesLessThan(Long value) {
            addCriterion("sort_merge_passes <", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesLessThanOrEqualTo(Long value) {
            addCriterion("sort_merge_passes <=", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesIn(List<Long> values) {
            addCriterion("sort_merge_passes in", values, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesNotIn(List<Long> values) {
            addCriterion("sort_merge_passes not in", values, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesBetween(Long value1, Long value2) {
            addCriterion("sort_merge_passes between", value1, value2, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesNotBetween(Long value1, Long value2) {
            addCriterion("sort_merge_passes not between", value1, value2, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesIsNull() {
            addCriterion("avg_sort_merges is null");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesIsNotNull() {
            addCriterion("avg_sort_merges is not null");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesEqualTo(BigDecimal value) {
            addCriterion("avg_sort_merges =", value, "avgSortMerges");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesNotEqualTo(BigDecimal value) {
            addCriterion("avg_sort_merges <>", value, "avgSortMerges");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesGreaterThan(BigDecimal value) {
            addCriterion("avg_sort_merges >", value, "avgSortMerges");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_sort_merges >=", value, "avgSortMerges");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesLessThan(BigDecimal value) {
            addCriterion("avg_sort_merges <", value, "avgSortMerges");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_sort_merges <=", value, "avgSortMerges");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesIn(List<BigDecimal> values) {
            addCriterion("avg_sort_merges in", values, "avgSortMerges");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesNotIn(List<BigDecimal> values) {
            addCriterion("avg_sort_merges not in", values, "avgSortMerges");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_sort_merges between", value1, value2, "avgSortMerges");
            return (Criteria) this;
        }

        public Criteria andAvgSortMergesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_sort_merges not between", value1, value2, "avgSortMerges");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansIsNull() {
            addCriterion("sorts_using_scans is null");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansIsNotNull() {
            addCriterion("sorts_using_scans is not null");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansEqualTo(Long value) {
            addCriterion("sorts_using_scans =", value, "sortsUsingScans");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansNotEqualTo(Long value) {
            addCriterion("sorts_using_scans <>", value, "sortsUsingScans");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansGreaterThan(Long value) {
            addCriterion("sorts_using_scans >", value, "sortsUsingScans");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansGreaterThanOrEqualTo(Long value) {
            addCriterion("sorts_using_scans >=", value, "sortsUsingScans");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansLessThan(Long value) {
            addCriterion("sorts_using_scans <", value, "sortsUsingScans");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansLessThanOrEqualTo(Long value) {
            addCriterion("sorts_using_scans <=", value, "sortsUsingScans");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansIn(List<Long> values) {
            addCriterion("sorts_using_scans in", values, "sortsUsingScans");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansNotIn(List<Long> values) {
            addCriterion("sorts_using_scans not in", values, "sortsUsingScans");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansBetween(Long value1, Long value2) {
            addCriterion("sorts_using_scans between", value1, value2, "sortsUsingScans");
            return (Criteria) this;
        }

        public Criteria andSortsUsingScansNotBetween(Long value1, Long value2) {
            addCriterion("sorts_using_scans not between", value1, value2, "sortsUsingScans");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeIsNull() {
            addCriterion("sort_using_range is null");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeIsNotNull() {
            addCriterion("sort_using_range is not null");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeEqualTo(Long value) {
            addCriterion("sort_using_range =", value, "sortUsingRange");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeNotEqualTo(Long value) {
            addCriterion("sort_using_range <>", value, "sortUsingRange");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeGreaterThan(Long value) {
            addCriterion("sort_using_range >", value, "sortUsingRange");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeGreaterThanOrEqualTo(Long value) {
            addCriterion("sort_using_range >=", value, "sortUsingRange");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeLessThan(Long value) {
            addCriterion("sort_using_range <", value, "sortUsingRange");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeLessThanOrEqualTo(Long value) {
            addCriterion("sort_using_range <=", value, "sortUsingRange");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeIn(List<Long> values) {
            addCriterion("sort_using_range in", values, "sortUsingRange");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeNotIn(List<Long> values) {
            addCriterion("sort_using_range not in", values, "sortUsingRange");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeBetween(Long value1, Long value2) {
            addCriterion("sort_using_range between", value1, value2, "sortUsingRange");
            return (Criteria) this;
        }

        public Criteria andSortUsingRangeNotBetween(Long value1, Long value2) {
            addCriterion("sort_using_range not between", value1, value2, "sortUsingRange");
            return (Criteria) this;
        }

        public Criteria andRowsSortedIsNull() {
            addCriterion("rows_sorted is null");
            return (Criteria) this;
        }

        public Criteria andRowsSortedIsNotNull() {
            addCriterion("rows_sorted is not null");
            return (Criteria) this;
        }

        public Criteria andRowsSortedEqualTo(Long value) {
            addCriterion("rows_sorted =", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedNotEqualTo(Long value) {
            addCriterion("rows_sorted <>", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedGreaterThan(Long value) {
            addCriterion("rows_sorted >", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_sorted >=", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedLessThan(Long value) {
            addCriterion("rows_sorted <", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedLessThanOrEqualTo(Long value) {
            addCriterion("rows_sorted <=", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedIn(List<Long> values) {
            addCriterion("rows_sorted in", values, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedNotIn(List<Long> values) {
            addCriterion("rows_sorted not in", values, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedBetween(Long value1, Long value2) {
            addCriterion("rows_sorted between", value1, value2, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedNotBetween(Long value1, Long value2) {
            addCriterion("rows_sorted not between", value1, value2, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedIsNull() {
            addCriterion("avg_rows_sorted is null");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedIsNotNull() {
            addCriterion("avg_rows_sorted is not null");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedEqualTo(BigDecimal value) {
            addCriterion("avg_rows_sorted =", value, "avgRowsSorted");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedNotEqualTo(BigDecimal value) {
            addCriterion("avg_rows_sorted <>", value, "avgRowsSorted");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedGreaterThan(BigDecimal value) {
            addCriterion("avg_rows_sorted >", value, "avgRowsSorted");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_rows_sorted >=", value, "avgRowsSorted");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedLessThan(BigDecimal value) {
            addCriterion("avg_rows_sorted <", value, "avgRowsSorted");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_rows_sorted <=", value, "avgRowsSorted");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedIn(List<BigDecimal> values) {
            addCriterion("avg_rows_sorted in", values, "avgRowsSorted");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedNotIn(List<BigDecimal> values) {
            addCriterion("avg_rows_sorted not in", values, "avgRowsSorted");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_rows_sorted between", value1, value2, "avgRowsSorted");
            return (Criteria) this;
        }

        public Criteria andAvgRowsSortedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_rows_sorted not between", value1, value2, "avgRowsSorted");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNull() {
            addCriterion("first_seen is null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNotNull() {
            addCriterion("first_seen is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenEqualTo(Date value) {
            addCriterion("first_seen =", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotEqualTo(Date value) {
            addCriterion("first_seen <>", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThan(Date value) {
            addCriterion("first_seen >", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("first_seen >=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThan(Date value) {
            addCriterion("first_seen <", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThanOrEqualTo(Date value) {
            addCriterion("first_seen <=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIn(List<Date> values) {
            addCriterion("first_seen in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotIn(List<Date> values) {
            addCriterion("first_seen not in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenBetween(Date value1, Date value2) {
            addCriterion("first_seen between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotBetween(Date value1, Date value2) {
            addCriterion("first_seen not between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenIsNull() {
            addCriterion("last_seen is null");
            return (Criteria) this;
        }

        public Criteria andLastSeenIsNotNull() {
            addCriterion("last_seen is not null");
            return (Criteria) this;
        }

        public Criteria andLastSeenEqualTo(Date value) {
            addCriterion("last_seen =", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotEqualTo(Date value) {
            addCriterion("last_seen <>", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenGreaterThan(Date value) {
            addCriterion("last_seen >", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("last_seen >=", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenLessThan(Date value) {
            addCriterion("last_seen <", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenLessThanOrEqualTo(Date value) {
            addCriterion("last_seen <=", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenIn(List<Date> values) {
            addCriterion("last_seen in", values, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotIn(List<Date> values) {
            addCriterion("last_seen not in", values, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenBetween(Date value1, Date value2) {
            addCriterion("last_seen between", value1, value2, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotBetween(Date value1, Date value2) {
            addCriterion("last_seen not between", value1, value2, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andDigestIsNull() {
            addCriterion("digest is null");
            return (Criteria) this;
        }

        public Criteria andDigestIsNotNull() {
            addCriterion("digest is not null");
            return (Criteria) this;
        }

        public Criteria andDigestEqualTo(String value) {
            addCriterion("digest =", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotEqualTo(String value) {
            addCriterion("digest <>", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThan(String value) {
            addCriterion("digest >", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThanOrEqualTo(String value) {
            addCriterion("digest >=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThan(String value) {
            addCriterion("digest <", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThanOrEqualTo(String value) {
            addCriterion("digest <=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLike(String value) {
            addCriterion("digest like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotLike(String value) {
            addCriterion("digest not like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestIn(List<String> values) {
            addCriterion("digest in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotIn(List<String> values) {
            addCriterion("digest not in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestBetween(String value1, String value2) {
            addCriterion("digest between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotBetween(String value1, String value2) {
            addCriterion("digest not between", value1, value2, "digest");
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