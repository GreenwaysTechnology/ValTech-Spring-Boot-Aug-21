package com.valtech.bootapp;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class BootappApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext context=SpringApplication.run(BootappApplication.class, args);
//		HelloWorld helloWorld=context.getBean(HelloWorld.class);
//		System.out.println(helloWorld.sayHello());

		SpringApplication application = new SpringApplication(BootappApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.setBannerMode(Banner.Mode.OFF);
		ConfigurableApplicationContext context =application.run(args);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		System.out.println(helloWorld.sayHello());


	}

}
