package cn.uaj.mall.entity.pms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsSpuCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsSpuCommentExample() {
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

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Long value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Long value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Long value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Long value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Long> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Long> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Long value1, Long value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNull() {
            addCriterion("spu_id is null");
            return (Criteria) this;
        }

        public Criteria andSpuIdIsNotNull() {
            addCriterion("spu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpuIdEqualTo(Long value) {
            addCriterion("spu_id =", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotEqualTo(Long value) {
            addCriterion("spu_id <>", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThan(Long value) {
            addCriterion("spu_id >", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("spu_id >=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThan(Long value) {
            addCriterion("spu_id <", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdLessThanOrEqualTo(Long value) {
            addCriterion("spu_id <=", value, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdIn(List<Long> values) {
            addCriterion("spu_id in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotIn(List<Long> values) {
            addCriterion("spu_id not in", values, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdBetween(Long value1, Long value2) {
            addCriterion("spu_id between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuIdNotBetween(Long value1, Long value2) {
            addCriterion("spu_id not between", value1, value2, "spuId");
            return (Criteria) this;
        }

        public Criteria andSpuNameIsNull() {
            addCriterion("spu_name is null");
            return (Criteria) this;
        }

        public Criteria andSpuNameIsNotNull() {
            addCriterion("spu_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpuNameEqualTo(String value) {
            addCriterion("spu_name =", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameNotEqualTo(String value) {
            addCriterion("spu_name <>", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameGreaterThan(String value) {
            addCriterion("spu_name >", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameGreaterThanOrEqualTo(String value) {
            addCriterion("spu_name >=", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameLessThan(String value) {
            addCriterion("spu_name <", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameLessThanOrEqualTo(String value) {
            addCriterion("spu_name <=", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameLike(String value) {
            addCriterion("spu_name like", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameNotLike(String value) {
            addCriterion("spu_name not like", value, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameIn(List<String> values) {
            addCriterion("spu_name in", values, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameNotIn(List<String> values) {
            addCriterion("spu_name not in", values, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameBetween(String value1, String value2) {
            addCriterion("spu_name between", value1, value2, "spuName");
            return (Criteria) this;
        }

        public Criteria andSpuNameNotBetween(String value1, String value2) {
            addCriterion("spu_name not between", value1, value2, "spuName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameIsNull() {
            addCriterion("member_nick_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameIsNotNull() {
            addCriterion("member_nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameEqualTo(String value) {
            addCriterion("member_nick_name =", value, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameNotEqualTo(String value) {
            addCriterion("member_nick_name <>", value, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameGreaterThan(String value) {
            addCriterion("member_nick_name >", value, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_nick_name >=", value, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameLessThan(String value) {
            addCriterion("member_nick_name <", value, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameLessThanOrEqualTo(String value) {
            addCriterion("member_nick_name <=", value, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameLike(String value) {
            addCriterion("member_nick_name like", value, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameNotLike(String value) {
            addCriterion("member_nick_name not like", value, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameIn(List<String> values) {
            addCriterion("member_nick_name in", values, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameNotIn(List<String> values) {
            addCriterion("member_nick_name not in", values, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameBetween(String value1, String value2) {
            addCriterion("member_nick_name between", value1, value2, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andMemberNickNameNotBetween(String value1, String value2) {
            addCriterion("member_nick_name not between", value1, value2, "memberNickName");
            return (Criteria) this;
        }

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(Boolean value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(Boolean value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(Boolean value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(Boolean value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(Boolean value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(Boolean value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<Boolean> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<Boolean> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(Boolean value1, Boolean value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(Boolean value1, Boolean value2) {
            addCriterion("star not between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andMemberIpIsNull() {
            addCriterion("member_ip is null");
            return (Criteria) this;
        }

        public Criteria andMemberIpIsNotNull() {
            addCriterion("member_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIpEqualTo(String value) {
            addCriterion("member_ip =", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpNotEqualTo(String value) {
            addCriterion("member_ip <>", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpGreaterThan(String value) {
            addCriterion("member_ip >", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpGreaterThanOrEqualTo(String value) {
            addCriterion("member_ip >=", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpLessThan(String value) {
            addCriterion("member_ip <", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpLessThanOrEqualTo(String value) {
            addCriterion("member_ip <=", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpLike(String value) {
            addCriterion("member_ip like", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpNotLike(String value) {
            addCriterion("member_ip not like", value, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpIn(List<String> values) {
            addCriterion("member_ip in", values, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpNotIn(List<String> values) {
            addCriterion("member_ip not in", values, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpBetween(String value1, String value2) {
            addCriterion("member_ip between", value1, value2, "memberIp");
            return (Criteria) this;
        }

        public Criteria andMemberIpNotBetween(String value1, String value2) {
            addCriterion("member_ip not between", value1, value2, "memberIp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andShowStatusIsNull() {
            addCriterion("show_status is null");
            return (Criteria) this;
        }

        public Criteria andShowStatusIsNotNull() {
            addCriterion("show_status is not null");
            return (Criteria) this;
        }

        public Criteria andShowStatusEqualTo(Boolean value) {
            addCriterion("show_status =", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusNotEqualTo(Boolean value) {
            addCriterion("show_status <>", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusGreaterThan(Boolean value) {
            addCriterion("show_status >", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("show_status >=", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusLessThan(Boolean value) {
            addCriterion("show_status <", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("show_status <=", value, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusIn(List<Boolean> values) {
            addCriterion("show_status in", values, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusNotIn(List<Boolean> values) {
            addCriterion("show_status not in", values, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("show_status between", value1, value2, "showStatus");
            return (Criteria) this;
        }

        public Criteria andShowStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("show_status not between", value1, value2, "showStatus");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesIsNull() {
            addCriterion("spu_attributes is null");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesIsNotNull() {
            addCriterion("spu_attributes is not null");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesEqualTo(String value) {
            addCriterion("spu_attributes =", value, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesNotEqualTo(String value) {
            addCriterion("spu_attributes <>", value, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesGreaterThan(String value) {
            addCriterion("spu_attributes >", value, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesGreaterThanOrEqualTo(String value) {
            addCriterion("spu_attributes >=", value, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesLessThan(String value) {
            addCriterion("spu_attributes <", value, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesLessThanOrEqualTo(String value) {
            addCriterion("spu_attributes <=", value, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesLike(String value) {
            addCriterion("spu_attributes like", value, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesNotLike(String value) {
            addCriterion("spu_attributes not like", value, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesIn(List<String> values) {
            addCriterion("spu_attributes in", values, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesNotIn(List<String> values) {
            addCriterion("spu_attributes not in", values, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesBetween(String value1, String value2) {
            addCriterion("spu_attributes between", value1, value2, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andSpuAttributesNotBetween(String value1, String value2) {
            addCriterion("spu_attributes not between", value1, value2, "spuAttributes");
            return (Criteria) this;
        }

        public Criteria andLikesCountIsNull() {
            addCriterion("likes_count is null");
            return (Criteria) this;
        }

        public Criteria andLikesCountIsNotNull() {
            addCriterion("likes_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikesCountEqualTo(Integer value) {
            addCriterion("likes_count =", value, "likesCount");
            return (Criteria) this;
        }

        public Criteria andLikesCountNotEqualTo(Integer value) {
            addCriterion("likes_count <>", value, "likesCount");
            return (Criteria) this;
        }

        public Criteria andLikesCountGreaterThan(Integer value) {
            addCriterion("likes_count >", value, "likesCount");
            return (Criteria) this;
        }

        public Criteria andLikesCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes_count >=", value, "likesCount");
            return (Criteria) this;
        }

        public Criteria andLikesCountLessThan(Integer value) {
            addCriterion("likes_count <", value, "likesCount");
            return (Criteria) this;
        }

        public Criteria andLikesCountLessThanOrEqualTo(Integer value) {
            addCriterion("likes_count <=", value, "likesCount");
            return (Criteria) this;
        }

        public Criteria andLikesCountIn(List<Integer> values) {
            addCriterion("likes_count in", values, "likesCount");
            return (Criteria) this;
        }

        public Criteria andLikesCountNotIn(List<Integer> values) {
            addCriterion("likes_count not in", values, "likesCount");
            return (Criteria) this;
        }

        public Criteria andLikesCountBetween(Integer value1, Integer value2) {
            addCriterion("likes_count between", value1, value2, "likesCount");
            return (Criteria) this;
        }

        public Criteria andLikesCountNotBetween(Integer value1, Integer value2) {
            addCriterion("likes_count not between", value1, value2, "likesCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNull() {
            addCriterion("reply_count is null");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNotNull() {
            addCriterion("reply_count is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCountEqualTo(Integer value) {
            addCriterion("reply_count =", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotEqualTo(Integer value) {
            addCriterion("reply_count <>", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThan(Integer value) {
            addCriterion("reply_count >", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_count >=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThan(Integer value) {
            addCriterion("reply_count <", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThanOrEqualTo(Integer value) {
            addCriterion("reply_count <=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountIn(List<Integer> values) {
            addCriterion("reply_count in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotIn(List<Integer> values) {
            addCriterion("reply_count not in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountBetween(Integer value1, Integer value2) {
            addCriterion("reply_count between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_count not between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andResourcesIsNull() {
            addCriterion("resources is null");
            return (Criteria) this;
        }

        public Criteria andResourcesIsNotNull() {
            addCriterion("resources is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesEqualTo(String value) {
            addCriterion("resources =", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotEqualTo(String value) {
            addCriterion("resources <>", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesGreaterThan(String value) {
            addCriterion("resources >", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesGreaterThanOrEqualTo(String value) {
            addCriterion("resources >=", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesLessThan(String value) {
            addCriterion("resources <", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesLessThanOrEqualTo(String value) {
            addCriterion("resources <=", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesLike(String value) {
            addCriterion("resources like", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotLike(String value) {
            addCriterion("resources not like", value, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesIn(List<String> values) {
            addCriterion("resources in", values, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotIn(List<String> values) {
            addCriterion("resources not in", values, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesBetween(String value1, String value2) {
            addCriterion("resources between", value1, value2, "resources");
            return (Criteria) this;
        }

        public Criteria andResourcesNotBetween(String value1, String value2) {
            addCriterion("resources not between", value1, value2, "resources");
            return (Criteria) this;
        }

        public Criteria andMemberIconIsNull() {
            addCriterion("member_icon is null");
            return (Criteria) this;
        }

        public Criteria andMemberIconIsNotNull() {
            addCriterion("member_icon is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIconEqualTo(String value) {
            addCriterion("member_icon =", value, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconNotEqualTo(String value) {
            addCriterion("member_icon <>", value, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconGreaterThan(String value) {
            addCriterion("member_icon >", value, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconGreaterThanOrEqualTo(String value) {
            addCriterion("member_icon >=", value, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconLessThan(String value) {
            addCriterion("member_icon <", value, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconLessThanOrEqualTo(String value) {
            addCriterion("member_icon <=", value, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconLike(String value) {
            addCriterion("member_icon like", value, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconNotLike(String value) {
            addCriterion("member_icon not like", value, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconIn(List<String> values) {
            addCriterion("member_icon in", values, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconNotIn(List<String> values) {
            addCriterion("member_icon not in", values, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconBetween(String value1, String value2) {
            addCriterion("member_icon between", value1, value2, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andMemberIconNotBetween(String value1, String value2) {
            addCriterion("member_icon not between", value1, value2, "memberIcon");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNull() {
            addCriterion("comment_type is null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIsNotNull() {
            addCriterion("comment_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTypeEqualTo(Byte value) {
            addCriterion("comment_type =", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotEqualTo(Byte value) {
            addCriterion("comment_type <>", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThan(Byte value) {
            addCriterion("comment_type >", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("comment_type >=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThan(Byte value) {
            addCriterion("comment_type <", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeLessThanOrEqualTo(Byte value) {
            addCriterion("comment_type <=", value, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeIn(List<Byte> values) {
            addCriterion("comment_type in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotIn(List<Byte> values) {
            addCriterion("comment_type not in", values, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeBetween(Byte value1, Byte value2) {
            addCriterion("comment_type between", value1, value2, "commentType");
            return (Criteria) this;
        }

        public Criteria andCommentTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("comment_type not between", value1, value2, "commentType");
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