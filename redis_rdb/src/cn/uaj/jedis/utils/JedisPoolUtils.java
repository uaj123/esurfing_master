package cn.uaj.jedis.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author: wushaojie
 * @Date: 2020/2/11 19:45
 */
public class JedisPoolUtils {

    private static JedisPool jedisPool;

    static {
        // 读取配置文件
        InputStream inputStream = JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedisConfig.properties");

        // 创建Properties对象
        Properties pro = new Properties();
        try {
            // 关联文件
            pro.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取数据，设置到JedisPoolConfig中
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(Integer.parseInt(pro.getProperty("redis.pool.maxTotal")));
        jedisPoolConfig.setMaxTotal(Integer.parseInt(pro.getProperty("redis.pool.maxIdle")));
        jedisPoolConfig.setMaxTotal(Integer.parseInt(pro.getProperty("redis.pool.minIdle")));
        jedisPoolConfig.setMaxTotal(Integer.parseInt(pro.getProperty("redis.pool.maxWaitMillis")));

        //初始化JedisPool
        jedisPool = new JedisPool(jedisPoolConfig,pro.getProperty("redis.ip"),Integer.parseInt(pro.getProperty("redis.port")));
    }

    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
