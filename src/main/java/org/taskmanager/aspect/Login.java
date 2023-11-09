package org.taskmanager.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.taskmanager.model.Employee;

@Aspect
@Component
public class Login {
	@Before("execution(* org.taskmanager.service.EmployeeService.addEmployee(org.taskmanager.model.Employee)) && args(employee)")
	public void beforeAddEmployee(Employee employee) {
		System.out.println("Name:" + employee.getName());
		System.out.println("Email:" + employee.getMail());
		System.out.println("Contact:" + employee.getContactNumber());
		System.out.println("Address:" + employee.getAddress());
		System.out.println("company:" + employee.getCompany());

	}

}
