package com.valtech.spring.beans.containerext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerMain {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beanscontainer.xml");
        factory.getBean("cust",Customer.class);
    }
}
