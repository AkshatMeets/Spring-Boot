package com.springboot.springbootproject.dao;

import com.springboot.springbootproject.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {


}
