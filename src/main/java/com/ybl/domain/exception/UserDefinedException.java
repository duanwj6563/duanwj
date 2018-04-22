package com.ybl.domain.exception;

/**
 * Created by duanwj on 18/04/09
 */
public class UserDefinedException extends GlobalException {
    private Integer code;

    private String error;

    private String msg;

    public UserDefinedException() {
        super();
        this.code = ServerStatus.DEFAULT_EXCEPTION.getCode();
        this.error = ServerStatus.DEFAULT_EXCEPTION.getMsg();
    }

    public UserDefinedException(String msg) {
        super();
        this.code = ServerStatus.DEFAULT_EXCEPTION.getCode();
        this.error = ServerStatus.DEFAULT_EXCEPTION.getMsg();
        this.msg = msg;
    }

    public UserDefinedException(ServerStatus ss) {
        super();
        this.code = ss.getCode();
        this.error = ss.getMsg();
        this.msg = ss.getMsg();
    }

    public UserDefinedException(ServerStatus ss, String msg) {
        super();
        this.code = ss.getCode();
        this.error = ss.getMsg();
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }


    @Override
    public String getError() {
        return this.error;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
