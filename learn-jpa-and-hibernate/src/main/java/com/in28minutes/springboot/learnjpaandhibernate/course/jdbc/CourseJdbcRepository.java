package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


//when a class talk to db
@Repository
public class CourseJdbcRepository {
	//enables to fire query in spring jdbc
	@Autowired		
	private JdbcTemplate springJdbcTemplate;

	private static String INSERT_QUERY = 
			"""
insert into COURSE(ID, NAME , AUTHOR)  
values(1, 'Learnaws ', 'in28minutes');	
""";
	public void insert() {
		//update method can be used to insert update and delete
		springJdbcTemplate.update(INSERT_QUERY);
	}

}
