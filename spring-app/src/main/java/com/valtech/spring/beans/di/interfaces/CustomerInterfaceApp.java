package com.valtech.spring.beans.di.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerInterfaceApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = context.getBean("customerservice", CustomerService.class);
        System.out.println(customerService.findAll());
    }
}
