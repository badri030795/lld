package com.parkinglot.parkinglot.dtos;

import java.util.List;

import com.parkinglot.parkinglot.model.ParkingSpots;

public class CreateParkingFloorRequestDto {

	private String name;

	private int floorNumber;

	private List<ParkingSpots> parkingSpots;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public List<ParkingSpots> getParkingSpots() {
		return parkingSpots;
	}

	public void setParkingSpots(List<ParkingSpots> parkingSpots) {
		this.parkingSpots = parkingSpots;
	}

}
