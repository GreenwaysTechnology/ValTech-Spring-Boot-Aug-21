package com.example.springdatajpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customers", path = "mycustomers")
public interface CustomerRestRepository extends PagingAndSortingRepository<Customer, Long> {
    List<Customer> findByLastName(@Param("name") String name);

}
