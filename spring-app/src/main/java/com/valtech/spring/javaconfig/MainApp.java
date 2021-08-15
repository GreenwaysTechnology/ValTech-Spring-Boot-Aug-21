package com.valtech.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfigComponentScanner.class);
        CustomerService service=ctx.getBean(CustomerService.class);
        System.out.println(service.findAll());

        OrderService orderService=ctx.getBean(OrderService.class);
        System.out.println(orderService.findAll());
    }
}
