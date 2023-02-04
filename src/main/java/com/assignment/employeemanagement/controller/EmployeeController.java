package com.assignment.employeemanagement.controller;

import com.assignment.employeemanagement.model.Employee;
import com.assignment.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepo;
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    //Create Employee REST API
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepo.save(employee);
    }

}
