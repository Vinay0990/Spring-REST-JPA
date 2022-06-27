package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository repo;

	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
		getDummyData().forEach(t -> {
			this.repo.save(t);
		});
	}

	public List<Employee> getAllEmployees() {
		List<Employee> emps = this.repo.findAll();
		return emps;
	}

	public Employee saveEmployee(Employee e) {
		if (e == null) {
			return null;
		}

		return this.repo.save(e);
	}

	public Employee updateEmployee(int id, Employee e) {

		Optional<Employee> e1 = this.repo.findById(id);

		if (e1.isPresent()) {
			e1.get().setName(e.getName());
			e1.get().setDept(e.getDept());
			e1.get().setSalary(e.getSalary());
			return this.repo.save(e1.get());
		} else {
			return null;
		}
	}

	public Employee deleteEmployee(int id) {
		Optional<Employee> e = this.repo.findById(id);
		this.repo.delete(e.get());
		return e.get();
	}

	private List<Employee> getDummyData() {
		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(1, "Vinay", "CS", 10000));
		emps.add(new Employee(2, "John", "IT", 15000));
		emps.add(new Employee(3, "James", "ECE", 17000));
		return emps;
	}

}
