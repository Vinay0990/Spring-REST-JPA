package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("employees")
public class EmployeeMongo {
	@Id
	private String id;
	private String name;
	private String dept;
	private int salary;
}
