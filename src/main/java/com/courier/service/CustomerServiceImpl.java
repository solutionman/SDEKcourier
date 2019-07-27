package com.courier.service;

import com.courier.dao.CustomerDao;
import com.courier.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    public CustomerDao customerDao;

    public List<Customer> findAll(){
        return customerDao.findAll();
    }

    @Override
    public List<Customer> findLate() {
        return customerDao.findLate();
    }

    @Override
    public void update(Customer customer) {
        customerDao.update( customer );
    }

    @Override
    public void later(int id) {
        customerDao.later( id );
    }
}
