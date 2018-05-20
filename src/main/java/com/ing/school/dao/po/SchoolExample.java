package com.ing.school.dao.po;

import java.util.ArrayList;
import java.util.List;

public class SchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolExample() {
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

        public void addCriterion(String condition) {
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

        public Criteria andContinentCodeIsNull() {
            addCriterion("continentCode is null");
            return (Criteria) this;
        }

        public Criteria andContinentCodeIsNotNull() {
            addCriterion("continentCode is not null");
            return (Criteria) this;
        }

        public Criteria andContinentCodeEqualTo(String value) {
            addCriterion("continentCode =", value, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeNotEqualTo(String value) {
            addCriterion("continentCode <>", value, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeGreaterThan(String value) {
            addCriterion("continentCode >", value, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("continentCode >=", value, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeLessThan(String value) {
            addCriterion("continentCode <", value, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeLessThanOrEqualTo(String value) {
            addCriterion("continentCode <=", value, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeLike(String value) {
            addCriterion("continentCode like", value, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeNotLike(String value) {
            addCriterion("continentCode not like", value, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeIn(List<String> values) {
            addCriterion("continentCode in", values, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeNotIn(List<String> values) {
            addCriterion("continentCode not in", values, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeBetween(String value1, String value2) {
            addCriterion("continentCode between", value1, value2, "continentCode");
            return (Criteria) this;
        }

        public Criteria andContinentCodeNotBetween(String value1, String value2) {
            addCriterion("continentCode not between", value1, value2, "continentCode");
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

        public Criteria andSchoolGenderTypeCodeIsNull() {
            addCriterion("schoolGenderTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeIsNotNull() {
            addCriterion("schoolGenderTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeEqualTo(String value) {
            addCriterion("schoolGenderTypeCode =", value, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeNotEqualTo(String value) {
            addCriterion("schoolGenderTypeCode <>", value, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeGreaterThan(String value) {
            addCriterion("schoolGenderTypeCode >", value, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("schoolGenderTypeCode >=", value, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeLessThan(String value) {
            addCriterion("schoolGenderTypeCode <", value, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("schoolGenderTypeCode <=", value, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeLike(String value) {
            addCriterion("schoolGenderTypeCode like", value, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeNotLike(String value) {
            addCriterion("schoolGenderTypeCode not like", value, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeIn(List<String> values) {
            addCriterion("schoolGenderTypeCode in", values, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeNotIn(List<String> values) {
            addCriterion("schoolGenderTypeCode not in", values, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeBetween(String value1, String value2) {
            addCriterion("schoolGenderTypeCode between", value1, value2, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andSchoolGenderTypeCodeNotBetween(String value1, String value2) {
            addCriterion("schoolGenderTypeCode not between", value1, value2, "schoolGenderTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeIsNull() {
            addCriterion("religionTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeIsNotNull() {
            addCriterion("religionTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeEqualTo(String value) {
            addCriterion("religionTypeCode =", value, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeNotEqualTo(String value) {
            addCriterion("religionTypeCode <>", value, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeGreaterThan(String value) {
            addCriterion("religionTypeCode >", value, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("religionTypeCode >=", value, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeLessThan(String value) {
            addCriterion("religionTypeCode <", value, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("religionTypeCode <=", value, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeLike(String value) {
            addCriterion("religionTypeCode like", value, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeNotLike(String value) {
            addCriterion("religionTypeCode not like", value, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeIn(List<String> values) {
            addCriterion("religionTypeCode in", values, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeNotIn(List<String> values) {
            addCriterion("religionTypeCode not in", values, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeBetween(String value1, String value2) {
            addCriterion("religionTypeCode between", value1, value2, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andReligionTypeCodeNotBetween(String value1, String value2) {
            addCriterion("religionTypeCode not between", value1, value2, "religionTypeCode");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Integer value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Integer value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Integer value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Integer value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Integer value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Integer> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Integer> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Integer value1, Integer value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Integer value1, Integer value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andMainPictureIsNull() {
            addCriterion("mainPicture is null");
            return (Criteria) this;
        }

        public Criteria andMainPictureIsNotNull() {
            addCriterion("mainPicture is not null");
            return (Criteria) this;
        }

        public Criteria andMainPictureEqualTo(String value) {
            addCriterion("mainPicture =", value, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureNotEqualTo(String value) {
            addCriterion("mainPicture <>", value, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureGreaterThan(String value) {
            addCriterion("mainPicture >", value, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureGreaterThanOrEqualTo(String value) {
            addCriterion("mainPicture >=", value, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureLessThan(String value) {
            addCriterion("mainPicture <", value, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureLessThanOrEqualTo(String value) {
            addCriterion("mainPicture <=", value, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureLike(String value) {
            addCriterion("mainPicture like", value, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureNotLike(String value) {
            addCriterion("mainPicture not like", value, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureIn(List<String> values) {
            addCriterion("mainPicture in", values, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureNotIn(List<String> values) {
            addCriterion("mainPicture not in", values, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureBetween(String value1, String value2) {
            addCriterion("mainPicture between", value1, value2, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andMainPictureNotBetween(String value1, String value2) {
            addCriterion("mainPicture not between", value1, value2, "mainPicture");
            return (Criteria) this;
        }

        public Criteria andPositionXIsNull() {
            addCriterion("positionX is null");
            return (Criteria) this;
        }

        public Criteria andPositionXIsNotNull() {
            addCriterion("positionX is not null");
            return (Criteria) this;
        }

        public Criteria andPositionXEqualTo(Double value) {
            addCriterion("positionX =", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXNotEqualTo(Double value) {
            addCriterion("positionX <>", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXGreaterThan(Double value) {
            addCriterion("positionX >", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXGreaterThanOrEqualTo(Double value) {
            addCriterion("positionX >=", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXLessThan(Double value) {
            addCriterion("positionX <", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXLessThanOrEqualTo(Double value) {
            addCriterion("positionX <=", value, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXIn(List<Double> values) {
            addCriterion("positionX in", values, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXNotIn(List<Double> values) {
            addCriterion("positionX not in", values, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXBetween(Double value1, Double value2) {
            addCriterion("positionX between", value1, value2, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionXNotBetween(Double value1, Double value2) {
            addCriterion("positionX not between", value1, value2, "positionX");
            return (Criteria) this;
        }

        public Criteria andPositionYIsNull() {
            addCriterion("positionY is null");
            return (Criteria) this;
        }

        public Criteria andPositionYIsNotNull() {
            addCriterion("positionY is not null");
            return (Criteria) this;
        }

        public Criteria andPositionYEqualTo(Double value) {
            addCriterion("positionY =", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYNotEqualTo(Double value) {
            addCriterion("positionY <>", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYGreaterThan(Double value) {
            addCriterion("positionY >", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYGreaterThanOrEqualTo(Double value) {
            addCriterion("positionY >=", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYLessThan(Double value) {
            addCriterion("positionY <", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYLessThanOrEqualTo(Double value) {
            addCriterion("positionY <=", value, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYIn(List<Double> values) {
            addCriterion("positionY in", values, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYNotIn(List<Double> values) {
            addCriterion("positionY not in", values, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYBetween(Double value1, Double value2) {
            addCriterion("positionY between", value1, value2, "positionY");
            return (Criteria) this;
        }

        public Criteria andPositionYNotBetween(Double value1, Double value2) {
            addCriterion("positionY not between", value1, value2, "positionY");
            return (Criteria) this;
        }

        public Criteria andHasEslIsNull() {
            addCriterion("hasEsl is null");
            return (Criteria) this;
        }

        public Criteria andHasEslIsNotNull() {
            addCriterion("hasEsl is not null");
            return (Criteria) this;
        }

        public Criteria andHasEslEqualTo(Boolean value) {
            addCriterion("hasEsl =", value, "hasEsl");
            return (Criteria) this;
        }

        public Criteria andHasEslNotEqualTo(Boolean value) {
            addCriterion("hasEsl <>", value, "hasEsl");
            return (Criteria) this;
        }

        public Criteria andHasEslGreaterThan(Boolean value) {
            addCriterion("hasEsl >", value, "hasEsl");
            return (Criteria) this;
        }

        public Criteria andHasEslGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasEsl >=", value, "hasEsl");
            return (Criteria) this;
        }

        public Criteria andHasEslLessThan(Boolean value) {
            addCriterion("hasEsl <", value, "hasEsl");
            return (Criteria) this;
        }

        public Criteria andHasEslLessThanOrEqualTo(Boolean value) {
            addCriterion("hasEsl <=", value, "hasEsl");
            return (Criteria) this;
        }

        public Criteria andHasEslIn(List<Boolean> values) {
            addCriterion("hasEsl in", values, "hasEsl");
            return (Criteria) this;
        }

        public Criteria andHasEslNotIn(List<Boolean> values) {
            addCriterion("hasEsl not in", values, "hasEsl");
            return (Criteria) this;
        }

        public Criteria andHasEslBetween(Boolean value1, Boolean value2) {
            addCriterion("hasEsl between", value1, value2, "hasEsl");
            return (Criteria) this;
        }

        public Criteria andHasEslNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasEsl not between", value1, value2, "hasEsl");
            return (Criteria) this;
        }

        public Criteria andPassingScoreIsNull() {
            addCriterion("passingScore is null");
            return (Criteria) this;
        }

        public Criteria andPassingScoreIsNotNull() {
            addCriterion("passingScore is not null");
            return (Criteria) this;
        }

        public Criteria andPassingScoreEqualTo(Double value) {
            addCriterion("passingScore =", value, "passingScore");
            return (Criteria) this;
        }

        public Criteria andPassingScoreNotEqualTo(Double value) {
            addCriterion("passingScore <>", value, "passingScore");
            return (Criteria) this;
        }

        public Criteria andPassingScoreGreaterThan(Double value) {
            addCriterion("passingScore >", value, "passingScore");
            return (Criteria) this;
        }

        public Criteria andPassingScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("passingScore >=", value, "passingScore");
            return (Criteria) this;
        }

        public Criteria andPassingScoreLessThan(Double value) {
            addCriterion("passingScore <", value, "passingScore");
            return (Criteria) this;
        }

        public Criteria andPassingScoreLessThanOrEqualTo(Double value) {
            addCriterion("passingScore <=", value, "passingScore");
            return (Criteria) this;
        }

        public Criteria andPassingScoreIn(List<Double> values) {
            addCriterion("passingScore in", values, "passingScore");
            return (Criteria) this;
        }

        public Criteria andPassingScoreNotIn(List<Double> values) {
            addCriterion("passingScore not in", values, "passingScore");
            return (Criteria) this;
        }

        public Criteria andPassingScoreBetween(Double value1, Double value2) {
            addCriterion("passingScore between", value1, value2, "passingScore");
            return (Criteria) this;
        }

        public Criteria andPassingScoreNotBetween(Double value1, Double value2) {
            addCriterion("passingScore not between", value1, value2, "passingScore");
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