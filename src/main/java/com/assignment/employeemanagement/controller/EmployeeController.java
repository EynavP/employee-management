package com.assignment.employeemanagement.controller;

import com.assignment.employeemanagement.model.Employee;
import com.assignment.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepo;
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

}
