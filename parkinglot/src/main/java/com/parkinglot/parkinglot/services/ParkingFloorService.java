package com.parkinglot.parkinglot.services;

import java.util.List;

import com.parkinglot.parkinglot.model.ParkingFloor;
import com.parkinglot.parkinglot.model.ParkingLot;
import com.parkinglot.parkinglot.model.ParkingSpots;
import com.parkinglot.parkinglot.repositories.ParkingLotRepository;
import com.parkinglot.parkinglot.repositories.ParkingSpotRepository;

public class ParkingFloorService {

	private ParkingLotRepository parkingLotRepository;

	private ParkingSpotRepository parkingSpotRepository;

	public ParkingFloorService(ParkingLotRepository parkingLotRepository, ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
		this.parkingLotRepository = parkingLotRepository;
	}

	public ParkingFloor createFloor(List<ParkingSpots> spots, int floorNumber, String name) {
		ParkingFloor parkingFloor = new ParkingFloor();
		parkingFloor.setFloorNumber(floorNumber);
		parkingFloor.setParkingSpots(spots);
		parkingFloor.setName(name);
		ParkingLot lot = parkingLotRepository.getParkingLot(1L);
		List<ParkingFloor> floors = lot.getFloor();
		floors.add(parkingFloor);
		parkingLotRepository.save(lot);
		return parkingFloor;
	}

}
