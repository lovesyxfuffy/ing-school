package com.ing.school.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyInfoExample() {
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

        public Criteria andApplyIdIsNull() {
            addCriterion("applyId is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("applyId is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(Integer value) {
            addCriterion("applyId =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(Integer value) {
            addCriterion("applyId <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(Integer value) {
            addCriterion("applyId >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("applyId >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(Integer value) {
            addCriterion("applyId <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("applyId <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<Integer> values) {
            addCriterion("applyId in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<Integer> values) {
            addCriterion("applyId not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("applyId between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("applyId not between", value1, value2, "applyId");
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

        public Criteria andStudentNameIsNull() {
            addCriterion("studentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("studentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("studentName =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("studentName <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("studentName >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("studentName >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("studentName <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("studentName <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("studentName like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("studentName not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("studentName in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("studentName not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("studentName between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("studentName not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andGenderCodeIsNull() {
            addCriterion("genderCode is null");
            return (Criteria) this;
        }

        public Criteria andGenderCodeIsNotNull() {
            addCriterion("genderCode is not null");
            return (Criteria) this;
        }

        public Criteria andGenderCodeEqualTo(String value) {
            addCriterion("genderCode =", value, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeNotEqualTo(String value) {
            addCriterion("genderCode <>", value, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeGreaterThan(String value) {
            addCriterion("genderCode >", value, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("genderCode >=", value, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeLessThan(String value) {
            addCriterion("genderCode <", value, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeLessThanOrEqualTo(String value) {
            addCriterion("genderCode <=", value, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeLike(String value) {
            addCriterion("genderCode like", value, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeNotLike(String value) {
            addCriterion("genderCode not like", value, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeIn(List<String> values) {
            addCriterion("genderCode in", values, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeNotIn(List<String> values) {
            addCriterion("genderCode not in", values, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeBetween(String value1, String value2) {
            addCriterion("genderCode between", value1, value2, "genderCode");
            return (Criteria) this;
        }

        public Criteria andGenderCodeNotBetween(String value1, String value2) {
            addCriterion("genderCode not between", value1, value2, "genderCode");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIsNull() {
            addCriterion("attendanceDate is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIsNotNull() {
            addCriterion("attendanceDate is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateEqualTo(Date value) {
            addCriterion("attendanceDate =", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotEqualTo(Date value) {
            addCriterion("attendanceDate <>", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateGreaterThan(Date value) {
            addCriterion("attendanceDate >", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("attendanceDate >=", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateLessThan(Date value) {
            addCriterion("attendanceDate <", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateLessThanOrEqualTo(Date value) {
            addCriterion("attendanceDate <=", value, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateIn(List<Date> values) {
            addCriterion("attendanceDate in", values, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotIn(List<Date> values) {
            addCriterion("attendanceDate not in", values, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateBetween(Date value1, Date value2) {
            addCriterion("attendanceDate between", value1, value2, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andAttendanceDateNotBetween(Date value1, Date value2) {
            addCriterion("attendanceDate not between", value1, value2, "attendanceDate");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeIsNull() {
            addCriterion("englishLevelTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeIsNotNull() {
            addCriterion("englishLevelTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeEqualTo(String value) {
            addCriterion("englishLevelTypeCode =", value, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeNotEqualTo(String value) {
            addCriterion("englishLevelTypeCode <>", value, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeGreaterThan(String value) {
            addCriterion("englishLevelTypeCode >", value, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("englishLevelTypeCode >=", value, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeLessThan(String value) {
            addCriterion("englishLevelTypeCode <", value, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("englishLevelTypeCode <=", value, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeLike(String value) {
            addCriterion("englishLevelTypeCode like", value, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeNotLike(String value) {
            addCriterion("englishLevelTypeCode not like", value, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeIn(List<String> values) {
            addCriterion("englishLevelTypeCode in", values, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeNotIn(List<String> values) {
            addCriterion("englishLevelTypeCode not in", values, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeBetween(String value1, String value2) {
            addCriterion("englishLevelTypeCode between", value1, value2, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelTypeCodeNotBetween(String value1, String value2) {
            addCriterion("englishLevelTypeCode not between", value1, value2, "englishLevelTypeCode");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreIsNull() {
            addCriterion("englishLevelScore is null");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreIsNotNull() {
            addCriterion("englishLevelScore is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreEqualTo(Integer value) {
            addCriterion("englishLevelScore =", value, "englishLevelScore");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreNotEqualTo(Integer value) {
            addCriterion("englishLevelScore <>", value, "englishLevelScore");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreGreaterThan(Integer value) {
            addCriterion("englishLevelScore >", value, "englishLevelScore");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("englishLevelScore >=", value, "englishLevelScore");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreLessThan(Integer value) {
            addCriterion("englishLevelScore <", value, "englishLevelScore");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreLessThanOrEqualTo(Integer value) {
            addCriterion("englishLevelScore <=", value, "englishLevelScore");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreIn(List<Integer> values) {
            addCriterion("englishLevelScore in", values, "englishLevelScore");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreNotIn(List<Integer> values) {
            addCriterion("englishLevelScore not in", values, "englishLevelScore");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreBetween(Integer value1, Integer value2) {
            addCriterion("englishLevelScore between", value1, value2, "englishLevelScore");
            return (Criteria) this;
        }

        public Criteria andEnglishLevelScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("englishLevelScore not between", value1, value2, "englishLevelScore");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailIsNull() {
            addCriterion("currentSchoolEmail is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailIsNotNull() {
            addCriterion("currentSchoolEmail is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailEqualTo(String value) {
            addCriterion("currentSchoolEmail =", value, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailNotEqualTo(String value) {
            addCriterion("currentSchoolEmail <>", value, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailGreaterThan(String value) {
            addCriterion("currentSchoolEmail >", value, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailGreaterThanOrEqualTo(String value) {
            addCriterion("currentSchoolEmail >=", value, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailLessThan(String value) {
            addCriterion("currentSchoolEmail <", value, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailLessThanOrEqualTo(String value) {
            addCriterion("currentSchoolEmail <=", value, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailLike(String value) {
            addCriterion("currentSchoolEmail like", value, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailNotLike(String value) {
            addCriterion("currentSchoolEmail not like", value, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailIn(List<String> values) {
            addCriterion("currentSchoolEmail in", values, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailNotIn(List<String> values) {
            addCriterion("currentSchoolEmail not in", values, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailBetween(String value1, String value2) {
            addCriterion("currentSchoolEmail between", value1, value2, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolEmailNotBetween(String value1, String value2) {
            addCriterion("currentSchoolEmail not between", value1, value2, "currentSchoolEmail");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneIsNull() {
            addCriterion("currentSchoolPhone is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneIsNotNull() {
            addCriterion("currentSchoolPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneEqualTo(String value) {
            addCriterion("currentSchoolPhone =", value, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneNotEqualTo(String value) {
            addCriterion("currentSchoolPhone <>", value, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneGreaterThan(String value) {
            addCriterion("currentSchoolPhone >", value, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("currentSchoolPhone >=", value, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneLessThan(String value) {
            addCriterion("currentSchoolPhone <", value, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneLessThanOrEqualTo(String value) {
            addCriterion("currentSchoolPhone <=", value, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneLike(String value) {
            addCriterion("currentSchoolPhone like", value, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneNotLike(String value) {
            addCriterion("currentSchoolPhone not like", value, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneIn(List<String> values) {
            addCriterion("currentSchoolPhone in", values, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneNotIn(List<String> values) {
            addCriterion("currentSchoolPhone not in", values, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneBetween(String value1, String value2) {
            addCriterion("currentSchoolPhone between", value1, value2, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolPhoneNotBetween(String value1, String value2) {
            addCriterion("currentSchoolPhone not between", value1, value2, "currentSchoolPhone");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressIsNull() {
            addCriterion("currentSchoolAddress is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressIsNotNull() {
            addCriterion("currentSchoolAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressEqualTo(String value) {
            addCriterion("currentSchoolAddress =", value, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressNotEqualTo(String value) {
            addCriterion("currentSchoolAddress <>", value, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressGreaterThan(String value) {
            addCriterion("currentSchoolAddress >", value, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressGreaterThanOrEqualTo(String value) {
            addCriterion("currentSchoolAddress >=", value, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressLessThan(String value) {
            addCriterion("currentSchoolAddress <", value, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressLessThanOrEqualTo(String value) {
            addCriterion("currentSchoolAddress <=", value, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressLike(String value) {
            addCriterion("currentSchoolAddress like", value, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressNotLike(String value) {
            addCriterion("currentSchoolAddress not like", value, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressIn(List<String> values) {
            addCriterion("currentSchoolAddress in", values, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressNotIn(List<String> values) {
            addCriterion("currentSchoolAddress not in", values, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressBetween(String value1, String value2) {
            addCriterion("currentSchoolAddress between", value1, value2, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolAddressNotBetween(String value1, String value2) {
            addCriterion("currentSchoolAddress not between", value1, value2, "currentSchoolAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameIsNull() {
            addCriterion("currentSchoolName is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameIsNotNull() {
            addCriterion("currentSchoolName is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameEqualTo(String value) {
            addCriterion("currentSchoolName =", value, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameNotEqualTo(String value) {
            addCriterion("currentSchoolName <>", value, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameGreaterThan(String value) {
            addCriterion("currentSchoolName >", value, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("currentSchoolName >=", value, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameLessThan(String value) {
            addCriterion("currentSchoolName <", value, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("currentSchoolName <=", value, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameLike(String value) {
            addCriterion("currentSchoolName like", value, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameNotLike(String value) {
            addCriterion("currentSchoolName not like", value, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameIn(List<String> values) {
            addCriterion("currentSchoolName in", values, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameNotIn(List<String> values) {
            addCriterion("currentSchoolName not in", values, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameBetween(String value1, String value2) {
            addCriterion("currentSchoolName between", value1, value2, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andCurrentSchoolNameNotBetween(String value1, String value2) {
            addCriterion("currentSchoolName not between", value1, value2, "currentSchoolName");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNull() {
            addCriterion("wechatId is null");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNotNull() {
            addCriterion("wechatId is not null");
            return (Criteria) this;
        }

        public Criteria andWechatIdEqualTo(String value) {
            addCriterion("wechatId =", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotEqualTo(String value) {
            addCriterion("wechatId <>", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThan(String value) {
            addCriterion("wechatId >", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechatId >=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThan(String value) {
            addCriterion("wechatId <", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThanOrEqualTo(String value) {
            addCriterion("wechatId <=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLike(String value) {
            addCriterion("wechatId like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotLike(String value) {
            addCriterion("wechatId not like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdIn(List<String> values) {
            addCriterion("wechatId in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotIn(List<String> values) {
            addCriterion("wechatId not in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdBetween(String value1, String value2) {
            addCriterion("wechatId between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotBetween(String value1, String value2) {
            addCriterion("wechatId not between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdIsNull() {
            addCriterion("skypeId is null");
            return (Criteria) this;
        }

        public Criteria andSkypeIdIsNotNull() {
            addCriterion("skypeId is not null");
            return (Criteria) this;
        }

        public Criteria andSkypeIdEqualTo(String value) {
            addCriterion("skypeId =", value, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdNotEqualTo(String value) {
            addCriterion("skypeId <>", value, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdGreaterThan(String value) {
            addCriterion("skypeId >", value, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("skypeId >=", value, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdLessThan(String value) {
            addCriterion("skypeId <", value, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdLessThanOrEqualTo(String value) {
            addCriterion("skypeId <=", value, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdLike(String value) {
            addCriterion("skypeId like", value, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdNotLike(String value) {
            addCriterion("skypeId not like", value, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdIn(List<String> values) {
            addCriterion("skypeId in", values, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdNotIn(List<String> values) {
            addCriterion("skypeId not in", values, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdBetween(String value1, String value2) {
            addCriterion("skypeId between", value1, value2, "skypeId");
            return (Criteria) this;
        }

        public Criteria andSkypeIdNotBetween(String value1, String value2) {
            addCriterion("skypeId not between", value1, value2, "skypeId");
            return (Criteria) this;
        }

        public Criteria andPassportNumberIsNull() {
            addCriterion("passportNumber is null");
            return (Criteria) this;
        }

        public Criteria andPassportNumberIsNotNull() {
            addCriterion("passportNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPassportNumberEqualTo(String value) {
            addCriterion("passportNumber =", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotEqualTo(String value) {
            addCriterion("passportNumber <>", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberGreaterThan(String value) {
            addCriterion("passportNumber >", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberGreaterThanOrEqualTo(String value) {
            addCriterion("passportNumber >=", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberLessThan(String value) {
            addCriterion("passportNumber <", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberLessThanOrEqualTo(String value) {
            addCriterion("passportNumber <=", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberLike(String value) {
            addCriterion("passportNumber like", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotLike(String value) {
            addCriterion("passportNumber not like", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberIn(List<String> values) {
            addCriterion("passportNumber in", values, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotIn(List<String> values) {
            addCriterion("passportNumber not in", values, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberBetween(String value1, String value2) {
            addCriterion("passportNumber between", value1, value2, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotBetween(String value1, String value2) {
            addCriterion("passportNumber not between", value1, value2, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeIsNull() {
            addCriterion("applyingGradeCode is null");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeIsNotNull() {
            addCriterion("applyingGradeCode is not null");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeEqualTo(String value) {
            addCriterion("applyingGradeCode =", value, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeNotEqualTo(String value) {
            addCriterion("applyingGradeCode <>", value, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeGreaterThan(String value) {
            addCriterion("applyingGradeCode >", value, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("applyingGradeCode >=", value, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeLessThan(String value) {
            addCriterion("applyingGradeCode <", value, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeLessThanOrEqualTo(String value) {
            addCriterion("applyingGradeCode <=", value, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeLike(String value) {
            addCriterion("applyingGradeCode like", value, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeNotLike(String value) {
            addCriterion("applyingGradeCode not like", value, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeIn(List<String> values) {
            addCriterion("applyingGradeCode in", values, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeNotIn(List<String> values) {
            addCriterion("applyingGradeCode not in", values, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeBetween(String value1, String value2) {
            addCriterion("applyingGradeCode between", value1, value2, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andApplyingGradeCodeNotBetween(String value1, String value2) {
            addCriterion("applyingGradeCode not between", value1, value2, "applyingGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeIsNull() {
            addCriterion("currendGradeCode is null");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeIsNotNull() {
            addCriterion("currendGradeCode is not null");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeEqualTo(String value) {
            addCriterion("currendGradeCode =", value, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeNotEqualTo(String value) {
            addCriterion("currendGradeCode <>", value, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeGreaterThan(String value) {
            addCriterion("currendGradeCode >", value, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("currendGradeCode >=", value, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeLessThan(String value) {
            addCriterion("currendGradeCode <", value, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeLessThanOrEqualTo(String value) {
            addCriterion("currendGradeCode <=", value, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeLike(String value) {
            addCriterion("currendGradeCode like", value, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeNotLike(String value) {
            addCriterion("currendGradeCode not like", value, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeIn(List<String> values) {
            addCriterion("currendGradeCode in", values, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeNotIn(List<String> values) {
            addCriterion("currendGradeCode not in", values, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeBetween(String value1, String value2) {
            addCriterion("currendGradeCode between", value1, value2, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andCurrendGradeCodeNotBetween(String value1, String value2) {
            addCriterion("currendGradeCode not between", value1, value2, "currendGradeCode");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNull() {
            addCriterion("studentEmail is null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNotNull() {
            addCriterion("studentEmail is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailEqualTo(String value) {
            addCriterion("studentEmail =", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotEqualTo(String value) {
            addCriterion("studentEmail <>", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThan(String value) {
            addCriterion("studentEmail >", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("studentEmail >=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThan(String value) {
            addCriterion("studentEmail <", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("studentEmail <=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLike(String value) {
            addCriterion("studentEmail like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotLike(String value) {
            addCriterion("studentEmail not like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIn(List<String> values) {
            addCriterion("studentEmail in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotIn(List<String> values) {
            addCriterion("studentEmail not in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailBetween(String value1, String value2) {
            addCriterion("studentEmail between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotBetween(String value1, String value2) {
            addCriterion("studentEmail not between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeIsNull() {
            addCriterion("secondLanguageCode is null");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeIsNotNull() {
            addCriterion("secondLanguageCode is not null");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeEqualTo(String value) {
            addCriterion("secondLanguageCode =", value, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeNotEqualTo(String value) {
            addCriterion("secondLanguageCode <>", value, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeGreaterThan(String value) {
            addCriterion("secondLanguageCode >", value, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("secondLanguageCode >=", value, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeLessThan(String value) {
            addCriterion("secondLanguageCode <", value, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeLessThanOrEqualTo(String value) {
            addCriterion("secondLanguageCode <=", value, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeLike(String value) {
            addCriterion("secondLanguageCode like", value, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeNotLike(String value) {
            addCriterion("secondLanguageCode not like", value, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeIn(List<String> values) {
            addCriterion("secondLanguageCode in", values, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeNotIn(List<String> values) {
            addCriterion("secondLanguageCode not in", values, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeBetween(String value1, String value2) {
            addCriterion("secondLanguageCode between", value1, value2, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andSecondLanguageCodeNotBetween(String value1, String value2) {
            addCriterion("secondLanguageCode not between", value1, value2, "secondLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeIsNull() {
            addCriterion("nativeLanguageCode is null");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeIsNotNull() {
            addCriterion("nativeLanguageCode is not null");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeEqualTo(String value) {
            addCriterion("nativeLanguageCode =", value, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeNotEqualTo(String value) {
            addCriterion("nativeLanguageCode <>", value, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeGreaterThan(String value) {
            addCriterion("nativeLanguageCode >", value, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nativeLanguageCode >=", value, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeLessThan(String value) {
            addCriterion("nativeLanguageCode <", value, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeLessThanOrEqualTo(String value) {
            addCriterion("nativeLanguageCode <=", value, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeLike(String value) {
            addCriterion("nativeLanguageCode like", value, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeNotLike(String value) {
            addCriterion("nativeLanguageCode not like", value, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeIn(List<String> values) {
            addCriterion("nativeLanguageCode in", values, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeNotIn(List<String> values) {
            addCriterion("nativeLanguageCode not in", values, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeBetween(String value1, String value2) {
            addCriterion("nativeLanguageCode between", value1, value2, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageCodeNotBetween(String value1, String value2) {
            addCriterion("nativeLanguageCode not between", value1, value2, "nativeLanguageCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeIsNull() {
            addCriterion("cityzenshipCode is null");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeIsNotNull() {
            addCriterion("cityzenshipCode is not null");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeEqualTo(String value) {
            addCriterion("cityzenshipCode =", value, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeNotEqualTo(String value) {
            addCriterion("cityzenshipCode <>", value, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeGreaterThan(String value) {
            addCriterion("cityzenshipCode >", value, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cityzenshipCode >=", value, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeLessThan(String value) {
            addCriterion("cityzenshipCode <", value, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeLessThanOrEqualTo(String value) {
            addCriterion("cityzenshipCode <=", value, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeLike(String value) {
            addCriterion("cityzenshipCode like", value, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeNotLike(String value) {
            addCriterion("cityzenshipCode not like", value, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeIn(List<String> values) {
            addCriterion("cityzenshipCode in", values, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeNotIn(List<String> values) {
            addCriterion("cityzenshipCode not in", values, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeBetween(String value1, String value2) {
            addCriterion("cityzenshipCode between", value1, value2, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andCityzenshipCodeNotBetween(String value1, String value2) {
            addCriterion("cityzenshipCode not between", value1, value2, "cityzenshipCode");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNull() {
            addCriterion("homePhone is null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIsNotNull() {
            addCriterion("homePhone is not null");
            return (Criteria) this;
        }

        public Criteria andHomePhoneEqualTo(String value) {
            addCriterion("homePhone =", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotEqualTo(String value) {
            addCriterion("homePhone <>", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThan(String value) {
            addCriterion("homePhone >", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("homePhone >=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThan(String value) {
            addCriterion("homePhone <", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("homePhone <=", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneLike(String value) {
            addCriterion("homePhone like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotLike(String value) {
            addCriterion("homePhone not like", value, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneIn(List<String> values) {
            addCriterion("homePhone in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotIn(List<String> values) {
            addCriterion("homePhone not in", values, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneBetween(String value1, String value2) {
            addCriterion("homePhone between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andHomePhoneNotBetween(String value1, String value2) {
            addCriterion("homePhone not between", value1, value2, "homePhone");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("countryCode is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("countryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("countryCode =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("countryCode <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("countryCode >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("countryCode >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("countryCode <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("countryCode <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("countryCode like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("countryCode not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("countryCode in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("countryCode not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("countryCode between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("countryCode not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("zip is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("zip is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("zip =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("zip <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("zip >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("zip >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("zip <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("zip <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("zip like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("zip not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("zip in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("zip not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("zip between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("zip not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("cityCode is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("cityCode is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("cityCode =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("cityCode <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("cityCode >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cityCode >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("cityCode <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("cityCode <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("cityCode like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("cityCode not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("cityCode in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("cityCode not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("cityCode between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("cityCode not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNull() {
            addCriterion("stateCode is null");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNotNull() {
            addCriterion("stateCode is not null");
            return (Criteria) this;
        }

        public Criteria andStateCodeEqualTo(String value) {
            addCriterion("stateCode =", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotEqualTo(String value) {
            addCriterion("stateCode <>", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThan(String value) {
            addCriterion("stateCode >", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stateCode >=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThan(String value) {
            addCriterion("stateCode <", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThanOrEqualTo(String value) {
            addCriterion("stateCode <=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLike(String value) {
            addCriterion("stateCode like", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotLike(String value) {
            addCriterion("stateCode not like", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIn(List<String> values) {
            addCriterion("stateCode in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotIn(List<String> values) {
            addCriterion("stateCode not in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeBetween(String value1, String value2) {
            addCriterion("stateCode between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotBetween(String value1, String value2) {
            addCriterion("stateCode not between", value1, value2, "stateCode");
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