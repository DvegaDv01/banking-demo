package com.javariches.demo.customer;

public class Customer {
    private String name;
    private String email;
    private String address;
    public static Customer create(String name, String email, String address) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setAddress(address);
        return customer;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {

        return name;
    }

    public String getEmail() {

        return email;
    }

    public String getAddress() {

        return address;
    }
}
