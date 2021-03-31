package cn.oreo5.entity.PO;

import java.util.ArrayList;
import java.util.List;

public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceIsNull() {
            addCriterion("preferential_price is null");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceIsNotNull() {
            addCriterion("preferential_price is not null");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceEqualTo(Integer value) {
            addCriterion("preferential_price =", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceNotEqualTo(Integer value) {
            addCriterion("preferential_price <>", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceGreaterThan(Integer value) {
            addCriterion("preferential_price >", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("preferential_price >=", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceLessThan(Integer value) {
            addCriterion("preferential_price <", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceLessThanOrEqualTo(Integer value) {
            addCriterion("preferential_price <=", value, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceIn(List<Integer> values) {
            addCriterion("preferential_price in", values, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceNotIn(List<Integer> values) {
            addCriterion("preferential_price not in", values, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceBetween(Integer value1, Integer value2) {
            addCriterion("preferential_price between", value1, value2, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andPreferentialPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("preferential_price not between", value1, value2, "preferentialPrice");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNull() {
            addCriterion("star_level is null");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNotNull() {
            addCriterion("star_level is not null");
            return (Criteria) this;
        }

        public Criteria andStarLevelEqualTo(String value) {
            addCriterion("star_level =", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotEqualTo(String value) {
            addCriterion("star_level <>", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThan(String value) {
            addCriterion("star_level >", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThanOrEqualTo(String value) {
            addCriterion("star_level >=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThan(String value) {
            addCriterion("star_level <", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThanOrEqualTo(String value) {
            addCriterion("star_level <=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLike(String value) {
            addCriterion("star_level like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotLike(String value) {
            addCriterion("star_level not like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelIn(List<String> values) {
            addCriterion("star_level in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotIn(List<String> values) {
            addCriterion("star_level not in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelBetween(String value1, String value2) {
            addCriterion("star_level between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotBetween(String value1, String value2) {
            addCriterion("star_level not between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andBriefIntroIsNull() {
            addCriterion("brief_intro is null");
            return (Criteria) this;
        }

        public Criteria andBriefIntroIsNotNull() {
            addCriterion("brief_intro is not null");
            return (Criteria) this;
        }

        public Criteria andBriefIntroEqualTo(String value) {
            addCriterion("brief_intro =", value, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroNotEqualTo(String value) {
            addCriterion("brief_intro <>", value, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroGreaterThan(String value) {
            addCriterion("brief_intro >", value, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroGreaterThanOrEqualTo(String value) {
            addCriterion("brief_intro >=", value, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroLessThan(String value) {
            addCriterion("brief_intro <", value, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroLessThanOrEqualTo(String value) {
            addCriterion("brief_intro <=", value, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroLike(String value) {
            addCriterion("brief_intro like", value, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroNotLike(String value) {
            addCriterion("brief_intro not like", value, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroIn(List<String> values) {
            addCriterion("brief_intro in", values, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroNotIn(List<String> values) {
            addCriterion("brief_intro not in", values, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroBetween(String value1, String value2) {
            addCriterion("brief_intro between", value1, value2, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andBriefIntroNotBetween(String value1, String value2) {
            addCriterion("brief_intro not between", value1, value2, "briefIntro");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNull() {
            addCriterion("img_path is null");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNotNull() {
            addCriterion("img_path is not null");
            return (Criteria) this;
        }

        public Criteria andImgPathEqualTo(String value) {
            addCriterion("img_path =", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotEqualTo(String value) {
            addCriterion("img_path <>", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThan(String value) {
            addCriterion("img_path >", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("img_path >=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThan(String value) {
            addCriterion("img_path <", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThanOrEqualTo(String value) {
            addCriterion("img_path <=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLike(String value) {
            addCriterion("img_path like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotLike(String value) {
            addCriterion("img_path not like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathIn(List<String> values) {
            addCriterion("img_path in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotIn(List<String> values) {
            addCriterion("img_path not in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathBetween(String value1, String value2) {
            addCriterion("img_path between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotBetween(String value1, String value2) {
            addCriterion("img_path not between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andIsDepotIsNull() {
            addCriterion("is_depot is null");
            return (Criteria) this;
        }

        public Criteria andIsDepotIsNotNull() {
            addCriterion("is_depot is not null");
            return (Criteria) this;
        }

        public Criteria andIsDepotEqualTo(String value) {
            addCriterion("is_depot =", value, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotNotEqualTo(String value) {
            addCriterion("is_depot <>", value, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotGreaterThan(String value) {
            addCriterion("is_depot >", value, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotGreaterThanOrEqualTo(String value) {
            addCriterion("is_depot >=", value, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotLessThan(String value) {
            addCriterion("is_depot <", value, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotLessThanOrEqualTo(String value) {
            addCriterion("is_depot <=", value, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotLike(String value) {
            addCriterion("is_depot like", value, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotNotLike(String value) {
            addCriterion("is_depot not like", value, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotIn(List<String> values) {
            addCriterion("is_depot in", values, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotNotIn(List<String> values) {
            addCriterion("is_depot not in", values, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotBetween(String value1, String value2) {
            addCriterion("is_depot between", value1, value2, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsDepotNotBetween(String value1, String value2) {
            addCriterion("is_depot not between", value1, value2, "isDepot");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastIsNull() {
            addCriterion("is_breakfast is null");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastIsNotNull() {
            addCriterion("is_breakfast is not null");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastEqualTo(String value) {
            addCriterion("is_breakfast =", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastNotEqualTo(String value) {
            addCriterion("is_breakfast <>", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastGreaterThan(String value) {
            addCriterion("is_breakfast >", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastGreaterThanOrEqualTo(String value) {
            addCriterion("is_breakfast >=", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastLessThan(String value) {
            addCriterion("is_breakfast <", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastLessThanOrEqualTo(String value) {
            addCriterion("is_breakfast <=", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastLike(String value) {
            addCriterion("is_breakfast like", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastNotLike(String value) {
            addCriterion("is_breakfast not like", value, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastIn(List<String> values) {
            addCriterion("is_breakfast in", values, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastNotIn(List<String> values) {
            addCriterion("is_breakfast not in", values, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastBetween(String value1, String value2) {
            addCriterion("is_breakfast between", value1, value2, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsBreakfastNotBetween(String value1, String value2) {
            addCriterion("is_breakfast not between", value1, value2, "isBreakfast");
            return (Criteria) this;
        }

        public Criteria andIsWindowIsNull() {
            addCriterion("is_window is null");
            return (Criteria) this;
        }

        public Criteria andIsWindowIsNotNull() {
            addCriterion("is_window is not null");
            return (Criteria) this;
        }

        public Criteria andIsWindowEqualTo(String value) {
            addCriterion("is_window =", value, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowNotEqualTo(String value) {
            addCriterion("is_window <>", value, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowGreaterThan(String value) {
            addCriterion("is_window >", value, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowGreaterThanOrEqualTo(String value) {
            addCriterion("is_window >=", value, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowLessThan(String value) {
            addCriterion("is_window <", value, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowLessThanOrEqualTo(String value) {
            addCriterion("is_window <=", value, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowLike(String value) {
            addCriterion("is_window like", value, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowNotLike(String value) {
            addCriterion("is_window not like", value, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowIn(List<String> values) {
            addCriterion("is_window in", values, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowNotIn(List<String> values) {
            addCriterion("is_window not in", values, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowBetween(String value1, String value2) {
            addCriterion("is_window between", value1, value2, "isWindow");
            return (Criteria) this;
        }

        public Criteria andIsWindowNotBetween(String value1, String value2) {
            addCriterion("is_window not between", value1, value2, "isWindow");
            return (Criteria) this;
        }

        public Criteria andRoomSizeIsNull() {
            addCriterion("room_size is null");
            return (Criteria) this;
        }

        public Criteria andRoomSizeIsNotNull() {
            addCriterion("room_size is not null");
            return (Criteria) this;
        }

        public Criteria andRoomSizeEqualTo(Double value) {
            addCriterion("room_size =", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeNotEqualTo(Double value) {
            addCriterion("room_size <>", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeGreaterThan(Double value) {
            addCriterion("room_size >", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("room_size >=", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeLessThan(Double value) {
            addCriterion("room_size <", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeLessThanOrEqualTo(Double value) {
            addCriterion("room_size <=", value, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeIn(List<Double> values) {
            addCriterion("room_size in", values, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeNotIn(List<Double> values) {
            addCriterion("room_size not in", values, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeBetween(Double value1, Double value2) {
            addCriterion("room_size between", value1, value2, "roomSize");
            return (Criteria) this;
        }

        public Criteria andRoomSizeNotBetween(Double value1, Double value2) {
            addCriterion("room_size not between", value1, value2, "roomSize");
            return (Criteria) this;
        }

        public Criteria andHrefIsNull() {
            addCriterion("href is null");
            return (Criteria) this;
        }

        public Criteria andHrefIsNotNull() {
            addCriterion("href is not null");
            return (Criteria) this;
        }

        public Criteria andHrefEqualTo(String value) {
            addCriterion("href =", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotEqualTo(String value) {
            addCriterion("href <>", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThan(String value) {
            addCriterion("href >", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThanOrEqualTo(String value) {
            addCriterion("href >=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThan(String value) {
            addCriterion("href <", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThanOrEqualTo(String value) {
            addCriterion("href <=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLike(String value) {
            addCriterion("href like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotLike(String value) {
            addCriterion("href not like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefIn(List<String> values) {
            addCriterion("href in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotIn(List<String> values) {
            addCriterion("href not in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefBetween(String value1, String value2) {
            addCriterion("href between", value1, value2, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotBetween(String value1, String value2) {
            addCriterion("href not between", value1, value2, "href");
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