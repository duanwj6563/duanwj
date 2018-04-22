package com.ybl.common;

import com.ybl.domain.exception.ServerStatus;
import com.ybl.domain.exception.UserDefinedException;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.BindingResult;

/**
 * Created by duanwj on 2018/4/13 0013 09:47
 */
public class AssertUtil {

    public static void isNotNull(Object obj) {
        if (ObjectUtils.isEmpty(obj))
            throw new UserDefinedException(ServerStatus.PARAM_EMPTY);
    }

    public static void isNotNull(Object obj, String msg) {
        if (ObjectUtils.isEmpty(obj))
            throw new UserDefinedException(ServerStatus.PARAM_EMPTY, msg);
    }

    public static void bindingResult(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new UserDefinedException(ServerStatus.PARAM_EMPTY, bindingResult.getFieldError().getDefaultMessage());
        }
    }
}
