package com.oldox.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oldox.framework.entity.User;
import com.oldox.framework.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getById")
	public String getById(@RequestParam Long id){
		User user = userService.getById(id);
		System.out.println(user.getUsername());
		return "helloworld/hello";
	}

}
