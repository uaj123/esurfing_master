package cn.uaj.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: wushaojie
 * @Date: 2020/2/22 13:57
 */
public class JedisPoolUtils {
    private static JedisPool jedisPool;

    static {
        // 读取配置文件
        InputStream resourceAsStream = JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedisConfig.properties");
        JedisPoolConfig jedisPoolConfig = null;
        Properties pro = null;
        // 创建Properties对象
        try {
            pro = Properties.class.newInstance();
            // 关联文件
            pro.load(resourceAsStream);
            // 获取数据，设置到JedisPoolConfig中
            jedisPoolConfig = JedisPoolConfig.class.newInstance();
        } catch (InstantiationException | IllegalAccessException | IOException e) {
            e.printStackTrace();
        }
        assert pro != null;
        assert jedisPoolConfig != null;
        jedisPoolConfig.setMaxTotal(Integer.parseInt(pro.getProperty("redis.pool.maxTotal")));
        jedisPoolConfig.setMaxIdle(Integer.parseInt(pro.getProperty("redis.pool.maxIdle")));
        jedisPoolConfig.setMinIdle(Integer.parseInt(pro.getProperty("redis.pool.minIdle")));
        jedisPoolConfig.setMaxWaitMillis(Integer.parseInt(pro.getProperty("redis.pool.maxWaitMillis")));

        /*初始化JedisPool*/
        jedisPool = new JedisPool(jedisPoolConfig, pro.getProperty("redis.ip"), Integer.parseInt("redis.port"));
    }
    /*提供外部调用方法*/
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
