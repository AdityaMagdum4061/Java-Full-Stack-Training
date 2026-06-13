package com.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {	
	
	
}
