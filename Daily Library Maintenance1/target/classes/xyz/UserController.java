package com.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository ur;
	@PostMapping("/user")
public String  m1() {
	
	return  "hello matcha";
	
  }
	@PostMapping("/saveuser")
  public String  m2() {
	
	return  "data SAVED ";
	
  }

}

