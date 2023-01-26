package com.parkinglot.parkinglot.dtos;

import java.util.List;

import com.parkinglot.parkinglot.model.EntryGate;
import com.parkinglot.parkinglot.model.ExitGate;
import com.parkinglot.parkinglot.model.ParkingFloor;

public class CreateParkingLotRequestDto {

	private List<ParkingFloor> floors;

	private String address;

	private List<EntryGate> entryGates;

	private List<ExitGate> exitGates;

	public List<ParkingFloor> getFloors() {
		return floors;
	}

	public void setFloors(List<ParkingFloor> floors) {
		this.floors = floors;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<EntryGate> getEntryGates() {
		return entryGates;
	}

	public void setEntryGates(List<EntryGate> entryGates) {
		this.entryGates = entryGates;
	}

	public List<ExitGate> getExitGates() {
		return exitGates;
	}

	public void setExitGates(List<ExitGate> exitGates) {
		this.exitGates = exitGates;
	}
}
