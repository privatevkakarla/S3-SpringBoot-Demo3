package com.veer.springboot.rest.demo3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.veer.springboot.rest.demo3.model.Employee;
import com.veer.springboot.rest.demo3.serviceImpl.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	
	 @Autowired 
	 EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<Object> getEmployee(@PathVariable String empId) throws Exception {
		
		Employee employeeResponse = employeeServiceImpl.getEmployeeByEmployeeId(empId);
		
	return new ResponseEntity<Object>(employeeResponse,HttpStatus.OK);
	}
	
	@GetMapping("/employees")
	public ResponseEntity<Object> getAllEmployees() throws Exception {
		List<Employee> empResponse=null;
		empResponse = employeeServiceImpl.getAllEmployees();
		
	return new ResponseEntity<Object>(empResponse,HttpStatus.OK);
	}
	
}
