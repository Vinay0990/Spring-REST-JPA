package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee saveEmployee(Employee e);

	public Employee updateEmployee(String id, Employee e);

	public Employee deleteEmployee(String id);

	default List<Employee> getDummyData() {
		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee("1", "Vinay", "CS", 10000));
		emps.add(new Employee("2", "John", "IT", 15000));
		emps.add(new Employee("3", "James", "ECE", 17000));
		return emps;
	}

}
