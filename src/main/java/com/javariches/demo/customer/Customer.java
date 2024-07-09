package com.javariches.demo.customer;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "customers", schema = "users")
public class Customer {

    // Attributes //
    @Column(name = "first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String dob;

    @Column
    private int phoneNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Methods //
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
