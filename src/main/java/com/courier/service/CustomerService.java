package com.courier.service;

import com.courier.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    List<Customer> findLate();

    void update( Customer customer );
}
