package com.javariches.demo.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/register")
public class CustomerController {
    private CustomerServiceImpl service;

    CustomerController(CustomerServiceImpl service){
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<Customer> registerCustomer(@RequestBody CustomerRequestDTO dto){
        // transform user request data
        Customer myobj = service.createCustomer(dto);
        // call customerService method createCustomer
        return ResponseEntity.ok(myobj);
    }

}
