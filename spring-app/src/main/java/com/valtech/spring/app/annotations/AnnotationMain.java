package com.valtech.spring.app.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("annotations.xml");
        Customer customer = factory.getBean("cust",Customer.class);
        System.out.println(customer.getAddress());
    }
}
