package cn.uaj.jedis.test;

import cn.uaj.jedis.utils.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: wushaojie
 * @Date: 2020/2/11 18:27
 */
public class JedisTest {

    /**
     * 字符串类型，string 数据结构操作
     */
    @Test
    public void test1(){
        /*获取连接*/
        Jedis jedis = new Jedis("localhost",6379);
        /*保存*/
        jedis.set("username","zhangsan");
        /*获取*/
        String username = jedis.get("username");
        System.out.println(username);
        /*删除*/
        // jedis.del("username");
        /*使用setex()方法存储指定过期时间的key和value*/
        jedis.setex("age",20,"12");//20秒后自动删除给键值对
        // 关闭连接
        jedis.close();
    }

    /**
     * hash类型，hash 数据结构操作
     */
    @Test
    public void test2(){
        /*获取连接*/
        Jedis jedis = new Jedis("localhost",6379);
        /*保存*/
        jedis.hset("myHash","name","lisi");
        jedis.hset("myHash","age","18");
        jedis.hset("myHash","gender","male");
        /*获取*/
        String name = jedis.hget("myHash", "name");
        System.out.println(name);
        /*获取myHash所有map集合*/
        Map<String, String> myHash = jedis.hgetAll("myHash");
        Set<String> keySet = myHash.keySet();
        for (String key:keySet) {
            System.out.println(key + ":" + myHash.get(key));
        }
        /*删除*/
        jedis.hdel("myHash","age");
        // 关闭连接
        jedis.close();
    }

    /**
     * list 数据结构操作
     */
    @Test
    public void test3(){
        /*获取连接*/
        Jedis jedis = new Jedis("localhost",6379);
        jedis.del("myList");
        /*从左边到右边存储*/
        jedis.lpush("myList","a","b","c");
        /*从右边到左边存储*/
        jedis.rpush("myList","a","b","c");
        /*获取myList中所有数据*/
        List<String> myList = jedis.lrange("myList", 0, -1);
        System.out.println(myList);
        /*从左边弹出,删除*/
        String element2 = jedis.lpop("myList");
        System.out.println(element2);
        /*从右边弹出,删除*/
        String element1 = jedis.rpop("myList");
        System.out.println(element1);
        /*获取myList中所有数据*/
        List<String> myList1 = jedis.lrange("myList", 0, -1);
        System.out.println(myList1);
        /*关闭连接*/
        jedis.close();
    }
    /**
     * set 数据结构操作
     */
    @Test
    public void test4(){
        /*获取连接*/
        Jedis jedis = new Jedis("localhost",6379);
        /*保存*/
        jedis.sadd("mySet","a","b","c","a","c");
        /*随机获取一个元素*/
        String mySet1 = jedis.srandmember("mySet");
        System.out.println("随机:" + mySet1);
        /*获取所有元素*/
        Set<String> mySet = jedis.smembers("mySet");
        System.out.println(mySet);
        /*删除*/
        jedis.srem("mySet","a");
        /*获取*/
        Set<String> mySet2 = jedis.smembers("mySet");
        System.out.println(mySet2);
        // 关闭连接
        jedis.close();
    }
    /**
     * sortedSet 数据结构操作
     */
    @Test
    public void test6(){
        //1. 获取连接
        Jedis jedis = new Jedis();//如果使用空参构造，默认值 "localhost",6379端口
        //2. 操作
        // sortedSet 存储
        jedis.zadd("mySortedSet",3,"亚瑟");
        jedis.zadd("mySortedSet",130,"后裔");
        jedis.zadd("mySortedSet",55,"孙悟空");

        // sortedSet 获取
        Set<String> mySortedSet = jedis.zrange("mySortedSet", 0, -1);
        System.out.println(mySortedSet);
        // 删除
        jedis.zrem("mySortedSet","亚瑟");
        // sortedSet 获取
        Set<String> mySortedSet1 = jedis.zrange("mySortedSet", 0, -1);
        System.out.println(mySortedSet1);


        //3. 关闭连接
        jedis.close();
    }

    /**
     * 使用JedisPool连接池
     */
    @Test
    public void test7(){
        /*创建连接池配置对象*/
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(50);
        /*创建连接池对象*/
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, "localhost", 6379);
        /*获取连接*/
        Jedis jedis = jedisPool.getResource();
        /*存储字符串键值对*/
        jedis.set("password","123");
        String password = jedis.get("password");
        System.out.println(password);
        /*关闭连接*/
        jedis.close();
    }
    /**
     * 使用JedisPoolUtils工具类
     */
    @Test
    public void test8(){
        /*获取连接*/
        Jedis jedis = JedisPoolUtils.getJedis();
        /*存储字符串键值对*/
        jedis.set("password","456");
        String password = jedis.get("password");
        System.out.println(password);
        /*关闭连接*/
        jedis.close();
    }
}

