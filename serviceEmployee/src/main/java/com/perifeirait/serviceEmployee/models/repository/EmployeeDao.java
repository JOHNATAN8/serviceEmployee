package com.perifeirait.serviceEmployee.models.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.perifeirait.serviceEmployee.models.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	
	@Query("select e from Employee e ")
	public List<Employee> findAllEmployees();
	
}
