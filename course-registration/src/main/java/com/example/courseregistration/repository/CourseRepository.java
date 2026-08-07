package com.example.courseregistration.repository;

import com.example.courseregistration.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
