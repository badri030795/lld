package com.parkinglot.parkinglot.dtos;

import com.parkinglot.parkinglot.model.ParkingFloor;

public class CreateParkingFloorResponseDto {

	ParkingFloor floor;

	public ParkingFloor getFloor() {
		return floor;
	}

	public void setFloor(ParkingFloor floor) {
		this.floor = floor;
	}
}
