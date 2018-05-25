package com.ing.school.dao.po;

import java.util.Date;

public class Apply {
    private Integer id;

    private Integer userId;

    private String userName;

    private Integer schoolId;

    private String schoolTypeCode;

    private String schoolName;

    private Date applyTime;

    private String telephone;

    private String schoolEnglishName;

    private String followUpContent;

    private Integer followUpStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolTypeCode() {
        return schoolTypeCode;
    }

    public void setSchoolTypeCode(String schoolTypeCode) {
        this.schoolTypeCode = schoolTypeCode == null ? null : schoolTypeCode.trim();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getSchoolEnglishName() {
        return schoolEnglishName;
    }

    public void setSchoolEnglishName(String schoolEnglishName) {
        this.schoolEnglishName = schoolEnglishName == null ? null : schoolEnglishName.trim();
    }

    public String getFollowUpContent() {
        return followUpContent;
    }

    public void setFollowUpContent(String followUpContent) {
        this.followUpContent = followUpContent == null ? null : followUpContent.trim();
    }

    public Integer getFollowUpStatus() {
        return followUpStatus;
    }

    public void setFollowUpStatus(Integer followUpStatus) {
        this.followUpStatus = followUpStatus;
    }
}