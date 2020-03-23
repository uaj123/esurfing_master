package cn.uaj.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换工具类
 * @Author: wushaojie
 * @Date: 2020/2/13 21:45
 */
public class DateUtils {
    //日期转换成字符串
    public static String date2String(Date date, String patt) {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        return sdf.format(date);
    }

    //字符串转换成日期
    public static Date string2Date(String str, String patt) throws Exception, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patt);
        return sdf.parse(str);
    }

}
