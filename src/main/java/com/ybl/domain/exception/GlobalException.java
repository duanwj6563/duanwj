package com.ybl.domain.exception;

/**
 * Created by duanwj on 18/04/09
 */
public abstract class GlobalException extends RuntimeException {

    public abstract Integer getCode();
    public abstract String getError();
    public abstract String getMsg();

}
