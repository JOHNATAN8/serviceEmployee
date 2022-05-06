package com.perifeirait.serviceEmployee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perifeirait.serviceEmployee.models.entity.Employee;
import com.perifeirait.serviceEmployee.services.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employees")
	@Operation(summary = "Busqueda de todos los empleados")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Empleados encontrados"),
			@ApiResponse(responseCode = "404", description = "No se encuentran los empleados en el sistema", content = @Content),
			@ApiResponse(responseCode = "400", description = "Datos recibidos inválidos", content = @Content),
			@ApiResponse(responseCode = "500", description = "Error en procesamiento de información", content = @Content)
	})
	public ResponseEntity<?> getAllEmployees() {
		List<Employee> employee = service.findAllEmployees();
		if(employee.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(employee);
	}

}
