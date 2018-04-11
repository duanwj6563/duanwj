package com.ybl.domain.exception;

/**
 * Created by duanwj on 18/04/09
 */
public class UserDefinedException extends GlobalException {
    private Integer status;

    private String error;

    private String message;

    public UserDefinedException(){
        super();
        this.status = ServerStatus.DEFAULT_EXCEPTION.getStatus();
        this.error = ServerStatus.DEFAULT_EXCEPTION.getMsg();
    }
    public UserDefinedException(String msg){
        super();
        this.status = ServerStatus.DEFAULT_EXCEPTION.getStatus();
        this.error = ServerStatus.DEFAULT_EXCEPTION.getMsg();
        this.message = msg;
    }
    public UserDefinedException(ServerStatus ss){
        super();
        this.status = ss.getStatus();
        this.error = ss.getMsg();
        this.message = ss.getMsg();
    }
    public UserDefinedException(ServerStatus ss, String msg){
        super();
        this.status = ss.getStatus();
        this.error = ss.getMsg();
        this.message = msg;
    }

    @Override
    public Integer getStatus() {
        return this.status;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getError() {
        return this.error;
    }
}
