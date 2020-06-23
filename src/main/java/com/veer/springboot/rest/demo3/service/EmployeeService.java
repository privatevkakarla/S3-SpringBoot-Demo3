package com.veer.springboot.rest.demo3.service;

import java.util.List;

import com.veer.springboot.rest.demo3.model.Employee;

public interface EmployeeService {

	public Employee getEmployeeByEmployeeId(String empId);
	
	public List<Employee> getAllEmployees();
}
