package com.perifeirait.serviceEmployee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perifeirait.serviceEmployee.models.entity.Employee;
import com.perifeirait.serviceEmployee.models.repository.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao repository;

	@Override
	public List<Employee> findAllEmployees() {
		return repository.findAllEmployees();
	}

}
