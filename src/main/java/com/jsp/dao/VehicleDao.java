package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Chasis;
import com.jsp.dto.Vehicle;

public class VehicleDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Vehicle vehicle, Chasis chasis) {
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(chasis);
		entityTransaction.commit();
		System.out.println("All Good");
	}

	public void update(Vehicle v, Chasis c, int id) {
		Vehicle vehicle = entityManager.find(Vehicle.class, id);
		Chasis chasis = entityManager.find(Chasis.class, id);
		if (vehicle != null) {
			chasis.setModel_num(c.getModel_num());
			chasis.setSize(c.getSize());
			vehicle.setBrand(v.getBrand());
			vehicle.setModel(v.getModel());
			vehicle.setChasis(chasis);
			chasis.setVehicle(vehicle);
			entityTransaction.begin();
			entityManager.merge(vehicle);
			entityManager.merge(chasis);
			entityTransaction.commit();
		} else {
			System.out.println("id not found");
		}

	}

	public void delete(int id) {
		Vehicle vehicle = entityManager.find(Vehicle.class, id);
		Chasis chasis = entityManager.find(Chasis.class, id);
		if (vehicle != null) {
			entityTransaction.begin();
			entityManager.remove(vehicle);
			entityManager.remove(chasis);
			entityTransaction.commit();
			System.out.println("Deleted");

		} else {
			System.out.println("Id not found");
		}

	}

	public Vehicle readVehicleById(int id) {
		
		return entityManager.find(Vehicle.class, id);


	}

	public Chasis readChasisById(int id) {
		return entityManager.find(Chasis.class, id);

	}

}
