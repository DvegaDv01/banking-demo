package com.javariches.demo.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    CustomerRepository underTest;

    @Test
    void shouldReturnCustomerWhenFindByEmail() {
        //given
        Customer customer = Customer.create(
                "Jose",
                "jose@test.com",
                "14 Star Island, Miami, FL, USA");
        // when
        // then
    }
}