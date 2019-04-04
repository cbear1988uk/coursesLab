package com.codeclan.example.courseLab.repositories.CustomerRepository;

import com.codeclan.example.courseLab.models.Course;
import com.codeclan.example.courseLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

}
