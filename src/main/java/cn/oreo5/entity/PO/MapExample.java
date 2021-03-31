package cn.oreo5.entity.PO;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MapExample() {
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

        public Criteria andClasIsNull() {
            addCriterion("clas is null");
            return (Criteria) this;
        }

        public Criteria andClasIsNotNull() {
            addCriterion("clas is not null");
            return (Criteria) this;
        }

        public Criteria andClasEqualTo(Integer value) {
            addCriterion("clas =", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasNotEqualTo(Integer value) {
            addCriterion("clas <>", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasGreaterThan(Integer value) {
            addCriterion("clas >", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasGreaterThanOrEqualTo(Integer value) {
            addCriterion("clas >=", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasLessThan(Integer value) {
            addCriterion("clas <", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasLessThanOrEqualTo(Integer value) {
            addCriterion("clas <=", value, "clas");
            return (Criteria) this;
        }

        public Criteria andClasIn(List<Integer> values) {
            addCriterion("clas in", values, "clas");
            return (Criteria) this;
        }

        public Criteria andClasNotIn(List<Integer> values) {
            addCriterion("clas not in", values, "clas");
            return (Criteria) this;
        }

        public Criteria andClasBetween(Integer value1, Integer value2) {
            addCriterion("clas between", value1, value2, "clas");
            return (Criteria) this;
        }

        public Criteria andClasNotBetween(Integer value1, Integer value2) {
            addCriterion("clas not between", value1, value2, "clas");
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

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
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

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
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

        public Criteria andCarportTotalIsNull() {
            addCriterion("carport_total is null");
            return (Criteria) this;
        }

        public Criteria andCarportTotalIsNotNull() {
            addCriterion("carport_total is not null");
            return (Criteria) this;
        }

        public Criteria andCarportTotalEqualTo(Integer value) {
            addCriterion("carport_total =", value, "carportTotal");
            return (Criteria) this;
        }

        public Criteria andCarportTotalNotEqualTo(Integer value) {
            addCriterion("carport_total <>", value, "carportTotal");
            return (Criteria) this;
        }

        public Criteria andCarportTotalGreaterThan(Integer value) {
            addCriterion("carport_total >", value, "carportTotal");
            return (Criteria) this;
        }

        public Criteria andCarportTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("carport_total >=", value, "carportTotal");
            return (Criteria) this;
        }

        public Criteria andCarportTotalLessThan(Integer value) {
            addCriterion("carport_total <", value, "carportTotal");
            return (Criteria) this;
        }

        public Criteria andCarportTotalLessThanOrEqualTo(Integer value) {
            addCriterion("carport_total <=", value, "carportTotal");
            return (Criteria) this;
        }

        public Criteria andCarportTotalIn(List<Integer> values) {
            addCriterion("carport_total in", values, "carportTotal");
            return (Criteria) this;
        }

        public Criteria andCarportTotalNotIn(List<Integer> values) {
            addCriterion("carport_total not in", values, "carportTotal");
            return (Criteria) this;
        }

        public Criteria andCarportTotalBetween(Integer value1, Integer value2) {
            addCriterion("carport_total between", value1, value2, "carportTotal");
            return (Criteria) this;
        }

        public Criteria andCarportTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("carport_total not between", value1, value2, "carportTotal");
            return (Criteria) this;
        }

        public Criteria andCarportUsedIsNull() {
            addCriterion("carport_used is null");
            return (Criteria) this;
        }

        public Criteria andCarportUsedIsNotNull() {
            addCriterion("carport_used is not null");
            return (Criteria) this;
        }

        public Criteria andCarportUsedEqualTo(Integer value) {
            addCriterion("carport_used =", value, "carportUsed");
            return (Criteria) this;
        }

        public Criteria andCarportUsedNotEqualTo(Integer value) {
            addCriterion("carport_used <>", value, "carportUsed");
            return (Criteria) this;
        }

        public Criteria andCarportUsedGreaterThan(Integer value) {
            addCriterion("carport_used >", value, "carportUsed");
            return (Criteria) this;
        }

        public Criteria andCarportUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("carport_used >=", value, "carportUsed");
            return (Criteria) this;
        }

        public Criteria andCarportUsedLessThan(Integer value) {
            addCriterion("carport_used <", value, "carportUsed");
            return (Criteria) this;
        }

        public Criteria andCarportUsedLessThanOrEqualTo(Integer value) {
            addCriterion("carport_used <=", value, "carportUsed");
            return (Criteria) this;
        }

        public Criteria andCarportUsedIn(List<Integer> values) {
            addCriterion("carport_used in", values, "carportUsed");
            return (Criteria) this;
        }

        public Criteria andCarportUsedNotIn(List<Integer> values) {
            addCriterion("carport_used not in", values, "carportUsed");
            return (Criteria) this;
        }

        public Criteria andCarportUsedBetween(Integer value1, Integer value2) {
            addCriterion("carport_used between", value1, value2, "carportUsed");
            return (Criteria) this;
        }

        public Criteria andCarportUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("carport_used not between", value1, value2, "carportUsed");
            return (Criteria) this;
        }

        public Criteria andCarTotalIsNull() {
            addCriterion("car_total is null");
            return (Criteria) this;
        }

        public Criteria andCarTotalIsNotNull() {
            addCriterion("car_total is not null");
            return (Criteria) this;
        }

        public Criteria andCarTotalEqualTo(Integer value) {
            addCriterion("car_total =", value, "carTotal");
            return (Criteria) this;
        }

        public Criteria andCarTotalNotEqualTo(Integer value) {
            addCriterion("car_total <>", value, "carTotal");
            return (Criteria) this;
        }

        public Criteria andCarTotalGreaterThan(Integer value) {
            addCriterion("car_total >", value, "carTotal");
            return (Criteria) this;
        }

        public Criteria andCarTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_total >=", value, "carTotal");
            return (Criteria) this;
        }

        public Criteria andCarTotalLessThan(Integer value) {
            addCriterion("car_total <", value, "carTotal");
            return (Criteria) this;
        }

        public Criteria andCarTotalLessThanOrEqualTo(Integer value) {
            addCriterion("car_total <=", value, "carTotal");
            return (Criteria) this;
        }

        public Criteria andCarTotalIn(List<Integer> values) {
            addCriterion("car_total in", values, "carTotal");
            return (Criteria) this;
        }

        public Criteria andCarTotalNotIn(List<Integer> values) {
            addCriterion("car_total not in", values, "carTotal");
            return (Criteria) this;
        }

        public Criteria andCarTotalBetween(Integer value1, Integer value2) {
            addCriterion("car_total between", value1, value2, "carTotal");
            return (Criteria) this;
        }

        public Criteria andCarTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("car_total not between", value1, value2, "carTotal");
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