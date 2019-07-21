package com.courier.config;

import com.courier.dao.CustomerDao;
import com.courier.dao.CustomerDaoImpl;
import com.courier.service.CustomerService;
import com.courier.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig{

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate( getDataSource() );
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl( "jdbc:mysql://localhost:3306/courier?useSll=false" );
        dataSource.setUsername( "root" );
        dataSource.setPassword( "12lom97" );
        dataSource.setDriverClassName( "com.mysql.jdbc.Driver" );
        return dataSource;
    }

    @Bean
    public CustomerDao getCustomerDao(){
        return new CustomerDaoImpl( getJdbcTemplate() );
    }

    @Bean
    public CustomerService getCustomerService(){
        return new CustomerServiceImpl();
    }
}
