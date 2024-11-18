package com.javariches.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers", schema = "users")
public class Customer {

    // Attributes //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_name")
    private String userName;

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



    // Methods //

    public String to_string(){
        return "Customer: " + getUserName() + " " + getFirstName() + " " + getLastName();
    }
}
