package com.ybl.domain.exception;


/**
 * Created by duanwj on 18/04/09
 */
public class ExceptionReturn {
    private Integer status;//返回码
    private String error;
    private String message;//返回信息
    private String path;
    private String exception;
    private Long timestamp;
    /**
     * 默认返回信息
     */
    public static ExceptionReturn SUCCESS = new ExceptionReturn(ServerStatus.SUCCESS);

    public ExceptionReturn(ServerStatus serverStatus) {
        this.status = serverStatus.getStatus();
        this.error = serverStatus.getMsg();
        this.message = serverStatus.getMsg();
        this.timestamp = getTimestamp();
    }

    public ExceptionReturn() {
    }

    public ExceptionReturn(Integer code, String error, String message) {
        this.status = code;
        this.error = error;
        this.message = message;
        this.timestamp = getTimestamp();
    }

    public Integer getStatus() {
        return status;
    }

    public ExceptionReturn setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ExceptionReturn setMessage(String message) {
        this.message = message;
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
