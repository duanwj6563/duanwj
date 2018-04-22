package com.ybl.common;

import com.ybl.domain.exception.ServerStatus;
import com.ybl.domain.exception.UserDefinedException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间处理工具类
 * Created by duanwj on 2018/4/17 0017 20:49
 */
public class DateUtil {
    /**
     * 字符串转换日期
     *
     * @param date 字符串（yyyy-MM-dd）
     * @return 时间
     * @throws ParseException 时间格式化异常
     */
    public static Date string2Date(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date time = null;
        try {
            time = sdf.parse(date);
        } catch (ParseException e) {
            throw new UserDefinedException(ServerStatus.DEFAULT_EXCEPTION);
        }
        return time;
    }
}
