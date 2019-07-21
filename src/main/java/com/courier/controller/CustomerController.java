package com.courier.controller;

import com.courier.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute( "customers", customerService.findAll() );
        return "deliveryLater";
    }

}
