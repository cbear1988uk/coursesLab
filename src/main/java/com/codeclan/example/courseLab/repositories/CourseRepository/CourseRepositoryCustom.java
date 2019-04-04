package com.codeclan.example.courseLab.repositories.CourseRepository;

import com.codeclan.example.courseLab.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> courseFromCustomer(Long id);
}
