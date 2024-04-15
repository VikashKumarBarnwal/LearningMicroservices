/**
 * 
 */
package com.vks.microservice.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vks.microservice.userservice.entity.User;
import com.vks.microservice.userservice.model.UserWithDepartmentVO;
import com.vks.microservice.userservice.service.UserService;

/**
 * @author Vikash
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService  userService;
	
	@PostMapping
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
		
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") Long userId) {
		return userService.getUserByUserid(userId);
		
	}
	
	@GetMapping("/UserWithDepartment/{id}")
	public UserWithDepartmentVO getUserwithDepartment(@PathVariable("id") Long userId) {
		
		
			return	userService.getUserWithDepartmentVO(userId);
	}

}
