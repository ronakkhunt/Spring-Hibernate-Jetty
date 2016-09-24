package com.spring_jetty.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_jetty.dao.UserDao;
import com.spring_jetty.entities.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired UserDao userDao;
	
	@RequestMapping("/get")
	@ResponseBody
	public String get() {
		return "Hello Guest!";
	}
	
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	@ResponseBody
	public void add() {
		User u1 = new User();
		u1.setName("Demo");
		userDao.saveOrUpdate(u1);
	}
}
