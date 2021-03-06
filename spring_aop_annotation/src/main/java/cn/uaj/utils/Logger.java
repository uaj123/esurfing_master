package cn.uaj.utils;

/**
 * @author wushaojie
 * @ 2020/1/27
 *
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 通知类,用于记录日志的工具类
 * 使用注解配置aop，通知使用环绕通知，因为其他四个通知分别使用执行的顺序混乱
 */
@Component("logger")
@Aspect // 表示当前类是一个切面
public class Logger {
    // 切入点表达式
    @Pointcut("execution(* cn.uaj.service.impl.*.*(..))")
    private void pt1(){}
    /**
     * 前置通知
     */
    //@Before("pt1()")
    void beforePrintLog(){
        System.out.println("前置通知");
    }

    /**
     * 后置通知
     */
    //@AfterReturning("pt1()")
    void afterReturnPrintLog(){
        System.out.println("后置通知");
    }

    /**
     * 异常通知
     */
    //@AfterThrowing("pt1()")
    void afterThrowingPrintLog(){
        System.out.println("异常通知");
    }

    /**
     * 最终通知
     */
    //@After("pt1()")
    void afterPrintLog(){
        System.out.println("最终通知");
    }

    /**
     * 环绕通知
     * 问题：当我们配置了环绕通知之后，切入点方法没有执行，而通知类中方法执行了
     * 分析：通过对比动态代理中的环绕通知代码，发现动态代理的环绕通知有明确的
     *      切入点方法调用，而配置的代码中没有
     * 解决：
     *      spring框架为我们提供了一个接口：ProceedingJoiPoint,该接口有一个方法proceed(),
     *      此方法相当于明确调用切入点方法
     *      该接口可以作为环绕通知的方法参数，在程序执行时，spring框架会为我们提供接口的实现类供我们使用
     * spring中的环绕通知：
     *      是spring框架为我们提供的一种可以在代码中手动控制增强方法何时执行的方式
     */
    @Around("pt1()")
    <T> T aroundPrintLog(ProceedingJoinPoint pjp){
        T rtValue = null;
        try {
            Object[] args = pjp.getArgs(); // 得到方法执行所需的参数
            System.out.println("环绕通知--前置");
            rtValue = (T) pjp.proceed(args); // 明确调用业务层方法（切入点方法）
            System.out.println("环绕通知--后置");
            return rtValue;
        }catch (Throwable t){
            System.out.println("环绕通知--异常");
            throw new RuntimeException(t);
        }finally {
            System.out.println("环绕通知--最终");
        }
    }
}
