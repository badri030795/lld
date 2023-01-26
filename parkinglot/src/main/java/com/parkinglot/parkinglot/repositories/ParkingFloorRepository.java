package com.parkinglot.parkinglot.repositories;

import java.util.ArrayList;
import java.util.List;

import com.parkinglot.parkinglot.model.ParkingFloor;
import com.parkinglot.parkinglot.model.ParkingLot;

public class ParkingFloorRepository {

	List<ParkingFloor> list = new ArrayList<>();

	public List<ParkingFloor> getParkingFloors() {
		return list;
	}

	public void saveFloor(ParkingLot parkingLot, ParkingFloor floor) {

	}
}
