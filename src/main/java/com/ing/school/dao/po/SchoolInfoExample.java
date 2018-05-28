package com.ing.school.dao.po;

import java.util.ArrayList;
import java.util.List;

public class SchoolInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolInfoExample() {
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

        public Criteria andSchoolIdIsNull() {
            addCriterion("schoolId is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("schoolId is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("schoolId =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("schoolId <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("schoolId >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoolId >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("schoolId <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("schoolId <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("schoolId in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("schoolId not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("schoolId between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("schoolId not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlIsNull() {
            addCriterion("headPictureUrl is null");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlIsNotNull() {
            addCriterion("headPictureUrl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlEqualTo(String value) {
            addCriterion("headPictureUrl =", value, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlNotEqualTo(String value) {
            addCriterion("headPictureUrl <>", value, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlGreaterThan(String value) {
            addCriterion("headPictureUrl >", value, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("headPictureUrl >=", value, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlLessThan(String value) {
            addCriterion("headPictureUrl <", value, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlLessThanOrEqualTo(String value) {
            addCriterion("headPictureUrl <=", value, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlLike(String value) {
            addCriterion("headPictureUrl like", value, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlNotLike(String value) {
            addCriterion("headPictureUrl not like", value, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlIn(List<String> values) {
            addCriterion("headPictureUrl in", values, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlNotIn(List<String> values) {
            addCriterion("headPictureUrl not in", values, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlBetween(String value1, String value2) {
            addCriterion("headPictureUrl between", value1, value2, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPictureUrlNotBetween(String value1, String value2) {
            addCriterion("headPictureUrl not between", value1, value2, "headPictureUrl");
            return (Criteria) this;
        }

        public Criteria andClassessIsNull() {
            addCriterion("classess is null");
            return (Criteria) this;
        }

        public Criteria andClassessIsNotNull() {
            addCriterion("classess is not null");
            return (Criteria) this;
        }

        public Criteria andClassessEqualTo(String value) {
            addCriterion("classess =", value, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessNotEqualTo(String value) {
            addCriterion("classess <>", value, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessGreaterThan(String value) {
            addCriterion("classess >", value, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessGreaterThanOrEqualTo(String value) {
            addCriterion("classess >=", value, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessLessThan(String value) {
            addCriterion("classess <", value, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessLessThanOrEqualTo(String value) {
            addCriterion("classess <=", value, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessLike(String value) {
            addCriterion("classess like", value, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessNotLike(String value) {
            addCriterion("classess not like", value, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessIn(List<String> values) {
            addCriterion("classess in", values, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessNotIn(List<String> values) {
            addCriterion("classess not in", values, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessBetween(String value1, String value2) {
            addCriterion("classess between", value1, value2, "classess");
            return (Criteria) this;
        }

        public Criteria andClassessNotBetween(String value1, String value2) {
            addCriterion("classess not between", value1, value2, "classess");
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