package com.ybl.ports.rest.handle;

import com.ybl.domain.exception.ExceptionReturn;
import com.ybl.domain.exception.ServerStatus;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@ApiIgnore
public class FinalExceptionHandler implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping(value = "/error")
    public ExceptionReturn error(HttpServletResponse resp, HttpServletRequest req) {
        // 错误处理逻辑
        ExceptionReturn exceptionReturn = new ExceptionReturn(ServerStatus.OPERATION_FAILED);
        return exceptionReturn;
    }
}
