package com.jsp.service;

import com.jsp.dao.VehicleDao;
import com.jsp.dto.Chasis;
import com.jsp.dto.Vehicle;

public class Service {
	VehicleDao vehicleDao = new VehicleDao();

	public void create(Vehicle vehicle, Chasis chasis) {
		vehicleDao.create(vehicle, chasis);
	}

	public void update(Vehicle v, Chasis c, int id) {
		vehicleDao.update(v, c, id);

	}

	public void delete(int id) {
		vehicleDao.delete(id);
	}

	public Vehicle readVehicleById(int id) {
		return vehicleDao.readVehicleById(id);
	}

	public Chasis readChasisById(int id) {
		return vehicleDao.readChasisById(id);
	}
}
