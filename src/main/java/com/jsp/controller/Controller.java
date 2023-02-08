package com.jsp.controller;

import com.jsp.dto.Chasis;
import com.jsp.dto.Vehicle;
import com.jsp.service.Service;

public class Controller {
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		Chasis chasis = new Chasis();

		vehicle.setModel("2019");
		vehicle.setBrand("HONDA");

		chasis.setSize("23");
		chasis.setModel_num("4445");

		chasis.setVehicle(vehicle);
		vehicle.setChasis(chasis);

		Service service = new Service();

//		SAVE VEHICLE, CHASIS
		service.create(vehicle, chasis);

//		UPDATE VEHICLE, CHASIS
//		int id=1;
//		service.update(vehicle, chasis,id);

//		DELETE VEHICLE, CHASIS
//		int id = 2;
//		service.delete(id);

//		READ VEHICLE BY ID
//		int id = 3;
//		Vehicle v = service.readVehicleById(id);
//		System.out.println(v.getId());
//		System.out.println(v.getBrand());
//		System.out.println(v.getModel());

//		READ CHASIS BY ID
//		int id = 3;
//		Chasis ch = service.readChasisById(id);
//		System.out.println(ch.getId());
//		System.out.println(ch.getModel_num());
//		System.out.println(ch.getSize());

		System.out.println("All Good");
	}
}
