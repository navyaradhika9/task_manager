package org.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.taskmanager.model.User;
import org.taskmanager.service.UserService;

@RestController
@RequestMapping("/taskmanager/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public User addNewUser(@RequestBody User user) {
		return userService.addUser(user);
	}
}