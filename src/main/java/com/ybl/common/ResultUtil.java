package com.ybl.common;

import com.ybl.domain.primary.model.Result;

/**
 * Created by duanwj on 2018/4/13 0013 14:47
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

}
