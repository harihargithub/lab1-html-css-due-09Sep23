package com.greatlearning.EmployeeManagmentSystem.service;

import java.util.List;

import com.greatlearning.EmployeeManagmentSystem.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
}