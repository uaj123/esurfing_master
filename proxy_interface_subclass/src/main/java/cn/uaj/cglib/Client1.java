package cn.uaj.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

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
 *      创建代理对象的要求：被代理类不能为最终类，否则不能使用动态代理
 *       create方法的参数:
 *          参数：Class：字节码
 *                Callback:用于增强的参数,一般使用该接口的子接口实现类：MethodInterceptor
 */
public class Client1 {
    public static void main(String[] args) {
        final Produce1 produce = new Produce1();
        Produce1 proxyProduce = (Produce1) Enhancer.create(produce.getClass(), new MethodInterceptor(){
            /**
             *
             * @param proxy
             * @param method
             * @param args
             * @param methodProxy
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
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
        proxyProduce.saleProduce(13000f);
        proxyProduce.afterService(2000f);
    }

}
