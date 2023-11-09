package org.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.taskmanager.model.Vehicle;
import org.taskmanager.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;

	@PostMapping("/add")
	public Vehicle addNewVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.addVehicle(vehicle);

	}

}