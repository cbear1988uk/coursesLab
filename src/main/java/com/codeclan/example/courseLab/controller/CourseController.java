package com.codeclan.example.courseLab.controller;

import com.codeclan.example.courseLab.models.Course;
import com.codeclan.example.courseLab.models.Customer;
import com.codeclan.example.courseLab.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    @GetMapping(value = "/rating/{starRating}")
    public List<Course> findCourseFromRating(@PathVariable int starRating){
        return courseRepository.findCourseByStarRating(starRating);
    }

    @GetMapping(value = "/customer/{id}")
    public List<Course> findCourseByCustomer(@PathVariable Long id){
        return courseRepository.courseFromCustomer(id);
    }

}


