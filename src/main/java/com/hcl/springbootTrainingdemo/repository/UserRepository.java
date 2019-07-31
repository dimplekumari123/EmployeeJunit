package com.hcl.springbootTrainingdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.springbootTrainingdemo.entity.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
