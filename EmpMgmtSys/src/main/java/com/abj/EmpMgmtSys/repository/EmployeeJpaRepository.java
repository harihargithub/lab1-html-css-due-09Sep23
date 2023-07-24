package com.abj.EmpMgmtSys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abj.EmpMgmtSys.model.Employee;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long>{

}
