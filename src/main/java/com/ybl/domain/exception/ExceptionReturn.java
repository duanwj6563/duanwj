package com.ybl.domain.exception;


/**
 * Created by duanwj on 18/04/09
 */
public class ExceptionReturn {
    private Integer code;//返回码
    private String error;
    private String msg;//返回信息
    private String path;
    private String exception;
    private Long timestamp;
    /**
     * 默认返回信息
     */
    public static ExceptionReturn SUCCESS = new ExceptionReturn(ServerStatus.SUCCESS);

    public ExceptionReturn(ServerStatus serverStatus) {
        this.code = serverStatus.getCode();
        this.error = serverStatus.getMsg();
        this.msg = serverStatus.getMsg();
        this.timestamp = getTimestamp();
    }

    public ExceptionReturn() {
    }

    public ExceptionReturn(Integer code, String error, String msg) {
        this.code = code;
        this.error = error;
        this.msg = msg;
        this.timestamp = getTimestamp();
    }

    public Integer getCode() {
        return code;
    }

    public ExceptionReturn setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ExceptionReturn setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getError() {
        return error;
    }

    public String getException() {
        return exception;
    }

    public ExceptionReturn setException(String exception) {
        this.exception = exception;
        return this;
    }

    public ExceptionReturn setError(String error) {
        this.error = error;
        return this;
    }

    public String getPath() {
        return path;
    }

    public ExceptionReturn setPath(String path) {
        this.path = path;
        return this;
    }

    public Long getTimestamp() {
        return System.currentTimeMillis();
    }
}
