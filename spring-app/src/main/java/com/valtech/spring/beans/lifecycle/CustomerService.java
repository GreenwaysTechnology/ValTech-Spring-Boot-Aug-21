package com.valtech.spring.beans.lifecycle;

public class CustomerService {
    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destory");
    }
}
