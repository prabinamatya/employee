package com.prabin.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prabin.employee.service.EmployeesRepository;

@SpringBootApplication
public class Application {
	
	@Autowired
	private EmployeesRepository employeesRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
