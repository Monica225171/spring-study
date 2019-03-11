package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImpl implements UserDao {
    private static  final Logger logger= LoggerFactory.getLogger ( BeforeAdvice.class );
    @Override
    public void insert() {
        logger.info ( "开始进入插入操作。。。" );
    }
}
