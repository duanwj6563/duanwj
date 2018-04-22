package com.ybl.common.enums;

/**
 * 销售人员职级枚举
 * Created by duanwj on 2018/4/20 0020 11:43
 */
public enum SmisRankEnum {
    SALES_MANAGER("sales", "销售经理");


    private String code;
    private String name;

    SmisRankEnum(String code, String name) {
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
