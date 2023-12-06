package com.xyz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.entity.Userss;
import com.xyz.service.UsersService;

@RestController
@RequestMapping("/api/")
public class HomeController {
	
	@Autowired
	private UsersService us;
	
	
	
	@PostMapping
	public ResponseEntity<Userss> createUserss(@RequestBody Userss userss){
		return new ResponseEntity<Userss>(us.saveUserss(userss),HttpStatus.CREATED);   
	}
	
	@GetMapping("/allUserss")
	public ResponseEntity<List<Userss>> allUsers(){
		return new ResponseEntity<List<Userss>>(us.getAllUserss(),HttpStatus.OK);
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<Userss> upd(@PathVariable("id") int id,@RequestBody Userss userss){
		return new ResponseEntity<>(us.updateUsers(id, userss),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") int id){
		return new ResponseEntity<>(us.deleteUser(id),HttpStatus.OK);
	}
	
	

}
