package com.mongodb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.Entity.UserEntity;
import com.mongodb.Repository.EntityRepo;

@RestController
@RequestMapping("/emp")
public class EntityController {
	
	@Autowired
	private EntityRepo entityrepo;
	
	@PostMapping("/save")
	public ResponseEntity<Object> create(@RequestBody UserEntity user){
		entityrepo.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body("Data Inserted Successfully!");
		
	}
	
	@GetMapping("/list")
	public ResponseEntity<Object> list(){
		return ResponseEntity.status(HttpStatus.OK).body(entityrepo.findAll());
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Object> update(@RequestBody UserEntity user){
		entityrepo.save(user);
		return ResponseEntity.status(HttpStatus.OK).body("Data Updated Successfully!");
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable int id){
		UserEntity obj1 = entityrepo.findById(id).get();
		entityrepo.delete(obj1);
		return ResponseEntity.status(HttpStatus.OK).body("Data Deleted Successfully!");
		
	}

}
