package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;


//when a class talk to db
@Repository
public class CourseJdbcRepository {
	//enables to fire query in spring jdbc
	@Autowired		
	private JdbcTemplate springJdbcTemplate;

	private static String INSERT_QUERY = 
			"""
insert into COURSE(id, name , author)  
values(?, ?, ?);	
""";
	
	private static String DELETE_QUERY = 
			"""
delete from COURSE where id=?;	
""";
	
	
	public void insert(Course course) {
		//update method can be used to insert update and delete
		springJdbcTemplate.update(INSERT_QUERY, course.getId(),course.getName(),course.getAuthor());
	}
	public void delete(long id) {
		
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
}
