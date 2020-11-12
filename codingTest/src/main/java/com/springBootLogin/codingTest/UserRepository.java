package com.springBootLogin.codingTest;

import org.springframework.data.repository.CrudRepository;

import com.springBootLogin.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>  {

}
