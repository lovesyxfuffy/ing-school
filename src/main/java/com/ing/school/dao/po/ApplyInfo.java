package com.ing.school.dao.po;

import java.util.Date;

public class ApplyInfo {
    private Integer id;

    private Integer applyId;

    private Integer userId;

    private String studentName;

    private Integer age;

    private String genderCode;

    private String telephone;

    private String address;

    private Date attendanceDate;

    private String englishLevelTypeCode;

    private Double englishLevelScore;

    private String currentSchoolEmail;

    private String currentSchoolPhone;

    private String currentSchoolAddress;

    private String currentSchoolName;

    private String wechatId;

    private String skypeId;

    private String passportNumber;

    private String applyingGradeCode;

    private String currendGradeCode;

    private String studentEmail;

    private String secondLanguageCode;

    private String nativeLanguageCode;

    private String cityzenshipCode;

    private String homePhone;

    private String countryCode;

    private String zip;

    private String cityCode;

    private String stateCode;

    private String attendanceGrades;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode == null ? null : genderCode.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(Date attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getEnglishLevelTypeCode() {
        return englishLevelTypeCode;
    }

    public void setEnglishLevelTypeCode(String englishLevelTypeCode) {
        this.englishLevelTypeCode = englishLevelTypeCode == null ? null : englishLevelTypeCode.trim();
    }

    public Double getEnglishLevelScore() {
        return englishLevelScore;
    }

    public void setEnglishLevelScore(Double englishLevelScore) {
        this.englishLevelScore = englishLevelScore;
    }

    public String getCurrentSchoolEmail() {
        return currentSchoolEmail;
    }

    public void setCurrentSchoolEmail(String currentSchoolEmail) {
        this.currentSchoolEmail = currentSchoolEmail == null ? null : currentSchoolEmail.trim();
    }

    public String getCurrentSchoolPhone() {
        return currentSchoolPhone;
    }

    public void setCurrentSchoolPhone(String currentSchoolPhone) {
        this.currentSchoolPhone = currentSchoolPhone == null ? null : currentSchoolPhone.trim();
    }

    public String getCurrentSchoolAddress() {
        return currentSchoolAddress;
    }

    public void setCurrentSchoolAddress(String currentSchoolAddress) {
        this.currentSchoolAddress = currentSchoolAddress == null ? null : currentSchoolAddress.trim();
    }

    public String getCurrentSchoolName() {
        return currentSchoolName;
    }

    public void setCurrentSchoolName(String currentSchoolName) {
        this.currentSchoolName = currentSchoolName == null ? null : currentSchoolName.trim();
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId == null ? null : wechatId.trim();
    }

    public String getSkypeId() {
        return skypeId;
    }

    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId == null ? null : skypeId.trim();
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber == null ? null : passportNumber.trim();
    }

    public String getApplyingGradeCode() {
        return applyingGradeCode;
    }

    public void setApplyingGradeCode(String applyingGradeCode) {
        this.applyingGradeCode = applyingGradeCode == null ? null : applyingGradeCode.trim();
    }

    public String getCurrendGradeCode() {
        return currendGradeCode;
    }

    public void setCurrendGradeCode(String currendGradeCode) {
        this.currendGradeCode = currendGradeCode == null ? null : currendGradeCode.trim();
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail == null ? null : studentEmail.trim();
    }

    public String getSecondLanguageCode() {
        return secondLanguageCode;
    }

    public void setSecondLanguageCode(String secondLanguageCode) {
        this.secondLanguageCode = secondLanguageCode == null ? null : secondLanguageCode.trim();
    }

    public String getNativeLanguageCode() {
        return nativeLanguageCode;
    }

    public void setNativeLanguageCode(String nativeLanguageCode) {
        this.nativeLanguageCode = nativeLanguageCode == null ? null : nativeLanguageCode.trim();
    }

    public String getCityzenshipCode() {
        return cityzenshipCode;
    }

    public void setCityzenshipCode(String cityzenshipCode) {
        this.cityzenshipCode = cityzenshipCode == null ? null : cityzenshipCode.trim();
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone == null ? null : homePhone.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode == null ? null : stateCode.trim();
    }

    public String getAttendanceGrades() {
        return attendanceGrades;
    }

    public void setAttendanceGrades(String attendanceGrades) {
        this.attendanceGrades = attendanceGrades == null ? null : attendanceGrades.trim();
    }
}