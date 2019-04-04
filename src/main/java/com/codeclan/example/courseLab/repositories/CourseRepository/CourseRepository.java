package com.codeclan.example.courseLab.repositories.CourseRepository;

import com.codeclan.example.courseLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findCourseByStarRating(int starRating);

}
