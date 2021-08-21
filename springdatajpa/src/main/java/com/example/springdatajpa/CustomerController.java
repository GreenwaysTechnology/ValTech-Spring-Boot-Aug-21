package com.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public ResponseEntity getCustomers() {
        return ResponseEntity.ok(customerRepository.findAll());
    }

    @RequestMapping("/{id}")
    @GetMapping
    public ResponseEntity findById(@PathVariable("id") long id) {
        Customer customer = customerRepository.findById(id);
        if (customer == null) {
            return  ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(customer);
    }
}
