package com.valtech.spring.app.beans.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //set
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.register(DataSourceConfig.class);
        ctx.refresh();

    }
}
