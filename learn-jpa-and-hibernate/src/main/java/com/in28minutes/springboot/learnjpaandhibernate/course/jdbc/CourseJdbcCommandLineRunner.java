package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
	private CourseJdbcRepository repository;
	@Override
	//this actually runs the code at startup
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "learn aws now", "in28minutes"));
		repository.insert(new Course(2, "learn azure now", "in28minutes"));
		repository.insert(new Course(3, "learn gcp now", "in28minutes"));
		
		repository.delete(1);
	}

}
