package com.valtech.spring.beans.creation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMainApp {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        AuthService auth=factory.getBean("authService",AuthService.class);
        auth.setUserName("admin");
        auth.setPassword("admin");
        boolean isAuth = auth.login("admin", "admin");
        System.out.println(isAuth ? "Valid" : "Not Valid");
    }
}
