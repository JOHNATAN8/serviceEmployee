package com.perifeirait.serviceEmployee.services;

import java.util.List;

import com.perifeirait.serviceEmployee.models.entity.Employee;


public interface EmployeeService {
	
	public List<Employee> findAllEmployees();

}