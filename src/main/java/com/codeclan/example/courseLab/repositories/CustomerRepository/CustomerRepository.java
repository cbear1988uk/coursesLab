package com.codeclan.example.courseLab.repositories.CustomerRepository;

import com.codeclan.example.courseLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
