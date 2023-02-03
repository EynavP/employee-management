package com.assignment.employeemanagement.repository;

import com.assignment.employeemanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //Crud database methods
}
