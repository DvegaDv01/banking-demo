package com.javariches.demo.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {
}
