package com.valtech.spring.app.annotations.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beanscreationautomation.xml");
        Customer customer = factory.getBean("cust", Customer.class);
        System.out.println(customer.getAddress());
    }
}
