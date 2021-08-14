package com.valtech.spring.beans.di.interfaces;

public class CustomerJPARepositoryImpl implements CustomerRepository {
    @Override
    public String findAll() {
        return "CustomerJPARepositoryImpl";
    }
}
