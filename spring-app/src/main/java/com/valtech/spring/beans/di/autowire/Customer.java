package com.valtech.spring.beans.di.autowire;

public class Customer {
    private int id;
    private String name;
    //address is variable which has to match against byName
    private Address address1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }
    //    public Customer() {
//    }
//
//    public Customer(Address address) {
//        this.address = address;
//    }
//
//    public Customer(int id, String name, Address address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
////    public Address getAddress() {
////        return address;
////    }
////
////    public void setAddress(Address address) {
////        this.address = address;
////    }
}
