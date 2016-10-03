package com.spring_jetty.rest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring_jetty.entities.User;

@RestController
@RequestMapping("/api/v1")
public class RestUserController {
	
	@RequestMapping("/users")
	@ResponseBody
	public List<User> gerUsers() {
		List<User> users = new ArrayList<User>();
		User u1 = new User();
		u1.setId("1234");
		u1.setName("Test user 1");
		
		User u11 = new User();
		u11.setId("1234");
		u11.setName("Test user 1");
		
		users.add(u11);
		users.add(u1);
		return users;
	}
}
