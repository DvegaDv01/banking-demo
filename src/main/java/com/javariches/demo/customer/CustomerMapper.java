package com.javariches.demo.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {


    public Customer toCustomer(CustomerRequestDTO dto){
        Customer customer = new Customer();
        customer.setFirstName(dto.firstName());
        customer.setLastName(dto.lastName());
        customer.setEmail(dto.email());
        customer.setAddress(dto.address());
        return customer;
    }

    public CustomerRequestDTO toDto(Customer customer){
        CustomerRequestDTO dto = new CustomerRequestDTO(customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getAddress());
        return dto;
    };
}
