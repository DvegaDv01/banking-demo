package com.javariches.demo.service;

import com.javariches.demo.dto.CustomerRequestDTO;
import com.javariches.demo.entity.Customer;

public interface CustomerServiceInterface {

    // User access methods
    Customer createCustomer(CustomerRequestDTO dto);
    void deleteCustomer(Long id);
    void processAccountApplication();
    void applicationDecision();
    void login();
    void logout();
    void downloadStatements();
    void viewAccountInfo();
    void processDeposit();
    void updatePassword();
    void processWithdrawal();


    // non-user access methods
    void generateAccountNumber();
    void generateRoutingNumber();
    void generateTemporaryPassword();
}
