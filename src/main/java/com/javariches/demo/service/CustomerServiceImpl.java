package com.javariches.demo.service;

import com.javariches.demo.mapping.CustomerMapper;
import com.javariches.demo.repo.CustomerRepositoryInterface;
import com.javariches.demo.dto.CustomerRequestDTO;
import com.javariches.demo.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerServiceInterface {


    private final CustomerRepositoryInterface repository;
    private final CustomerMapper mapper;

    private List<Customer> users;


    public CustomerServiceImpl(CustomerRepositoryInterface customerRepositoryInterface, CustomerMapper mapper, List<Customer> users){
        this.repository = customerRepositoryInterface;
        this.mapper = mapper;
        this.users = users;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    @Override
    public Customer createCustomer(CustomerRequestDTO request){

        // map request to entity
        Customer customer = mapper.toCustomer(request);
        // persist data
        repository.save(customer);

        return customer;
    }

    public List<Customer> findAllUsers(){
//        users = new ArrayList<>();
//        users.addAll(repository.findAllById());

        return repository.findAll();
    }


    @Override
    public void deleteCustomer(Long id) {
        // the type returned by the findBy method is of type Optional
        Optional<Customer> customer = repository.findById(id);
        if (customer.isPresent()){
            log.info(LocalDateTime.now() + ": Deleting " + customer.get().getFirstName() + " " + customer.get().getLastName() + "'s profile.");
            repository.delete(customer.get());
        }

    }

    @Override
    public void processAccountApplication() {

    }

    @Override
    public void applicationDecision() {

    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    @Override
    public void downloadStatements() {

    }

    @Override
    public void viewAccountInfo() {

    }

    @Override
    public void processDeposit() {

    }

    @Override
    public void updatePassword() {

    }

    @Override
    public void processWithdrawal() {

    }

    @Override
    public void generateAccountNumber() {

    }

    @Override
    public void generateRoutingNumber() {

    }

    @Override
    public void generateTemporaryPassword() {

    }
}
