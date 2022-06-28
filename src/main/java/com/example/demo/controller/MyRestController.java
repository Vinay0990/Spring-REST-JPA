package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeMongoService;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class MyRestController {

	@Autowired
	public EmployeeService service2;

	@Autowired
	public EmployeeMongoService service;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return service.getAllEmployees();
	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee e) {
		return service.saveEmployee(e);
	}

	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable("id") String id, @RequestBody Employee e) {
		return this.service.updateEmployee(id, e);
	}

	@DeleteMapping("/employees/{id}")
	public Employee deleteEmployee(@PathVariable("id") String id) {
		return this.service.deleteEmployee(id);
	}
}
