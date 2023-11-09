
package org.taskmanager.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.taskmanager.model.User;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* org.taskmanager.service.UserService.addUser(org.taskmanager.model.User)) && args(user)")
	public void beforeAddUser(User user) {
		System.out.println("Name:"+user.getName());
		System.out.println("Email:"+user.getMail());
		System.out.println("Contact:"+user.getContactNumber());
		System.out.println("Password:"+user.getPassword());
		System.out.println("Confirm Password:"+user.getConfirmPassword());
		System.out.println("Address:"+user.getAddress());
	}

}


