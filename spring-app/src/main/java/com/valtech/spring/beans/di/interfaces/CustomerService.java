package com.valtech.spring.beans.di.interfaces;

public class CustomerService {
    //di with interface
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public CustomerService() {
    }

    public CustomerRepository getRepository() {
        return repository;
    }

    public void setRepository(CustomerRepository repository) {
        this.repository = repository;
    }

    public String findAll() {
        return repository.findAll();
    }
}
