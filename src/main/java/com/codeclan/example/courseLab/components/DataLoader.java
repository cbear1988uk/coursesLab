package com.codeclan.example.courseLab.components;

import com.codeclan.example.courseLab.models.Booking;
import com.codeclan.example.courseLab.models.Course;
import com.codeclan.example.courseLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.courseLab.repositories.CourseRepository.CourseRepository;
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

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course python = new Course("Intro to Python", "Glasgow", "4/5");
        courseRepository.save(python);

        Course ruby = new Course("Ruby Fundamentals", "Edinburgh", "3/5");
        courseRepository.save(ruby);

        Booking spring = new Booking("March 2020");
        bookingRepository.save(spring);

        Booking autumn = new Booking("September 2020");
        bookingRepository.save(autumn);

    }

}
