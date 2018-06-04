package com.ing.school.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyExample() {
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
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
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

        public Criteria andSchoolTypeCodeIsNull() {
            addCriterion("schoolTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeIsNotNull() {
            addCriterion("schoolTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeEqualTo(String value) {
            addCriterion("schoolTypeCode =", value, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeNotEqualTo(String value) {
            addCriterion("schoolTypeCode <>", value, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeGreaterThan(String value) {
            addCriterion("schoolTypeCode >", value, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("schoolTypeCode >=", value, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeLessThan(String value) {
            addCriterion("schoolTypeCode <", value, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("schoolTypeCode <=", value, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeLike(String value) {
            addCriterion("schoolTypeCode like", value, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeNotLike(String value) {
            addCriterion("schoolTypeCode not like", value, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeIn(List<String> values) {
            addCriterion("schoolTypeCode in", values, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeNotIn(List<String> values) {
            addCriterion("schoolTypeCode not in", values, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeBetween(String value1, String value2) {
            addCriterion("schoolTypeCode between", value1, value2, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeCodeNotBetween(String value1, String value2) {
            addCriterion("schoolTypeCode not between", value1, value2, "schoolTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("schoolName is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("schoolName is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("schoolName =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("schoolName <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("schoolName >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolName >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("schoolName <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("schoolName <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("schoolName like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("schoolName not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("schoolName in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("schoolName not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("schoolName between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("schoolName not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("applyTime is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("applyTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("applyTime =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("applyTime <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("applyTime >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applyTime >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("applyTime <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("applyTime <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("applyTime in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("applyTime not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("applyTime between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("applyTime not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameIsNull() {
            addCriterion("schoolEnglishName is null");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameIsNotNull() {
            addCriterion("schoolEnglishName is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameEqualTo(String value) {
            addCriterion("schoolEnglishName =", value, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameNotEqualTo(String value) {
            addCriterion("schoolEnglishName <>", value, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameGreaterThan(String value) {
            addCriterion("schoolEnglishName >", value, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolEnglishName >=", value, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameLessThan(String value) {
            addCriterion("schoolEnglishName <", value, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("schoolEnglishName <=", value, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameLike(String value) {
            addCriterion("schoolEnglishName like", value, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameNotLike(String value) {
            addCriterion("schoolEnglishName not like", value, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameIn(List<String> values) {
            addCriterion("schoolEnglishName in", values, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameNotIn(List<String> values) {
            addCriterion("schoolEnglishName not in", values, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameBetween(String value1, String value2) {
            addCriterion("schoolEnglishName between", value1, value2, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andSchoolEnglishNameNotBetween(String value1, String value2) {
            addCriterion("schoolEnglishName not between", value1, value2, "schoolEnglishName");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentIsNull() {
            addCriterion("followUpContent is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentIsNotNull() {
            addCriterion("followUpContent is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentEqualTo(String value) {
            addCriterion("followUpContent =", value, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentNotEqualTo(String value) {
            addCriterion("followUpContent <>", value, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentGreaterThan(String value) {
            addCriterion("followUpContent >", value, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentGreaterThanOrEqualTo(String value) {
            addCriterion("followUpContent >=", value, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentLessThan(String value) {
            addCriterion("followUpContent <", value, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentLessThanOrEqualTo(String value) {
            addCriterion("followUpContent <=", value, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentLike(String value) {
            addCriterion("followUpContent like", value, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentNotLike(String value) {
            addCriterion("followUpContent not like", value, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentIn(List<String> values) {
            addCriterion("followUpContent in", values, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentNotIn(List<String> values) {
            addCriterion("followUpContent not in", values, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentBetween(String value1, String value2) {
            addCriterion("followUpContent between", value1, value2, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpContentNotBetween(String value1, String value2) {
            addCriterion("followUpContent not between", value1, value2, "followUpContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusIsNull() {
            addCriterion("followUpStatus is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusIsNotNull() {
            addCriterion("followUpStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusEqualTo(Integer value) {
            addCriterion("followUpStatus =", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusNotEqualTo(Integer value) {
            addCriterion("followUpStatus <>", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusGreaterThan(Integer value) {
            addCriterion("followUpStatus >", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("followUpStatus >=", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusLessThan(Integer value) {
            addCriterion("followUpStatus <", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("followUpStatus <=", value, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusIn(List<Integer> values) {
            addCriterion("followUpStatus in", values, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusNotIn(List<Integer> values) {
            addCriterion("followUpStatus not in", values, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusBetween(Integer value1, Integer value2) {
            addCriterion("followUpStatus between", value1, value2, "followUpStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("followUpStatus not between", value1, value2, "followUpStatus");
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