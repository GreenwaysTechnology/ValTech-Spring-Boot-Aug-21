package com.valtech.spring.javaconfig;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepo {
    public String findAll(){
        return "Order Repo";
    }
}
