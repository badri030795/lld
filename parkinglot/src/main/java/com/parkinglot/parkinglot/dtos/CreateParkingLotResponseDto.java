package com.parkinglot.parkinglot.dtos;

import com.parkinglot.parkinglot.model.ParkingLot;

public class CreateParkingLotResponseDto {

	private ParkingLot parkingLot;

	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}
}
