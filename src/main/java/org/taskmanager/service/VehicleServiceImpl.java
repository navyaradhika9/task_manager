package org.taskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskmanager.model.Vehicle;
import org.taskmanager.repository.VehicleRepository;
@Service
public class VehicleServiceImpl  implements VehicleService{
	@Autowired
	private VehicleRepository vehicleRepository;
	
	public Vehicle getVehicle(Integer id) {
		System.out.println("Id:::: "+id);
		System.out.println(vehicleRepository.findById(id));
		return vehicleRepository.findById(id).get();
	}
	
	public Vehicle addVehicle(Vehicle vehicle) {
		return vehicleRepository.saveAndFlush(vehicle);
	}

	public Vehicle loginVehicle(Vehicle vehicle) {
		System.out.println("Vehicle model : "+vehicle.getmodel());
		Vehicle loggedInVehicle = vehicleRepository.findByModel(vehicle.getmodel());
		if (loggedInVehicle != null && vehicle.getColor().equals(loggedInVehicle.getColor()))
			return loggedInVehicle;
		else
			return null;

}
}
