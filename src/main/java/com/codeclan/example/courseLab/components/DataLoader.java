package com.codeclan.example.courseLab.components;

import com.codeclan.example.courseLab.models.Booking;
import com.codeclan.example.courseLab.models.Course;
import com.codeclan.example.courseLab.models.Customer;
import com.codeclan.example.courseLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.courseLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.courseLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course python = new Course("Intro to Python", "Glasgow", "4/5");
        courseRepository.save(python);

        Course ruby = new Course("Ruby Fundamentals", "Edinburgh", "3/5");
        courseRepository.save(ruby);

        Customer collin = new Customer("Collin Bull", "Glasgow", 30);
        customerRepository.save(collin);

        Customer kieran = new Customer("Kieran Reid", "Paisley", 25);
        customerRepository.save(kieran);

        Booking spring = new Booking("March 2020", python, collin);
        bookingRepository.save(spring);

        Booking autumn = new Booking("September 2020", ruby, kieran);
        bookingRepository.save(autumn);

    }

}
