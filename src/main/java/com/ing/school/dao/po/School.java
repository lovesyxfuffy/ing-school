package com.ing.school.dao.po;


public class School {
    private Integer id;

    private String schoolName;

    private String schoolEnglishName;

    private String continentCode;

    private String countryCode;

    private String stateCode;

    private String cityCode;

    private String schoolTypeCode;

    private String schoolGenderTypeCode;

    private String religionTypeCode;

    private String mainPicture;

    private Double positionX;

    private Double positionY;

    private Boolean hasEsl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getSchoolEnglishName() {
        return schoolEnglishName;
    }

    public void setSchoolEnglishName(String schoolEnglishName) {
        this.schoolEnglishName = schoolEnglishName == null ? null : schoolEnglishName.trim();
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode == null ? null : continentCode.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode == null ? null : stateCode.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getSchoolTypeCode() {
        return schoolTypeCode;
    }

    public void setSchoolTypeCode(String schoolTypeCode) {
        this.schoolTypeCode = schoolTypeCode == null ? null : schoolTypeCode.trim();
    }

    public String getSchoolGenderTypeCode() {
        return schoolGenderTypeCode;
    }

    public void setSchoolGenderTypeCode(String schoolGenderTypeCode) {
        this.schoolGenderTypeCode = schoolGenderTypeCode == null ? null : schoolGenderTypeCode.trim();
    }

    public String getReligionTypeCode() {
        return religionTypeCode;
    }

    public void setReligionTypeCode(String religionTypeCode) {
        this.religionTypeCode = religionTypeCode == null ? null : religionTypeCode.trim();
    }

    public String getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture == null ? null : mainPicture.trim();
    }

    public Double getPositionX() {
        return positionX;
    }

    public void setPositionX(Double positionX) {
        this.positionX = positionX;
    }

    public Double getPositionY() {
        return positionY;
    }

    public void setPositionY(Double positionY) {
        this.positionY = positionY;
    }

    public Boolean getHasEsl() {
        return hasEsl;
    }

    public void setHasEsl(Boolean hasEsl) {
        this.hasEsl = hasEsl;
    }
}