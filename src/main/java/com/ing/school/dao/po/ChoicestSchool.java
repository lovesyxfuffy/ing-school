package com.ing.school.dao.po;

public class ChoicestSchool {
    private Integer id;

    private Integer schoolId;

    private String schoolName;

    private String mainPicture;

    private String choicestContent;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public String getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture == null ? null : mainPicture.trim();
    }

    public String getChoicestContent() {
        return choicestContent;
    }

    public void setChoicestContent(String choicestContent) {
        this.choicestContent = choicestContent == null ? null : choicestContent.trim();
    }
}