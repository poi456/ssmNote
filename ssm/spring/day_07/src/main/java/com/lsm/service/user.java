package com.lsm.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.scheduling.annotation.Async;

@Aspect
public class user  {
@Before("execution(* *.*.*.*.*())")
public void aa(){
    System.out.println("我要在你前面执行");
}
@After("execution(* *.*.*.*.*())")
    public void bb(){
        System.out.println("我要在你后面执行");
    }
}
