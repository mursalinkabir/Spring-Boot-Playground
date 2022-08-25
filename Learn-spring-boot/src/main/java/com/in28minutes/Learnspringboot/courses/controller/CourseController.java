package com.in28minutes.Learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.Learnspringboot.courses.bean.Course;

//marking this as a controller
@RestController
public class CourseController {

	// http://localhost:8080/courses
	
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1, "learn Microservicesss", "in28Minutes"));
	}
	
	
	// http://localhost:8080/courses/1
	@GetMapping("/courses/1")
	public Course getCourseDetail(){
		return new Course(1, "learn Microservices 1", "in28Minutes");
	}
	
}
