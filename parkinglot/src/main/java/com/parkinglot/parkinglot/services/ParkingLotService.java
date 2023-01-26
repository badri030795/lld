package com.parkinglot.parkinglot.services;

import java.util.List;

import com.parkinglot.parkinglot.model.EntryGate;
import com.parkinglot.parkinglot.model.ExitGate;
import com.parkinglot.parkinglot.model.ParkingFloor;
import com.parkinglot.parkinglot.model.ParkingLot;
import com.parkinglot.parkinglot.repositories.ParkingLotRepository;

public class ParkingLotService {

	private ParkingLotRepository parkingLotRepository;

	public ParkingLotService(ParkingLotRepository parkingLotRepository) {
		this.parkingLotRepository = parkingLotRepository;
	}

	public ParkingLot createParkingLot(List<ParkingFloor> floors, String address, List<EntryGate> entryGates,
			List<ExitGate> exitGates) {
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setAddress(address);
		parkingLot.setEntryGates(entryGates);
		parkingLot.setExitGates(exitGates);
		parkingLot.setFloor(floors);
		return parkingLotRepository.save(parkingLot);
	}

}
