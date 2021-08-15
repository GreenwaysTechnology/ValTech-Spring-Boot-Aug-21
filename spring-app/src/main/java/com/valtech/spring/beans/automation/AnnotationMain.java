package com.valtech.spring.beans.automation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beanscreations.xml");
        Customer customer = factory.getBean("customer", Customer.class);
        System.out.println(customer.getAddress());
    }
}
