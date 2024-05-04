package com.user.User_Details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.User_Details.Entity.User;
import com.user.User_Details.Service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	List<User>getAlluser(){
		return userService.getAllUser();
	}
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	@PutMapping("/{id}")
	public User updateUser(@RequestBody User updatedUser,@PathVariable Long id) {
		
		return userService.updateUser(id, updatedUser);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<User>deleteUser(@PathVariable Long id){
		userService.deletebyId(id);
		return ResponseEntity.ok().build();
	}
	@GetMapping("/{id}")
	public User getById(@PathVariable Long id) {
		return userService.getById(id);
	}
	
}
