package com.javariches.demo.customer;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface {


    private final CustomerRepositoryInterface customerRepositoryInterface;
    private final CustomerMapper mapper;


    public CustomerServiceImpl(CustomerRepositoryInterface customerRepositoryInterface, CustomerMapper mapper){
        this.customerRepositoryInterface = customerRepositoryInterface;
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public Customer createCustomer(CustomerRequestDTO dto){
        //validate input data
        // validation logic

        // map request to entity
        Customer customer = mapper.toCustomer(dto);
        // persist data
        customerRepositoryInterface.save(customer);
        // log service transaction
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + "'s profile has been created");
        return customer;
    }



    @Override
    public void deleteCustomer() {

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
