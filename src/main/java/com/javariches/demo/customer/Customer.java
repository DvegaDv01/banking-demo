package com.javariches.demo.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Customer {


    private String firstName;
    private String lastName;
    private String email;
    private String address;

    private String dob;

    private int phoneNumber;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected Customer(){

    }

    public Customer(String firstName, String lastName, String email, String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void setId(Long id) {
        this.id = id;
    }

}
