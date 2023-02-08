package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Chasis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String size;
	private String model_num;

	@OneToOne(mappedBy = "chasis")
	@JoinColumn
	private Vehicle vehicle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getModel_num() {
		return model_num;
	}

	public void setModel_num(String model_num) {
		this.model_num = model_num;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
