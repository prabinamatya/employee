package com.prabin.employee.service;

import org.springframework.data.repository.CrudRepository;

import com.prabin.employee.domain.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Long>{

}
