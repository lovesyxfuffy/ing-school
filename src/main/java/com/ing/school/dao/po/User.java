package com.ing.school.dao.po;

public class User {
    private Integer id;

    private String name;

    private String nickname;

    private String telephone;

    private String idcard;

    private String genderCode;

    private Integer age;

    private String address;

    private String avatarUrl;

    private String englishLevelTypeCode;

    private Double englishLevelScore;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode == null ? null : genderCode.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}