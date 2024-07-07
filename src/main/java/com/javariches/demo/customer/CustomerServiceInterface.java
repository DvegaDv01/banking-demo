package com.javariches.demo.customer;

public interface CustomerServiceInterface {

    // User access methods
    String createCustomer(String firstName, String lastName, String email, String address);
    void deleteCustomer();
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
