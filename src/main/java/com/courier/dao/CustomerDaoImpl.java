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

    }

    @Override
    public Customer getById(int id) {
        String sql = " SELECT c.*, dt.deliveryTime FROM customer c" +
                     " INNER JOIN deliveryTimeHistory dt ON c.ID = dt.customerID" +
                     " WHERE dt.isActual = 'yes'" +
                     " AND c.ID = ?";
        return jdbcTemplate.queryForObject( sql, new CustomerMapper(), id );
    }

    public List<Customer> findAll(){
        String sql = "SELECT c.*, dt.deliveryTime  FROM customer c " +
                     " INNER JOIN deliveryTimeHistory dt ON c.ID = dt.customerID " +
                     " WHERE dt.isActual = 'yes' " +
                     " AND c.lateDelivery = 'no' " +
                     " ORDER BY dt.deliveryTime ";
        return jdbcTemplate.query(sql, new CustomerMapper());
    }

    @Override
    public List<Customer> findLate() {
        String sql = " SELECT c.*, dt.deliveryTime  FROM customer c " +
                     " INNER JOIN deliveryTimeHistory dt ON c.ID = dt.customerID " +
                     " WHERE dt.isActual = 'yes' " +
                     " AND c.lateDelivery = 'yes' " +
                     " ORDER BY dt.deliveryTime ";
        return jdbcTemplate.query(sql, new CustomerMapper());
    }

    @Override
    public void update(Customer customer) {
        String sql = "UPDATE customer SET lateDelivery = 'yes' WHERE id = ?";
        jdbcTemplate.update( sql, customer.getId() );
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void later(int id) {
        String sql = "UPDATE customer SET lateDelivery = 'yes' WHERE ID = ?";
        jdbcTemplate.update( sql, id );
    }
}
