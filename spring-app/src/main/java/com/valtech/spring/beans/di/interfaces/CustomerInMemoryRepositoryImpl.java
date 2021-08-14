package com.valtech.spring.beans.di.interfaces;

public class CustomerInMemoryRepositoryImpl implements  CustomerRepository{
    @Override
    public String findAll() {
        return "CustomerInMemoryRepositoryImpl";
    }
}
