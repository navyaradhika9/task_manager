package org.taskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskmanager.model.Employee;
import org.taskmanager.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee getEmployee(Integer id) {
		System.out.println("Id:::: " + id);
		System.out.println(employeeRepository.findById(id));
		return employeeRepository.findById(id).get();
	}

	public Employee addEmployee(Employee employee) {
		return employeeRepository.saveAndFlush(employee);
	}

	public Employee loginEmployee(Employee employee) {
		System.out.println("Employee name : " + employee.getName());
		Employee loggedInEmployee = employeeRepository.findByName(employee.getName());
		if (loggedInEmployee != null && employee.getCompany().equals(loggedInEmployee.getCompany()))
			return loggedInEmployee;
		else
			return null;

	}

}