package com.capstone.contoller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capstone.model.User;
import com.capstone.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;	
	@GetMapping("/user")
	public List<User> listALL(){
		System.out.println("Testing");
		return service.listAllUser();
	}	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Integer id){
		try {
		Optional<User> user=service.getUsersById(id);
		System.out.println(user);
		return user;//200
		}catch(NoSuchElementException e) {
			return null;//404
		}
	}
	@PostMapping("/users")
	public void addProduct(@RequestBody User user) {
		service.createUser(user);
	}
	
	@DeleteMapping("/user{id}")
	public void deleteUser(@PathVariable Integer id) {
		service.deleteUser(id);
	}
	 //just added for the update method
    @PutMapping("/user/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Integer id) {
        service.updateUser(user, id);
    }

	
}

