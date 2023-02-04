package com.assignment.employeemanagement;

import com.assignment.employeemanagement.model.Employee;
import com.assignment.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepo;
	@Override
	public void run(String... args) throws Exception {
		/*
		Employee employee = new Employee();
		employee.setFirst_name("Eynav");
		employee.setLast_name("Ptia");
		employee.setEmail("eynav@gmail.com");
		employeeRepo.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirst_name("Shahar");
		employee1.setLast_name("Ilani");
		employee1.setEmail("shahar@gmail.com");
		employeeRepo.save(employee1);
		 */
	}
}
