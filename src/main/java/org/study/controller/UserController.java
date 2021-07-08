package org.study.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.study.Entity.User;
import org.study.service.IUserService;

@RestController
public class UserController {
	@Autowired
	private IUserService userService;
	@GetMapping("users")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	@GetMapping("course/{courseId}/user")
	public List<User> getAllUserByCourseId(@PathVariable int courseId){
		return userService.getAllUserByCourseId(courseId);
	}
	@GetMapping("users/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	@PostMapping("user")
	public String addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	@PutMapping("user/{id}")
	public String updateUser(@RequestBody User user ,@PathVariable int id) {
		return userService.updateUser(user,id);
	}
	@DeleteMapping("deleteuser/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
}