package com.spring.aop;
//用户自定义的前置增强
public class MyBeforeAdvice {
    public  void  beforeMethod(){
        //定义前置方法
        System.out.println("This is before method");
    }

}
