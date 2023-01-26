package com.parkinglot.parkinglot.model;

import java.util.List;

public class ParkingLot extends BaseModel {

	private List<ParkingFloor> floor;

	private String address;

	private List<EntryGate> entryGates;

	private List<ExitGate> exitGates;

	public List<ParkingFloor> getFloor() {
		return floor;
	}

	public void setFloor(List<ParkingFloor> floor) {
		this.floor = floor;
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
