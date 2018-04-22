package com.ybl.ports.rest.handle;

import com.ybl.domain.exception.ExceptionReturn;
import com.ybl.domain.exception.GlobalException;
import com.ybl.domain.exception.UserDefinedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    @ExceptionHandler(value = UserDefinedException.class)
    @ResponseBody
    public Object handleUserDefinedException(HttpServletRequest request, Exception e) {
        log.error("【系统异常 - UserDefinedException】{}", e);
        log.error("HTTP method : {}, URL : {} ,params : {}",request.getMethod(),request.getRequestURL(),request.getQueryString());
        String className = e.getStackTrace()[0].getClassName();
        GlobalException ge = (GlobalException) e;
        ExceptionReturn er = new ExceptionReturn();
        BeanUtils.copyProperties(ge,er);
        er.setPath(request.getServletPath());
        er.setException(className);
        log.error("ExceptionInfo : {}", er);
        return er;
    }
    @ExceptionHandler(value = Exception.class)
    public Object handleException(HttpServletRequest request, Exception e) {
        log.error("【系统异常 - Exception】{}", e);
        log.error("HTTP method : {}, URL : {} ,params : {}",request.getMethod(),request.getRequestURL(),request.getQueryString());
        log.error("ExceptionInfo : {}", e);
        return e;
    }
}

