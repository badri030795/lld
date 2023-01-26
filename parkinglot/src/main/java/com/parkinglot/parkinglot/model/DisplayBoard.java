package com.parkinglot.parkinglot.model;

public class DisplayBoard extends BaseModel {

	private ParkingLot parkingLot;

	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

}
