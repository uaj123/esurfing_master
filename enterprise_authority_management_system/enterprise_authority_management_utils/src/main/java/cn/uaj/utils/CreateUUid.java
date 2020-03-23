package cn.uaj.utils;

import java.util.UUID;

/**
 * @Author: wushaojie
 * @Date: 2020/2/14 17:20
 */
public class CreateUUid {

    /**
     * 生成唯一uuid
     * @return
     */
    public static String createUUID(){
        return UUID.randomUUID().toString();
    }
}
