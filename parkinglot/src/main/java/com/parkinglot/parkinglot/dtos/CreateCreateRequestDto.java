package com.parkinglot.parkinglot.dtos;

import com.parkinglot.parkinglot.model.Gate;
import com.parkinglot.parkinglot.model.ParkingLot;
import com.parkinglot.parkinglot.model.Vehicle;

public class CreateCreateRequestDto {

	private ParkingLot parkingLot;

	private Gate gate;

	private Vehicle vehicle;

	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	public Gate getGate() {
		return gate;
	}

	public void setGate(Gate gate) {
		this.gate = gate;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
