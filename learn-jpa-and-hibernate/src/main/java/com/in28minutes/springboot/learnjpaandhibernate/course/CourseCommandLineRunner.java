package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//	private CourseJdbcRepository repository;
	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	//this actually runs the code at startup
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "learn aws now", "in28minutes"));
		repository.insert(new Course(2, "learn azure now", "in28minutes"));
		repository.insert(new Course(3, "learn gcp now", "in28minutes"));
		
		repository.deleteById(1);
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}

}
