package com.greatlearning.EmployeeManagmentSystem.repository;

import com.greatlearning.EmployeeManagmentSystem.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Add custom query methods if needed
}