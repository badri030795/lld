package com.parkinglot.parkinglot.model;

import java.util.List;

public class ParkingSpots extends BaseModel {

	private List<VehicleType> vehicleTypes;

	private String name;

	private int spotNumber;

	private ParkingFloor parkingFloor;

	private ParkingSlotSatus slotStatus;

	private Vehicle vehicle;

	public List<VehicleType> getVehicleTypes() {
		return vehicleTypes;
	}

	public void setVehicleTypes(List<VehicleType> vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}

	public ParkingFloor getParkingFloor() {
		return parkingFloor;
	}

	public void setParkingFloor(ParkingFloor parkingFloor) {
		this.parkingFloor = parkingFloor;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ParkingSlotSatus getSlotStatus() {
		return slotStatus;
	}

	public void setSlotStatus(ParkingSlotSatus slotStatus) {
		this.slotStatus = slotStatus;
	}

}
