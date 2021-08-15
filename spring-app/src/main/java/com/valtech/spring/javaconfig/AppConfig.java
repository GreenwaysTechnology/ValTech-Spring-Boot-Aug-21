package com.valtech.spring.javaconfig;

//beans.xml === This java class

//import com.valtech.spring.javaconfig.customer.CustomerConfig;
//import com.valtech.spring.javaconfig.customer.OrderConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import({CustomerConfig.class, OrderConfig.class})
public class AppConfig {
    //bean creation
//    @Bean
//    public CustomerService getCustomerService() {
//        return new CustomerService();
//    }
//    @Bean
//    public OrderService getOrderService(){
//        return new OrderService();
//    }
//    @Bean
//    public OrderRepo getOrderRepo(){
//        return new OrderRepo();
//    }
}