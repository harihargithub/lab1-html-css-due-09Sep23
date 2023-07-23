package com.greatlearning.EmployeeManagmentSystem.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.EmployeeManagmentSystem.model.Employee;
import com.greatlearning.EmployeeManagmentSystem.model.Role;
import com.greatlearning.EmployeeManagmentSystem.model.User;
import com.greatlearning.EmployeeManagmentSystem.repository.EmployeeRepository;
import com.greatlearning.EmployeeManagmentSystem.repository.UserRepository;

@Configuration
public class BootstrapAppData {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@EventListener(ApplicationReadyEvent.class)
	@Transactional
	public void loadUsers(ApplicationReadyEvent event) {

		// adding users and roles

		User kiran = new User("kiran", this.passwordEncoder.encode("welcome"));
		User vinay = new User("vinay", this.passwordEncoder.encode("welcome"));
		User ramesh = new User("ramesh", this.passwordEncoder.encode("welcome"));

		Role userRole = new Role("ROLE_USER");
		Role adminRole = new Role("ROLE_ADMIN");
		Role superAdminRole = new Role("ROLE_SUPER_ADMIN");

		kiran.addRole(userRole);

		vinay.addRole(userRole);
		vinay.addRole(adminRole);
		
		ramesh.addRole(userRole);
		ramesh.addRole(adminRole);
		ramesh.addRole(superAdminRole);

		this.userRepository.save(kiran);
		this.userRepository.save(vinay);
		this.userRepository.save(ramesh);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	@Transactional
	public void loadEmployees(ApplicationReadyEvent event) {

		Employee emp1 = new Employee();
		emp1.setFirstName("Johny");
		emp1.setLastName("Meir");
		emp1.setEmail("it@gg");

		Employee emp2 = new Employee();
		emp2.setFirstName("Janey");
		emp2.setLastName("Mithow");
		emp2.setEmail("hr@gg");

		Employee emp3 = new Employee();
		emp3.setFirstName("Michsael");
		emp3.setLastName("Socher");
		emp3.setEmail("sales@gg");

		Employee emp4 = new Employee();
		emp4.setFirstName("Wilson");
		emp4.setLastName("Finao");
		emp4.setEmail("fin@gg");
		
		this.employeeRepository.save(emp1);
		this.employeeRepository.save(emp2);
		this.employeeRepository.save(emp3);
		this.employeeRepository.save(emp4);
	}
}
