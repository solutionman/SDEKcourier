package com.courier.service;

import com.courier.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    List<Customer> findLate();

    void save( Customer customer );

    void update( Customer customer );

    Customer getById( int id );

    void later( int id );

    void cancel( int id );
}
