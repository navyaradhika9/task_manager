package org.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.taskmanager.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	public Vehicle findByModel(String model);

	public Vehicle findByColor(String vehiclecolor);

}

