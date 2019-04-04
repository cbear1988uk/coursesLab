package com.codeclan.example.courseLab.controller;

import com.codeclan.example.courseLab.models.Customer;
import com.codeclan.example.courseLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping(value = "/course/{id}")
    public List<Customer> findCustomerByCourse(@PathVariable Long id){
        return customerRepository.customerFromCourse(id);
    }

}
