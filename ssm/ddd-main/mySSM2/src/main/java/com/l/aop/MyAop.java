package com.l.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAop {
    @Pointcut("execution(* com.l.service.*.*(..))")
    public void pointcut(){}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint + "开始执行");
        Object proceed = joinPoint.proceed();
        System.out.println("结果>>>" + proceed);
        System.out.println(joinPoint + "执行结束");
        return proceed;
    }

    @Before("pointcut()")
    public void before(){

    }

    @AfterReturning("pointcut()")
    public void afterReturning(){

    }
}
