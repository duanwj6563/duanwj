package com.ybl.domain.primary.model;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by duanwj on 2018/4/13 0013 14:37
 */
@Data
public class Result<T> {
    /**
     * 错误码.
     */
    private Integer code;

    /**
     * 提示信息.
     */
    private String msg;

    /**
     * 具体的内容.
     */
    private T data;

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
