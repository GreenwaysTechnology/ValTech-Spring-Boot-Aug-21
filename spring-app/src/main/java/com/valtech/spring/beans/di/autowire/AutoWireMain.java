package com.valtech.spring.beans.di.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans1.xml");
        Customer customer=factory.getBean("cust",Customer.class);
        System.out.println(customer.getAddress1().getCity());

    }
}
