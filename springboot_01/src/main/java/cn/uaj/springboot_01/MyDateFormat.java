package cn.uaj.springboot_01;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: wushaojie
 * @Date: 2020/3/19 15:47
 * 自定义时间转换器
 */
public class MyDateFormat implements Converter<String , Date> {
    private static final String dateFormat = "yyyy-MM-dd hh:mm:ss";

    @Override
    public Date convert(String s) {
        if (StringUtils.isEmpty(s)){
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        try {
            Date date = simpleDateFormat.parse(s);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException(String.format("parser %s to Date fail",s));
        }
    }
}
