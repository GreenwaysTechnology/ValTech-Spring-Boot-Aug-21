package com.valtech.spring.app;

import com.valtech.spring.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        //Object Creation : Without Spring
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello Spring");
        System.out.println(helloWorld.getMessage());
        //Object creation : Using Spring
        //Create Spring Container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //access bean
        HelloWorld bean = context.getBean(HelloWorld.class);
        //set message
        bean.setMessage("Hello Spring Bean");
        //get message
        System.out.println(bean.getMessage());


    }
}
