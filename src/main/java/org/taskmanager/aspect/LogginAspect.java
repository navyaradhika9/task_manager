package org.taskmanager.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.taskmanager.model.Vehicle;

@Aspect
@Component
public class LogginAspect {
	@Before("execution(* org.taskmanager.service.VehicleService.addVehicle(org.taskmanager.model.Vehicle)) && args(vehicle)")
	public void beforeAddVehicle(Vehicle vehicle) {
		System.out.println("Id:"+vehicle.getId());
		System.out.println("Name:" + vehicle.getName());
		System.out.println("Model:" + vehicle.getmodel());
		System.out.println("Color:" + vehicle.getColor());
	}

}