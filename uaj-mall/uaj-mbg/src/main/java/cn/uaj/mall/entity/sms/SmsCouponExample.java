package cn.uaj.mall.entity.sms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmsCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmsCouponExample() {
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

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Boolean value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Boolean value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Boolean value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Boolean value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Boolean> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Boolean> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponImgIsNull() {
            addCriterion("coupon_img is null");
            return (Criteria) this;
        }

        public Criteria andCouponImgIsNotNull() {
            addCriterion("coupon_img is not null");
            return (Criteria) this;
        }

        public Criteria andCouponImgEqualTo(String value) {
            addCriterion("coupon_img =", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgNotEqualTo(String value) {
            addCriterion("coupon_img <>", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgGreaterThan(String value) {
            addCriterion("coupon_img >", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_img >=", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgLessThan(String value) {
            addCriterion("coupon_img <", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgLessThanOrEqualTo(String value) {
            addCriterion("coupon_img <=", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgLike(String value) {
            addCriterion("coupon_img like", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgNotLike(String value) {
            addCriterion("coupon_img not like", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgIn(List<String> values) {
            addCriterion("coupon_img in", values, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgNotIn(List<String> values) {
            addCriterion("coupon_img not in", values, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgBetween(String value1, String value2) {
            addCriterion("coupon_img between", value1, value2, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgNotBetween(String value1, String value2) {
            addCriterion("coupon_img not between", value1, value2, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPerLimitIsNull() {
            addCriterion("per_limit is null");
            return (Criteria) this;
        }

        public Criteria andPerLimitIsNotNull() {
            addCriterion("per_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPerLimitEqualTo(Integer value) {
            addCriterion("per_limit =", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitNotEqualTo(Integer value) {
            addCriterion("per_limit <>", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitGreaterThan(Integer value) {
            addCriterion("per_limit >", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("per_limit >=", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitLessThan(Integer value) {
            addCriterion("per_limit <", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitLessThanOrEqualTo(Integer value) {
            addCriterion("per_limit <=", value, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitIn(List<Integer> values) {
            addCriterion("per_limit in", values, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitNotIn(List<Integer> values) {
            addCriterion("per_limit not in", values, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitBetween(Integer value1, Integer value2) {
            addCriterion("per_limit between", value1, value2, "perLimit");
            return (Criteria) this;
        }

        public Criteria andPerLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("per_limit not between", value1, value2, "perLimit");
            return (Criteria) this;
        }

        public Criteria andMinPointIsNull() {
            addCriterion("min_point is null");
            return (Criteria) this;
        }

        public Criteria andMinPointIsNotNull() {
            addCriterion("min_point is not null");
            return (Criteria) this;
        }

        public Criteria andMinPointEqualTo(BigDecimal value) {
            addCriterion("min_point =", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointNotEqualTo(BigDecimal value) {
            addCriterion("min_point <>", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointGreaterThan(BigDecimal value) {
            addCriterion("min_point >", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_point >=", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointLessThan(BigDecimal value) {
            addCriterion("min_point <", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_point <=", value, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointIn(List<BigDecimal> values) {
            addCriterion("min_point in", values, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointNotIn(List<BigDecimal> values) {
            addCriterion("min_point not in", values, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_point between", value1, value2, "minPoint");
            return (Criteria) this;
        }

        public Criteria andMinPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_point not between", value1, value2, "minPoint");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNull() {
            addCriterion("use_type is null");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNotNull() {
            addCriterion("use_type is not null");
            return (Criteria) this;
        }

        public Criteria andUseTypeEqualTo(Boolean value) {
            addCriterion("use_type =", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotEqualTo(Boolean value) {
            addCriterion("use_type <>", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThan(Boolean value) {
            addCriterion("use_type >", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("use_type >=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThan(Boolean value) {
            addCriterion("use_type <", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("use_type <=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeIn(List<Boolean> values) {
            addCriterion("use_type in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotIn(List<Boolean> values) {
            addCriterion("use_type not in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("use_type between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("use_type not between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andPublishCountIsNull() {
            addCriterion("publish_count is null");
            return (Criteria) this;
        }

        public Criteria andPublishCountIsNotNull() {
            addCriterion("publish_count is not null");
            return (Criteria) this;
        }

        public Criteria andPublishCountEqualTo(Integer value) {
            addCriterion("publish_count =", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotEqualTo(Integer value) {
            addCriterion("publish_count <>", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountGreaterThan(Integer value) {
            addCriterion("publish_count >", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_count >=", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountLessThan(Integer value) {
            addCriterion("publish_count <", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountLessThanOrEqualTo(Integer value) {
            addCriterion("publish_count <=", value, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountIn(List<Integer> values) {
            addCriterion("publish_count in", values, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotIn(List<Integer> values) {
            addCriterion("publish_count not in", values, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountBetween(Integer value1, Integer value2) {
            addCriterion("publish_count between", value1, value2, "publishCount");
            return (Criteria) this;
        }

        public Criteria andPublishCountNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_count not between", value1, value2, "publishCount");
            return (Criteria) this;
        }

        public Criteria andUseCountIsNull() {
            addCriterion("use_count is null");
            return (Criteria) this;
        }

        public Criteria andUseCountIsNotNull() {
            addCriterion("use_count is not null");
            return (Criteria) this;
        }

        public Criteria andUseCountEqualTo(Integer value) {
            addCriterion("use_count =", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountNotEqualTo(Integer value) {
            addCriterion("use_count <>", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountGreaterThan(Integer value) {
            addCriterion("use_count >", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_count >=", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountLessThan(Integer value) {
            addCriterion("use_count <", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountLessThanOrEqualTo(Integer value) {
            addCriterion("use_count <=", value, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountIn(List<Integer> values) {
            addCriterion("use_count in", values, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountNotIn(List<Integer> values) {
            addCriterion("use_count not in", values, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountBetween(Integer value1, Integer value2) {
            addCriterion("use_count between", value1, value2, "useCount");
            return (Criteria) this;
        }

        public Criteria andUseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("use_count not between", value1, value2, "useCount");
            return (Criteria) this;
        }

        public Criteria andReceiveCountIsNull() {
            addCriterion("receive_count is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCountIsNotNull() {
            addCriterion("receive_count is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCountEqualTo(Integer value) {
            addCriterion("receive_count =", value, "receiveCount");
            return (Criteria) this;
        }

        public Criteria andReceiveCountNotEqualTo(Integer value) {
            addCriterion("receive_count <>", value, "receiveCount");
            return (Criteria) this;
        }

        public Criteria andReceiveCountGreaterThan(Integer value) {
            addCriterion("receive_count >", value, "receiveCount");
            return (Criteria) this;
        }

        public Criteria andReceiveCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_count >=", value, "receiveCount");
            return (Criteria) this;
        }

        public Criteria andReceiveCountLessThan(Integer value) {
            addCriterion("receive_count <", value, "receiveCount");
            return (Criteria) this;
        }

        public Criteria andReceiveCountLessThanOrEqualTo(Integer value) {
            addCriterion("receive_count <=", value, "receiveCount");
            return (Criteria) this;
        }

        public Criteria andReceiveCountIn(List<Integer> values) {
            addCriterion("receive_count in", values, "receiveCount");
            return (Criteria) this;
        }

        public Criteria andReceiveCountNotIn(List<Integer> values) {
            addCriterion("receive_count not in", values, "receiveCount");
            return (Criteria) this;
        }

        public Criteria andReceiveCountBetween(Integer value1, Integer value2) {
            addCriterion("receive_count between", value1, value2, "receiveCount");
            return (Criteria) this;
        }

        public Criteria andReceiveCountNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_count not between", value1, value2, "receiveCount");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeIsNull() {
            addCriterion("enable_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeIsNotNull() {
            addCriterion("enable_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeEqualTo(Date value) {
            addCriterion("enable_start_time =", value, "enableStartTime");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeNotEqualTo(Date value) {
            addCriterion("enable_start_time <>", value, "enableStartTime");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeGreaterThan(Date value) {
            addCriterion("enable_start_time >", value, "enableStartTime");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enable_start_time >=", value, "enableStartTime");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeLessThan(Date value) {
            addCriterion("enable_start_time <", value, "enableStartTime");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("enable_start_time <=", value, "enableStartTime");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeIn(List<Date> values) {
            addCriterion("enable_start_time in", values, "enableStartTime");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeNotIn(List<Date> values) {
            addCriterion("enable_start_time not in", values, "enableStartTime");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeBetween(Date value1, Date value2) {
            addCriterion("enable_start_time between", value1, value2, "enableStartTime");
            return (Criteria) this;
        }

        public Criteria andEnableStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("enable_start_time not between", value1, value2, "enableStartTime");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeIsNull() {
            addCriterion("enable_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeIsNotNull() {
            addCriterion("enable_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeEqualTo(Date value) {
            addCriterion("enable_end_time =", value, "enableEndTime");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeNotEqualTo(Date value) {
            addCriterion("enable_end_time <>", value, "enableEndTime");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeGreaterThan(Date value) {
            addCriterion("enable_end_time >", value, "enableEndTime");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enable_end_time >=", value, "enableEndTime");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeLessThan(Date value) {
            addCriterion("enable_end_time <", value, "enableEndTime");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("enable_end_time <=", value, "enableEndTime");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeIn(List<Date> values) {
            addCriterion("enable_end_time in", values, "enableEndTime");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeNotIn(List<Date> values) {
            addCriterion("enable_end_time not in", values, "enableEndTime");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeBetween(Date value1, Date value2) {
            addCriterion("enable_end_time between", value1, value2, "enableEndTime");
            return (Criteria) this;
        }

        public Criteria andEnableEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("enable_end_time not between", value1, value2, "enableEndTime");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNull() {
            addCriterion("member_level is null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIsNotNull() {
            addCriterion("member_level is not null");
            return (Criteria) this;
        }

        public Criteria andMemberLevelEqualTo(Boolean value) {
            addCriterion("member_level =", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotEqualTo(Boolean value) {
            addCriterion("member_level <>", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThan(Boolean value) {
            addCriterion("member_level >", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("member_level >=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThan(Boolean value) {
            addCriterion("member_level <", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("member_level <=", value, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelIn(List<Boolean> values) {
            addCriterion("member_level in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotIn(List<Boolean> values) {
            addCriterion("member_level not in", values, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("member_level between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andMemberLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("member_level not between", value1, value2, "memberLevel");
            return (Criteria) this;
        }

        public Criteria andPublishIsNull() {
            addCriterion("publish is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("publish is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(Boolean value) {
            addCriterion("publish =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(Boolean value) {
            addCriterion("publish <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(Boolean value) {
            addCriterion("publish >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("publish >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(Boolean value) {
            addCriterion("publish <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(Boolean value) {
            addCriterion("publish <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<Boolean> values) {
            addCriterion("publish in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<Boolean> values) {
            addCriterion("publish not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(Boolean value1, Boolean value2) {
            addCriterion("publish between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("publish not between", value1, value2, "publish");
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