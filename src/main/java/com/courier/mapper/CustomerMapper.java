package com.courier.mapper;

import com.courier.entity.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setId( rs.getInt( "id" ) );
        customer.setOrderNo( rs.getInt( "orderno" ) );
        customer.setFirstName( rs.getString( "firstname" ) );
        customer.setLastName( rs.getString( "lastname" ) );
        customer.setMiddleName( rs.getString( "middlename" ) );
        customer.setAddress( rs.getString( "address" ) );
        customer.setPhone( rs.getString( "phone" ) );
        customer.setLateDelivery( rs.getString( "latedelivery" ) );
        customer.setDeliveryTime( rs.getString( "deliveryTime" ) );
        return customer;
    }
}
