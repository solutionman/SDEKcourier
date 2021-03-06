package com.courier.controller;

import com.courier.entity.Customer;
import com.courier.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @GetMapping( "/addCustomer" )
    public String createCustomerPage(){
        return "createCustomer";
    }

    @PostMapping( "/addCustomer" )
    public String addCustomer( @ModelAttribute( "customer" ) Customer customer ){
        customerService.save( customer );
        return "redirect:/customers";
    }

    @GetMapping("/customersLater")
    public String deliveryLater( Model model ){
        model.addAttribute( "customers", customerService.findLate() );
        return "deliveryLater";
    }

    @PostMapping( "/updateCustomer" )
    public String updateCustomer(@ModelAttribute( "customer" ) Customer customer){
        java.lang.System.out.println("DEBUG updateCustomer ");
        customerService.update( customer );
        return "redirect:/customersLater";
    }

    @PostMapping( "/customerByOrderNo" )
    public String customerByOrderNo(@ModelAttribute( "orderNo" ) int orderNo, Model model ){
        //customerService.getByOrderNo( orderNo );
        try {
            Model test = model.addAttribute("customer", customerService.getByOrderNo(orderNo));
            Map<String, Object> map =  test.asMap();
            Object testCustomer =  map.get( "customer" );
            if(testCustomer == null ){
                return "redirect:/noRecord";
            }
        } catch (Exception e){
            return "/customersLater";
        }
        return "editCustomer";
    }

    @PostMapping( "/cantDeliverByOrderNo" )
    public String cantDeliverByOrderNo(@ModelAttribute( "orderNo" ) int orderNo, Model model ){
        //customerService.getByOrderNo( orderNo );
        try {
            customerService.laterByOrderNo(orderNo);
            Model test = model.addAttribute("customer", customerService.getByOrderNo(orderNo));
            Map<String, Object> map =  test.asMap();
            Object testCustomer =  map.get( "customer" );
            if(testCustomer == null ){
                return "redirect:/noRecordDeliveryList";
            }
        } catch (Exception e){
            return "/customers";
        }
        return "redirect:/customers";
    }

    @GetMapping( "/update/{id}" )
    public String update( @PathVariable( "id" ) int id, Model model ){
        model.addAttribute( "customer", customerService.getById( id ) );
        return "editCustomer";
    }

    @GetMapping("/later/{id}")
    public String laterCustomer(@PathVariable( "id" ) int id){
        customerService.later( id );
        return "redirect:/customers";
    }

    @GetMapping("/cancel/{id}")
    public String customerNewTime( @PathVariable( "id" ) int id ){
        customerService.cancel( id );
        return "redirect:/customersLater";
    }

    @GetMapping( "/noRecord" )
    public String noRecordPage(){
        return "noRecord";
    }

    @GetMapping( "/noRecordDeliveryList" )
    public String noRecordDeliveryPage(){
        return "noRecordDeliveryList";
    }
}
