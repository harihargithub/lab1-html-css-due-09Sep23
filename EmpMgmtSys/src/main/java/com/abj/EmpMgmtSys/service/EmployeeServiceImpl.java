package com.abj.EmpMgmtSys.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abj.EmpMgmtSys.model.Employee;
import com.abj.EmpMgmtSys.repository.EmployeeJpaRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	  @Autowired
	  private EmployeeJpaRepository employeeJpaRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return this.employeeJpaRepository.save(employee);
	}

	@Override
	public Set<Employee> fetchAll() {
		return Set.copyOf(this.employeeJpaRepository.findAll());
	}

	@Override
	public Employee findEmployeeById(long id) {
		return this.employeeJpaRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Employee Id"));
	}

	@Override
	public Employee updateEmployeeById(long employeeId, Employee employee) {
		Employee employeeFromRepository = this.findEmployeeById(employeeId);
		employeeFromRepository.setFirstName(employee.getFirstName());
		employeeFromRepository.setLastName(employee.getLastName());
		employeeFromRepository.setEmail(employee.getEmail());
		return this.employeeJpaRepository.save(employeeFromRepository) ;
	}

	@Override
	public void deleteEmployeeById(long EmployeeId) {
       this.employeeJpaRepository.deleteById(EmployeeId);		
	}

}
