package com.javariches.demo.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface {


    final CustomerServiceInterface serviceInterface;
    final CustomerRepositoryImpl customerRepositoryImpl;


    public CustomerServiceImpl(CustomerServiceInterface serviceInterface, CustomerRepositoryImpl customerRepositoryImpl){
        this.serviceInterface = serviceInterface;
        this.customerRepositoryImpl = customerRepositoryImpl;
    }

    @Override
    public String createCustomer(String firstName, String lastName, String email, String address){
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setAddress(address);
        customerRepositoryImpl.save(customer);
        return customer.getFirstName() + " " + customer.getLastName() + "'s profile has been created";


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
