package cn.uaj.mall.entity.oms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsOrderReturnApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderReturnApplyExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
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

        public Criteria andMemberUsernameIsNull() {
            addCriterion("member_username is null");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameIsNotNull() {
            addCriterion("member_username is not null");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameEqualTo(String value) {
            addCriterion("member_username =", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotEqualTo(String value) {
            addCriterion("member_username <>", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameGreaterThan(String value) {
            addCriterion("member_username >", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("member_username >=", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameLessThan(String value) {
            addCriterion("member_username <", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameLessThanOrEqualTo(String value) {
            addCriterion("member_username <=", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameLike(String value) {
            addCriterion("member_username like", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotLike(String value) {
            addCriterion("member_username not like", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameIn(List<String> values) {
            addCriterion("member_username in", values, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotIn(List<String> values) {
            addCriterion("member_username not in", values, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameBetween(String value1, String value2) {
            addCriterion("member_username between", value1, value2, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotBetween(String value1, String value2) {
            addCriterion("member_username not between", value1, value2, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNull() {
            addCriterion("return_amount is null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNotNull() {
            addCriterion("return_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountEqualTo(BigDecimal value) {
            addCriterion("return_amount =", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotEqualTo(BigDecimal value) {
            addCriterion("return_amount <>", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThan(BigDecimal value) {
            addCriterion("return_amount >", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amount >=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThan(BigDecimal value) {
            addCriterion("return_amount <", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amount <=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIn(List<BigDecimal> values) {
            addCriterion("return_amount in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotIn(List<BigDecimal> values) {
            addCriterion("return_amount not in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amount between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amount not between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnNameIsNull() {
            addCriterion("return_name is null");
            return (Criteria) this;
        }

        public Criteria andReturnNameIsNotNull() {
            addCriterion("return_name is not null");
            return (Criteria) this;
        }

        public Criteria andReturnNameEqualTo(String value) {
            addCriterion("return_name =", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameNotEqualTo(String value) {
            addCriterion("return_name <>", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameGreaterThan(String value) {
            addCriterion("return_name >", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameGreaterThanOrEqualTo(String value) {
            addCriterion("return_name >=", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameLessThan(String value) {
            addCriterion("return_name <", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameLessThanOrEqualTo(String value) {
            addCriterion("return_name <=", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameLike(String value) {
            addCriterion("return_name like", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameNotLike(String value) {
            addCriterion("return_name not like", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameIn(List<String> values) {
            addCriterion("return_name in", values, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameNotIn(List<String> values) {
            addCriterion("return_name not in", values, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameBetween(String value1, String value2) {
            addCriterion("return_name between", value1, value2, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameNotBetween(String value1, String value2) {
            addCriterion("return_name not between", value1, value2, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneIsNull() {
            addCriterion("return_phone is null");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneIsNotNull() {
            addCriterion("return_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneEqualTo(String value) {
            addCriterion("return_phone =", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotEqualTo(String value) {
            addCriterion("return_phone <>", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneGreaterThan(String value) {
            addCriterion("return_phone >", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("return_phone >=", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneLessThan(String value) {
            addCriterion("return_phone <", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneLessThanOrEqualTo(String value) {
            addCriterion("return_phone <=", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneLike(String value) {
            addCriterion("return_phone like", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotLike(String value) {
            addCriterion("return_phone not like", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneIn(List<String> values) {
            addCriterion("return_phone in", values, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotIn(List<String> values) {
            addCriterion("return_phone not in", values, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneBetween(String value1, String value2) {
            addCriterion("return_phone between", value1, value2, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotBetween(String value1, String value2) {
            addCriterion("return_phone not between", value1, value2, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNull() {
            addCriterion("handle_time is null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNotNull() {
            addCriterion("handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualTo(Date value) {
            addCriterion("handle_time =", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Date value) {
            addCriterion("handle_time <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Date value) {
            addCriterion("handle_time >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("handle_time >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Date value) {
            addCriterion("handle_time <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("handle_time <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIn(List<Date> values) {
            addCriterion("handle_time in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotIn(List<Date> values) {
            addCriterion("handle_time not in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeBetween(Date value1, Date value2) {
            addCriterion("handle_time between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("handle_time not between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andSkuImgIsNull() {
            addCriterion("sku_img is null");
            return (Criteria) this;
        }

        public Criteria andSkuImgIsNotNull() {
            addCriterion("sku_img is not null");
            return (Criteria) this;
        }

        public Criteria andSkuImgEqualTo(String value) {
            addCriterion("sku_img =", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotEqualTo(String value) {
            addCriterion("sku_img <>", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgGreaterThan(String value) {
            addCriterion("sku_img >", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgGreaterThanOrEqualTo(String value) {
            addCriterion("sku_img >=", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLessThan(String value) {
            addCriterion("sku_img <", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLessThanOrEqualTo(String value) {
            addCriterion("sku_img <=", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLike(String value) {
            addCriterion("sku_img like", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotLike(String value) {
            addCriterion("sku_img not like", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgIn(List<String> values) {
            addCriterion("sku_img in", values, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotIn(List<String> values) {
            addCriterion("sku_img not in", values, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgBetween(String value1, String value2) {
            addCriterion("sku_img between", value1, value2, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotBetween(String value1, String value2) {
            addCriterion("sku_img not between", value1, value2, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIsNull() {
            addCriterion("sku_brand is null");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIsNotNull() {
            addCriterion("sku_brand is not null");
            return (Criteria) this;
        }

        public Criteria andSkuBrandEqualTo(String value) {
            addCriterion("sku_brand =", value, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNotEqualTo(String value) {
            addCriterion("sku_brand <>", value, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandGreaterThan(String value) {
            addCriterion("sku_brand >", value, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandGreaterThanOrEqualTo(String value) {
            addCriterion("sku_brand >=", value, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandLessThan(String value) {
            addCriterion("sku_brand <", value, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandLessThanOrEqualTo(String value) {
            addCriterion("sku_brand <=", value, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandLike(String value) {
            addCriterion("sku_brand like", value, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNotLike(String value) {
            addCriterion("sku_brand not like", value, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandIn(List<String> values) {
            addCriterion("sku_brand in", values, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNotIn(List<String> values) {
            addCriterion("sku_brand not in", values, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandBetween(String value1, String value2) {
            addCriterion("sku_brand between", value1, value2, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuBrandNotBetween(String value1, String value2) {
            addCriterion("sku_brand not between", value1, value2, "skuBrand");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsIsNull() {
            addCriterion("sku_attrs_vals is null");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsIsNotNull() {
            addCriterion("sku_attrs_vals is not null");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsEqualTo(String value) {
            addCriterion("sku_attrs_vals =", value, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsNotEqualTo(String value) {
            addCriterion("sku_attrs_vals <>", value, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsGreaterThan(String value) {
            addCriterion("sku_attrs_vals >", value, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsGreaterThanOrEqualTo(String value) {
            addCriterion("sku_attrs_vals >=", value, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsLessThan(String value) {
            addCriterion("sku_attrs_vals <", value, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsLessThanOrEqualTo(String value) {
            addCriterion("sku_attrs_vals <=", value, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsLike(String value) {
            addCriterion("sku_attrs_vals like", value, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsNotLike(String value) {
            addCriterion("sku_attrs_vals not like", value, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsIn(List<String> values) {
            addCriterion("sku_attrs_vals in", values, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsNotIn(List<String> values) {
            addCriterion("sku_attrs_vals not in", values, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsBetween(String value1, String value2) {
            addCriterion("sku_attrs_vals between", value1, value2, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuAttrsValsNotBetween(String value1, String value2) {
            addCriterion("sku_attrs_vals not between", value1, value2, "skuAttrsVals");
            return (Criteria) this;
        }

        public Criteria andSkuCountIsNull() {
            addCriterion("sku_count is null");
            return (Criteria) this;
        }

        public Criteria andSkuCountIsNotNull() {
            addCriterion("sku_count is not null");
            return (Criteria) this;
        }

        public Criteria andSkuCountEqualTo(Integer value) {
            addCriterion("sku_count =", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountNotEqualTo(Integer value) {
            addCriterion("sku_count <>", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountGreaterThan(Integer value) {
            addCriterion("sku_count >", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_count >=", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountLessThan(Integer value) {
            addCriterion("sku_count <", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountLessThanOrEqualTo(Integer value) {
            addCriterion("sku_count <=", value, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountIn(List<Integer> values) {
            addCriterion("sku_count in", values, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountNotIn(List<Integer> values) {
            addCriterion("sku_count not in", values, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountBetween(Integer value1, Integer value2) {
            addCriterion("sku_count between", value1, value2, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_count not between", value1, value2, "skuCount");
            return (Criteria) this;
        }

        public Criteria andSkuPriceIsNull() {
            addCriterion("sku_price is null");
            return (Criteria) this;
        }

        public Criteria andSkuPriceIsNotNull() {
            addCriterion("sku_price is not null");
            return (Criteria) this;
        }

        public Criteria andSkuPriceEqualTo(BigDecimal value) {
            addCriterion("sku_price =", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceNotEqualTo(BigDecimal value) {
            addCriterion("sku_price <>", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceGreaterThan(BigDecimal value) {
            addCriterion("sku_price >", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_price >=", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceLessThan(BigDecimal value) {
            addCriterion("sku_price <", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_price <=", value, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceIn(List<BigDecimal> values) {
            addCriterion("sku_price in", values, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceNotIn(List<BigDecimal> values) {
            addCriterion("sku_price not in", values, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_price between", value1, value2, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_price not between", value1, value2, "skuPrice");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceIsNull() {
            addCriterion("sku_real_price is null");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceIsNotNull() {
            addCriterion("sku_real_price is not null");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceEqualTo(BigDecimal value) {
            addCriterion("sku_real_price =", value, "skuRealPrice");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceNotEqualTo(BigDecimal value) {
            addCriterion("sku_real_price <>", value, "skuRealPrice");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceGreaterThan(BigDecimal value) {
            addCriterion("sku_real_price >", value, "skuRealPrice");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_real_price >=", value, "skuRealPrice");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceLessThan(BigDecimal value) {
            addCriterion("sku_real_price <", value, "skuRealPrice");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sku_real_price <=", value, "skuRealPrice");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceIn(List<BigDecimal> values) {
            addCriterion("sku_real_price in", values, "skuRealPrice");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceNotIn(List<BigDecimal> values) {
            addCriterion("sku_real_price not in", values, "skuRealPrice");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_real_price between", value1, value2, "skuRealPrice");
            return (Criteria) this;
        }

        public Criteria andSkuRealPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sku_real_price not between", value1, value2, "skuRealPrice");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andDescription述IsNull() {
            addCriterion("description述 is null");
            return (Criteria) this;
        }

        public Criteria andDescription述IsNotNull() {
            addCriterion("description述 is not null");
            return (Criteria) this;
        }

        public Criteria andDescription述EqualTo(String value) {
            addCriterion("description述 =", value, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述NotEqualTo(String value) {
            addCriterion("description述 <>", value, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述GreaterThan(String value) {
            addCriterion("description述 >", value, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述GreaterThanOrEqualTo(String value) {
            addCriterion("description述 >=", value, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述LessThan(String value) {
            addCriterion("description述 <", value, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述LessThanOrEqualTo(String value) {
            addCriterion("description述 <=", value, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述Like(String value) {
            addCriterion("description述 like", value, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述NotLike(String value) {
            addCriterion("description述 not like", value, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述In(List<String> values) {
            addCriterion("description述 in", values, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述NotIn(List<String> values) {
            addCriterion("description述 not in", values, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述Between(String value1, String value2) {
            addCriterion("description述 between", value1, value2, "description述");
            return (Criteria) this;
        }

        public Criteria andDescription述NotBetween(String value1, String value2) {
            addCriterion("description述 not between", value1, value2, "description述");
            return (Criteria) this;
        }

        public Criteria andDescPicsIsNull() {
            addCriterion("desc_pics is null");
            return (Criteria) this;
        }

        public Criteria andDescPicsIsNotNull() {
            addCriterion("desc_pics is not null");
            return (Criteria) this;
        }

        public Criteria andDescPicsEqualTo(String value) {
            addCriterion("desc_pics =", value, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsNotEqualTo(String value) {
            addCriterion("desc_pics <>", value, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsGreaterThan(String value) {
            addCriterion("desc_pics >", value, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsGreaterThanOrEqualTo(String value) {
            addCriterion("desc_pics >=", value, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsLessThan(String value) {
            addCriterion("desc_pics <", value, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsLessThanOrEqualTo(String value) {
            addCriterion("desc_pics <=", value, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsLike(String value) {
            addCriterion("desc_pics like", value, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsNotLike(String value) {
            addCriterion("desc_pics not like", value, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsIn(List<String> values) {
            addCriterion("desc_pics in", values, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsNotIn(List<String> values) {
            addCriterion("desc_pics not in", values, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsBetween(String value1, String value2) {
            addCriterion("desc_pics between", value1, value2, "descPics");
            return (Criteria) this;
        }

        public Criteria andDescPicsNotBetween(String value1, String value2) {
            addCriterion("desc_pics not between", value1, value2, "descPics");
            return (Criteria) this;
        }

        public Criteria andHandleNoteIsNull() {
            addCriterion("handle_note is null");
            return (Criteria) this;
        }

        public Criteria andHandleNoteIsNotNull() {
            addCriterion("handle_note is not null");
            return (Criteria) this;
        }

        public Criteria andHandleNoteEqualTo(String value) {
            addCriterion("handle_note =", value, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteNotEqualTo(String value) {
            addCriterion("handle_note <>", value, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteGreaterThan(String value) {
            addCriterion("handle_note >", value, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteGreaterThanOrEqualTo(String value) {
            addCriterion("handle_note >=", value, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteLessThan(String value) {
            addCriterion("handle_note <", value, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteLessThanOrEqualTo(String value) {
            addCriterion("handle_note <=", value, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteLike(String value) {
            addCriterion("handle_note like", value, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteNotLike(String value) {
            addCriterion("handle_note not like", value, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteIn(List<String> values) {
            addCriterion("handle_note in", values, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteNotIn(List<String> values) {
            addCriterion("handle_note not in", values, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteBetween(String value1, String value2) {
            addCriterion("handle_note between", value1, value2, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleNoteNotBetween(String value1, String value2) {
            addCriterion("handle_note not between", value1, value2, "handleNote");
            return (Criteria) this;
        }

        public Criteria andHandleManIsNull() {
            addCriterion("handle_man is null");
            return (Criteria) this;
        }

        public Criteria andHandleManIsNotNull() {
            addCriterion("handle_man is not null");
            return (Criteria) this;
        }

        public Criteria andHandleManEqualTo(String value) {
            addCriterion("handle_man =", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManNotEqualTo(String value) {
            addCriterion("handle_man <>", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManGreaterThan(String value) {
            addCriterion("handle_man >", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManGreaterThanOrEqualTo(String value) {
            addCriterion("handle_man >=", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManLessThan(String value) {
            addCriterion("handle_man <", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManLessThanOrEqualTo(String value) {
            addCriterion("handle_man <=", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManLike(String value) {
            addCriterion("handle_man like", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManNotLike(String value) {
            addCriterion("handle_man not like", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManIn(List<String> values) {
            addCriterion("handle_man in", values, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManNotIn(List<String> values) {
            addCriterion("handle_man not in", values, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManBetween(String value1, String value2) {
            addCriterion("handle_man between", value1, value2, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManNotBetween(String value1, String value2) {
            addCriterion("handle_man not between", value1, value2, "handleMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManIsNull() {
            addCriterion("receive_man is null");
            return (Criteria) this;
        }

        public Criteria andReceiveManIsNotNull() {
            addCriterion("receive_man is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveManEqualTo(String value) {
            addCriterion("receive_man =", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManNotEqualTo(String value) {
            addCriterion("receive_man <>", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManGreaterThan(String value) {
            addCriterion("receive_man >", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManGreaterThanOrEqualTo(String value) {
            addCriterion("receive_man >=", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManLessThan(String value) {
            addCriterion("receive_man <", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManLessThanOrEqualTo(String value) {
            addCriterion("receive_man <=", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManLike(String value) {
            addCriterion("receive_man like", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManNotLike(String value) {
            addCriterion("receive_man not like", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManIn(List<String> values) {
            addCriterion("receive_man in", values, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManNotIn(List<String> values) {
            addCriterion("receive_man not in", values, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManBetween(String value1, String value2) {
            addCriterion("receive_man between", value1, value2, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManNotBetween(String value1, String value2) {
            addCriterion("receive_man not between", value1, value2, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteIsNull() {
            addCriterion("receive_note is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteIsNotNull() {
            addCriterion("receive_note is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteEqualTo(String value) {
            addCriterion("receive_note =", value, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteNotEqualTo(String value) {
            addCriterion("receive_note <>", value, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteGreaterThan(String value) {
            addCriterion("receive_note >", value, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteGreaterThanOrEqualTo(String value) {
            addCriterion("receive_note >=", value, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteLessThan(String value) {
            addCriterion("receive_note <", value, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteLessThanOrEqualTo(String value) {
            addCriterion("receive_note <=", value, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteLike(String value) {
            addCriterion("receive_note like", value, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteNotLike(String value) {
            addCriterion("receive_note not like", value, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteIn(List<String> values) {
            addCriterion("receive_note in", values, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteNotIn(List<String> values) {
            addCriterion("receive_note not in", values, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteBetween(String value1, String value2) {
            addCriterion("receive_note between", value1, value2, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceiveNoteNotBetween(String value1, String value2) {
            addCriterion("receive_note not between", value1, value2, "receiveNote");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNull() {
            addCriterion("receive_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNotNull() {
            addCriterion("receive_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneEqualTo(String value) {
            addCriterion("receive_phone =", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotEqualTo(String value) {
            addCriterion("receive_phone <>", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThan(String value) {
            addCriterion("receive_phone >", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receive_phone >=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThan(String value) {
            addCriterion("receive_phone <", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThanOrEqualTo(String value) {
            addCriterion("receive_phone <=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLike(String value) {
            addCriterion("receive_phone like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotLike(String value) {
            addCriterion("receive_phone not like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIn(List<String> values) {
            addCriterion("receive_phone in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotIn(List<String> values) {
            addCriterion("receive_phone not in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneBetween(String value1, String value2) {
            addCriterion("receive_phone between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotBetween(String value1, String value2) {
            addCriterion("receive_phone not between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
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