package com.ing.school.constants;

/**
 * Created by yujingyang on 2018/5/10.
 */
public enum
CostIntervalEnum {

    INTERVAL_ZERO_TWENTY("0", "0到20万", 0, 20),
    INTERVAL_TWENTY_FORTY("1", "20到40万", 20, 40),
    INTERVAL_FORTY_MORE("2", "40万以上", 40, null);

    String code;
    String name;
    Integer costFloor;
    Integer costUpper;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCostFloor() {
        return costFloor;
    }

    public void setCostFloor(Integer costFloor) {
        this.costFloor = costFloor;
    }

    public Integer getCostUpper() {
        return costUpper;
    }

    public void setCostUpper(Integer costUpper) {
        this.costUpper = costUpper;
    }

    CostIntervalEnum(String code, String name, Integer costFloor, Integer costUpper) {
        this.code = code;
        this.name = name;
        this.costFloor = costFloor;
        this.costUpper = costUpper;
    }

    public static CostIntervalEnum getEnumByCode(String code) {
        CostIntervalEnum[] enumList = CostIntervalEnum.values();
        for (CostIntervalEnum costIntervalEnum : enumList) {
            if (code.equals(costIntervalEnum.getCode()))
                return costIntervalEnum;
        }
        return null;
    }
}
