package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//用户自定义的前置增强
public class MyBeforeAdvice {
    private static  final Logger logger= LoggerFactory.getLogger(MyBeforeAdvice.class);
    public  void  beforeMethod(){
        //定义前置方法
//        logger.debug ( "This is before method by liuting" );
        logger.info("This is before method by liuting");
//        System.out.println("This is before method");
    }

}
