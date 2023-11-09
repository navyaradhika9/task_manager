package org.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.taskmanager.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public Employee findByName(String name);

	public Employee findByCompany(String employeecompany);

}
