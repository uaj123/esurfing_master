package cn.uaj.utils;

/**
 * @author wushaojie
 * @date 2020/1/16 21:15
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * 事务相关的工具类，包含了，开启事务，提交事务，回滚事务，释放连接
 */
@Component("txManager")
@Aspect // 表明切面，注解开发使用环绕通知，不使用会出问题
public class TransactionManager {
    @Autowired
    private ConnectionUtils connectionUtils;
    // 配置切入点表达式
    @Pointcut("execution(* cn.uaj.service.impl.*.*(..))")
    private void pt(){}
    /**
     *
     * 开启事务
     */
    public void beginTransaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * 提交事务
     */
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * 回滚事务
     */

    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * 释放连接
     */
    public void release(){
        try {
            connectionUtils.getThreadConnection().rollback();
            connectionUtils.removeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 环绕通知
     */
    @Around("pt()")
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        Object rtValue = null;
        try {
            /*获取参数*/
            Object[] args = proceedingJoinPoint.getArgs();
            /*开始事务*/
            this.beginTransaction();
            /*执行方法*/
            rtValue = proceedingJoinPoint.proceed(args);
            /*提交事务*/
            this.commit();
            /*返回结果*/
            return rtValue;
        } catch (Throwable throwable) {
            /*回滚事务*/
            this.rollback();
            throw new RuntimeException(throwable);
        }finally {
            /*释放资源*/
            this.release();
        }
    }
}
