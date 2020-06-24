package cn.uaj.mall.entity.pms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmsSkuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsSkuInfoExample() {
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

        public Criteria andSkuDescIsNull() {
            addCriterion("sku_desc is null");
            return (Criteria) this;
        }

        public Criteria andSkuDescIsNotNull() {
            addCriterion("sku_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSkuDescEqualTo(String value) {
            addCriterion("sku_desc =", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotEqualTo(String value) {
            addCriterion("sku_desc <>", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescGreaterThan(String value) {
            addCriterion("sku_desc >", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescGreaterThanOrEqualTo(String value) {
            addCriterion("sku_desc >=", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescLessThan(String value) {
            addCriterion("sku_desc <", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescLessThanOrEqualTo(String value) {
            addCriterion("sku_desc <=", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescLike(String value) {
            addCriterion("sku_desc like", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotLike(String value) {
            addCriterion("sku_desc not like", value, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescIn(List<String> values) {
            addCriterion("sku_desc in", values, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotIn(List<String> values) {
            addCriterion("sku_desc not in", values, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescBetween(String value1, String value2) {
            addCriterion("sku_desc between", value1, value2, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andSkuDescNotBetween(String value1, String value2) {
            addCriterion("sku_desc not between", value1, value2, "skuDesc");
            return (Criteria) this;
        }

        public Criteria andCatalogIdIsNull() {
            addCriterion("catalog_id is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIdIsNotNull() {
            addCriterion("catalog_id is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogIdEqualTo(Long value) {
            addCriterion("catalog_id =", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdNotEqualTo(Long value) {
            addCriterion("catalog_id <>", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdGreaterThan(Long value) {
            addCriterion("catalog_id >", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("catalog_id >=", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdLessThan(Long value) {
            addCriterion("catalog_id <", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdLessThanOrEqualTo(Long value) {
            addCriterion("catalog_id <=", value, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdIn(List<Long> values) {
            addCriterion("catalog_id in", values, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdNotIn(List<Long> values) {
            addCriterion("catalog_id not in", values, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdBetween(Long value1, Long value2) {
            addCriterion("catalog_id between", value1, value2, "catalogId");
            return (Criteria) this;
        }

        public Criteria andCatalogIdNotBetween(Long value1, Long value2) {
            addCriterion("catalog_id not between", value1, value2, "catalogId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgIsNull() {
            addCriterion("sku_default_img is null");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgIsNotNull() {
            addCriterion("sku_default_img is not null");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgEqualTo(String value) {
            addCriterion("sku_default_img =", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgNotEqualTo(String value) {
            addCriterion("sku_default_img <>", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgGreaterThan(String value) {
            addCriterion("sku_default_img >", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgGreaterThanOrEqualTo(String value) {
            addCriterion("sku_default_img >=", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgLessThan(String value) {
            addCriterion("sku_default_img <", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgLessThanOrEqualTo(String value) {
            addCriterion("sku_default_img <=", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgLike(String value) {
            addCriterion("sku_default_img like", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgNotLike(String value) {
            addCriterion("sku_default_img not like", value, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgIn(List<String> values) {
            addCriterion("sku_default_img in", values, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgNotIn(List<String> values) {
            addCriterion("sku_default_img not in", values, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgBetween(String value1, String value2) {
            addCriterion("sku_default_img between", value1, value2, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuDefaultImgNotBetween(String value1, String value2) {
            addCriterion("sku_default_img not between", value1, value2, "skuDefaultImg");
            return (Criteria) this;
        }

        public Criteria andSkuTitleIsNull() {
            addCriterion("sku_title is null");
            return (Criteria) this;
        }

        public Criteria andSkuTitleIsNotNull() {
            addCriterion("sku_title is not null");
            return (Criteria) this;
        }

        public Criteria andSkuTitleEqualTo(String value) {
            addCriterion("sku_title =", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleNotEqualTo(String value) {
            addCriterion("sku_title <>", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleGreaterThan(String value) {
            addCriterion("sku_title >", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleGreaterThanOrEqualTo(String value) {
            addCriterion("sku_title >=", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleLessThan(String value) {
            addCriterion("sku_title <", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleLessThanOrEqualTo(String value) {
            addCriterion("sku_title <=", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleLike(String value) {
            addCriterion("sku_title like", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleNotLike(String value) {
            addCriterion("sku_title not like", value, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleIn(List<String> values) {
            addCriterion("sku_title in", values, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleNotIn(List<String> values) {
            addCriterion("sku_title not in", values, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleBetween(String value1, String value2) {
            addCriterion("sku_title between", value1, value2, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuTitleNotBetween(String value1, String value2) {
            addCriterion("sku_title not between", value1, value2, "skuTitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleIsNull() {
            addCriterion("sku_subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleIsNotNull() {
            addCriterion("sku_subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleEqualTo(String value) {
            addCriterion("sku_subtitle =", value, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleNotEqualTo(String value) {
            addCriterion("sku_subtitle <>", value, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleGreaterThan(String value) {
            addCriterion("sku_subtitle >", value, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("sku_subtitle >=", value, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleLessThan(String value) {
            addCriterion("sku_subtitle <", value, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleLessThanOrEqualTo(String value) {
            addCriterion("sku_subtitle <=", value, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleLike(String value) {
            addCriterion("sku_subtitle like", value, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleNotLike(String value) {
            addCriterion("sku_subtitle not like", value, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleIn(List<String> values) {
            addCriterion("sku_subtitle in", values, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleNotIn(List<String> values) {
            addCriterion("sku_subtitle not in", values, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleBetween(String value1, String value2) {
            addCriterion("sku_subtitle between", value1, value2, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andSkuSubtitleNotBetween(String value1, String value2) {
            addCriterion("sku_subtitle not between", value1, value2, "skuSubtitle");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSaleCountIsNull() {
            addCriterion("sale_count is null");
            return (Criteria) this;
        }

        public Criteria andSaleCountIsNotNull() {
            addCriterion("sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCountEqualTo(Long value) {
            addCriterion("sale_count =", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotEqualTo(Long value) {
            addCriterion("sale_count <>", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThan(Long value) {
            addCriterion("sale_count >", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_count >=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThan(Long value) {
            addCriterion("sale_count <", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountLessThanOrEqualTo(Long value) {
            addCriterion("sale_count <=", value, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountIn(List<Long> values) {
            addCriterion("sale_count in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotIn(List<Long> values) {
            addCriterion("sale_count not in", values, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountBetween(Long value1, Long value2) {
            addCriterion("sale_count between", value1, value2, "saleCount");
            return (Criteria) this;
        }

        public Criteria andSaleCountNotBetween(Long value1, Long value2) {
            addCriterion("sale_count not between", value1, value2, "saleCount");
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