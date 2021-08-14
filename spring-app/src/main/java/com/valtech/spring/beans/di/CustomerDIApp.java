package com.valtech.spring.beans.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDIApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //access bean
        Customer customer = context.getBean("customer",Customer.class);
//        customer.setCustomerId(1);
//        customer.setName("subramanian");
//        customer.getAddress().setCity("Coimbatore");
        System.out.println(customer);
        System.out.println(customer.getOrders());

        Customer customer1 = context.getBean("newCustomer",Customer.class);
        System.out.println(customer1);


    }

}
