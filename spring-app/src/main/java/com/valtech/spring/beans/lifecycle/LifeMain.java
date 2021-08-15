package com.valtech.spring.beans.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeMain {
    public static void main(String[] args) {
//        ApplicationContext factory = new ClassPathXmlApplicationContext("beans1.xml");
        ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("beans1.xml");
        factory.getBean("custService",CustomerService.class);
        factory.registerShutdownHook();

    }

}
