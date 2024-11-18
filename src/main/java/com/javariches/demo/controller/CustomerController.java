package com.javariches.demo.controller;

import com.javariches.demo.dto.CustomerRequestDTO;
import com.javariches.demo.service.CustomerServiceImpl;
import com.javariches.demo.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Slf4j
@RequestMapping(path="api/v1/users")
public class CustomerController {
    private final CustomerServiceImpl service;

    CustomerController(CustomerServiceImpl service){
        this.service = service;
    }
    @PostMapping(path = "/signup")
    public ResponseEntity<Customer> registerCustomer(@RequestBody CustomerRequestDTO request){

        // transform user request data
        Customer customer = service.createCustomer(request);
        log.info(LocalDateTime.now() + ": " + customer.getFirstName() + " " + customer.getLastName() + "'s profile has been created with id: " + customer.getId());

        return ResponseEntity.ok(customer);
    }

    @GetMapping(path = "/all_users")
    public ResponseEntity<List<Customer>> getAllUsers() {
        return ResponseEntity.ok(service.findAllUsers());
    }

    @DeleteMapping(path = "/close_account/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
        service.deleteCustomer(id);
        return ResponseEntity.ok("User deleted!");
    }
}
