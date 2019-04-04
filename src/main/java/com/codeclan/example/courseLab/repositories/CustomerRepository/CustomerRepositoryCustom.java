package com.codeclan.example.courseLab.repositories.CustomerRepository;

import com.codeclan.example.courseLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> customerFromCourse(Long id);
}
