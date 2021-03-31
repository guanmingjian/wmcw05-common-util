package cn.oreo5.entity.PO;

import java.util.ArrayList;
import java.util.List;

public class UserRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRecordExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdIsNull() {
            addCriterion("article_like_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdIsNotNull() {
            addCriterion("article_like_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdEqualTo(Integer value) {
            addCriterion("article_like_id =", value, "articleLikeId");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdNotEqualTo(Integer value) {
            addCriterion("article_like_id <>", value, "articleLikeId");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdGreaterThan(Integer value) {
            addCriterion("article_like_id >", value, "articleLikeId");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_like_id >=", value, "articleLikeId");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdLessThan(Integer value) {
            addCriterion("article_like_id <", value, "articleLikeId");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_like_id <=", value, "articleLikeId");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdIn(List<Integer> values) {
            addCriterion("article_like_id in", values, "articleLikeId");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdNotIn(List<Integer> values) {
            addCriterion("article_like_id not in", values, "articleLikeId");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdBetween(Integer value1, Integer value2) {
            addCriterion("article_like_id between", value1, value2, "articleLikeId");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_like_id not between", value1, value2, "articleLikeId");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdIsNull() {
            addCriterion("article_read_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdIsNotNull() {
            addCriterion("article_read_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdEqualTo(Integer value) {
            addCriterion("article_read_id =", value, "articleReadId");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdNotEqualTo(Integer value) {
            addCriterion("article_read_id <>", value, "articleReadId");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdGreaterThan(Integer value) {
            addCriterion("article_read_id >", value, "articleReadId");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_read_id >=", value, "articleReadId");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdLessThan(Integer value) {
            addCriterion("article_read_id <", value, "articleReadId");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_read_id <=", value, "articleReadId");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdIn(List<Integer> values) {
            addCriterion("article_read_id in", values, "articleReadId");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdNotIn(List<Integer> values) {
            addCriterion("article_read_id not in", values, "articleReadId");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdBetween(Integer value1, Integer value2) {
            addCriterion("article_read_id between", value1, value2, "articleReadId");
            return (Criteria) this;
        }

        public Criteria andArticleReadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_read_id not between", value1, value2, "articleReadId");
            return (Criteria) this;
        }

        public Criteria andArticleSearchIsNull() {
            addCriterion("article_search is null");
            return (Criteria) this;
        }

        public Criteria andArticleSearchIsNotNull() {
            addCriterion("article_search is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSearchEqualTo(String value) {
            addCriterion("article_search =", value, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchNotEqualTo(String value) {
            addCriterion("article_search <>", value, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchGreaterThan(String value) {
            addCriterion("article_search >", value, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchGreaterThanOrEqualTo(String value) {
            addCriterion("article_search >=", value, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchLessThan(String value) {
            addCriterion("article_search <", value, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchLessThanOrEqualTo(String value) {
            addCriterion("article_search <=", value, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchLike(String value) {
            addCriterion("article_search like", value, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchNotLike(String value) {
            addCriterion("article_search not like", value, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchIn(List<String> values) {
            addCriterion("article_search in", values, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchNotIn(List<String> values) {
            addCriterion("article_search not in", values, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchBetween(String value1, String value2) {
            addCriterion("article_search between", value1, value2, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andArticleSearchNotBetween(String value1, String value2) {
            addCriterion("article_search not between", value1, value2, "articleSearch");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdIsNull() {
            addCriterion("hotel_read_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdIsNotNull() {
            addCriterion("hotel_read_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdEqualTo(Integer value) {
            addCriterion("hotel_read_id =", value, "hotelReadId");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdNotEqualTo(Integer value) {
            addCriterion("hotel_read_id <>", value, "hotelReadId");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdGreaterThan(Integer value) {
            addCriterion("hotel_read_id >", value, "hotelReadId");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_read_id >=", value, "hotelReadId");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdLessThan(Integer value) {
            addCriterion("hotel_read_id <", value, "hotelReadId");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_read_id <=", value, "hotelReadId");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdIn(List<Integer> values) {
            addCriterion("hotel_read_id in", values, "hotelReadId");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdNotIn(List<Integer> values) {
            addCriterion("hotel_read_id not in", values, "hotelReadId");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_read_id between", value1, value2, "hotelReadId");
            return (Criteria) this;
        }

        public Criteria andHotelReadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_read_id not between", value1, value2, "hotelReadId");
            return (Criteria) this;
        }

        public Criteria andHotelSearchIsNull() {
            addCriterion("hotel_search is null");
            return (Criteria) this;
        }

        public Criteria andHotelSearchIsNotNull() {
            addCriterion("hotel_search is not null");
            return (Criteria) this;
        }

        public Criteria andHotelSearchEqualTo(String value) {
            addCriterion("hotel_search =", value, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchNotEqualTo(String value) {
            addCriterion("hotel_search <>", value, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchGreaterThan(String value) {
            addCriterion("hotel_search >", value, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_search >=", value, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchLessThan(String value) {
            addCriterion("hotel_search <", value, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchLessThanOrEqualTo(String value) {
            addCriterion("hotel_search <=", value, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchLike(String value) {
            addCriterion("hotel_search like", value, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchNotLike(String value) {
            addCriterion("hotel_search not like", value, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchIn(List<String> values) {
            addCriterion("hotel_search in", values, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchNotIn(List<String> values) {
            addCriterion("hotel_search not in", values, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchBetween(String value1, String value2) {
            addCriterion("hotel_search between", value1, value2, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andHotelSearchNotBetween(String value1, String value2) {
            addCriterion("hotel_search not between", value1, value2, "hotelSearch");
            return (Criteria) this;
        }

        public Criteria andCateReadIdIsNull() {
            addCriterion("cate_read_id is null");
            return (Criteria) this;
        }

        public Criteria andCateReadIdIsNotNull() {
            addCriterion("cate_read_id is not null");
            return (Criteria) this;
        }

        public Criteria andCateReadIdEqualTo(Integer value) {
            addCriterion("cate_read_id =", value, "cateReadId");
            return (Criteria) this;
        }

        public Criteria andCateReadIdNotEqualTo(Integer value) {
            addCriterion("cate_read_id <>", value, "cateReadId");
            return (Criteria) this;
        }

        public Criteria andCateReadIdGreaterThan(Integer value) {
            addCriterion("cate_read_id >", value, "cateReadId");
            return (Criteria) this;
        }

        public Criteria andCateReadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_read_id >=", value, "cateReadId");
            return (Criteria) this;
        }

        public Criteria andCateReadIdLessThan(Integer value) {
            addCriterion("cate_read_id <", value, "cateReadId");
            return (Criteria) this;
        }

        public Criteria andCateReadIdLessThanOrEqualTo(Integer value) {
            addCriterion("cate_read_id <=", value, "cateReadId");
            return (Criteria) this;
        }

        public Criteria andCateReadIdIn(List<Integer> values) {
            addCriterion("cate_read_id in", values, "cateReadId");
            return (Criteria) this;
        }

        public Criteria andCateReadIdNotIn(List<Integer> values) {
            addCriterion("cate_read_id not in", values, "cateReadId");
            return (Criteria) this;
        }

        public Criteria andCateReadIdBetween(Integer value1, Integer value2) {
            addCriterion("cate_read_id between", value1, value2, "cateReadId");
            return (Criteria) this;
        }

        public Criteria andCateReadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_read_id not between", value1, value2, "cateReadId");
            return (Criteria) this;
        }

        public Criteria andCateSearchIsNull() {
            addCriterion("cate_search is null");
            return (Criteria) this;
        }

        public Criteria andCateSearchIsNotNull() {
            addCriterion("cate_search is not null");
            return (Criteria) this;
        }

        public Criteria andCateSearchEqualTo(String value) {
            addCriterion("cate_search =", value, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchNotEqualTo(String value) {
            addCriterion("cate_search <>", value, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchGreaterThan(String value) {
            addCriterion("cate_search >", value, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchGreaterThanOrEqualTo(String value) {
            addCriterion("cate_search >=", value, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchLessThan(String value) {
            addCriterion("cate_search <", value, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchLessThanOrEqualTo(String value) {
            addCriterion("cate_search <=", value, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchLike(String value) {
            addCriterion("cate_search like", value, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchNotLike(String value) {
            addCriterion("cate_search not like", value, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchIn(List<String> values) {
            addCriterion("cate_search in", values, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchNotIn(List<String> values) {
            addCriterion("cate_search not in", values, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchBetween(String value1, String value2) {
            addCriterion("cate_search between", value1, value2, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andCateSearchNotBetween(String value1, String value2) {
            addCriterion("cate_search not between", value1, value2, "cateSearch");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeIsNull() {
            addCriterion("map_read_type is null");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeIsNotNull() {
            addCriterion("map_read_type is not null");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeEqualTo(Integer value) {
            addCriterion("map_read_type =", value, "mapReadType");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeNotEqualTo(Integer value) {
            addCriterion("map_read_type <>", value, "mapReadType");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeGreaterThan(Integer value) {
            addCriterion("map_read_type >", value, "mapReadType");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("map_read_type >=", value, "mapReadType");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeLessThan(Integer value) {
            addCriterion("map_read_type <", value, "mapReadType");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeLessThanOrEqualTo(Integer value) {
            addCriterion("map_read_type <=", value, "mapReadType");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeIn(List<Integer> values) {
            addCriterion("map_read_type in", values, "mapReadType");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeNotIn(List<Integer> values) {
            addCriterion("map_read_type not in", values, "mapReadType");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeBetween(Integer value1, Integer value2) {
            addCriterion("map_read_type between", value1, value2, "mapReadType");
            return (Criteria) this;
        }

        public Criteria andMapReadTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("map_read_type not between", value1, value2, "mapReadType");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdIsNull() {
            addCriterion("map_select_id is null");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdIsNotNull() {
            addCriterion("map_select_id is not null");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdEqualTo(Integer value) {
            addCriterion("map_select_id =", value, "mapSelectId");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdNotEqualTo(Integer value) {
            addCriterion("map_select_id <>", value, "mapSelectId");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdGreaterThan(Integer value) {
            addCriterion("map_select_id >", value, "mapSelectId");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("map_select_id >=", value, "mapSelectId");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdLessThan(Integer value) {
            addCriterion("map_select_id <", value, "mapSelectId");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdLessThanOrEqualTo(Integer value) {
            addCriterion("map_select_id <=", value, "mapSelectId");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdIn(List<Integer> values) {
            addCriterion("map_select_id in", values, "mapSelectId");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdNotIn(List<Integer> values) {
            addCriterion("map_select_id not in", values, "mapSelectId");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdBetween(Integer value1, Integer value2) {
            addCriterion("map_select_id between", value1, value2, "mapSelectId");
            return (Criteria) this;
        }

        public Criteria andMapSelectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("map_select_id not between", value1, value2, "mapSelectId");
            return (Criteria) this;
        }

        public Criteria andMapTripWayIsNull() {
            addCriterion("map_trip_way is null");
            return (Criteria) this;
        }

        public Criteria andMapTripWayIsNotNull() {
            addCriterion("map_trip_way is not null");
            return (Criteria) this;
        }

        public Criteria andMapTripWayEqualTo(Integer value) {
            addCriterion("map_trip_way =", value, "mapTripWay");
            return (Criteria) this;
        }

        public Criteria andMapTripWayNotEqualTo(Integer value) {
            addCriterion("map_trip_way <>", value, "mapTripWay");
            return (Criteria) this;
        }

        public Criteria andMapTripWayGreaterThan(Integer value) {
            addCriterion("map_trip_way >", value, "mapTripWay");
            return (Criteria) this;
        }

        public Criteria andMapTripWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("map_trip_way >=", value, "mapTripWay");
            return (Criteria) this;
        }

        public Criteria andMapTripWayLessThan(Integer value) {
            addCriterion("map_trip_way <", value, "mapTripWay");
            return (Criteria) this;
        }

        public Criteria andMapTripWayLessThanOrEqualTo(Integer value) {
            addCriterion("map_trip_way <=", value, "mapTripWay");
            return (Criteria) this;
        }

        public Criteria andMapTripWayIn(List<Integer> values) {
            addCriterion("map_trip_way in", values, "mapTripWay");
            return (Criteria) this;
        }

        public Criteria andMapTripWayNotIn(List<Integer> values) {
            addCriterion("map_trip_way not in", values, "mapTripWay");
            return (Criteria) this;
        }

        public Criteria andMapTripWayBetween(Integer value1, Integer value2) {
            addCriterion("map_trip_way between", value1, value2, "mapTripWay");
            return (Criteria) this;
        }

        public Criteria andMapTripWayNotBetween(Integer value1, Integer value2) {
            addCriterion("map_trip_way not between", value1, value2, "mapTripWay");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeIsNull() {
            addCriterion("panoramic_map_read_type is null");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeIsNotNull() {
            addCriterion("panoramic_map_read_type is not null");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeEqualTo(Integer value) {
            addCriterion("panoramic_map_read_type =", value, "panoramicMapReadType");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeNotEqualTo(Integer value) {
            addCriterion("panoramic_map_read_type <>", value, "panoramicMapReadType");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeGreaterThan(Integer value) {
            addCriterion("panoramic_map_read_type >", value, "panoramicMapReadType");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("panoramic_map_read_type >=", value, "panoramicMapReadType");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeLessThan(Integer value) {
            addCriterion("panoramic_map_read_type <", value, "panoramicMapReadType");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeLessThanOrEqualTo(Integer value) {
            addCriterion("panoramic_map_read_type <=", value, "panoramicMapReadType");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeIn(List<Integer> values) {
            addCriterion("panoramic_map_read_type in", values, "panoramicMapReadType");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeNotIn(List<Integer> values) {
            addCriterion("panoramic_map_read_type not in", values, "panoramicMapReadType");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeBetween(Integer value1, Integer value2) {
            addCriterion("panoramic_map_read_type between", value1, value2, "panoramicMapReadType");
            return (Criteria) this;
        }

        public Criteria andPanoramicMapReadTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("panoramic_map_read_type not between", value1, value2, "panoramicMapReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeIsNull() {
            addCriterion("photo_read_type is null");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeIsNotNull() {
            addCriterion("photo_read_type is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeEqualTo(Integer value) {
            addCriterion("photo_read_type =", value, "photoReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeNotEqualTo(Integer value) {
            addCriterion("photo_read_type <>", value, "photoReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeGreaterThan(Integer value) {
            addCriterion("photo_read_type >", value, "photoReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo_read_type >=", value, "photoReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeLessThan(Integer value) {
            addCriterion("photo_read_type <", value, "photoReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeLessThanOrEqualTo(Integer value) {
            addCriterion("photo_read_type <=", value, "photoReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeIn(List<Integer> values) {
            addCriterion("photo_read_type in", values, "photoReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeNotIn(List<Integer> values) {
            addCriterion("photo_read_type not in", values, "photoReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeBetween(Integer value1, Integer value2) {
            addCriterion("photo_read_type between", value1, value2, "photoReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoReadTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("photo_read_type not between", value1, value2, "photoReadType");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdIsNull() {
            addCriterion("photo_select_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdIsNotNull() {
            addCriterion("photo_select_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdEqualTo(Integer value) {
            addCriterion("photo_select_id =", value, "photoSelectId");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdNotEqualTo(Integer value) {
            addCriterion("photo_select_id <>", value, "photoSelectId");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdGreaterThan(Integer value) {
            addCriterion("photo_select_id >", value, "photoSelectId");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo_select_id >=", value, "photoSelectId");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdLessThan(Integer value) {
            addCriterion("photo_select_id <", value, "photoSelectId");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdLessThanOrEqualTo(Integer value) {
            addCriterion("photo_select_id <=", value, "photoSelectId");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdIn(List<Integer> values) {
            addCriterion("photo_select_id in", values, "photoSelectId");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdNotIn(List<Integer> values) {
            addCriterion("photo_select_id not in", values, "photoSelectId");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdBetween(Integer value1, Integer value2) {
            addCriterion("photo_select_id between", value1, value2, "photoSelectId");
            return (Criteria) this;
        }

        public Criteria andPhotoSelectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("photo_select_id not between", value1, value2, "photoSelectId");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeIsNull() {
            addCriterion("service_read_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeIsNotNull() {
            addCriterion("service_read_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeEqualTo(Integer value) {
            addCriterion("service_read_type =", value, "serviceReadType");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeNotEqualTo(Integer value) {
            addCriterion("service_read_type <>", value, "serviceReadType");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeGreaterThan(Integer value) {
            addCriterion("service_read_type >", value, "serviceReadType");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_read_type >=", value, "serviceReadType");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeLessThan(Integer value) {
            addCriterion("service_read_type <", value, "serviceReadType");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeLessThanOrEqualTo(Integer value) {
            addCriterion("service_read_type <=", value, "serviceReadType");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeIn(List<Integer> values) {
            addCriterion("service_read_type in", values, "serviceReadType");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeNotIn(List<Integer> values) {
            addCriterion("service_read_type not in", values, "serviceReadType");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeBetween(Integer value1, Integer value2) {
            addCriterion("service_read_type between", value1, value2, "serviceReadType");
            return (Criteria) this;
        }

        public Criteria andServiceReadTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_read_type not between", value1, value2, "serviceReadType");
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