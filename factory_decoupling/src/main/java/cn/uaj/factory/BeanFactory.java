package cn.uaj.factory;

/**
 * @author wushaojie
 * @date 2020/1/14 16:49
 */

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建Bean对象的工厂
 * Bean:在计算机英语中，有可重用组件的含义
 * JavaBean：用java语言编写的可重用组件
 * 创建service和dao对象：
 *  第一个：需要一个配置文件配置service和dao
 *      配置内容：唯一标识=全限定类名
 *  第二个：读取配置文件内容，反射创建对象
 */
public class BeanFactory {
    // 定义一个Properties对象
    private static Properties props;
    // 定义一个map用于存放初始化生成的对象，称为容器
    private static Map<String,Object> beans;


    // 使用静态代码块为props对象赋值，单例模式需要容器，工厂模式解耦升级版
    static {
        try {
            // 实例化对象
            props = new Properties();
            // 获取properties文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            // 实例化容器
            beans = new HashMap<String,Object>();
            // 取出配置文件中所有的key
            Enumeration<Object> keys = props.keys();
            // 遍历枚举
            while (keys.hasMoreElements()) {
                // 取出每个key
                String key = keys.nextElement().toString();
                // 根据key获取value
                String beanPath = props.getProperty(key);
                // 反射创建对象
                Object value = Class.forName(beanPath).newInstance();
                // 存入容器中
                beans.put(key,value);

            }
        }catch (Exception e){
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }

    /**
     * 根据Bean的名称获取bean对象，使用泛型，单例模式
     * @param beanName
     * @param <T>
     * @return
     */
    public static <T> T  getBean(String beanName){
        return (T) beans.get(beanName);
    }


   /*  多例
   // 使用静态代码块为props对象赋值
    static {
        try {
            // 实例化对象
            props = new Properties();
            // 获取properties文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
        }catch (Exception e){
            throw new ExceptionInInitializerError("初始化properties失败");
        }
    }*/
    /**
     * 根据Bean的名称获取bean对象，使用泛型
     * @param beanName
     * @param <T>
     * @return
     */
    /*public static <T> T getBean(String beanName){
        T bean = null;
        try {
            String beanPath = props.getProperty(beanName);
            bean = (T) Class.forName(beanPath).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bean;
    }*/
}
