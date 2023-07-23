package com.greatlearning.EmployeeManagmentSystem.repository;

import com.greatlearning.EmployeeManagmentSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Add custom query methods if needed
}
