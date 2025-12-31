package com.mongodb.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employee")
public class UserEntity {
	
	private int id;
	private String name;
	private String email;
	private String job_role;
	private String salary;

}
