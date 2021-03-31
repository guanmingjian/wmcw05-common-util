package cn.oreo5.entity.PO;

import java.util.ArrayList;
import java.util.List;

public class ViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViewExample() {
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

        public Criteria andIndexVisitsIsNull() {
            addCriterion("index_visits is null");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsIsNotNull() {
            addCriterion("index_visits is not null");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsEqualTo(Integer value) {
            addCriterion("index_visits =", value, "indexVisits");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsNotEqualTo(Integer value) {
            addCriterion("index_visits <>", value, "indexVisits");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsGreaterThan(Integer value) {
            addCriterion("index_visits >", value, "indexVisits");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("index_visits >=", value, "indexVisits");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsLessThan(Integer value) {
            addCriterion("index_visits <", value, "indexVisits");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsLessThanOrEqualTo(Integer value) {
            addCriterion("index_visits <=", value, "indexVisits");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsIn(List<Integer> values) {
            addCriterion("index_visits in", values, "indexVisits");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsNotIn(List<Integer> values) {
            addCriterion("index_visits not in", values, "indexVisits");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsBetween(Integer value1, Integer value2) {
            addCriterion("index_visits between", value1, value2, "indexVisits");
            return (Criteria) this;
        }

        public Criteria andIndexVisitsNotBetween(Integer value1, Integer value2) {
            addCriterion("index_visits not between", value1, value2, "indexVisits");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsIsNull() {
            addCriterion("hotel_visits is null");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsIsNotNull() {
            addCriterion("hotel_visits is not null");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsEqualTo(Integer value) {
            addCriterion("hotel_visits =", value, "hotelVisits");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsNotEqualTo(Integer value) {
            addCriterion("hotel_visits <>", value, "hotelVisits");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsGreaterThan(Integer value) {
            addCriterion("hotel_visits >", value, "hotelVisits");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_visits >=", value, "hotelVisits");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsLessThan(Integer value) {
            addCriterion("hotel_visits <", value, "hotelVisits");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_visits <=", value, "hotelVisits");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsIn(List<Integer> values) {
            addCriterion("hotel_visits in", values, "hotelVisits");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsNotIn(List<Integer> values) {
            addCriterion("hotel_visits not in", values, "hotelVisits");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsBetween(Integer value1, Integer value2) {
            addCriterion("hotel_visits between", value1, value2, "hotelVisits");
            return (Criteria) this;
        }

        public Criteria andHotelVisitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_visits not between", value1, value2, "hotelVisits");
            return (Criteria) this;
        }

        public Criteria andCateVisitsIsNull() {
            addCriterion("cate_visits is null");
            return (Criteria) this;
        }

        public Criteria andCateVisitsIsNotNull() {
            addCriterion("cate_visits is not null");
            return (Criteria) this;
        }

        public Criteria andCateVisitsEqualTo(Integer value) {
            addCriterion("cate_visits =", value, "cateVisits");
            return (Criteria) this;
        }

        public Criteria andCateVisitsNotEqualTo(Integer value) {
            addCriterion("cate_visits <>", value, "cateVisits");
            return (Criteria) this;
        }

        public Criteria andCateVisitsGreaterThan(Integer value) {
            addCriterion("cate_visits >", value, "cateVisits");
            return (Criteria) this;
        }

        public Criteria andCateVisitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("cate_visits >=", value, "cateVisits");
            return (Criteria) this;
        }

        public Criteria andCateVisitsLessThan(Integer value) {
            addCriterion("cate_visits <", value, "cateVisits");
            return (Criteria) this;
        }

        public Criteria andCateVisitsLessThanOrEqualTo(Integer value) {
            addCriterion("cate_visits <=", value, "cateVisits");
            return (Criteria) this;
        }

        public Criteria andCateVisitsIn(List<Integer> values) {
            addCriterion("cate_visits in", values, "cateVisits");
            return (Criteria) this;
        }

        public Criteria andCateVisitsNotIn(List<Integer> values) {
            addCriterion("cate_visits not in", values, "cateVisits");
            return (Criteria) this;
        }

        public Criteria andCateVisitsBetween(Integer value1, Integer value2) {
            addCriterion("cate_visits between", value1, value2, "cateVisits");
            return (Criteria) this;
        }

        public Criteria andCateVisitsNotBetween(Integer value1, Integer value2) {
            addCriterion("cate_visits not between", value1, value2, "cateVisits");
            return (Criteria) this;
        }

        public Criteria andMapVisitsIsNull() {
            addCriterion("map_visits is null");
            return (Criteria) this;
        }

        public Criteria andMapVisitsIsNotNull() {
            addCriterion("map_visits is not null");
            return (Criteria) this;
        }

        public Criteria andMapVisitsEqualTo(Integer value) {
            addCriterion("map_visits =", value, "mapVisits");
            return (Criteria) this;
        }

        public Criteria andMapVisitsNotEqualTo(Integer value) {
            addCriterion("map_visits <>", value, "mapVisits");
            return (Criteria) this;
        }

        public Criteria andMapVisitsGreaterThan(Integer value) {
            addCriterion("map_visits >", value, "mapVisits");
            return (Criteria) this;
        }

        public Criteria andMapVisitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("map_visits >=", value, "mapVisits");
            return (Criteria) this;
        }

        public Criteria andMapVisitsLessThan(Integer value) {
            addCriterion("map_visits <", value, "mapVisits");
            return (Criteria) this;
        }

        public Criteria andMapVisitsLessThanOrEqualTo(Integer value) {
            addCriterion("map_visits <=", value, "mapVisits");
            return (Criteria) this;
        }

        public Criteria andMapVisitsIn(List<Integer> values) {
            addCriterion("map_visits in", values, "mapVisits");
            return (Criteria) this;
        }

        public Criteria andMapVisitsNotIn(List<Integer> values) {
            addCriterion("map_visits not in", values, "mapVisits");
            return (Criteria) this;
        }

        public Criteria andMapVisitsBetween(Integer value1, Integer value2) {
            addCriterion("map_visits between", value1, value2, "mapVisits");
            return (Criteria) this;
        }

        public Criteria andMapVisitsNotBetween(Integer value1, Integer value2) {
            addCriterion("map_visits not between", value1, value2, "mapVisits");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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