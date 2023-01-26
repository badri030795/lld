package com.parkinglot.parkinglot.strategies.slotAllocation;

import com.parkinglot.parkinglot.exception.NoParkingSpotAvailableException;
import com.parkinglot.parkinglot.model.ParkingFloor;
import com.parkinglot.parkinglot.model.ParkingLot;
import com.parkinglot.parkinglot.model.ParkingSlotSatus;
import com.parkinglot.parkinglot.model.ParkingSpots;
import com.parkinglot.parkinglot.model.VehicleType;

public class RandomSpotAllocationStrategy implements ParkingSpotStrategy {

	public ParkingSpots assignSpot(ParkingLot parkingLot, VehicleType type) throws NoParkingSpotAvailableException {
		for (ParkingFloor floor : parkingLot.getFloor()) {
			for (ParkingSpots spot : floor.getParkingSpots()) {
				if (spot.getSlotStatus().equals(ParkingSlotSatus.AVAILABLE) && spot.getVehicleTypes().contains(type)) {
					return spot;
				}
			}
		}
		throw new NoParkingSpotAvailableException("Spot Not Available");
	}
}
