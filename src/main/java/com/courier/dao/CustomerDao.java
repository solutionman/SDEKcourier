package com.courier.dao;

import com.courier.entity.Customer;

import java.util.List;

public interface CustomerDao {

    void save( Customer customer );

    Customer getById( int id );

    List<Customer> findAll();

    void update( Customer customer );

    void delete( int id );
}
