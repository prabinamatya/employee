package com.prabin.employee;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prabin.employee.domain.Employees;
import com.prabin.employee.service.EmployeesRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTest {

	@Autowired
	private EmployeesRepository employeesRepository;
	
	@Test
	public void test() throws Exception {
		List<Employees> employees = (List<Employees>)employeesRepository.findAll();
		assertEquals(9, employees.size());
	}

}
