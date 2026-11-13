package com.ecommerce.user.controller;

import com.ecommerce.user.model.Customer;
import com.ecommerce.user.service.CustomerServiceIntr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {


    @Autowired
    private CustomerServiceIntr customerServiceIntr;

    @GetMapping("/hello")
    public String Hello(){

        return "Hello from user service";
    }

    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> adduser(@RequestBody Customer customer) {

        Customer customer1 = customerServiceIntr.addCustomer(customer);

        return new ResponseEntity<>(customer1, HttpStatus.OK);
    }
}
