package com.ecommerce.user.service;

import com.ecommerce.user.model.Customer;
import com.ecommerce.user.repository.CustomerRepo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Log4j2
@Service
public class CustomerServiceImpl implements CustomerServiceIntr {

    @Autowired
    private CustomerRepo customerRepo;


    public Customer addCustomer(Customer customer){

        Customer customer1 = customerRepo.save(customer);

        log.info("Customer added Successfully.");

       return customer1;
    }


}
