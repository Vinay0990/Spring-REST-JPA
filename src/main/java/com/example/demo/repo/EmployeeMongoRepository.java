package com.example.demo.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Employee;

@Primary
public interface EmployeeMongoRepository extends MongoRepository<Employee, String> {

}
