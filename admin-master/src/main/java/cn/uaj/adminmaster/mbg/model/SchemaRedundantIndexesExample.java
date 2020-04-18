package cn.uaj.adminmaster.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class SchemaRedundantIndexesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchemaRedundantIndexesExample() {
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

        public Criteria andRedundantIndexNameIsNull() {
            addCriterion("redundant_index_name is null");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameIsNotNull() {
            addCriterion("redundant_index_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameEqualTo(String value) {
            addCriterion("redundant_index_name =", value, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameNotEqualTo(String value) {
            addCriterion("redundant_index_name <>", value, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameGreaterThan(String value) {
            addCriterion("redundant_index_name >", value, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameGreaterThanOrEqualTo(String value) {
            addCriterion("redundant_index_name >=", value, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameLessThan(String value) {
            addCriterion("redundant_index_name <", value, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameLessThanOrEqualTo(String value) {
            addCriterion("redundant_index_name <=", value, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameLike(String value) {
            addCriterion("redundant_index_name like", value, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameNotLike(String value) {
            addCriterion("redundant_index_name not like", value, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameIn(List<String> values) {
            addCriterion("redundant_index_name in", values, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameNotIn(List<String> values) {
            addCriterion("redundant_index_name not in", values, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameBetween(String value1, String value2) {
            addCriterion("redundant_index_name between", value1, value2, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNameNotBetween(String value1, String value2) {
            addCriterion("redundant_index_name not between", value1, value2, "redundantIndexName");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueIsNull() {
            addCriterion("redundant_index_non_unique is null");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueIsNotNull() {
            addCriterion("redundant_index_non_unique is not null");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueEqualTo(Long value) {
            addCriterion("redundant_index_non_unique =", value, "redundantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueNotEqualTo(Long value) {
            addCriterion("redundant_index_non_unique <>", value, "redundantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueGreaterThan(Long value) {
            addCriterion("redundant_index_non_unique >", value, "redundantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueGreaterThanOrEqualTo(Long value) {
            addCriterion("redundant_index_non_unique >=", value, "redundantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueLessThan(Long value) {
            addCriterion("redundant_index_non_unique <", value, "redundantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueLessThanOrEqualTo(Long value) {
            addCriterion("redundant_index_non_unique <=", value, "redundantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueIn(List<Long> values) {
            addCriterion("redundant_index_non_unique in", values, "redundantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueNotIn(List<Long> values) {
            addCriterion("redundant_index_non_unique not in", values, "redundantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueBetween(Long value1, Long value2) {
            addCriterion("redundant_index_non_unique between", value1, value2, "redundantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andRedundantIndexNonUniqueNotBetween(Long value1, Long value2) {
            addCriterion("redundant_index_non_unique not between", value1, value2, "redundantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameIsNull() {
            addCriterion("dominant_index_name is null");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameIsNotNull() {
            addCriterion("dominant_index_name is not null");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameEqualTo(String value) {
            addCriterion("dominant_index_name =", value, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameNotEqualTo(String value) {
            addCriterion("dominant_index_name <>", value, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameGreaterThan(String value) {
            addCriterion("dominant_index_name >", value, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameGreaterThanOrEqualTo(String value) {
            addCriterion("dominant_index_name >=", value, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameLessThan(String value) {
            addCriterion("dominant_index_name <", value, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameLessThanOrEqualTo(String value) {
            addCriterion("dominant_index_name <=", value, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameLike(String value) {
            addCriterion("dominant_index_name like", value, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameNotLike(String value) {
            addCriterion("dominant_index_name not like", value, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameIn(List<String> values) {
            addCriterion("dominant_index_name in", values, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameNotIn(List<String> values) {
            addCriterion("dominant_index_name not in", values, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameBetween(String value1, String value2) {
            addCriterion("dominant_index_name between", value1, value2, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNameNotBetween(String value1, String value2) {
            addCriterion("dominant_index_name not between", value1, value2, "dominantIndexName");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueIsNull() {
            addCriterion("dominant_index_non_unique is null");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueIsNotNull() {
            addCriterion("dominant_index_non_unique is not null");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueEqualTo(Long value) {
            addCriterion("dominant_index_non_unique =", value, "dominantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueNotEqualTo(Long value) {
            addCriterion("dominant_index_non_unique <>", value, "dominantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueGreaterThan(Long value) {
            addCriterion("dominant_index_non_unique >", value, "dominantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueGreaterThanOrEqualTo(Long value) {
            addCriterion("dominant_index_non_unique >=", value, "dominantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueLessThan(Long value) {
            addCriterion("dominant_index_non_unique <", value, "dominantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueLessThanOrEqualTo(Long value) {
            addCriterion("dominant_index_non_unique <=", value, "dominantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueIn(List<Long> values) {
            addCriterion("dominant_index_non_unique in", values, "dominantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueNotIn(List<Long> values) {
            addCriterion("dominant_index_non_unique not in", values, "dominantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueBetween(Long value1, Long value2) {
            addCriterion("dominant_index_non_unique between", value1, value2, "dominantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andDominantIndexNonUniqueNotBetween(Long value1, Long value2) {
            addCriterion("dominant_index_non_unique not between", value1, value2, "dominantIndexNonUnique");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsIsNull() {
            addCriterion("subpart_exists is null");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsIsNotNull() {
            addCriterion("subpart_exists is not null");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsEqualTo(Integer value) {
            addCriterion("subpart_exists =", value, "subpartExists");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsNotEqualTo(Integer value) {
            addCriterion("subpart_exists <>", value, "subpartExists");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsGreaterThan(Integer value) {
            addCriterion("subpart_exists >", value, "subpartExists");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsGreaterThanOrEqualTo(Integer value) {
            addCriterion("subpart_exists >=", value, "subpartExists");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsLessThan(Integer value) {
            addCriterion("subpart_exists <", value, "subpartExists");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsLessThanOrEqualTo(Integer value) {
            addCriterion("subpart_exists <=", value, "subpartExists");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsIn(List<Integer> values) {
            addCriterion("subpart_exists in", values, "subpartExists");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsNotIn(List<Integer> values) {
            addCriterion("subpart_exists not in", values, "subpartExists");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsBetween(Integer value1, Integer value2) {
            addCriterion("subpart_exists between", value1, value2, "subpartExists");
            return (Criteria) this;
        }

        public Criteria andSubpartExistsNotBetween(Integer value1, Integer value2) {
            addCriterion("subpart_exists not between", value1, value2, "subpartExists");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexIsNull() {
            addCriterion("sql_drop_index is null");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexIsNotNull() {
            addCriterion("sql_drop_index is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexEqualTo(String value) {
            addCriterion("sql_drop_index =", value, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexNotEqualTo(String value) {
            addCriterion("sql_drop_index <>", value, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexGreaterThan(String value) {
            addCriterion("sql_drop_index >", value, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexGreaterThanOrEqualTo(String value) {
            addCriterion("sql_drop_index >=", value, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexLessThan(String value) {
            addCriterion("sql_drop_index <", value, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexLessThanOrEqualTo(String value) {
            addCriterion("sql_drop_index <=", value, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexLike(String value) {
            addCriterion("sql_drop_index like", value, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexNotLike(String value) {
            addCriterion("sql_drop_index not like", value, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexIn(List<String> values) {
            addCriterion("sql_drop_index in", values, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexNotIn(List<String> values) {
            addCriterion("sql_drop_index not in", values, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexBetween(String value1, String value2) {
            addCriterion("sql_drop_index between", value1, value2, "sqlDropIndex");
            return (Criteria) this;
        }

        public Criteria andSqlDropIndexNotBetween(String value1, String value2) {
            addCriterion("sql_drop_index not between", value1, value2, "sqlDropIndex");
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