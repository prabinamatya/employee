package com.prabin.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prabin.employee.domain.Employees;
import com.prabin.employee.service.EmployeesRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private EmployeesRepository employeesRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		for(Employees employees : employeesRepository.findAll()) {
			System.out.println(employees.getFirstName());
		}
	}
}
