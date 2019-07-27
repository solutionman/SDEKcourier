package com.courier.controller;

import com.courier.entity.Customer;
import com.courier.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class CustomerController {

    @Autowired
    public CustomerService customerService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/customers")
    public String deliveryList( Model model ){
        model.addAttribute( "customers", customerService.findAll() );
        return "deliveryList";
    }

    @GetMapping("/customersLater")
    public String deliveryLater( Model model ){
        model.addAttribute( "customers", customerService.findLate() );
        return "deliveryLater";
    }

    @PostMapping( "/customers" )
    public String updateCustomer(@ModelAttribute( "customer" ) Customer customer){
        customerService.update( customer );
        return "deliveryList";
    }

    @GetMapping("/later/{id}")
    public String laterCustomer(@PathVariable( "id" ) int id){
        customerService.later( id );
        return "redirect:/customers";
    }

}
