package com.courier.dao;

import com.courier.entity.Customer;

import java.util.List;

public interface CustomerDao {

    void save( Customer customer );

    Customer getById( int id );

    Customer getByOrderNo( int id );

    List<Customer> findAll();

    List<Customer> findLate();

    void update( Customer customer );

    void delete( int id );

    void later( int id );

    void laterByOrderNo( int orderNo );

    void cancel( int id );
}
