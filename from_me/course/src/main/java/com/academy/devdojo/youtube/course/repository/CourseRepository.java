package com.academy.devdojo.youtube.course.repository;

import com.academy.devdojo.youtube.course.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}
