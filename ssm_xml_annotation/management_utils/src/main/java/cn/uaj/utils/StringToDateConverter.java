package cn.uaj.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串转日期
 * @Author: wushaojie
 * @Date: 2020/2/14 14:32
 */
public class StringToDateConverter implements Converter<String, Date> {

    /**
     * 字符串转日期
     * @param s
     * @return
     */
    @Override
    public Date convert(String s) {
        if (!s.isEmpty()){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                return dateFormat.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        // throw new RuntimeException("请您传入数据");
        return null;
    }
}
