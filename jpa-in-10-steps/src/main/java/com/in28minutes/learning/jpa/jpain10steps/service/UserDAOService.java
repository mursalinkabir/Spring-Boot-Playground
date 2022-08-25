package com.in28minutes.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.in28minutes.learning.jpa.jpain10steps.entity.User;
// repo helps to mark it as db element
@Repository
@Transactional
public class UserDAOService {
	// to make every object which has been through entity manager be autowired and tracked
	@PersistenceContext
	private EntityManager entitymanager;
	public long insert(User user) {
		entitymanager.persist(user);
		return user.getId();
	}
}
