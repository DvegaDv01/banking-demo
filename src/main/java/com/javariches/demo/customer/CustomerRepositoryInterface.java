package com.javariches.demo.customer;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositoryInterface {


    void save(Customer customer);
}
