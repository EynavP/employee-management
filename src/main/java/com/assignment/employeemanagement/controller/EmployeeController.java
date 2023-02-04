package com.assignment.employeemanagement.controller;

import com.assignment.employeemanagement.exception.ResourceNotFoundException;
import com.assignment.employeemanagement.model.Employee;
import com.assignment.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    //Get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
        Employee employee = employeeRepo.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Employee not exist with id:"+id));
        return ResponseEntity.ok(employee);
    }

    //Update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee updateDetails){
        Employee updateEmployee = employeeRepo.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Employee not exist with id:"+ id));
        updateEmployee.setFirst_name(updateDetails.getFirst_name());
        updateEmployee.setLast_name(updateDetails.getLast_name());
        updateEmployee.setEmail(updateDetails.getEmail());
        employeeRepo.save(updateEmployee);
        return ResponseEntity.ok(updateEmployee);
    }

}
