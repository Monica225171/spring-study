package com.spring.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Fighter {
    @Pointcut("execution(* com.spring.aop.Tiger.walk())")
    public void foundTiger(){
    }

    @Before ( value = "foundTiger()")
    public void foundBefore(){
        System.out.println ( "Fighter wait for tiger" );
    }
    @AfterReturning("foundTiger()")
    public void foundAfter(){
        System.out.println ( "Fighter fight with tiger" );
    }
}
