package com.parkinglot.parkinglot.strategies.slotAllocation;

import com.parkinglot.parkinglot.exception.NoParkingSpotAvailableException;
import com.parkinglot.parkinglot.model.ParkingLot;
import com.parkinglot.parkinglot.model.ParkingSpots;
import com.parkinglot.parkinglot.model.VehicleType;

public interface ParkingSpotStrategy {

	public ParkingSpots assignSpot(ParkingLot parkingLot, VehicleType type) throws NoParkingSpotAvailableException;

}
