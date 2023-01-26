package com.parkinglot.parkinglot.model;

import java.util.List;

public class ParkingFloor extends BaseModel {

	private String name;

	private int floorNumber;

	private List<ParkingSpots> parkingSpots;

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ParkingSpots> getParkingSpots() {
		return parkingSpots;
	}

	public void setParkingSpots(List<ParkingSpots> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}

}
