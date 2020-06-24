package cn.uaj.mall.entity.oms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OmsOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderItemExample() {
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

        public Criteria andSpuPicIsNull() {
            addCriterion("spu_pic is null");
            return (Criteria) this;
        }

        public Criteria andSpuPicIsNotNull() {
            addCriterion("spu_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSpuPicEqualTo(String value) {
            addCriterion("spu_pic =", value, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicNotEqualTo(String value) {
            addCriterion("spu_pic <>", value, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicGreaterThan(String value) {
            addCriterion("spu_pic >", value, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicGreaterThanOrEqualTo(String value) {
            addCriterion("spu_pic >=", value, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicLessThan(String value) {
            addCriterion("spu_pic <", value, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicLessThanOrEqualTo(String value) {
            addCriterion("spu_pic <=", value, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicLike(String value) {
            addCriterion("spu_pic like", value, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicNotLike(String value) {
            addCriterion("spu_pic not like", value, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicIn(List<String> values) {
            addCriterion("spu_pic in", values, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicNotIn(List<String> values) {
            addCriterion("spu_pic not in", values, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicBetween(String value1, String value2) {
            addCriterion("spu_pic between", value1, value2, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuPicNotBetween(String value1, String value2) {
            addCriterion("spu_pic not between", value1, value2, "spuPic");
            return (Criteria) this;
        }

        public Criteria andSpuBrandIsNull() {
            addCriterion("spu_brand is null");
            return (Criteria) this;
        }

        public Criteria andSpuBrandIsNotNull() {
            addCriterion("spu_brand is not null");
            return (Criteria) this;
        }

        public Criteria andSpuBrandEqualTo(String value) {
            addCriterion("spu_brand =", value, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandNotEqualTo(String value) {
            addCriterion("spu_brand <>", value, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandGreaterThan(String value) {
            addCriterion("spu_brand >", value, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandGreaterThanOrEqualTo(String value) {
            addCriterion("spu_brand >=", value, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandLessThan(String value) {
            addCriterion("spu_brand <", value, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandLessThanOrEqualTo(String value) {
            addCriterion("spu_brand <=", value, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandLike(String value) {
            addCriterion("spu_brand like", value, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandNotLike(String value) {
            addCriterion("spu_brand not like", value, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandIn(List<String> values) {
            addCriterion("spu_brand in", values, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandNotIn(List<String> values) {
            addCriterion("spu_brand not in", values, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandBetween(String value1, String value2) {
            addCriterion("spu_brand between", value1, value2, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andSpuBrandNotBetween(String value1, String value2) {
            addCriterion("spu_brand not between", value1, value2, "spuBrand");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
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

        public Criteria andSkuPicIsNull() {
            addCriterion("sku_pic is null");
            return (Criteria) this;
        }

        public Criteria andSkuPicIsNotNull() {
            addCriterion("sku_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSkuPicEqualTo(String value) {
            addCriterion("sku_pic =", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicNotEqualTo(String value) {
            addCriterion("sku_pic <>", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicGreaterThan(String value) {
            addCriterion("sku_pic >", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicGreaterThanOrEqualTo(String value) {
            addCriterion("sku_pic >=", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicLessThan(String value) {
            addCriterion("sku_pic <", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicLessThanOrEqualTo(String value) {
            addCriterion("sku_pic <=", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicLike(String value) {
            addCriterion("sku_pic like", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicNotLike(String value) {
            addCriterion("sku_pic not like", value, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicIn(List<String> values) {
            addCriterion("sku_pic in", values, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicNotIn(List<String> values) {
            addCriterion("sku_pic not in", values, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicBetween(String value1, String value2) {
            addCriterion("sku_pic between", value1, value2, "skuPic");
            return (Criteria) this;
        }

        public Criteria andSkuPicNotBetween(String value1, String value2) {
            addCriterion("sku_pic not between", value1, value2, "skuPic");
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

        public Criteria andSkuQuantityIsNull() {
            addCriterion("sku_quantity is null");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityIsNotNull() {
            addCriterion("sku_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityEqualTo(Integer value) {
            addCriterion("sku_quantity =", value, "skuQuantity");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityNotEqualTo(Integer value) {
            addCriterion("sku_quantity <>", value, "skuQuantity");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityGreaterThan(Integer value) {
            addCriterion("sku_quantity >", value, "skuQuantity");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_quantity >=", value, "skuQuantity");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityLessThan(Integer value) {
            addCriterion("sku_quantity <", value, "skuQuantity");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("sku_quantity <=", value, "skuQuantity");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityIn(List<Integer> values) {
            addCriterion("sku_quantity in", values, "skuQuantity");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityNotIn(List<Integer> values) {
            addCriterion("sku_quantity not in", values, "skuQuantity");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityBetween(Integer value1, Integer value2) {
            addCriterion("sku_quantity between", value1, value2, "skuQuantity");
            return (Criteria) this;
        }

        public Criteria andSkuQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_quantity not between", value1, value2, "skuQuantity");
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

        public Criteria andPromotionAmountIsNull() {
            addCriterion("promotion_amount is null");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIsNotNull() {
            addCriterion("promotion_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountEqualTo(BigDecimal value) {
            addCriterion("promotion_amount =", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotEqualTo(BigDecimal value) {
            addCriterion("promotion_amount <>", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountGreaterThan(BigDecimal value) {
            addCriterion("promotion_amount >", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_amount >=", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountLessThan(BigDecimal value) {
            addCriterion("promotion_amount <", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("promotion_amount <=", value, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountIn(List<BigDecimal> values) {
            addCriterion("promotion_amount in", values, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotIn(List<BigDecimal> values) {
            addCriterion("promotion_amount not in", values, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_amount between", value1, value2, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andPromotionAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("promotion_amount not between", value1, value2, "promotionAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNull() {
            addCriterion("coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIsNotNull() {
            addCriterion("coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAmountEqualTo(BigDecimal value) {
            addCriterion("coupon_amount =", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <>", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThan(BigDecimal value) {
            addCriterion("coupon_amount >", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount >=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThan(BigDecimal value) {
            addCriterion("coupon_amount <", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_amount <=", value, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountIn(List<BigDecimal> values) {
            addCriterion("coupon_amount in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotIn(List<BigDecimal> values) {
            addCriterion("coupon_amount not in", values, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andCouponAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_amount not between", value1, value2, "couponAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountIsNull() {
            addCriterion("integration_amount is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountIsNotNull() {
            addCriterion("integration_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountEqualTo(BigDecimal value) {
            addCriterion("integration_amount =", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountNotEqualTo(BigDecimal value) {
            addCriterion("integration_amount <>", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountGreaterThan(BigDecimal value) {
            addCriterion("integration_amount >", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("integration_amount >=", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountLessThan(BigDecimal value) {
            addCriterion("integration_amount <", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("integration_amount <=", value, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountIn(List<BigDecimal> values) {
            addCriterion("integration_amount in", values, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountNotIn(List<BigDecimal> values) {
            addCriterion("integration_amount not in", values, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integration_amount between", value1, value2, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andIntegrationAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integration_amount not between", value1, value2, "integrationAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("real_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(BigDecimal value) {
            addCriterion("real_amount =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_amount <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(BigDecimal value) {
            addCriterion("real_amount >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(BigDecimal value) {
            addCriterion("real_amount <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<BigDecimal> values) {
            addCriterion("real_amount in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_amount not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationIsNull() {
            addCriterion("gift_integration is null");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationIsNotNull() {
            addCriterion("gift_integration is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationEqualTo(Integer value) {
            addCriterion("gift_integration =", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationNotEqualTo(Integer value) {
            addCriterion("gift_integration <>", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationGreaterThan(Integer value) {
            addCriterion("gift_integration >", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_integration >=", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationLessThan(Integer value) {
            addCriterion("gift_integration <", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationLessThanOrEqualTo(Integer value) {
            addCriterion("gift_integration <=", value, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationIn(List<Integer> values) {
            addCriterion("gift_integration in", values, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationNotIn(List<Integer> values) {
            addCriterion("gift_integration not in", values, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationBetween(Integer value1, Integer value2) {
            addCriterion("gift_integration between", value1, value2, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftIntegrationNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_integration not between", value1, value2, "giftIntegration");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthIsNull() {
            addCriterion("gift_growth is null");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthIsNotNull() {
            addCriterion("gift_growth is not null");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthEqualTo(Integer value) {
            addCriterion("gift_growth =", value, "giftGrowth");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthNotEqualTo(Integer value) {
            addCriterion("gift_growth <>", value, "giftGrowth");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthGreaterThan(Integer value) {
            addCriterion("gift_growth >", value, "giftGrowth");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_growth >=", value, "giftGrowth");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthLessThan(Integer value) {
            addCriterion("gift_growth <", value, "giftGrowth");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthLessThanOrEqualTo(Integer value) {
            addCriterion("gift_growth <=", value, "giftGrowth");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthIn(List<Integer> values) {
            addCriterion("gift_growth in", values, "giftGrowth");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthNotIn(List<Integer> values) {
            addCriterion("gift_growth not in", values, "giftGrowth");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthBetween(Integer value1, Integer value2) {
            addCriterion("gift_growth between", value1, value2, "giftGrowth");
            return (Criteria) this;
        }

        public Criteria andGiftGrowthNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_growth not between", value1, value2, "giftGrowth");
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