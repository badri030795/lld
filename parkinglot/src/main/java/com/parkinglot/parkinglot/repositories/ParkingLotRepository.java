package com.parkinglot.parkinglot.repositories;

import java.util.HashMap;
import java.util.Map;

import com.parkinglot.parkinglot.model.ParkingLot;

public class ParkingLotRepository {

	private Map<Long, ParkingLot> map = new HashMap<>();

	private Long count = 0L;

	public ParkingLot getParkingLot(Long parkingLotId) {
		return map.get(parkingLotId);
	}

	public ParkingLot save(ParkingLot parkingLot) {
		count += 1;
		parkingLot.setId(count);
		return parkingLot;
	}

}
