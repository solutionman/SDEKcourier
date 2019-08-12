package com.courier.dao;

import com.courier.entity.Customer;
import com.courier.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDaoImpl( JdbcTemplate jdbcTemplate ){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Customer customer) {
        String sql = "INSERT INTO customer ( orderNo, lastName, firstName, middleName, lateDelivery, deliveryTime, address, phone) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";
        jdbcTemplate.update( sql, customer.getOrderNo(), customer.getLastName(), customer.getFirstName(), customer.getMiddleName(), customer.getLateDelivery(), customer.getDeliveryTime(), customer.getAddress(), customer.getPhone() );
    }

    @Override
    public Customer getById(int id) {
        String sql = " SELECT c.* FROM customer c" +
                     " WHERE c.ID = ?";
        return jdbcTemplate.queryForObject( sql, new CustomerMapper(), id );
    }

    @Override
    public Customer getByOrderNo(int orderNo) {
        String sql = " SELECT * FROM customer WHERE orderNo = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new CustomerMapper(), orderNo);
        } catch (Exception e) {
            java.lang.System.out.println( "No records" + e );
        }
        return null;
    }

    public List<Customer> findAll(){
        String sql = "SELECT c.*  FROM customer c " +
                     " WHERE c.lateDelivery = 'no' " +
                     " ORDER BY c.deliveryTime ";
        return jdbcTemplate.query(sql, new CustomerMapper());
    }

    @Override
    public List<Customer> findLate() {
        String sql = " SELECT c.* FROM customer c " +
                     " WHERE c.lateDelivery = 'yes' " +
                     " ORDER BY c.deliveryTime ";
        return jdbcTemplate.query(sql, new CustomerMapper());
    }

    @Override
    public void update(Customer customer) {
        String sql = "UPDATE customer SET deliveryTime = ?, lateDelivery = 'no' WHERE id = ?";
        jdbcTemplate.update( sql, customer.getDeliveryTime(), customer.getId() );
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void later(int id) {
        String sql = "UPDATE customer SET lateDelivery = 'yes' WHERE ID = ?";
        jdbcTemplate.update( sql, id );
    }

    @Override
    public void cancel(int id) {
        String sql = "UPDATE customer SET lateDelivery = 'no' WHERE ID = ?";
        jdbcTemplate.update( sql, id );
    }
}
