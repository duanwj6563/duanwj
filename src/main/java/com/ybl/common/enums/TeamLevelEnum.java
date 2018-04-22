package com.ybl.common.enums;

/**
 * Created by duanwj on 2018/4/20 0020 14:55
 */
public enum TeamLevelEnum {
    AREA("Q", "区"),
    GROUP("Z", "组");

    private String code;
    private String name;

    TeamLevelEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

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
}
