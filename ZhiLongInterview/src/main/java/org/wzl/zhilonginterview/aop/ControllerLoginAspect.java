package org.wzl.zhilonginterview.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static org.wzl.zhilonginterview.constant.LogConstant.LOG_INFO_PREFIX;
import static org.wzl.zhilonginterview.constant.LogConstant.LOG_INFO_SUFFIX;

/**
 * @author : 卫志龙
 * @date : 2023/5/20
 */
@Aspect
@Component
public class ControllerLoginAspect {
    private static final Logger logger = LoggerFactory.getLogger(ControllerLoginAspect.class);

    @Before("execution(* org.wzl.zhilonginterview.controller.*.*(..))")
    public void logBeforeControllerMethod(JoinPoint joinPoint) {
        logger.info(LOG_INFO_PREFIX + "{}.{} 【开始执行】" + LOG_INFO_SUFFIX,joinPoint.getTarget().getClass().getSimpleName() , joinPoint.getSignature().getName());
    }

    @Around("execution(* org.wzl.zhilonginterview.controller.*.*(..))")
    public Object calculateExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        logger.info(LOG_INFO_PREFIX + "方法 {} 执行时间为: 【{} ms】" + LOG_INFO_PREFIX, joinPoint.getSignature().getName(), executionTime);
        return result;
    }

    @After("execution(* org.wzl.zhilonginterview.controller.*.*(..))")
    public void logAfterControllerMethod(JoinPoint joinPoint) {

    }
}
