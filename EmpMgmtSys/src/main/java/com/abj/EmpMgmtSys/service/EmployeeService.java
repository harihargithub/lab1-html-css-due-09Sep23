package com.abj.EmpMgmtSys.service;

import java.util.Set;

import com.abj.EmpMgmtSys.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	Set<Employee> fetchAll();
	
	Employee findEmployeeById(long id);
	
	Employee updateEmployeeById(long employeeId, Employee employee);
	
	void deleteEmployeeById(long EmployeeId);
	

}
