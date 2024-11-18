package com.javariches.demo.repo;

import com.javariches.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {
    Optional<Customer> findById(Long id);

    List<Customer> findAll();
}
