package com.spring.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MeetingApp {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        MessagePrinter printer =context.getBean(Meeting.class);
//        System.out.println(meeting);
        Meeting meeting =context.getBean(Meeting.class);
        System.out.println(meeting);


    }
}
