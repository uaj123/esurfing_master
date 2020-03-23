package cn.uaj.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wushaojie
 * @date 2020/1/17 10:21
 * 基于接口的动态代理
 */

/**
 * 动态代理：
 *      特点：字节码随时创建，随时加载
 *      作用：不修改源码的基础上对方法增强
 *      分类：
 *          1，基于接口的动态代理：
 *              涉及的类：Proxy
 *              提供者:JDK官方
 *          2，基于子类的动态代理：
 *              涉及的类：Enhancer
 *              提供者:第三方cglib库
 *      创建代理对象的要求：被代理对象至少实现一个接口，没有则不能使用动态代理
 *       newProxyInstance:
 *          参数：ClassLoader:类加载器，Class[]：字节码数组 ，还有一个用于增强的参数
 *
 */
public class Client {
    public static void main(String[] args) {
        final Produce produce = new Produce();
        IProduce proxyProduce = (IProduce) Proxy.newProxyInstance(produce.getClass().getClassLoader(),
                produce.getClass().getInterfaces(), new InvocationHandler() {
                    /**
                     * 作用：执行被代理对戏的任何接口方法都会经过该方法
                     * @param proxy  代理对象的引用
                     * @param method 当前执行的方法
                     * @param args  当前执行方法的参数
                     * @return  和被代理对象有相同的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object returnValue = null;
                        // 获取执行方法的参数
                        Float money = (Float) args[0];
                        // 判断是否是销售方法
                        if ("saleProduce".equals(method.getName())) {
                            returnValue = method.invoke(produce, money * 0.8f);
                        }
                        //判断是否是售后服务方法
                        if ("afterService".equals(method.getName())) {
                            returnValue = method.invoke(produce, money * 0.95f);
                        }
                        return returnValue;
                    }
                });
        proxyProduce.saleProduce(10000f);
        proxyProduce.afterService(10000f);
    }

}
