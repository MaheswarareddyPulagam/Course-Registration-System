package com.example.courseregistration.service;

import com.example.courseregistration.entity.Course;
import com.example.courseregistration.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Course createCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
    }

    @Override
    public Course updateCourse(Long id, Course course) {
        Course existing = getCourseById(id);
        existing.setName(course.getName());
        existing.setCode(course.getCode());
        return repository.save(existing);
    }

    @Override
    public void deleteCourse(Long id) {
        repository.deleteById(id);
    }
}
