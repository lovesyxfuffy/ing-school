package com.ing.school.dao.po;

public class SchoolInfo {
    private Integer id;

    private Integer schoolId;

    private String headPictureUrl;

    private String classess;

    private String synopsis;

    private String badge;

    private String applicationGuide;

    private String advantage;

    private String afterGraduation;

    private String applyCondition;

    private String activity;

    private String applyCase;

    private String accommodation;

    private String mainPictureUrl;

    public String getMainPictureUrl() {
        return mainPictureUrl;
    }

    public void setMainPictureUrl(String mainPictureUrl) {
        this.mainPictureUrl = mainPictureUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getHeadPictureUrl() {
        return headPictureUrl;
    }

    public void setHeadPictureUrl(String headPictureUrl) {
        this.headPictureUrl = headPictureUrl == null ? null : headPictureUrl.trim();
    }

    public String getClassess() {
        return classess;
    }

    public void setClassess(String classess) {
        this.classess = classess == null ? null : classess.trim();
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis == null ? null : synopsis.trim();
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge == null ? null : badge.trim();
    }

    public String getApplicationGuide() {
        return applicationGuide;
    }

    public void setApplicationGuide(String applicationGuide) {
        this.applicationGuide = applicationGuide == null ? null : applicationGuide.trim();
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage == null ? null : advantage.trim();
    }

    public String getAfterGraduation() {
        return afterGraduation;
    }

    public void setAfterGraduation(String afterGraduation) {
        this.afterGraduation = afterGraduation == null ? null : afterGraduation.trim();
    }

    public String getApplyCondition() {
        return applyCondition;
    }

    public void setApplyCondition(String applyCondition) {
        this.applyCondition = applyCondition == null ? null : applyCondition.trim();
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity == null ? null : activity.trim();
    }

    public String getApplyCase() {
        return applyCase;
    }

    public void setApplyCase(String applyCase) {
        this.applyCase = applyCase == null ? null : applyCase.trim();
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation == null ? null : accommodation.trim();
    }
}