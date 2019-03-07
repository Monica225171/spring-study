package com.spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserLoginApp {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring.xml");
        UserLogin userLogin = context.getBean(UserLogin.class);
        System.out.println(userLogin);
    }
}